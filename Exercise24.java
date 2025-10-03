
package javaapplication73;
import java.util.Scanner;
public class JavaApplication73 {

    public static void main(String[] args) {
        // Computing Distance of two points
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 1st point x1: ");
        double x1 = input.nextDouble();
        System.out.println("please enter the 1st point y1: ");
        double y1 = input.nextDouble();
        System.out.println("please enter the 2nd point x2: ");
        double x2 = input.nextDouble();
        System.out.println("please enter the 2nd point y2: ");
        double y2 = input.nextDouble();
        double Distance =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("the distance of two point is: " + Distance);

    }
    
}
