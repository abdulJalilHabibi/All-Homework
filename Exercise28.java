
package javaapplication79;
import java.util.Scanner;

public class JavaApplication79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  integer value for a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x1 = (-b + Math.pow(b*b-4*a*c, 0.5))/2;
        double x2 = (-b - Math.pow(b*b-4*a*c, 0.5))/2;
        
        if(b*b-4*a*c>0){
            System.out.println("the equation has two real roots " + x1 + " and" + x2 );
      }
        else if(b*b-4*a*c==0){
            System.out.println("the equation has one real root " + x1);
        }      
        else{
            System.out.println("the equation has no real root");
        }    
        
    
    }
    
}
