package domein;

import javafx.beans.value.ChangeListener;

public class DomeinController {
	
	private TellerThread tellerThread;
	private Thread thredje;
	
	public DomeinController() {
		init();
	}
	
	private void init() {
		tellerThread = new TellerThread();
		thredje = new Thread(tellerThread);
		thredje.start();	
	}
	
	public void addObserver(ChangeListener<? super Number> listener) {
		tellerThread.addObserver(listener);
	}
	
	public void resume() {
		tellerThread.resume();
	}
	
	public void suspend() {
		tellerThread.suspend();	
	}
	
	public void stop() {
		tellerThread.stop();
	}

	public void restart() {
		stop();
		while(thredje.isAlive()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		init();		
	}
	

}
