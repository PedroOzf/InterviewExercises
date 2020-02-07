package test.normalTests;

import normal.CountingDuplicates;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingDuplicatesTest {
    @Test
    public void test(){
        String ex = "abcde";
        assertEquals(0,CountingDuplicates.count(ex));
    }
    @Test
    public void test2(){
        String ex = "abcdeaBReturnsTwo";
        assertEquals(2,CountingDuplicates.count(ex));
    }

}