
package exercise8;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
       // Maximum of Two Number
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the 1st number: ");
    int num1 = input.nextInt();
    System.out.println("please enter the 2nd number: ");
    int num2 = input.nextInt();
    if(num1>num2){
        System.out.println("the 1st number "+ num1 +" is greather then 2nd number "+ num2);
    
    }
    else{
        System.out.println("the 2nd number "+ num2 +" is greather then 1st number "+ num1);
    
    }
    
    
    }
    
}
