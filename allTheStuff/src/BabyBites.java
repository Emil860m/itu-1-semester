import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        boolean good = true;
        for (int i = 1; i <= count; i++) {
            String input = s.next();
            if (!input.equals("mumble")) {
                try {
                    if (Integer.parseInt(input) != i) {
                        good = false;
                    }

                }catch (Exception e) {

                }
            }

        }
        if (good) {
            System.out.println("makes sense");
        } else System.out.println("something is fishy");
    }
}
