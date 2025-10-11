
package asciicode;

import java.util.Scanner;


public class ASCIIcode {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an ACSII code between (0-127) ");
    int code = input.nextInt();
    char co = (char)code;
        System.out.println("the character for ASCII code " + code + " is " + co);
    
    
    
    
    }
    
}
