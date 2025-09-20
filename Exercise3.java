
package exercise3;

import java.util.Scanner;

public class Exercise3 {

    
    public static void main(String[] args) {
          // Swap Two Number
        Scanner input = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int a = input.nextInt();
        System.out.println("enter the 2nd number: ");
        int b = input.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("after swap  the first number is: " + a);
        System.out.println("after  swap  Second number is: " + b);
        
    }
    
}
