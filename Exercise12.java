
package exercise12;

import java.util.Scanner;


public class Exercise12 {

    public static void main(String[] args) {
       
     // Computing Loan Pyments
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the Intersetrate: ");
    int IntersetRate = input.nextInt();
    System.out.println("please enter the number of Year: ");
    int year = input.nextInt();
    System.out.println("please enter the LoanAmount: ");
    int LoanAmount = input.nextInt();
    double MonthlyPayment = (LoanAmount*IntersetRate)/1-1/Math.pow(1+IntersetRate, year*12);
        System.out.println("the MonthlyPayment is: " + MonthlyPayment);    
     
    }
    
}
