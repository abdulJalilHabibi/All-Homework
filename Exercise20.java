
package javaapplication68;
import java.util.Scanner;
public class JavaApplication68 {

    public static void main(String[] args) {
       // Find the Number of Year
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the number of minutes");
    int min = input.nextInt();
    int Year = min/525600;
    int RemaningMin = min%525600;
    int Day = RemaningMin/1440;   
    
    System.out.println(min + " is " + Year+ " Years " + " and " + Day + " days ");
    
    }
    
}
