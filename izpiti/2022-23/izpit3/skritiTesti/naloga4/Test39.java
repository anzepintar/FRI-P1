
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(17, 26), new Cas(19, 26), new Cas(8, 33), new Cas(14, 24), new Cas(11, 34), new Cas(6, 45), new Cas(8, 6), new Cas(1, 9), new Cas(3, 34), new Cas(21, 18), new Cas(21, 28), new Cas(16, 2), new Cas(21, 0), new Cas(21, 52), new Cas(4, 22), new Cas(1, 53), new Cas(3, 36), new Cas(13, 38), new Cas(19, 16), new Cas(18, 0), new Cas(10, 41), new Cas(7, 10), new Cas(19, 59), new Cas(14, 20), new Cas(21, 43), new Cas(14, 56), new Cas(19, 31), new Cas(5, 35), new Cas(21, 32), new Cas(0, 27), new Cas(0, 58), new Cas(19, 23), new Cas(10, 1), new Cas(2, 10), new Cas(8, 51), new Cas(17, 53), new Cas(8, 11), new Cas(22, 28)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(3, 41), new Cas(0, 13), new Cas(11, 18), new Cas(18, 21), new Cas(7, 18), new Cas(0, 15), new Cas(7, 31), new Cas(15, 13), new Cas(21, 14), new Cas(16, 4), new Cas(23, 47), new Cas(16, 6), new Cas(15, 51), new Cas(21, 0), new Cas(6, 35), new Cas(20, 53), new Cas(16, 29), new Cas(3, 8), new Cas(7, 47), new Cas(3, 27), new Cas(21, 37), new Cas(12, 3), new Cas(10, 6), new Cas(4, 33), new Cas(15, 38), new Cas(1, 35)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
