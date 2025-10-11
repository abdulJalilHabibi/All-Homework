
package unicode;

import java.util.Scanner;


public class Unicode {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a character ");  
   char ch = input.next().charAt(0);
   int unicode = (int)ch;
        System.out.println("the unicode for "+ch+" is "+unicode);
   
    
    
      
      
}

    }