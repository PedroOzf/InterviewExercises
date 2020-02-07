package test.normalTests;

import normal.GoogleInt;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoogleIntTest {
    @Test
    public void test1(){
        int[] en = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] exp = {3,9};

        assertEquals(GoogleInt.sort(en),exp);
    }

}