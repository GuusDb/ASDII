package domein;

public class Rectangle extends Graphic  {

    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.printf(
                "rectangle (%d,%d), width:%d, height:%d\n",
                x, y, width, height);
    }

}
