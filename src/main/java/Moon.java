public class Moon {

    int height;
    int width;
    Robot robot;

    public Moon(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }


    public void moveRobotX(Moon moon, int x) throws Exception {
        Robot robot = new Robot();
        if (robot.getX() + x < 0 || robot.getX() + x >= moon.height) {
            throw new Exception("x should be between 0 and < as " + moon.height + " but x is " + x);
        } else {
            robot.moveX(x);
        }
    }

    public void moveRobotY(Moon moon, int y) throws Exception {
        Robot robot = new Robot();
        if (robot.getY() + y < 0 || robot.getY() + y >= moon.width) {
            throw new Exception("y should be between 0 and < as " + moon.width + " but y is " + y);
        } else {
            robot.moveY(y);
        }
    }

    public void createPlace(Moon moon) throws Exception {
        if (height <= 0) {
            throw new Exception("Hight must be positive, but is " + height);
        }
        if (width <= 0) {
            throw new Exception("Width must be positive, but is " + width);
        }
    }
}

