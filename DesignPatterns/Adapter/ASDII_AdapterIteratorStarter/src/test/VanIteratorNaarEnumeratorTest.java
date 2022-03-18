package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Class1;



public class VanIteratorNaarEnumeratorTest {

    @Test
    public void testIteratorNaatEnumeration() {
        Class1 class1 = new Class1();
        String items = class1.toString();
        Assertions.assertEquals("item1 item2 item3 item4 ", items);
    }
}
