package iterator;

import domein.DinerMenu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {

    public static void main(String[] args) {
        PancakeHouseMenu pcm = new PancakeHouseMenu();
        DinerMenu dm = new DinerMenu();

        Waitress waitress = new Waitress(pcm, dm);

        waitress.printMenu();
    }

}
