package domein;

import java.util.List;

public class Sandwich {

    private BreadType breadType;
    private boolean isToasted;
    private CheeseType cheeseType;
    private MeatType meatType;
    private boolean hasMustard;
    private boolean hasMayo;
    private List<String> vegetables;

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }
//    public Sandwich(BreadType breadType, boolean isToasted, CheeseType cheeseType,
//            MeatType meatType,  boolean hasMustard, boolean hasMayo,
//            List<String> vegetables) {
//        setBreadType(breadType);
//        setIsToasted(isToasted);
//        setCheeseType(cheeseType);
//        setMeatType(meatType);
//        setHasMustard(hasMustard);
//        setHasMayo(hasMayo);
//        setVegetables(vegetables);
//    }

    public void display() {

        System.out.println("Sandwich on " + getBreadType() + " bread");
        if (isIsToasted()) {
            System.out.println("Toasted");
        }
        if (isHasMayo()) {
            System.out.println("With Mayo");
        }
        if (isHasMustard()) {
            System.out.println("With Mustard");
        }
        System.out.println("Meat: " + getMeatType());
        System.out.println("Cheese: " + getCheeseType());
        System.out.println("Veggies:");
        for (String vegetable : getVegetables()) {
            System.out.println("   " + vegetable);
        }
    }

    public boolean isIsToasted() {
        return isToasted;
    }

    public void setIsToasted(boolean IsToasted) {
        this.isToasted = IsToasted;
    }

    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType CheeseType) {
        this.cheeseType = CheeseType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType MeatType) {
        this.meatType = MeatType;
    }

    public boolean isHasMustard() {
        return hasMustard;
    }

    public void setHasMustard(boolean HasMustard) {
        this.hasMustard = HasMustard;
    }

    public boolean isHasMayo() {
        return hasMayo;
    }

    public void setHasMayo(boolean HasMayo) {
        this.hasMayo = HasMayo;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<String> Vegetables) {
        this.vegetables = Vegetables;
    }
}
