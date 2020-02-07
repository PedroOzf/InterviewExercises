package test.normalTests;

import normal.PermutChar;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutCharTest {
    @Test
    public void etst(){
        String en = "DID";
        assertEquals(PermutChar.numPermsDISequence(en),5);
    }

}