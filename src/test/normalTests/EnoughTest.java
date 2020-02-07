package test.normalTests;

import normal.Enough;
import org.junit.Test;

import static normal.Enough.*;
import static org.junit.Assert.*;

public class EnoughTest {

    @Test
    public void test1(){
        int[] exp = {20,37,21};
        int[] res = {20,37,21,20};
        int n = 1;
        assertArrayEquals(delete(res,n),exp);
    }
    @Test
    public void test2(){
        int[] exp = {20,37,21};
        int[] res = {20,37,21,20,56,3456,234};
        int n = 1;
        assertArrayEquals(delete(res,n),exp);
    }
    @Test
    public void test3(){
        int[] exp = {1,1,1,1,1};
        int[] res = {1,1,1,1,1};
        int n = 5;
        assertArrayEquals(delete(res,n),exp);
    }

}