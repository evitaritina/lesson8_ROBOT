import java.lang.reflect.Array;
import java.util.Scanner;

public class Logic {
    Scanner sc = new Scanner(System.in);
//    int height  = sc.nextInt();
//    int width = sc.nextInt();
    int height  = 5;
    int width = 5;
    Moon moon = new Moon(height, width);
    Robot robot = new Robot();

    public int[][] createPlace(Moon moon) throws Exception {
        if (height <= 0) {
            throw new Exception(" ");
        }
        if (width <= 0) {
            throw new Exception(" ");
        } else {
            int[][] array = new int[height][width];
            for (int i = 0; i < array.length; i++) {
                System.out.println();
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            return array;

        }
    }


    public void goX(int x) throws Exception {
      int st1 = robot.getX();
        int move = x;
        int st2 = st1 + move;
        if (st2 < 0 || st2>height) {
            throw new Exception("Out of boundaries");
        }

 /*   public  void main(String[] args) throws Exception {
        int[][] array = new int[height][width];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    } */

    }

}
