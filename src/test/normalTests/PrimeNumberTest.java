package test.normalTests;

import normal.PrimeNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void test(){
        assertTrue(PrimeNumber.isPrime(23));
    }

    @Test
    public void test2(){
        assertFalse(PrimeNumber.isPrime(4));
    }

    @Test
    public void test3(){
        assertTrue(PrimeNumber.isPrime2(23));
    }

}