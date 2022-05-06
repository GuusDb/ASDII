package domein;

import java.security.SecureRandom;

public class Kok implements Runnable {
	
	private final Restaurant restaurant;
	private SecureRandom random = new SecureRandom();

	public Kok(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(random.nextInt(2001));
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			restaurant.plaatsOrder(new Order());
		}

	}

}
