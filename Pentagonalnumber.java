
package pentagonalnumber;

import java.util.Scanner;


public class Pentagonalnumber {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");
      int n = input.nextInt();
      int result = getpentagonalnumber(n);
      for(int i =1;i<=result;i++){
          
          System.out.println("p("+i+")="+getpentagonalnumber(i));
          
       }

    }

    
 public static int getpentagonalnumber(int n){
      return n*(3*n-1)/2;
              
 }
       






}
