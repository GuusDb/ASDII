package domein;

public class Menu {

    private String drink;
    private String mainCourse;
    private String side;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("drink:%s, main course:%s, side:%s ", drink, mainCourse, side);
    }

}
