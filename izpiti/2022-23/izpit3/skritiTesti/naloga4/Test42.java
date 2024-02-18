
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(12, 3), new Cas(1, 6), new Cas(9, 24), new Cas(16, 53), new Cas(22, 10), new Cas(7, 53), new Cas(16, 56)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(5, 22), new Cas(21, 31), new Cas(12, 36), new Cas(5, 44), new Cas(21, 31), new Cas(14, 5), new Cas(7, 21), new Cas(12, 18), new Cas(5, 41), new Cas(21, 37), new Cas(23, 20), new Cas(7, 5), new Cas(15, 9), new Cas(4, 51), new Cas(2, 1), new Cas(4, 13), new Cas(20, 59), new Cas(2, 25), new Cas(14, 31), new Cas(2, 43), new Cas(8, 58), new Cas(14, 51), new Cas(8, 17), new Cas(4, 1), new Cas(8, 7), new Cas(21, 5), new Cas(18, 21), new Cas(9, 10), new Cas(9, 30), new Cas(16, 56), new Cas(23, 5), new Cas(2, 24), new Cas(11, 12), new Cas(2, 4), new Cas(16, 27), new Cas(7, 21), new Cas(23, 56), new Cas(12, 5), new Cas(19, 11), new Cas(21, 52), new Cas(1, 26), new Cas(13, 12), new Cas(16, 35), new Cas(0, 11), new Cas(4, 5), new Cas(5, 5)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
