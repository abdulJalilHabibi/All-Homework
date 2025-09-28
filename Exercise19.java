
package javaapplication67;

import java.util.Scanner;

public class JavaApplication67 {

    public static void main(String[] args) {
        // Sum of digits
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 0 and 1000: ");
        int a = input.nextInt();
        int c = a%10;
        a = a/10;
        int b = a%10;
        a = a/10;
        int sum = a+b+c;
        System.out.println("the sum of digit is " + sum );
    }
    
}
