import java.util.Scanner;
public class Vindmoelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt(), target = sc.nextInt(), difference = target - current;
        System.out.println(difference <= 180 && difference >= -179 ? difference : difference > 0 ? difference - 360 : difference + 360);
    }
}