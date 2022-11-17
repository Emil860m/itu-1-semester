import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int unused = sc.nextInt();
        int leastMistakes = Integer.MAX_VALUE;
        int best = Integer.MAX_VALUE;
        sc.nextLine();
        for (int i = 1; i < amount + 1; i++) {
            String line = sc.nextLine();
            String[] splitLine = line.split(" ");
            int mistakes = 0;
            for (int j = 0; j < splitLine.length; j++) {
                int k = j+1;
                if (k % 3 == 0 && k % 5 == 0) {
                    if (!splitLine[j].equals("fizzbuzz")) mistakes++;
                }
                else if (k % 3 == 0) {
                    if (!splitLine[j].equals("fizz")) mistakes++;
                }
                else if (k % 5 == 0) {
                    if (!splitLine[j].equals("buzz")) mistakes++;
                }
                else {
                    if (!splitLine[j].equals(String.valueOf(k))) mistakes++;
                }
            }
            System.out.println(i + " " + mistakes);
            if (mistakes < leastMistakes) {
                best = i;
                leastMistakes = mistakes;
            }
        }
        System.out.println(best);
    }
}
