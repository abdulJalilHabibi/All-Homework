
package javaapplication88;

import java.util.Scanner;

public class JavaApplication88 {

    public static void main(String[] args) {
    // Cost Of Shipping
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the weight of package! ");
    double weight = input.nextDouble();
    if(weight>0 && weight<=1){
        System.out.println("your Cost is 3.5$ ");
    }
    else if(weight>1 && weight<=3){
        System.out.println("your Cost is 5.5$ ");
    }
    else if(weight>3 && weight<=10){
        System.out.println("your Cost is 8.5$ ");
    }
    else if(weight>10 && weight<=20){
        System.out.println("your Cost is 10.5$ ");
    }    
    else if(weight>20){
        System.out.println("your Package cannot shipped");
    }    
    else{
        System.out.println("inavalid input!");
    }    
        
        
        
    }
    
}
