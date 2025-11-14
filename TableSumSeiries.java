package tablesumseiries;


public class TableSumSeiries {

    public static void main(String[] args) {
         System.out.println("i\tm(i)");
        for(int i=1;i<=20;i++){
            System.out.printf("%d\t%.4f%n", i, m(i));
        
            }
        
    }

    public static double m(int i){
        double sum = 0;
        for(int n = 1; n<=i;n++){
            sum+= (double)n/(n+1);
    }
        return sum;
        
    }
    
}
