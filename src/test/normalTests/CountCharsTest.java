package test.normalTests;

import normal.CountChars;
import org.junit.Test;


import static org.junit.Assert.*;

public class CountCharsTest {
    @Test
    public void test1(){
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        String expected = "abcdefklmopqwxy";
        assertEquals(expected,CountChars.count(a,b));
    }

}