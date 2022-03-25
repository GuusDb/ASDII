package testen;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domeinOef2_2.Duck;

public class DuckTestOef2_2 {
	@Test
	public void sortBySizeTest() {
		
		//dit is de template methode
		
		Duck d1 = new Duck("Ducky", 50, 33);
		Duck d2 = new Duck("Greenie", 44, 24);
		Duck d3 = new Duck("Tutsie", 1, 105);
		Duck d4 = new Duck("Lisie", 911, 87);
		Duck[] ducks = { d1, d2, d3, d4 };

		// OEF 2.2
		// ------------------------
		Arrays.sort(ducks);
		// ------------------------

		Duck[] resultDucks = { d2, d1, d4, d3 };
		Assertions.assertArrayEquals(resultDucks, ducks);

	}
}
