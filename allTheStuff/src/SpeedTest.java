
import java.util.*;

class SpeedTest {
    static int N = 500000;

    public static void main(String[] args) {
        List<Integer> list;
        list = new ArrayList<Integer>();
        System.out.println("ArrayList: (N=" + N + ")");
        System.out.println("- insertion: " + insertion(list) + "ms");
        System.out.println("- traversal: " + traversal(list) + "ms");
        System.out.println();
        list = new LinkedList<Integer>();
        System.out.println("LinkedList: (N=" + N + ")");
        System.out.println("- insertion: " + insertion(list) + "ms");
        System.out.println("- traversal: " + traversal(list) + "ms");
        System.out.println();
    }



    static long insertion(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i); // insert at index 0
        }
        long stop = System.currentTimeMillis();
        return (stop - start); // time elapsed (in ms)
    }

    static long traversal(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i:list) {

        }
        long stop = System.currentTimeMillis();
        return (stop - start); // time elapsed (in ms)
    }

}
