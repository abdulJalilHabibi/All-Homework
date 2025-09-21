
package exercise11;

public class Exercise11 {

    public static void main(String[] args) {
        // this programme change current time into GMT
    
     long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Current time in GMT: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
    }
    

