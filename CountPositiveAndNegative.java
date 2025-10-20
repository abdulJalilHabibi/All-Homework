
package count.positive.and.negative;

import java.util.Scanner;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
    // count POsitive and negative and compute the average of number
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer , the input ends if its 0: ");
        int positive=0;
        int negative=0;
        int total = 0;
        int count = 0;
        
        int number = input.nextInt();
        while(number!=0){
       if(number>0){
       positive++;
       }
       else if(number<0){
           negative++;
       } 
       total +=number;
        count++;
        System.out.println("enter an integer , the input ends if its 0: ");
        number = input.nextInt();
        }
       if(count==0){
           System.out.println("no number entered except 0 ");
       }
        
       else{
        double ave = (double)total/count;
        System.out.println("the average of this number is " + ave);
       }         
        System.out.println("the poisitive number is " + positive );
        System.out.println("the negative number is " + negative);
        System.out.println("the total is " + total);
 
        
        
        
        
    }
    
        
        
        
        
        
        
    
}

    