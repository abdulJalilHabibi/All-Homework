
package javaapplication87;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication87 {

    public static void main(String[] args) {
    // Game: scissor,rock,paper
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int num = rand.nextInt(3);
    System.out.println("(enter 0 for scissor),(1 for rock) ,(2 for paper)");
    int user = input.nextInt();
    if(num==0 && user==0 || num==1 && user==1 || num==2 && user==2){
        System.out.println("the Game is draw");
    }    
    else if(num==0 && user==1){
        System.out.println(" the computer is scissor and you rock ----> you win ");
    }
    else if(num==0 && user==2){
        System.out.println(" the computer is scissor and you paper ----> computer win");
    }
    else if(num==1 && user==0){
        System.out.println("the computer is rock and you scissor ----> computer win");
    }
    else if(num==1 && user==2){
        System.out.println("the computer is rock and you paper ----> you win");
    }
    else if(num==2 && user==0){
        System.out.println("the computer is paper and you scissor ----> you win");
    }
    else if(num==2 && user==1){
        System.out.println("the computer is paper and you rock ----> computer win");
    }
    else{
        System.out.println(" invalid number! ");
    }
    
    
    
    
    
    }
}
