package test.normalTests;

import normal.HighLow;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighLowTest {

    @Test
    public void test1(){
        String str = "34 21 543 -4 654 752 23 -12";
        String expected = "752 -12";
        assertEquals(HighLow.highAndLow(str),expected);
    }

    @Test
    public void test2(){
        String str = "1 9 3 4 -5";
        String expected = "9 -5";
        assertEquals(HighLow.highAndLow(str),expected);
    }

}