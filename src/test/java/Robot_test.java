import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Robot_test {

    private Moon moon;

    @Test
    public void testRobotPosition() {
        Moon moon = new Moon(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Robot robot = new Robot(moon);
        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());

    }

    @Test
    public void testRobotGoX_HappyPass() throws Exception {
        Moon moon = new Moon(10, 10);
        Robot robot = new Robot(moon);
        robot.moveX(2);
        assertEquals(2, robot.getX());
    }

    @Test
    public void testRobotGoY_HappyPass() throws Exception {
        Moon moon = new Moon(10, 10);
        Robot robot = new Robot(moon);
        robot.moveY(8);
        assertEquals(8, robot.getY());
    }


    @Test
    public void testRobotGoXY_HappyPass() throws Exception {
        Moon moon = new Moon(10, 10);
        Robot robot = new Robot(moon);
        robot.moveX(5);
        assertEquals("Can't move, out of boundaries", 5, robot.getX());
        robot.moveY(8);
        assertEquals("Can't move, out of boundaries", 8, robot.getY());
        robot.moveX(4);
        assertEquals("Can't move, out of boundaries", 9, robot.getX());

    }

    @Test
    public void testRobotGoXNeg_1() {
        Moon moon = new Moon(3, 4);
        Robot robot = new Robot(moon);
        try {
            robot.moveX(5);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("not out of boundaries", "x should be between 0 and < as 3 but x is 5", e.getMessage());
        }
    }

    @Test
    public void testRobotGoXNeg_2() {
        Moon moon = new Moon(3, 4);
        Robot robot = new Robot(moon);
        try {
            robot.moveX(-1);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("not out of boundaries", "x should be between 0 and < as 3 but x is -1", e.getMessage());
        }
    }

    @Test
    public void testRobotGoYNeg_1() {
        Moon moon = new Moon(5, 5);
        Robot robot = new Robot(moon);
        try {
           robot.moveY(5);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("not out of boundaries", "y should be between 0 and < as 5 but y is 5", e.getMessage());
        }
    }

    @Test
    public void testRobotGoYNeg_2() {
        Moon moon = new Moon(5, 5);
        Robot robot = new Robot(moon);
        try {
           robot.moveY(-1);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("not out of boundaries", "y should be between 0 and < as 5 but y is -1", e.getMessage());
        }
    }
}
