package test.normalTests;

import normal.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberTest {
    @Test
    public void test1(){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(a));
    }

    @Test
    public void test2(){
        int[] a = {3, 2, 1, 7, 5, 6, 7, 8, 9, 0};
        assertEquals("(321) 756-7890", PhoneNumber.createPhoneNumber(a));
    }
    @Test
    public void test3(){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(a));
    }

}