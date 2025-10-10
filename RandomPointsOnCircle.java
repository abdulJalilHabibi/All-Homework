
package randompointsoncircle;

import java.util.Scanner;

public class RandomPointsOnCircle {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int radius = 40;
    double a1 = Math.random()*2*Math.PI;
    double x1 = radius*Math.cos(a1);
    double y1 = radius*Math.sin(a1);
  
    double a2 = Math.random()*2*Math.PI;
    double x2 = radius*Math.cos(a2);
    double y2 = radius*Math.cos(a2);
    
    double a3 = Math.random()*2*Math.PI;
    double x3 = radius*Math.cos(a3);
    double y3 = radius*Math.cos(a3);
    

    double a = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
    double b = Math.sqrt(Math.pow((x3-x2),2) + Math.pow(y3-y2, 2));
    double c = Math.sqrt(Math.pow((x1-x3),2) + Math.pow(y3-y1,2));
    
    double A = (b*b+c*c-a*a)/2*b*c;
    double B = (a*a+c*c-b*b)/2*a*c;
    double C = (b*b+a*a-c*c)/2*a*b;
    
        System.out.println("the Angle A is " + A);
        System.out.println("the Angle B is " + B);
        System.out.println("the Angle C is " + C);

    
    
    
    


    
    
    
    }
    
}
