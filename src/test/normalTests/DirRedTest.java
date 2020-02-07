package test.normalTests;

import normal.DirRed;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirRedTest {
    @Test
    public void testSimpleDirReduc() {
        String[] direcciones = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] expected = {"WEST"};
        assertArrayEquals(expected, DirRed.optimizar(direcciones));
    }
}