
package javaapplication82;

import java.util.Scanner;

public class JavaApplication82 {

    public static void main(String[] args) {
        // Game: add three number
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int num3 = (int)(Math.random()*10);
        int result = num1+num2+num3;
        Scanner input = new Scanner(System.in);
        System.out.println("what is the sum of these number: " + num1 + " + " + num2 + " + " + num3 +"=?");
        int answer = input.nextInt();
        if(answer==result){
            System.out.println("the answer is correct! " );
        }
        else if(answer!=result){
            System.out.println("the asnwer is not correct!");
        }
        
        
    }
    
}
