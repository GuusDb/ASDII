package domein;

import java.security.SecureRandom;

public class JobA extends Job {
	
	@Override
	public String execute() {
		try {
			Thread.sleep(new SecureRandom().nextInt(2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		return "Job A finished";
	}

}
