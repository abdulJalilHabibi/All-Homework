package computecommission;


public class ComputeCommission {

    public static void main(String[] args) {
        System.out.println("sales Amount | Commission");
        System.out.println("---------------------------------");
        for(int i = 10000; i<=100000;i+=5000){
        double result = computeCommisson(i);
             System.out.printf("%-12d | %10.2f%n", i, result);

                    
        }
        
        
        
        
    }
public static double computeCommisson(double salesAmount){
    if(salesAmount<=5000){
        return salesAmount*0.08;
    }
    else if(salesAmount>5000 && salesAmount<=10000){
        return (5000*0.08)+(salesAmount-5000)*0.10;
    }    
    else{
    return (5000*0.08)+(5000*0.10)+(salesAmount-10000)*0.12;
        }    
        
    }
    


    
}
