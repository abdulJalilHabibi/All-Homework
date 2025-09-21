
package exercise13;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your Money to change into quarter,Dime,Nickle,pennie");
        double Money = input.nextDouble();
        int Dollar = (int)Money;
        int cent = (int)(Money*100)%100;
        int quarter = cent/25;
        int RemaningCent = cent%25;
        int Dime = RemaningCent/10;
        RemaningCent = RemaningCent%10;
        int Nickle = RemaningCent/5;
        int pennie = RemaningCent%5;
        System.out.println("Dollar: " + Dollar);
        System.out.println("quarter: " + quarter);
        System.out.println("Dime: " + Dime);
        System.out.println("Nickle: " + Nickle);
        System.out.println("pennie: " + pennie);
        
        
        
        

        
        
        
        
       

}
    }