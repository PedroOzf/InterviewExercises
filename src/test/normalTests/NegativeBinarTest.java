package test.normalTests;

import normal.NegativeBinar;
import org.junit.Test;

import static org.junit.Assert.*;

public class NegativeBinarTest {
    @Test
    public void test(){
        int[] arr1 = {1,1,1,1,1};
        int[] arr2 = {1,0,1};
        int[] expected = {1,0,0,0,0};
        assertArrayEquals(expected, NegativeBinar.convert(arr1,arr2));
    }

}