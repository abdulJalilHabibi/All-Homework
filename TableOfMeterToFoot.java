package table.of.meter.to.foot;

public class TableOfMeterToFoot {
    public static void main(String[] args) {
        System.out.println("Feet  Meters   |  Meters   Feet");
        System.out.println("-------------------------------------");
        int meter = 65;
        for(int feet =1;feet<=10;feet++,meter-=5){
            double toMeter = footToMeter(feet);
            double tofoot = meterToFoot(meter);
            
          System.out.printf("%-2d%10.3f   |   %-5d%8.3f%n",
                    feet, toMeter, meter, tofoot);
    
        
        }
      

        
        
    }
  
    
    public static double footToMeter(double foot){
       double meter = 0;
        return meter = 0.305*foot;
        }
       
    public static double meterToFoot(double meter){
       double foot = 0;
        return foot = 3.279*meter;
        }
       
    
    
}
