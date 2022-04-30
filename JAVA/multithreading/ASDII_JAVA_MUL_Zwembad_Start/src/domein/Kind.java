package domein;

import java.security.SecureRandom;

// VUL DE KLASSE VERDER AAN
public class Kind {

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

        System.out.printf("%s : "
                + (zwembad.vol() ? "zwembad vol" : "reeds "
                        + zwembad.getInhoud() + " emmers") + "\n", naam);
        
        
        
    }
}
