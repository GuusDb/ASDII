package domein;

//Makes a sandwich, contains the process for making a sandwich regardless of what type of sandwich it is
public class SandwichDirector {

    private SandwichBuilder builder;

    public SandwichDirector(SandwichBuilder builder) {
        this.builder = builder;
    }

    //uses builder to create sandwich
    public void buildSandwich() {
        builder.createNewSandwich();
        builder.prepareBread();
        builder.applyMeatAndCheese();
        builder.applyVegetables();
        builder.addCondiments();
    }

    //get sandwich back out
    public Sandwich getSandwhich() {
        return builder.getSandwich();
    }
}
