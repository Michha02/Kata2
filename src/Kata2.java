import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main (String[] args){
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i:data){
            histogram.put(i, histogram.containsKey(i)? histogram.get(i) + 1:1);
        }
        histogram.forEach((k,v) -> System.out.println(k + " ==> " + v));
    }
}