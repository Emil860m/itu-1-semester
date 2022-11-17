import java.util.ArrayList;
import java.util.HashMap;
public class Test01 {
    public static void main(String[] args) {
        
    }
    public static boolean isReasonablePrice(int price) {
        return price < 20;
    }
    
    public static boolean isReasonablePrice(int price, int low, int high) {
       return (price >= low && price <= high);
    }
    
    public static ArrayList<Integer> isReasonablePrices(ArrayList<Integer> prices, int low, int high) {
        ArrayList<Integer> l = new ArrayList(); 
        for(int i = 0; i<prices.size();i++){
            if(isReasonablePrice(prices.get(i), low, high)) l.add(prices.get(i));
        }
        return l;
    }
    
    public static HashMap<String, Integer> getMap() {
        HashMap<String, Integer> l = new HashMap();
        l.put("Lurpak", 15);
        l.put("Smørbar", 20);
        l.put("Kærgården", 25);
        return l;
    }
    
    public static void printButterPrices(HashMap<String, Integer> map, ArrayList<String> names) {
        System.out.println("Her er dine smørproduktmuligheder:");
        for(String name: names) {
            if (map.containsKey(name)) 
            System.out.println(name + "(" + map.get(name) + " kr)");
            else {
            System.out.println(name + "(?? kr)");
            }
        }
    }
    public static void test4 () {
        ArrayList<String> list = new ArrayList();
        list.add("Lurpak");
        list.add("Smørbar");
        list.add("Kærgården");
        list.add("Egelykke");
        HashMap<String, Integer> map = getMap();
        printButterPrices(map, list);
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
    public static void test2() {
        ArrayList<Integer> l = new ArrayList();
        l.add(5);
        l.add(17);
        l.add(18);
        l.add(28);
        ArrayList r = isReasonablePrices(l, 10, 25);
        System.out.println(r.size());
        for(int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }
    
    public static void test3() {
        HashMap<String, Integer> h = getMap();
        System.out.println(h.get("Lurpak"));
        System.out.println(h.get("Kærgården"));
    }
}