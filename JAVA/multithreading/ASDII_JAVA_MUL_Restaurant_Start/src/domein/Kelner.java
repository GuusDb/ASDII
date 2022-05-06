package domein;

import java.security.SecureRandom;

public class Kelner implements Runnable {

	private Restaurant restaurant;
	private String naam;
	private SecureRandom random = new SecureRandom();

	public Kelner(Restaurant restaurant, String naam) {
		this.restaurant = restaurant;
		this.naam = naam;
	}

	@Override
	public void run() {
		while (true) {
			Order order = restaurant.haalOrderOp();
			try {
				Thread.sleep(random.nextInt(2001));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("kelnder %s krijgt en brengt order %s%n", naam, order);
		}
	}

}
