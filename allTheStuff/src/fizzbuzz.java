import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count ; i++) {
            String print = "";
            if (i % 3 == 0) print += "øf";
            if (i % 5 == 0) print += "grynt";
            if (print.equals("")) {
                if (i>100) print += (i-100);
                else print += i;
            }
            System.out.println(print);
        }
    }
}
