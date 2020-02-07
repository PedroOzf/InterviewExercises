package test.basicTests;

import basics.PrimeNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {
    PrimeNumber pN = new PrimeNumber();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPrimeNumbers1(){
        int number = 5;
        assertTrue(pN.isPrime(number));
    }
    @Test
    public void testPrimeNumbers2(){
        int number = 0;
        assertTrue(pN.isPrime(number));
    }
    @Test
    public void testPrimeNumbers3(){
        int number = 12;
        assertTrue(!pN.isPrime(number));
    }
    @Test
    public void testPrimeNumbers4(){
        int number = 79;
        assertTrue(pN.isPrime(number));
    }
}