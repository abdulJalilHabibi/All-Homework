package tableof.celsisus.into.fahrenhite;

import java.util.Scanner;

public class TableOfCelsisusIntoFahrenhite {

public static void main(String[] args) {
    System.out.println("celsius   fahrenhite  |  fahrenhite     celsius ");
    System.out.println("---------------------------------------------------");
    int fahrenhite = 30;
    for(int i=31;i<=40;i++,fahrenhite+=10){
        double toFahrenhite = celsiustofahrenhite(i);
        double toCelsisus = fahrenhiteToCelisus(fahrenhite);
        
          System.out.printf("%-9d%10.2f   |   %-12d%8.2f%n",
                    i, toFahrenhite, fahrenhite, toCelsisus);
    
        }
    
    
    
    
    
 
}



public static double celsiustofahrenhite(double celsius){
    double fahrenhite = 0;
    return  fahrenhite = (9.0/5)*celsius+32;
    
    }
    
public static double fahrenhiteToCelisus(double fahrenhite){
double celsius = 0;
    return celsius = (5.0/9)*(fahrenhite-32); 

}




}