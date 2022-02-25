package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

    private List<Object> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Object menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(Object menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public Object getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        menuComponents.forEach( menuComponents ->
        {
        		if (menuComponents instanceof MenuItem item)
        			item.print();
        		else
        			((Menu)menuComponents).print();
        }
        );
    }

}
