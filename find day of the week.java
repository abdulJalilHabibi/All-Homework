
package javaapplication90;

import java.util.Scanner;

public class JavaApplication90 {

    public static void main(String[] args) {
    // findnig day of the week
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the Year: ");
    int Year = input.nextInt();
    int j = Year/100;
    int k = Year%100;
    System.out.println("please enter the month(1-12): ");
    int m = input.nextInt();
    System.out.println("please enter the day of the month(1-31): ");
    int q = input.nextInt();
    int h = ((q) + (26* (m+1)/10) + (k) + (k/4) + (j/4)+ (5*j))%7;
        System.out.println(h);
    
        
    switch(h){
        case 0:
            System.out.println("Day of the week is saturday");
        break;
    
        case 1:
            System.out.println("Day of the week is  sunday");
        break;
    
        case 2:
            System.out.println("Day of the week is monday");
        break;
    
        case 3:
            System.out.println("Day of the week is tuesday");
        break;
    
        case 4:
            System.out.println("Day of the week is wedensday");
        break;
    
        case 5:
            System.out.println("Day of the week is thursday");
        break;
    
        case 6:
            System.out.println("Day of the week is friday");
        break;
        
        default:
            System.out.println("invalid number");
        
        
    }
    
    
    }
    
}
