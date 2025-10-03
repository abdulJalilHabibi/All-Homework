
package javaapplication72;

import java.util.Scanner;

public class JavaApplication72 {

    public static void main(String[] args) {
        // Finding Runawy Length
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the velocity in m/s: ");
        double V = input.nextDouble();
        System.out.println("please enter the Acceleration in m/s*s: ");
        double a = input.nextDouble();
        double MRL = (Math.pow(V, 2))/(2*a);
        System.out.println("the Minimum runaway lenght for this airoplane is: " + MRL);
        
        
    }
    
}
