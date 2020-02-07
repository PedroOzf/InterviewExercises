package test.basicTests;

import basics.PalindromeStr;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeStrTest {
    PalindromeStr ps = new PalindromeStr();
    @Test
    public void testPalindrome(){
        String string  = "aba";
        assertTrue(ps.isPalindrome(string));
    }
    @Test
    public void testPalindrome2(){
        String string  = "abaaba";
        assertTrue(ps.isPalindrome(string));
    }
    @Test
    public void testPalindrome3(){
        String string  = "qwerrty";
        assertTrue(!ps.isPalindrome(string));
    }
    @Test
    public void testPalindrome4(){
        String string  = "qwertyytrewq";
        assertTrue(ps.isPalindrome(string));
    }

}