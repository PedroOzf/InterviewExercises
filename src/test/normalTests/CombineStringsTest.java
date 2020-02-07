package test.normalTests;

import normal.CombineStrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombineStringsTest {

    @Test
    public void test1(){
        CombineStrings cs = new CombineStrings();
        String str1 = "abc";
        String str2 = "def";
        String str3="dabecf";
        assertTrue(cs.isValid(str1,str2,str3));
    }

    @Test
    public void test2(){
        CombineStrings cs = new CombineStrings();
        String str1 = "abc";
        String str2 = "def";
        String str3="fabecd";
        assertFalse(cs.isValid(str1,str2,str3));
    }


}