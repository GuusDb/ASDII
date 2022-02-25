package domein;

import java.util.Iterator;

public class Waitress {
	// TODO
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	// TODO nieuwe attributen en constructor

	public void printMenu() {
		// TODO 
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);

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