
package exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        //caculate the area of circle
       
        System.out.println("please enter the value of radius");
        Scanner input = new Scanner(System.in);
        
        double R = input.nextDouble();
        final double PI = 3.14;
        double area = R*R*3.14;
        System.out.println(area);
        
        
    }
    
}
