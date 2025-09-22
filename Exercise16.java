
package exercise16;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        // Computing Taxes In Afghanistan
        Scanner input =  new Scanner(System.in);
        System.out.println("enter your salary per Month in afghani ");
        double salary = input.nextDouble();
        double tax = 0;
        if(salary<=5000){
        tax = 0;
        }
        else if(salary<=12500){
            tax = (salary-5000)*0.02;        
        }
        else if(salary<=100000){
        tax = (salary-12500)*0.10+(7500*0.02);
        }
        else {
         tax = (salary-100000)*(0.20+87500*0.10)+(7500*0.02);
        }
         
        System.out.println("your payable tax is " + tax);
    }
}