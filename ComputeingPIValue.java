
package computeing.pi.value;

public class ComputeingPIValue {

    public static void main(String[] args) {
        double pi = 0;
        for(double i = 10000;i<=100000;i+=10000){
        pi = pi + 4*((Math.pow(-1, i+1))/(2*i-1));
        }
        System.out.println("the PI value is " + pi);

    }
    
}
