package test.normalTests;

import normal.Rotate;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateTest {
    @Test
    public void test(){
        String cadena = "66443875";
        int chunk = 4;
        String expected = "44668753";
        assertEquals(expected,Rotate.revRot(cadena,chunk));
    }

}