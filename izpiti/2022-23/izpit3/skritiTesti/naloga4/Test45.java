
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(20, 49), new Cas(8, 20), new Cas(14, 6), new Cas(8, 53), new Cas(9, 24), new Cas(22, 44), new Cas(22, 49), new Cas(10, 5), new Cas(2, 22), new Cas(17, 48), new Cas(15, 36), new Cas(8, 38), new Cas(12, 54), new Cas(15, 38), new Cas(4, 11), new Cas(11, 46), new Cas(18, 34), new Cas(12, 2), new Cas(23, 26), new Cas(19, 35), new Cas(19, 14), new Cas(2, 14), new Cas(7, 32), new Cas(11, 47), new Cas(16, 48), new Cas(12, 34), new Cas(21, 47), new Cas(9, 41), new Cas(15, 40), new Cas(18, 32), new Cas(21, 17), new Cas(17, 35), new Cas(8, 4), new Cas(10, 26), new Cas(1, 38), new Cas(5, 37), new Cas(21, 52), new Cas(12, 3), new Cas(14, 48), new Cas(21, 22), new Cas(5, 39), new Cas(18, 7), new Cas(9, 54), new Cas(21, 0)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(21, 14), new Cas(20, 10)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
