package domein;

public class Order
{
    private static int i = 1;
    private int count = i++;

    public Order()
    {
        if (count > 10)
        {
            System.out.println("Voedsel is op, sluiten!");
            System.exit(0);
        }
    }

    @Override
    public String toString()
    {
        return String.format("Order %d", count);
    }

}
