import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main (String[] args){
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        Map histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++){
            if (histogram.get(data[i]) != null) {
                int n = (int) histogram.get(data[i]);
                histogram.put(data[i], n + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        histogram.forEach((k,v) -> System.out.println(k + " ==> " + v));
    }
}