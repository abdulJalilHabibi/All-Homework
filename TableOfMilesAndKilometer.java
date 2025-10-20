
package table.of.miles.and.kilometer;


public class TableOfMilesAndKilometer {

    public static void main(String[] args) {
        System.out.println("miles        kilometers");
    for(int miles = 1; miles<=10; miles++){
    double kilometers = miles*1.609;
        System.out.printf("%-10d%10.1f\n",miles,kilometers);
    }



    }
    
}
