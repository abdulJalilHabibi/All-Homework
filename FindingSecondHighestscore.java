
package findingsecondhighestscore;

import java.util.Scanner;

public class FindingSecondHighestscore {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number of student ");
    int num = input.nextInt();
    int highestScore =0;
    String highestName ="";
    int secondHighestScore = 0;
    String secondHighestName = "";
    int score = 0;
    int thirdHighestScore = 0;
    String thirdHighestName = "";
    
    for(int i = 1; i<=num; i++){
    System.out.println("enter the name ");
    String name = input.next();
    System.out.println("enter the score ");
     score = input.nextInt();
    
    
    if(score>highestScore){
    secondHighestScore = highestScore;
    secondHighestName = highestName;   
    
    
    highestName = name;
    highestScore = score;
    
    
    }
    else if(score>secondHighestScore){
    secondHighestScore = score;    
    secondHighestName = name;
    }
   
    }
    
    
    
    
   System.out.println("The highest score is " + highestScore + " by " + highestName);
   System.out.println("The second highest score is " + secondHighestScore + " by " + secondHighestName);
        
        
        
        
        
        
    }
    
}
