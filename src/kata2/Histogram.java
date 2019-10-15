package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {

    private int[] data;
    
    public int[] getData() {
        return data;
    }

    public Histogram(int[] data) {
        this.data = data;
    }
    
    Map<Integer,Integer> getHistogram(){
       Map<Integer,Integer> histogram = new HashMap();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1);
        }
       return histogram;
    }
    
}
