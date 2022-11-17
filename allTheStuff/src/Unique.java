import java.util.*;
public class Unique {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("allan");
        namesList.add("fred");
        namesList.add("emma");
        namesList.add("daniel");
        namesList.add("allan");
        namesList.add("bo");
        namesList.add("carl");
        namesList.add("bo");
        System.out.println(uniqueNames(namesList));
    }
    
    public static int uniqueNames(ArrayList<String> names) {
//        HashMap<Integer, Integer> lengths = new HashMap<>();
//        for (String name: names) {
//            if (lengths.containsKey(name.length())) lengths.put(name.length(), lengths.get(name.length()) + 1);
//            else lengths.put(name.length(), 1);
//        }
//        System.out.println(lengths);
        return new HashSet<>(names).size();
    }
}
