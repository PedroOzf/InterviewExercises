package test.normalTests;

import normal.LongestArit;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestAritTest {
    @Test public void test(){
        int[] en = {1,2,3,4};
        int expected = 4;
        int diff = 1;
        assertEquals(LongestArit.longest(en,diff),expected);
    }

    @Test
    public void test2(){
        int[] en = {3,0,-3,4,-4,7,6};
        int expected = 2;
        int diff = 3;
        assertEquals(LongestArit.longest(en,diff),expected);
    }

}