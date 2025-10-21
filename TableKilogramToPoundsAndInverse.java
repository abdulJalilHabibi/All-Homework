
package table.kilogram.to.pounds.and.inverse;


public class TableKilogramToPoundsAndInverse {
    public static void main(String[] args) {
        System.out.println("kilogram       pounds \t      pounds         kilogram");
        System.out.println("--------------------------------------------------------------------");
    int pound = 20;
    for(int kilo = 1; kilo<=199; kilo+=2){
        double pounds = kilo*2.2;
        double kilos = pounds/2.2;
        System.out.printf("%-10d%10.2f\t|\t%-10d%10.2f\n",kilo,pounds,pound,kilos);
    
    
    pound+=5;
    
    }    
    
    
    
    
    } 
} 

