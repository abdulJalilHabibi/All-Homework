
package javaapplication83;

import java.util.Scanner;

public class JavaApplication83 {

    public static void main(String[] args) {
        // Sorting three integers from decresing to increasing
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a three integer number");    
        int num = input.nextInt();
        int x = num%10;
        int p = num/10;
        int y = p%10;
        int z = p/10;
        if(x>y && x>z){
        
            if(y>z){
                    System.out.println(z +" "+ y +" "+ x);
                }
           else if(z>y){
           System.out.println(y +" "+ z +" "+ x);
           }
            
        
        }
        else if(y>x && y>z){
            if(x>z){
                   System.out.println(z +" "+ x +" "+ y);
            }
            else if(z>x){
                   System.out.println(x +" "+ z +" "+ y);
            }
        }
        else if(z>x && z>y){
            if(x>y){
               System.out.println(y +" "+ x +" "+ z);
            }
            else if(y>x){
                   System.out.println(x +" "+ y +" "+ z);
            }
        }
    }
}
