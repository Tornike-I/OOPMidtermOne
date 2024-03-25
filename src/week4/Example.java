package week4;
import java.util.HashMap;
public class Example {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 8);
        map.put("Cherry", 12);
        System.out.println("Value for key 'Banana': " + map.get("Banana"));
        System.out.println("Size of the map: " + map.size());
        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        // Iterating over values
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        // Iterating over entries
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}