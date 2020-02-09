import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Moon_test {

    @Test
    public void testMoonHight0() {
        Moon moon = new Moon(0,2);
        try {
          moon.createPlace(moon);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("Hight must be positive, but is " +moon.height, e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMoonWidth0() {
        Moon moon = new Moon(2,0);
        try {
           moon.createPlace(moon);
            fail("exceptions was not throw");
        } catch (Exception e) {
            assertEquals("Width must be positive, but is " + moon.width, e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMoonSize22() throws Exception {
        Moon moon = new Moon(2,2);
          moon.createPlace(moon);
        assertEquals(2, moon.height);
        assertEquals(2, moon.width);
    }
}
