package celsiustofahrenhite;

import java.util.Scanner;

public class Celsiustofahrenhite {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the celsius to change into fahrenhite");
    double result1 = input.nextDouble();
    System.out.println("enter the fahrenhite to change into celsius");
    double result2 = input.nextDouble();
    double resultFahrenhite = celsiustofahrenhite(result1);
    double resultCelisus = fahrenhiteToCelisus(result2);
    
    System.out.println("the "+result1+" celsius into fahrenhite is " + resultFahrenhite);
    System.out.println("the "+result2+" fahrenhite into celsius is " + resultCelisus);
    

    
    
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
