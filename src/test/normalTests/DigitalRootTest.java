package test.normalTests;

import normal.DigitalRoot;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalRootTest {
    @Test
    public void test(){
        int a = 12;
        int expected = 3;
        assertEquals(expected, DigitalRoot.getNum(a));
    }

    @Test
    public void test2(){
        int a = 942;
        int expected = 6;
        assertEquals(expected, DigitalRoot.getNum(a));
    }

}