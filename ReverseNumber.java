
package reverse.number;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter a  number to reverse ");
    int n = s.nextInt();
    int reverse = reverseNumber(n);
    if(isPalindrome(n)){
        System.out.println("the number is palindrome and the reverse number is " + reverse);
    
    }
    else{
        System.out.println("the number is not palindrome and the reverse number is " + reverse);

    }
    
    
    
    
    
 
    
    
    
    }

public static int reverseNumber(int number){
    int reverse = 0;
    while(number!=0){
        int digit = number%10;
        reverse = reverse*10+digit;
        number = number/10;
    }
    return reverse;

}
    
 public static boolean isPalindrome(int number){
 
 
 return number ==reverseNumber(number);
 
 
 }
    
}
