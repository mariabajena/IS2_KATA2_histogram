package kata2;

import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,1,2,3};
        
        HashMap<Integer, Integer> histogram = new HashMap();
        for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if (histogram.containsKey(j))
                histogram.put(j, histogram.get(j)+1);
            else histogram.put(j, 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
}
