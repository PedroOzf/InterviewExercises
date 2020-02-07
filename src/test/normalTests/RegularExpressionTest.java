package test.normalTests;

import normal.RegularExpression;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    @Test
    public void test(){
        String str1 = "abbba";
        String str2 = "ab*a";
        assertTrue(RegularExpression.regex(str1,str2));
    }

}