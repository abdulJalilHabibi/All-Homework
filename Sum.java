
package sum;

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("enter a number to sum all of digit");
   int number  = input.nextInt();
    long result = sumDigits(number);
        System.out.println("the sum of All Digit Number is " +result);
    }
       
    
    public static long sumDigits(long n){
        int sum = 0;
        while (n>0){
        long digit = n%10;
        sum +=digit;
        n = n/10;
        
        }
        return sum;
    
    }



}
     
       

   
    
    
    
    
    
    
    








