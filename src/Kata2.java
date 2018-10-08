import java.util.Map;

public class Kata2 {
    public static void main (String[] args){
        Integer[] data = {0, 0, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();

        histogr.forEach((k,v) -> System.out.println(k + " ==> " + v));
    }
}