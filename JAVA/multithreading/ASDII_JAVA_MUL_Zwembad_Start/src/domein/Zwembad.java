package domein;

//DEZE KLASSE IS VOLLEDIG
public class Zwembad {

    private final int CAPACITEIT;
    private int inhoud;

    public Zwembad(int cap) {
        CAPACITEIT = cap;
    }

    public void gietEmmer() {
        inhoud++;
    }

    public void haalEmmer() {
        inhoud--;
    }

    public boolean vol() {
        return inhoud == CAPACITEIT;
    }

    public boolean leeg() {
        return inhoud == 0;
    }

    public int getInhoud() {
        return inhoud;
    }
}
