import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >=5550000 && number <5560000) {
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
