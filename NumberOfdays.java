package numberofdays;

public class NumberOfdays {

    public static void main(String[] args) {
        System.out.println("Year\t| Number Of Days");
        System.out.println("------------------------");
        
        for(int i=2000;i<=2020;i++){
            System.out.println(i+" \t|\t"+numberOfdays(i));
            
            }
    
    
    }

    public static int numberOfdays(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return 366;
    }
        else{
            return 365;
            }
    
        }

}
