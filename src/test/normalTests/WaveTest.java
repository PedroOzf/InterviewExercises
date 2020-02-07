package test.normalTests;

import normal.Wave;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WaveTest {
    @Test
    public void test(){
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, Wave.wave("hello"));
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        String[] as = Wave.wave(" gap ");
        assertArrayEquals(result, as);
    }

}