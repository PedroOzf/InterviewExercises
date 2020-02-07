package test.normalTests;

import dynamicProgramming.ZerosOnes;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZerosOnesTest {
    @Test
    public void test(){
        String[] enunc={"10","0001","111001","1","0"};
        assertEquals(3, ZerosOnes.findMaxForm(enunc,5,3));
    }

}