package kata2;

import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,1,2,3};

        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
}
