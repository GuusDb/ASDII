package iterator_java_util;

import domein.DinerMenu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {
	public static void main(String args[]) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();

	}
}
