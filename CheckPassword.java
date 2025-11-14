package check.password;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the password: ");
        String P = input.nextLine();
        if(isValidPassword(P)){
            System.out.println("your password is correct");
        }
        else{
            System.out.println("your password is incorrect");
        }
       
    }

    public static boolean isValidPassword(String password) {
        if(password.length()<8){
            return false;
            }
        int digitCount = 0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isDigit(ch)){
                digitCount++;
            }
            
            
            }
        
        return digitCount >=2;
    }
    
}
