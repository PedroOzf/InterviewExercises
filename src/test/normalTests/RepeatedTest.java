package test.normalTests;

import normal.Repeated;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedTest {
    @Test
    public void test(){
        String prueba = "ababab";
        assertTrue(Repeated.repeatedSubstringPattern(prueba));
    }

}