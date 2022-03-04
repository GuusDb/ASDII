package domein;

public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
            String description,
            boolean vegetarian,
            double price) {
        setName(name);
        setDescription(description);
        setVegetarian(vegetarian);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
