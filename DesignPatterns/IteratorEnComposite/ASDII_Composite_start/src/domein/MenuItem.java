package domein;

import java.util.Iterator;
import java.util.*;

public class MenuItem extends MenuComponent {


    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
    	super(name, description);
        this.vegetarian = vegetarian;
        this.price = price;
    }



    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }



	public Iterator<domein.MenuComponent> createIterator() {
		return new NullIterator();
	}



	public boolean isLeaf() {
		return true;
	}

}
