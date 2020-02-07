package test.normalTests;

import normal.JadenCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class JadenCaseTest {

    @Test
    public void test1(){
        String expected = "";
        JadenCase jc = new JadenCase();
        assertEquals(expected,jc.toJadenCase("he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below."));
    }

}