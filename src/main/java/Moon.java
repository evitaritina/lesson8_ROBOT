public class Moon {
    int height;
    int width;

    public Moon(int height, int width) {
        this.height = height;
        this.width = width;
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

