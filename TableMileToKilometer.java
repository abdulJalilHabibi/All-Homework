package table.mile.to.kilometer;


public class TableMileToKilometer {
    public static void main(String[] args) {
        System.out.println("milles       kilometers      kilometers       miles       ");
        System.out.println("-------------------------  --------------------------------------------");
        
        int kilometeres = 20;
        for(int mile = 1; mile<=10; mile++){
            double kilometer = mile*1.609;
            double miles = kilometeres/1.609;
            System.out.printf("%-10d%10.3f\t | \t%-10d%10.3f\n",mile,kilometer,kilometeres,miles);
            
        kilometeres+=5;
        }


    }
    
}
