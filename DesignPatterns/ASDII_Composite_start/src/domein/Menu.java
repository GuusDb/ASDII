package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Menu extends MenuComponent {

	private List<MenuComponent> menuComponents = new ArrayList<>();
	
	
    public Menu(String name, String description) {
    	super(name,description);
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        
        menuComponents.forEach(MenuComponent::print);
//        menuComponents.forEach( menuComponents ->
//        {
//        		if (menuComponents instanceof MenuItem item)
//        			item.print();
//        		else
//        			((Menu)menuComponents).print();
//        }
//        );
    }

	

}
