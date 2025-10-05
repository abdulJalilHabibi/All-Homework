
package javaapplication76;
import java.util.Scanner;

public class JavaApplication76 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("please enter a three digit number: ");
    int num = input.nextInt();
    int x = num%10;
    int p = num/10;
    int y = p%10;
    int z = p/10;
    if(x==z){
        System.out.println("its palindrome");
    }
    else{
        System.out.println("its not palindrome");
    }
    
        
    
    }
}
