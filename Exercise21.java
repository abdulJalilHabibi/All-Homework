
package javaapplication70;

import java.util.Scanner;

public class JavaApplication70 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the amount of water in kilogram: ");
        double amountWater = input.nextDouble();
        System.out.println("please enter the initial temoreture : ");
        double initialTempreture = input.nextDouble();
        System.out.println("please enter the final tempreture : ");
        double finalTempreture = input.nextDouble();
        double Q = amountWater*(finalTempreture-initialTempreture)*4184;
        System.out.println("the energy needed: " + Q);


    }
    
}
