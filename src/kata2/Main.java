package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 9, 1, 2, 3, 4};
    
    Map<Integer,Integer> histogram = new HashMap<>();
    
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.getOrDefault(data[i], 0)+1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
    
        }
    }
}
