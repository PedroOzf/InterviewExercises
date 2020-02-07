package test.normalTests;

import normal.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    @Test
    public void test1(){
        assertEquals(false,Parser.parsear("[(])"));
    }
    @Test
    public void test2(){
        assertEquals(true,Parser.parsear("(){}[]"));
    }
    @Test
    public void test3(){
        assertEquals(true,Parser.parsear("([{}])"));
    }
    @Test
    public void test4(){
        assertFalse(Parser.parsear("[({})](]"));
    }
}