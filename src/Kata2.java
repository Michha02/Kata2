import java.util.Map;

public class Kata2 {
    public static void main (String[] args){
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();

        histogr.forEach((k,v) -> System.out.println(k + " ==> " + v));
    }
}