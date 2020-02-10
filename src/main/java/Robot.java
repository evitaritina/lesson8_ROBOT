public class Robot {
    String name;

    private int x, y;
    private Moon moon;

    public Robot(Moon moon) {
        this.moon = moon;
        this.x = 0;
        this.y = 0;
    }

    public void moveX(int x) throws Exception {
        // TODO check
        if (getX() + x < 0 || getX() + x >= moon.height) {
            throw new Exception("x should be between 0 and < as " + moon.height + " but x is " + (getX() + x));
        } else {
            this.x = this.x + x;
        }


    }

    public void moveY(int y) throws Exception{
        // TODO check
        if (getY() + y < 0 || getY() + y >= moon.width) {
            throw new Exception("y should be between 0 and < as " + moon.width + " but y is " + (getY() + y));
        } else {
            this.y = this.y + y;
        }

    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
