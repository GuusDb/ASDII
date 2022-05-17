package domein;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Beyonce 
{
	private int aantalKeerGezongen;
	private static final Beyonce beyonce = new Beyonce();
	private static final Imitator beyonceImi = new Imitator();
	
	public Beyonce() {
	}

	public void zingEenLied() {
		++aantalKeerGezongen;
		System.out.println("Ik zong "+ aantalKeerGezongen + " keer");
	}

	public static Beyonce getInstance() {
		return LocalDate.now().getDayOfWeek()==DayOfWeek.WEDNESDAY?beyonceImi:beyonce;
	}
	
	private static class Imitator extends Beyonce  {
		@Override
		public void zingEenLied() {
			System.out.println("imitator zingt een lied");
		}
	}
}
