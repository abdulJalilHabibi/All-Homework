
package exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
          // perimetre of Rectengle
    Scanner input = new Scanner(System.in);  
    System.out.println("please enter the width of rectengle: ");
    double a = input.nextDouble();
    System.out.println("please enter lenght of rectengle: ");
    double b = input.nextDouble();
    double Perimeter = 2*(a+b);
    System.out.println("the perimeter of rectengle: "+ Perimeter);
      
    }
    
}
