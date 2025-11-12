package sum.series;

import java.util.Scanner;

public class SumSeries {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        double i = input.nextDouble();
        double result = m(i);
        System.out.printf("the sum of the series is %.4f", result);
        System.out.println();
    }

    public static double m(double i) {
        double sum = 0;
        for (double n = 1; n <= i; n++) {
            sum += n / (n + 1);

        }
        return sum;
    }

}
