package test.normalTests;

import normal.Digits;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {
    @Test
    public void test(){
        assertEquals(1, Digits.digPow(89,1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, Digits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, Digits.digPow(46288, 3));
    }

}