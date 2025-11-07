package sort;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();
        System.out.println("enter the third number");
        int num3 = input.nextInt();
        sort(num1,num2,num3);

    }

    public static void sort(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("in decreasing order is " + num1 + " > "+num2 +" > " +num3);
            } else {
                System.out.println("in decreasing order is " + num1 + " > "+num3 +" > " +num2);

            }

        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("in decreasing order is " + num2 +" > "+ num1 + " > " +num3);

            } else {
                System.out.println("in decreasing order is " + num2 + " > "+num3 +" > " +num1);

            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println("in decreasing order is " + num3 +" > " +num1 +" > " +num2);

            } else {
                System.out.println("in decreasing order is " + num3 +" > " +num2 + " > "+num1);

            }

        }

    }
}
