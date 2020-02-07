package test.normalTests;

import normal.BestTravel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BestTravelTest {
    @Test
    public void test(){
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        int n = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
    }
}