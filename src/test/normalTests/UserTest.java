package test.normalTests;

import normal.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testInitRank(){
        User user =  new User();
        assertEquals(user.rank,-8);
    }

    @Test
    public void testInitProgress(){
        User user =  new User();
        assertEquals(user.progress,0);
    }

    @Test
    public void testProgress() throws Exception {
        User user =  new User();
        user.incProgress(-5);
        assertEquals(user.progress,90);
    }

    @Test
    public void testProgress2() throws Exception {
        User user =  new User();
        user.incProgress(-5);
        user.incProgress(-6);
        assertEquals(user.rank,-7);
    }

    @Test(expected = Exception.class)
    public void textExcep() throws Exception {
        User user =  new User();
        user.incProgress(-12);
    }

    @Test(expected = Exception.class)
    public void textExcepZ() throws Exception {
        User user =  new User();
        user.incProgress(0);
    }

    @Test(expected = Exception.class)
    public void textExcepTop() throws Exception {
        User user =  new User();
        user.incProgress(10);
    }
}