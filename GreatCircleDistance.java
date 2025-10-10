
package great.circle.distance;

import java.util.Scanner;

public class GreatCircleDistance {


public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final double radius = 6371.01;
    System.out.println("enter the point 1 (latitiude,lontitude) in degrees");
    double x1 = Math.toRadians(input.nextDouble());
    double y1 = Math.toRadians(input.nextDouble());
    System.out.println("enter the point 2 (latitude,lontitude) in degrees");
    double x2 = Math.toRadians(input.nextDouble());
    double y2 = Math.toRadians(input.nextDouble());
    double d = radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y2-y1));
    System.out.println("the distance between the two points is " + d);
    
    
   

    
    
    
    


        }
    }
    


