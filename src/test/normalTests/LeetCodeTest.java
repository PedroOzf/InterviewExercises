package test.normalTests;

import normal.LeetCode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCodeTest {
    @Test
    public void test(){
        List<Integer> l1 = new ArrayList<>(){{add(2);
            add(4);
            add(3);}};

        List<Integer> l2 = new ArrayList<>(){{add(5);
            add(6);
            add(4);}};
        List<Integer> l3 = new ArrayList<>(){{add(7);
            add(0);
            add(8);}};

        LeetCode lc = new LeetCode();
        assertEquals(l3,lc.addTwoNumbers(l1,l2));


    }

}