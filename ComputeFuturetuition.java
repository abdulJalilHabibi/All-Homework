
package computefuturetuition;

public class ComputeFuturetuition {


    public static void main(String[] args) {
    double tuition = 10000;
    double rate = 0.05;
    for(int i = 1; i<=10;i++ ){
    tuition = tuition*(1+rate);
    }
        System.out.printf("the Tuition in 10 years is: $%.2f\n ", tuition ); 
    
    double totalCost = 0;
    for(int j =1; j<=4;j++){
    tuition = tuition*(1+rate);
    
    totalCost = totalCost+tuition;
    }
        System.out.printf("the totalcost in 4 years is: $%.2f\n ", totalCost ); 
 
        
        
        
        
    }
    
}
