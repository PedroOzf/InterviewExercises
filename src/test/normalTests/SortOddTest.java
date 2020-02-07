package test.normalTests;

import normal.SortOdd;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortOddTest {
    @Test
    public void test1(){
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

}