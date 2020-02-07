package test.normalTests;

import normal.SumDigPower;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumDigPowerTest {

    @Test
    public void test1(){
        long[] expected = {89};
        long a = 10;
        long b = 90;
        assertEquals(Arrays.toString(expected), Arrays.toString(SumDigPower.calc(a,b).toArray()));
    }

    @Test
    public void test2(){
        long[] expected = {89,135};
        long a = 10;
        long b = 150;
        assertEquals(Arrays.toString(expected), Arrays.toString(SumDigPower.calc(a,b).toArray()));
    }
    @Test
    public void test3(){
        long[] expected = {135};
        long a = 130;
        long b = 140;
        assertEquals(Arrays.toString(expected), Arrays.toString(SumDigPower.calc(a,b).toArray()));
    }

}