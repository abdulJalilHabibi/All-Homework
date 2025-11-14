package computing.area.of.tringle;

import java.util.Scanner;

public class ComputingAreaOfTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        double side1 = input.nextDouble();
        System.out.println("Enter the second side of the triangle:");
        double side2 = input.nextDouble();
        System.out.println("Enter the third side of the triangle:");
        double side3 = input.nextDouble();

        double result = areaTriangle(side1, side2, side3);

        if(result == 0) {
            System.out.println("Invalid input! The sides do not form a triangle.");
        } else {
            System.out.println("The area of the triangle is " + result);
        }

    }

    public static double areaTriangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {

            return 0;
        }
    }
}
