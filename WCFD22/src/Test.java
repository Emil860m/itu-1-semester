import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        BigInteger cups = new BigInteger("0");
        BigInteger fluid = new BigInteger("0");
        for (int i = 1; i <= height; i++) {
            cups = cups.add(new BigInteger(String.valueOf(i*i)));
            fluid = fluid.add(new BigInteger("4").pow(i-1));
        }

        //System.out.println(cups);
        System.out.println(fluid.subtract(cups));
    }
}
