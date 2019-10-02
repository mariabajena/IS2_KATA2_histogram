package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 9, 1, 2, 3, 4};
    
    Map<Integer,Integer> histogram = new HashMap<>();
    
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
    
        }
    }
}
