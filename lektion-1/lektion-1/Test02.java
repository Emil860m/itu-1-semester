import java.util.ArrayList;
public class Test02 {
    public static void main(String[] args) {
        
    }
    public static boolean isReasonablePrice(int price) {
        return price < 20;
    }
    
    public static boolean isReasonablePrice(ArrayList<Integer> prices, int low, int high) {
        boolean[] l = new boolean[prices.size()];
        for(int i = 0; i<prices.size(); i++) {
            boolean[i] =
        }
    }
    
    public static void test0 () {
        System.out.println(isReasonablePrice(15));
        System.out.println(isReasonablePrice(22));
    }
    public static void test1() {
        System.out.println(isReasonablePrice(8, 9, 25));
        System.out.println(isReasonablePrice(16, 9, 25));
        System.out.println(isReasonablePrice(32, 9, 25));
    }
}