
package javaapplication71;

import java.util.Scanner;

public class JavaApplication71 {

    public static void main(String[] args) {
        // Calculating Acceleration
       
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 1st velocity in m/s: ");
        double v0 = input.nextDouble();
        System.out.println("please enter the 2nd velocity in m/s: ");
        double v1 = input.nextDouble();
        System.out.println("please enter the time in seconds: ");
        double t = input.nextDouble();
        double a = (v1-v0)/t;
        System.out.println("the Acceleration is: " + a);
    }
    
}
