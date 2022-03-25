package domein;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //if (customerWantsCondiments()) {
            addCondiments();
        //}
    }

    protected final void boilWater() {
        System.out.println("Boiling water");
    }

    protected final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected boolean customerWantsCondiments() {
        return true;
    }
}
