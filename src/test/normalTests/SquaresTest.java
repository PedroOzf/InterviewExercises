package test.normalTests;

import normal.Squares;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresTest {
    @Test
    public void test(){
        assertEquals(Squares.calculate(64),8);
    }
    @Test
    public void test2(){
        assertEquals(Squares.calculate(81),9);
    }
    @Test
    public void test3(){
        assertEquals(Squares.calculate(10000),100);
    }

}