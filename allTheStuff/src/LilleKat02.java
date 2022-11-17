import java.util.ArrayList;
import java.util.Scanner;

public class LilleKat02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxTime = s.nextInt();
        int maxSand = s.nextInt();
        int flips = s.nextInt();
        int currentTime = s.nextInt();
        int trackedTime = 0;
        boolean flipped = false;
        int flipTime = -1;
        for (int i = 1; i < flips ; i++) {
            flipTime  = s.nextInt();
            if (i % 2 == 1) {
                trackedTime += flipTime - currentTime;
                if (trackedTime > maxSand) trackedTime = maxSand;
            }
            else {
                trackedTime -= flipTime - currentTime;
                if (trackedTime < 0) trackedTime = 0;
            }
            currentTime = flipTime;
//            currentTime += flipTime;
//            maxTime = maxTime - s.nextInt(); // amount of time left

        }
        if (flips % 2 == 1) {
            trackedTime += maxTime - flipTime;
            if (trackedTime > maxSand) trackedTime = maxSand;

            System.out.println(maxSand - trackedTime);

        }
        else {
            trackedTime -= maxTime - flipTime;
            if (trackedTime < 0) trackedTime = 0;
            System.out.println(trackedTime);
        }
    }
}
