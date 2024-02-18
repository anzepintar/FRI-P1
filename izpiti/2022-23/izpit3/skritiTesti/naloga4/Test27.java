
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(11, 0), new Cas(5, 52), new Cas(8, 34), new Cas(0, 4), new Cas(10, 5), new Cas(16, 53), new Cas(22, 44), new Cas(2, 15), new Cas(13, 54), new Cas(23, 5), new Cas(7, 11), new Cas(1, 12), new Cas(4, 37), new Cas(6, 37), new Cas(6, 17), new Cas(2, 27), new Cas(23, 20), new Cas(21, 40), new Cas(10, 52), new Cas(23, 18), new Cas(18, 32), new Cas(20, 0), new Cas(13, 47), new Cas(16, 33), new Cas(7, 8), new Cas(21, 2), new Cas(22, 14), new Cas(1, 50), new Cas(10, 59), new Cas(6, 22), new Cas(23, 19), new Cas(22, 12), new Cas(7, 47)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(3, 27), new Cas(21, 39), new Cas(20, 56), new Cas(5, 22), new Cas(11, 48), new Cas(22, 29), new Cas(14, 6), new Cas(2, 54), new Cas(4, 47), new Cas(2, 10), new Cas(23, 52), new Cas(9, 5)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
