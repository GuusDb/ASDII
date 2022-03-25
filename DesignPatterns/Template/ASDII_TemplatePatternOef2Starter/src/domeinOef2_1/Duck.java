package domeinOef2_1;

public class Duck
{
    private String name;
    private double weight;
    private double size;

    public Duck(String name, double weight, double size) {
        super();
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("name= %s, size= %.1f, weight= %.1f", name, size, weight);
    }

    public String getName() {return name;}
    public double getSize() {return size;}
    public double getWeight() {return weight;}
}

