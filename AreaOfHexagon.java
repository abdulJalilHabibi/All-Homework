
package areaofhexagon;

import java.util.Scanner;

public class AreaOfHexagon {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the side of hexagon ");
    double s = input.nextDouble();
    double Area = (6*s*s)/(4*Math.tan(Math.PI/6));
        System.out.println("the Area of hexagone is " + Area);
    


    
    }
    
}
