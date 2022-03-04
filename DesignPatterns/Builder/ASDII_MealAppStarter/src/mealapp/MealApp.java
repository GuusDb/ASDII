package mealapp;

import domein.ItalianMenuBuilder;
import domein.JapaneseMenuBuilder;
import domein.Menu;
import domein.MenuBuilder;
import domein.MenuDirector;

public class MealApp {

   public static void main(String[] args) {
      new MealApp();
   }
   
   public MealApp() {
       
        //TODO
        System.out.printf("menu is: %s%n",  getMenu(new ItalianMenuBuilder())                      );
        
        System.out.printf("menu is: %s%n",            getMenu(new JapaneseMenuBuilder())            );
	   
    }
   
   private Menu getMenu(MenuBuilder builder) {
	   MenuDirector menuDirector = new MenuDirector(builder);
	   menuDirector.buildMenu();
	   return menuDirector.getMenu();
   }

   
}
