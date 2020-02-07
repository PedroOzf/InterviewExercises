package test.normalTests;

import normal.LongestSub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubTest {
    @Test
    public void test(){
        String en = "abcasaeva";
        int expected = 3;
        assertEquals(expected, LongestSub.lenghtOfLongest(en));
    }

    @Test
    public void test2(){
        String en = "dvdf";
        int expected = 3;
        assertEquals(expected, LongestSub.lenghtOfLongest(en));
    }

    @Test
    public void test3(){
        String en = "pwwkew";
        int expected = 3;
        assertEquals(expected, LongestSub.lenghtOfLongest(en));
    }

}