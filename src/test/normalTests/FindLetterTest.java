package test.normalTests;

import normal.FindLetter;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLetterTest {

    @Test
    public void test1(){
        char[] str = {'a','b','c','d','f'};
        char expected = 'e';
        assertTrue(expected==FindLetter.find(str));
    }
    @Test
    public void test2(){
        char[] str = {'O','Q','R','S'};
        Character expected = 'P';
        assertTrue(expected==FindLetter.find(str));
    }

}