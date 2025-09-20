
package exercise7;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
         // Convet celisius to fahrenheit
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the celisius degree: ");
        double C = input.nextDouble();
        double Fahrenheit = 9/5*C+32;
        System.out.println(Fahrenheit);
        
    }
    
}
