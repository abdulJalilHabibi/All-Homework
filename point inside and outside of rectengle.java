
package javaapplication92;

import java.util.Scanner;

public class JavaApplication92 {

    public static void main(String[] args) {
    //
     Scanner input = new Scanner(System.in);
    System.out.println("please enter a x cordinate: ");
    double x = input.nextDouble();
    System.out.println("please enter a y cordinate: ");
    double y = input.nextDouble();
    double width = 10;
    double height = 5;
    if(Math.abs(x)<=width/2 && Math.abs(y)<=height/2){
        System.out.println("("+x +","+y +")" + "the point is inside of rectengle ");
    } 
    else{
        System.out.println("("+x +","+y +")" + "the point is outside of rectengle ");
    }
    
    
    
    
    

}
        }