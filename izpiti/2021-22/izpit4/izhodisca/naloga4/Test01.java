
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(10, 5);
        slovar.put(20, 30);
        slovar.put(30, 30);
        slovar.put(40, 39);
        slovar.put(50, 15);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
