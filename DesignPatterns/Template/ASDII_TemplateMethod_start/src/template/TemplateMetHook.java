package template;

import domein.CaffeineBeverage;
import domein.Coffee;
import domein.CoffeeWithHook;
import domein.Tea;
import java.util.Scanner;

public class TemplateMetHook {

	public static void main(String[] args) {
		
		System.out.println("Making  coffee");
		CaffeineBeverage beverage = new Coffee();
		beverage.prepareRecipe();
		
		System.out.println("Making  tea");
		beverage = new Tea();
		beverage.prepareRecipe();
		
		System.out.println("Making coffee with a hook");
		boolean answer = getUserInputForCoffee();
		beverage = new CoffeeWithHook(answer);
		beverage.prepareRecipe();
	}

	public static boolean getUserInputForCoffee() {
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		Scanner in = new Scanner(System.in);
		return in.next().equalsIgnoreCase("y");
	}
}