
package divisibleby5or6;

public class DivisibleBy5or6 {

    public static void main(String[] args) {
      int count = 0;
        for(int i =100; i<=200;i++){
       if(i%5==0){
        count++;   
           System.out.print(i + " ");
           if(count%10==0){
               System.out.println();
           }
       }
       else if(i%6==0){
          count++; 
           System.out.print(i+ " ");
           if(count%10==0){
               System.out.println("\n");
           }
       }
       }
    }
}
    
