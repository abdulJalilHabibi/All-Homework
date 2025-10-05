
package javaapplication86;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication86 {

    public static void main(String[] args) {
    // Game Tails and Heads
    Scanner input = new Scanner(System.in);
    Random  rand = new Random();
    int coin = rand.nextInt(2);
    System.out.println("enter 0 for Heads and 1 for Tails ");
    int guess = input.nextInt();
    if(coin==0){
        System.out.println("the coin is heads ");
    }
    else{
        System.out.println("the coin is Tails ");
        }   
    if(guess==coin){
        System.out.println("Your Guess is correct! ");
    }
    else{
        System.out.println("your Guess is incorrect! ");
    
    }
    
    
    
    
}
    }