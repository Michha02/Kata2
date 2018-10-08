import java.util.Map;

public class Kata2 {
    public static void main (String[] args){
        String[] data = {"Azul", "Verde", "Amarillo", "Rojo", "Naranja", "Blanco", "Negro", "Verde", "Verde",
                         "Amarillo", "Rojo",};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();

        histogr.forEach((k,v) -> System.out.println(k + " ==> " + v));
    }
}