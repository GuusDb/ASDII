package testen;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domeinOef2_1.Duck;

public class DuckTestOef2_1 {
    @Test
    public void sortBySizeTest() {
        Duck d1 = new Duck("Ducky", 50, 33);
        Duck d2 = new Duck("Greenie", 44, 24);
        Duck d3 = new Duck("Tutsie", 1, 105);
        Duck d4 = new Duck("Lisie", 911, 87);
        Duck[] ducks = {d1, d2, d3, d4};  
        
        //OEF 2.1
        //--------------------------------------------------------
        Arrays.sort(ducks, Comparator.comparing(Duck::getSize));
        //---------------------------------------------------------
        
		Duck[] resultDucks = { d2, d1, d4, d3 };
		Assertions.assertArrayEquals(resultDucks, ducks);
    }
}

