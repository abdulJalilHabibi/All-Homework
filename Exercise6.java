
package exercise6;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
          // Sum of n Natural Number
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the natural number to sum: ");
        int num = input.nextInt();
        int sum = num*(num+1)/2;
        System.out.println("the sum of "+ num +" natural number is "+ sum);
        
    }
    
}
