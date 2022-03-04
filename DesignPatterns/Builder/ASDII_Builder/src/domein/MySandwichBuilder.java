package domein;

import java.util.ArrayList;
import java.util.List;

public class MySandwichBuilder extends SandwichBuilder {
    
    @Override
    public void prepareBread() {
        Sandwich sandwich = getSandwich();
        sandwich.setBreadType(BreadType.Wheat);
    }
    
    @Override
    public void applyMeatAndCheese() {
        Sandwich sandwich = getSandwich();
        sandwich.setCheeseType(CheeseType.American);
        sandwich.setMeatType(MeatType.Turkey);
    }
    
    @Override
    public void applyVegetables() {
        Sandwich sandwich = getSandwich();
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Lettuce");
        sandwich.setVegetables(vegetables);
    }

    @Override
    public void addCondiments() {
        Sandwich sandwich = getSandwich();
        sandwich.setHasMayo(false);
        sandwich.setIsToasted(true);
        sandwich.setHasMustard(true);
    }
}
    //Versie 1 
//    public void createSandwich() {
//        List<String> vegetables = new ArrayList<>();
//        vegetables.add("Tomato");
//        vegetables.add("Salad");
//        sandwich = new Sandwich();
//        sandwich.setBreadType(BreadType.Wheat);
//       sandwich.setMeatType(MeatType.Turkey);
//        sandwich.setCheeseType(CheeseType.American);
//        sandwich.setHasMayo(false);
//        sandwich.setIsToasted(true);
//        sandwich.setHasMustard(true);
//        sandwich.setVegetables(vegetables);
//    }

//Versie2
//   private Sandwich sandwich;
//    public Sandwich getSandwich() {
//        return sandwich;
//    }  
//    
//    public void createSandwich() {
//        createNewSandwich();
//        prepareBread();
//        applyMeatAndCheese();
//        applyVegetables();
//        addCondiments();        
//    }    
//    private void createNewSandwich()
//    {
//        sandwich = new Sandwich();
//    }
