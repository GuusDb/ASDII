package domein;

import java.security.SecureRandom;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

// VUL DE KLASSE VERDER AAN
public class Tafel {

	private ArrayBlockingQueue<Boolean> abq;
	private static final SecureRandom generator = new SecureRandom();
	private boolean vatLeeg = false;

	public Tafel(int aantalEmmers) {
		abq = new ArrayBlockingQueue<Boolean>(aantalEmmers);
	}

	public void vulEmmer() {
		try {
			Thread.sleep(1000 + generator.nextInt(10001));
			abq.put(true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean pakEmmer() {
    	Boolean emmer = null;
    	try {
    		while(emmer == null && !vatLeeg ) {
    			
    			emmer = abq.poll(50L, TimeUnit.MILLISECONDS);
    		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return emmer != null;
    }

	public void setVatLeeg(boolean vatLeeg) {
		this.vatLeeg = vatLeeg;
	}

}
