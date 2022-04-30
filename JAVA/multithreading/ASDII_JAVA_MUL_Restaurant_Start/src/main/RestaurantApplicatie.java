package main;

import domein.Kelner;
import domein.Kok;
import domein.Restaurant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RestaurantApplicatie
{

    public static void main(String[] args)
    {
        ExecutorService application = 
                Executors.newFixedThreadPool(3);
        Restaurant restaurant = new Restaurant();
        Kelner kelner1 = new Kelner(restaurant, "Sofie");
        Kelner kelner2 = new Kelner(restaurant, "Hendrik");
        Kok kok = new Kok(restaurant);

        application.execute(kelner1);
        application.execute(kelner2);
        application.execute(kok);

        application.shutdown();
    }

}
