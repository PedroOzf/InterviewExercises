package test.normalTests;

import normal.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    @Test
    public void test(){
        assertTrue(Robot.isRobot("GGGR"));
    }

}