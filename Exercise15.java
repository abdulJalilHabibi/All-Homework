
package exercise15;

import java.util.Scanner;

public class Exercise15 {

    
    public static void main(String[] args) {
        // Computing Body Mass index(BMI)
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your weight in kilogram");
        double weight = input.nextDouble();
        System.out.println("please enter your height in in meters");
        double height = input.nextDouble();
        double BMI = weight/height;
        if(BMI<18.5){
            System.out.println("your BMI is "+ BMI +" and your are Underweight ");
        }
        else if(BMI>=18.5 && BMI<25.0){
            System.out.println("your BMI is " + BMI +" and you are Normal");
        }
        else if(BMI>=25.0 && BMI<30.0){
            System.out.println("your BMI is "+ BMI +" and you are Overweight");
        }
        else{
            System.out.println("your BMI is "+ BMI +" and You are Obese");
        }
            
    
}
}