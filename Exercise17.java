
package exercise17;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
    // Lottery Game!
    
    int Lottery = (int)(Math.random()*100);
    Scanner input = new Scanner(System.in);
    System.out.println("please enter a two digit number! ");
    int user = input.nextInt();
    int Lottery1 = Lottery/10;
    int Lottery2 = Lottery%10;
    
    int user1 = user/10;
    int user2 = user%10;
    if(user==Lottery){
        System.out.println("You win! $10000 " + " the Lottery number is" + Lottery);
    }
    else if(Lottery1==user2 && Lottery2==user1 ){
        System.out.println("you win! $3000 " + " the Lottery number is" + Lottery);
    } 
    else if(Lottery1==user2 || Lottery2==user2 || Lottery1==user1 || Lottery2==user2){
        System.out.println("you win! $1000 " + " the Lottery number is" + Lottery);
    }
    else{
        System.out.println("you lose the game! "+ " the Lottery number is" + Lottery);
    }
    
    }
    
}
