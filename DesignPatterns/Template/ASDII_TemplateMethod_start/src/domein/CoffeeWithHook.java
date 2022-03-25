package domein;

public class CoffeeWithHook extends CaffeineBeverage {

    private boolean wantsCondiments;

    public CoffeeWithHook(boolean wantsCondiments) {
        this.wantsCondiments = wantsCondiments;
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    
     @Override
    protected boolean customerWantsCondiments() {
        return wantsCondiments;
    }
}
