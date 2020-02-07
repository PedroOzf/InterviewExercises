package test.normalTests;

import normal.ExesOhs;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExesOhsTest {

    @Test
    public void test1(){
        String str = "ooxx";
        assertTrue(ExesOhs.getXO(str));
    }

    @Test
    public void test2(){
        String str = "OoxxoX";
        assertTrue(ExesOhs.getXO(str));
    }
    @Test
    public void test3(){
        String str = "QWEQWE";
        assertTrue(ExesOhs.getXO(str));
    }
}