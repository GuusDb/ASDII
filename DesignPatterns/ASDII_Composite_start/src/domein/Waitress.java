package domein;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

//    public void printVegetarianMenu() {
//        //We wensen over de hele boomstructuur te itereren, we verpakken de iterator van de root
//        //in een CompositeIterator die weet hoe hij een willekeurige compositie moet itereren
//        Iterator<MenuComponent> iterator = new CompositeIterator(allMenus.createIterator());
//        System.out.println("\nVEGETARIAN MENU\n----");
//        while (iterator.hasNext()) {
//            MenuComponent menuComponent = iterator.next();
//            try {
//                if (menuComponent.isVegetarian()) {
//                    menuComponent.print();
//                }
//             } catch (UnsupportedOperationException e) {
//           }
//        }
//    }
}
