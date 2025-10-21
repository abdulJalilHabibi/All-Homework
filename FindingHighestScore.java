package finding.highest.score;

import java.util.Scanner;



public class FindingHighestScore {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number of student");
    int num = input.nextInt();
    double highestScore = 0;
    String highestName = "";
    for(int student = 1; student<=num;student++){
        System.out.println("enter the name of  student ");
        String name = input.next();
        System.out.println("enter the score of  student");
        int score = input.nextInt();
    
    
    if(score>highestScore){
    highestScore = score;
    highestName = name;
    
    }
    }       
    
        System.out.println("the student with highest score is " +highestName+"with Score "+highestScore);
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
        
        
    }
    
}
