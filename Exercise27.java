
package javaapplication77;

import java.util.Scanner;


public class JavaApplication77 {

    
    public static void main(String[] args) {
     // calculate interset
        Scanner input = new Scanner(System.in);
        System.out.println("please enter balance: ");
        double balance = input.nextDouble();
        System.out.println("please enter interset rate: ");
        double annual_interset_Rate = input.nextDouble();
        double interset = balance*(annual_interset_Rate/1200);
        System.out.println("the interset is: "+ interset);
        
        



    }
    
}
