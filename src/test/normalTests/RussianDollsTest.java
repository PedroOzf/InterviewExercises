package test.normalTests;

import normal.RussianDolls;
import org.junit.Test;

import static org.junit.Assert.*;

public class RussianDollsTest {

    @Test
    public void test(){
        int expected = 3;
        int[][] en = {{1,2},{2,3},{3,4},{4,5},{1,3}};
        assertEquals(RussianDolls.max(en),expected);
    }
}