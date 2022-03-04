package domein;

import java.util.ArrayList;
import java.util.List;

public class ClubSandwichBuilder extends SandwichBuilder {

    @Override
    public void prepareBread() {
        Sandwich sandwich = getSandwich();
        sandwich.setBreadType(BreadType.White);
    }

    @Override
    public void applyMeatAndCheese() {
        Sandwich sandwich = getSandwich();
        sandwich.setCheeseType(CheeseType.Swiss);
        sandwich.setMeatType(MeatType.Ham);
    }

    @Override
    public void applyVegetables() {
        Sandwich sandwich = getSandwich();
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Lattuce");
        vegetables.add("Onion");
        sandwich.setVegetables(vegetables);
    }

    @Override
    public void addCondiments() {
        Sandwich sandwich = getSandwich();
        sandwich.setHasMayo(true);
        sandwich.setIsToasted(true);
        sandwich.setHasMustard(false);
    }
}
