package test.normalTests;

import normal.LongestConsec;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecTest {

    @Test
    public void test(){
        String[] en = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int n=2;
        String expected = "abigailtheta";
        assertEquals(LongestConsec.longestConsec(en,n),expected);
    }

    @Test
    public void test2(){
        String[] en = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        int n =1;
        String expected = "oocccffuucccjjjkkkjyyyeehh";
        assertEquals(LongestConsec.longestConsec(en,n),expected);
    }
    @Test
    public void test3(){
        String[] en = {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};
        int n =2;
        String expected = "wlwsasphmxxowiaxujylentrklctozmymu";
        assertEquals(expected,LongestConsec.longestConsec(en,n));
    }

    @Test
    public void test4(){
        String[] en = {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"};
        int n =3;
        String expected = "ixoyx3452zzzzzzzzzzzz";
        assertEquals(expected,LongestConsec.longestConsec(en,n));
    }

}