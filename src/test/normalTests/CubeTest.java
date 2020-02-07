package test.normalTests;

import normal.Cube;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {

    @Test
    public void test1(){
        long t = 1071225;
        assertEquals(45, Cube.cube(t));

    }

}