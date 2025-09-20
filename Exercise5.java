
package exercise5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
         // Even and odd number
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("the number is Even");
        }
        
        else{
            System.out.println("the number is odd");
        }
        
    }
    
}
