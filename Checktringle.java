package checktringle;

import java.util.Scanner;

public class Checktringle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first side of tringle");
        double side1 = input.nextInt();
        System.out.println("enter the second side of tringle");

        double side2 = input.nextInt();
        System.out.println("enter the third side of tringle");

        double side3 = input.nextInt();
        boolean myTringle = myTringle(side1, side2, side3);
        System.out.println(myTringle);
    }  

    public static boolean myTringle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }
}
