package test.normalTests;

import org.junit.Test;

import static org.junit.Assert.*;

public class BabilonicoTest {
    @Test
    public void etst(){
        assertEquals(Babilonico.sqr(16),false);
    }

    @Test
    public void etst2(){
        assertEquals(Babilonico.sqr(9),false);
    }

}