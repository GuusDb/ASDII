package template;

import domein.Coffee;
import domein.Tea;

public class Template {

    public static void main(String[] args) {
    	
        System.out.println("Making coffee");
        new Coffee().prepareRecipe();
        System.out.println();
        
        System.out.println("Making tea");
        new Tea().prepareRecipe();
    }

}