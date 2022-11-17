import java.util.Scanner;

public class vindmoelle {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        int wanted = sc.nextInt();
        int difference = current - wanted;
        if (difference < 180 && difference > -180) {
            System.out.println(difference * -1);
        }
        else if(difference == 180||difference == -180) {
            System.out.println(180);
        }
        else {
            if (difference < 0) {
                difference += 360;
            }
            else {
                difference -= 360;
            }
            System.out.println(difference * -1);
        }
    }
}