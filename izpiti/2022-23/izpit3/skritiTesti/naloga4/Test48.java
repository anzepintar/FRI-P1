
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(20, 29), new Cas(11, 38), new Cas(17, 58), new Cas(0, 26), new Cas(9, 28), new Cas(10, 31), new Cas(23, 24), new Cas(1, 34), new Cas(14, 2), new Cas(21, 32), new Cas(4, 39), new Cas(5, 45), new Cas(8, 35), new Cas(5, 10), new Cas(3, 6), new Cas(17, 38), new Cas(4, 17), new Cas(23, 48)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(14, 31), new Cas(20, 51), new Cas(3, 8), new Cas(3, 46), new Cas(2, 48), new Cas(19, 36), new Cas(1, 26), new Cas(0, 19), new Cas(12, 53), new Cas(11, 35), new Cas(4, 12), new Cas(2, 49), new Cas(18, 18), new Cas(17, 12), new Cas(1, 56)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
