package domein;

public class Text extends Graphic {

    private String text;
    private int x, y;

    public Text(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public void draw() {
        System.out.printf("text: %s (%d,%d)\n", text, x, y);
    }
}
