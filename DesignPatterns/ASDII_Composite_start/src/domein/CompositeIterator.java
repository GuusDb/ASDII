package domein;

import java.util.*;
import java.util.Iterator;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();
    //parameter : de iterator van de rootcompositie waardoor we gaan itereren
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }
    
    @Override
    public MenuComponent next() {
        if (hasNext()) { //Is er wel een volgend element?
            //haal lopende iterator van de stack en ga naar volgend element
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            //Is dit element een Menu, dan moet die compositie in de iteratie worden opgenomen
            //Dus zetten we het op de stack (en zullen we sowieso later verwerken)
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {     return null;      }    } // er isgeen volgend element

    @Override
    public boolean hasNext() {
        if (stack.empty()) { //is er een volgend element? Niet als de stack leeg is
            return false;
        } else {
            //Haal iterator van de top van de stack 
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) { //en kijk of er een volgend element is
                //zo niet, dan poppen we hem van de stack en roepen hasNext() recursief aan
                stack.pop();
                return hasNext();
            } else { //er is een volgend element
                return true;
            }
        }
    }
}
