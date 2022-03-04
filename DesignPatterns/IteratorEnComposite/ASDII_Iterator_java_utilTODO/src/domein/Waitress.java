package domein;

import java.util.Iterator;
import java.util.*;

public class Waitress {
	

	private List<Menu> menus;
	
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	// TODO nieuwe attributen en constructor

	public void printMenu() {
		// TODO 
//		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//		System.out.println("MENU\n----\nBREAKFAST");
//		printMenu(pancakeIterator);
//		System.out.println("\nLUNCH");
//		printMenu(dinerIterator);
		System.out.println("MENU\n----\nBREAKFAST");
		
		
//		menus.stream().map(Menu::createIterator)
//					  .forEach(this::printMenu);
		
		menus.forEach(menu -> {
			System.out.printf("%n%s%n", menu.getTitle());
			printMenu(menu.createIterator());
		});
		
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}