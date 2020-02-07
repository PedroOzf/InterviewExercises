package test.normalTests;

import normal.CreditCard;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
    @Test
    public void test(){
        String s = "4556364607935616";
        String expected = "############5616";
        assertEquals(expected, CreditCard.maskify(s));
    }

    @Test
    public void test2(){
        String s = "64607935616";
        String expected = "#######5616";
        assertEquals(expected, CreditCard.maskify(s));
    }
}