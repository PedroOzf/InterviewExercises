package test.normalTests;

import normal.MaxProfit;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {
    @Test
    public void  test(){
        int[] input = {5,11,3,50,60,90};
        assertEquals(94, MaxProfit.max(input,2));
    }
}