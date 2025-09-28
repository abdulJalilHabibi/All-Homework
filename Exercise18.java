
package javaapplication65;

import java.util.Scanner;

public class JavaApplication65 {

  
    public static void main(String[] args) {
        //Financial application
        
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the subtotal: ");
        int subtotal = input.nextInt();
        System.out.println("please enter the Gratuity rate: ");
        double GratuityRate = input.nextDouble();
        double Gratuity = (subtotal*GratuityRate)/100;
        double Total = subtotal+Gratuity;
        System.out.println("the gartuityRate is $"+ Gratuity + " and Total is $" + Total );
    }
    
}
