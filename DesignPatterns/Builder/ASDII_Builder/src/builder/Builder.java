package builder;

import domein.*;

public class Builder {

    public static void main(String[] args) {
        SandwichDirector director = new SandwichDirector(new MySandwichBuilder());
        director.buildSandwich();
        Sandwich sandwich = director.getSandwhich();
        sandwich.display();
    }
}
