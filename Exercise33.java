




package javaapplication85;


import java.util.Scanner;

public class JavaApplication85 {

    public static void main(String[] args) {
        // finding the days of Month
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the Year: ");
        int year = input.nextInt();
        System.out.println("please enter the Month (1-12): ");
        int month = input.nextInt();
        switch(month){
            case 1:
                 System.out.println("january" + year +"has 31 days" );
            break;
            case 2:
                if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("febaruary" + year +" has 29 days");
            }
             else{
                 System.out.println(" febauary " + year + " has 28 days");
            }
            break;
            case 3:
                System.out.println(" march " + year +" has 31 days" ); 
                break;
            case 4:
            System.out.println(" april " + year +" has 30 days " );
            break;
            case 5:
             System.out.println(" may " + year +" has 31 days" );
            break;
            
            case 6:
              System.out.println(" june " + year +" has 30 days" );
            break;
            
            case 7:
               System.out.println(" july " + year +" has 31 days " );
            break;
            
            case 8:
               System.out.println(" August " + year +" has 31 days " );
            break;
            
            case 9:
                System.out.println(" september " + year +" has 30 days " );
            break;
            
            case 10:
               System.out.println(" October " + year +" has 31 days" );
            break;
            
            case 11:
                System.out.println(" Novemvber " + year +" has 30 days" );
            break;
            case 12:
            
                System.out.println(" December " + year + " has 31 days" );
            break;
            default:
                System.out.println(" invalid number! ");
                    
        }
     
       
        
        
        
        
        
        
        
        
        
        
        
           
        
    }
    
}
