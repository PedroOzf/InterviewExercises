package test.basicTests;

import basics.RepeatedString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {

    @Test
    public void test1(){
        String s ="abcd";
        int len = 10;
        assertEquals(RepeatedString.repeat(s,10),3);
    }

    @Test
    public void test2(){
        String s ="a";
        assertEquals(RepeatedString.repeat(s,12312),12312);
    }
}