
package exercise14;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
      // Practice of Subtract
      
      int num1 = (int)(Math.random()*10);
      int num2 = (int)(Math.random()*10);
      if(num1>num2){
      num2 = num1;
      num2 = num1;
      }
        System.out.println("what is the value of " + num2 + "-" + num1 + "?");
        Scanner input = new Scanner(System.in);
        int Result = input.nextInt();
        if(num1-num2==Result){
            System.out.println("the answer is correct ");
        }
        else{
            System.out.println("the answer is not correct ");
        }
    
    }
    
}
