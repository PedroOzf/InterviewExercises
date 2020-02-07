package test.basicTests;

import basics.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    Fibonacci fib = new Fibonacci();

    @Test
    public void testFibOfZero(){
        int number = 0;
        int expected = 1;
        assertEquals(expected,fib.getFib(number));
    }

    @Test
    public void testFib1(){
        int number = 6;
        int expected = 13;
        assertEquals(expected,fib.getFib(number));
    }


    @Test
    public void testFib2(){

        int number = 8;
        int expected = 34;
        assertEquals(expected,fib.getFib(number));
    }
    @Test
    public void testFib3(){

        int number = 10;
        int expected = 89;
        assertEquals(expected,fib.getFib(number));
    }


}