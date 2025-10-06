
package javaapplication89;
import java.util.Scanner;

public class JavaApplication89 {

    public static void main(String[] args) {
    // compute the perimeter of tringle
    Scanner input = new Scanner(System.in);
    System.out.println("enter the the 1st side of tringle");
    double s1 = input.nextDouble();
    System.out.println("enter the the 2nd side of tringle");
    double s2 = input.nextDouble();
    System.out.println("enter the the 3rd side of tringle");
    double s3 = input.nextDouble();
    double perimeter = (s1+s2+s3);
    if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2){
        System.out.println("the perimeter is " + perimeter );
    }
    else{
        System.out.println("invalid input(these edges cannot forms of tringle)");
    } 
    }
}


       
        
    
    
    
    
