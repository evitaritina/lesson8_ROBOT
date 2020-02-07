import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Moon_test {

    @Test
    public void testRobotPosition() {
        Robot robot = new Robot();
        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());

    }

    @Test
    public void testRobotPosition_exc() {
        Robot robot = new Robot();
        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());
        try {
            robot.moveX(-3);
            fail("out of boundaries");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Test
    public void testRobotGoX() {
        Robot robot = new Robot();
        robot.moveX(2);
        robot.moveY(3);
        assertEquals(2, robot.getX());
        assertEquals(3, robot.getY());
    }



}
