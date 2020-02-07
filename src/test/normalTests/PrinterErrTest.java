package test.normalTests;

import normal.PrinterErr;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterErrTest {
    @Test
    public void test1(){
        String expected = "0/14";
        String cadena = "aaabbbbhaijjjm";
        assertEquals(expected, PrinterErr.printerError(cadena));
    }
}