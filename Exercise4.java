
package exercise4;

import java.util.Scanner;


public class Exercise4 {

    public static void main(String[] args) {
         // Simple interset
        Scanner input = new Scanner(System.in);
      System.out.println("please enter the Rate: ");
      double Rate = input.nextDouble();
      System.out.println("please enter the principle: ");
      double Principle = input.nextDouble();
      System.out.println("please enter the year: ");
      int Year = input.nextInt();
      double IntersetRate = (Rate*Principle*Year)/100;
      System.out.println("the IntersetRate is: " + IntersetRate);
      
      
    }
    
}
