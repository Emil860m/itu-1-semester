import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LilleKat02Archtechture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] array = new int[length][2];
        for (int i = 0; i < length; i++) {
            String shape = scanner.next();
            int size = scanner.nextInt();
            if (shape.equals("cube")) {
                array[i][0] = 0;
                array[i][1] = size;
            }
            else {
                array[i][0] = 1;
                array[i][1] = size * 2;
            }
        }
        int[][] array2 = new int[length][2];
        for (int i = 0; i < length; i++) {
            int largestPosition = -1;
            int largestNumber = 0;
            for (int j = 0; j < length; j++) {
                if (largestNumber < array[j][1]) {
                    largestPosition = j;
                    largestNumber = array[j][1];
                }
            }
            if (largestPosition < 0) {
                array2[i][0] = array[0][0];
                array2[i][1] = array[0][1];
            }
            else {
                array2[i][0] = array[largestPosition][0];
                array2[i][1] = array[largestPosition][1];
            }
            array[largestPosition][1] = 0;
        }
        for (int i = 1; i < length; i++) {
            if (array2[i - 1][0] != array2[i][0]) {
                if (array2[i-1][0] == 1) {
                   double pyt = (array2[i][1]* array2[i][1]) * 2;
                   pyt = Math.sqrt(pyt);
                   if (pyt > array2[i-1][1]) {
                       System.out.println("Impossible");
                       return;
                   }
                }
                else {
                    double pyt = (array2[i-1][1]* array2[i-1][1]) * 2;
                    pyt = Math.sqrt(pyt);
                    if (pyt < array2[i][1]) {
                        System.out.println("Impossible");
                        return;
                    }
                }
            }
        }
        for (int i = length -1; i >= 0; i--) {
            String output = "";
            if (array2[i][0] == 0) {
                output += "cube " + array2[i][1];
            }
            else {
                output += "cylinder " + (array2[i][1]/2);
            }
            System.out.println(output);
        }
    }
}
