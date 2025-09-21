
package exercise9;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
       // Check Leap Year
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the Year that its leap year or not ");
    int Year = input.nextInt();
    if(Year%4==0){
       
        if(Year%100!=0){
        
            
            if(Year%400==0){
                System.out.println(Year+" is the Leap Year");
}
    else{    
            System.out.println(Year + "is the leap Year");
          
            }
}
                   
    else{
        System.out.println(Year + " is not the Leap Year");
    }
        
}
    else{
        System.out.println(Year + " is not the Leap Year");
                   
    }
}
        
        
    
    }


    
    
    
    

