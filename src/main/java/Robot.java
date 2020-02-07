public class Robot {
    String name;

    private int x, y;

    public Robot() {
        this.x = 0;
        this.y = 0;
    }

    public void moveX(int x) {
        this.x = this.x + x;
    }

    public void moveY(int y) {
        this.y = this.y + y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
