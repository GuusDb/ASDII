package domein;

import java.security.SecureRandom;

// VUL DE KLASSE VERDER AAN
public class Kind implements Runnable{

    private final Tafel tafel;
    private final Zwembad zwembad;
    private final String naam;
    private static final SecureRandom generator = new SecureRandom();

    public Kind(Tafel tafel, Zwembad zwembad, String naam) {
        this.tafel = tafel;
        this.zwembad = zwembad;
        this.naam = naam;
    }

    public void run() {
    
    	while(!zwembad.vol() && tafel.pakEmmer()) {
    		System.out.printf("kind %s heeft emmer genomen%n",naam);
    		try {
				Thread.sleep(2000 + generator.nextInt(1001));
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
    		zwembad.gietEmmer();
    	}
        System.out.printf("%s : "
                + (zwembad.vol() ? "zwembad vol" : "reeds "
                        + zwembad.getInhoud() + " emmers") + "\n", naam);
        
        
        
    }
}
