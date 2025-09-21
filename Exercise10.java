
package exercise10;

import java.util.Scanner;


public class Exercise10 {

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("please enter the a three digit number");
     int x = input.nextInt();
     int y = x%10;
     int z = x/10;
     int p = z%10;
     int a = z/10;
     System.out.print(y);
     System.out.print(p);
     System.out.print(a);
     
     
     
    }
    
}
