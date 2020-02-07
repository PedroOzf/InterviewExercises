package test.normalTests;

import normal.PermutNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutNumbersTest {
    @Test
    public void test(){
        String str = "42765";
        String expected = "1243";
        assertEquals(expected, PermutNumbers.nextBigger(str));
    }

}