
package areaofpolygon;

import java.util.Scanner;

public class AreaOfPolygon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of sides ");
        int n = input.nextInt();
        System.out.println("enter the side of Polygon ");
        double s = input.nextDouble();
        double Area = (n*s*s)/(4*Math.tan(Math.PI/n));
        System.out.println("the Area of this polygon is " + Area);
        
        
        
    }
    
}
