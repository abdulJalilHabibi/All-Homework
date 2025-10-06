
package javaapplication91;

import java.util.Scanner;

public class JavaApplication91 {

    public static void main(String[] args) {
        // 
    Scanner input = new Scanner(System.in);
    System.out.println("please enter a Point(x,y): ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    double distance = Math.sqrt(x*x+y*y);
    if(distance<=10 ){
        System.out.println("("+ x +","+ y +")"+" the point is inside of circle ");
    }
    else{
        System.out.println("("+ x +","+ y +")" +" the point is outside of the circle ");
    }
        
        
    }
    
}
