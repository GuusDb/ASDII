package guiabstractfactorystarter;

import domein.ScreenFactory;
import domein.Screen;


public class StartUp {

       public static void main(String args[]) {
        new StartUp().run();
    }

    private void run() {
        Screen winScreen = ScreenFactory.createScreen("win");
        winScreen.addButton();
        winScreen.addLabel();
        winScreen.viewComponents();
        Screen macScreen = ScreenFactory.createScreen("mac");
        macScreen.addButton();
        macScreen.addLabel();
        macScreen.addLabel();
        macScreen.viewComponents();
    }
    
}
