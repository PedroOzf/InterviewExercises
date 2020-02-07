package test.normalTests;

import normal.PathFinder;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathFinderTest {
    @Test
    public void test(){
        String a = ".W."+
                ".W."+
                "...";
        assertEquals(true, PathFinder.find(a));
    }

    @Test
    public void test2(){
        String d = "......\n"+
                "......\n"+
                "......\n"+
                "......\n"+
                ".....W\n"+
                "....W.";
        assertEquals(false, PathFinder.find(d));
    }

    @Test
    public void test3(){
        String b = ".W.\n"+
                ".W.\n"+
                "W..";
        assertEquals(false,PathFinder.find(b));
    }

    @Test
    public void test4(){
        String b = ".W.\n"+
                ".W.\n"+
                "W..";
        assertEquals(false,PathFinder.find(b));
    }

}