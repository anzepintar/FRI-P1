
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(11, 41), new Cas(21, 43), new Cas(20, 11), new Cas(17, 31), new Cas(9, 0), new Cas(8, 35), new Cas(5, 45), new Cas(1, 12), new Cas(10, 40), new Cas(7, 8), new Cas(13, 8), new Cas(13, 16), new Cas(8, 53), new Cas(23, 40), new Cas(5, 3), new Cas(18, 48), new Cas(11, 15), new Cas(10, 2), new Cas(8, 56), new Cas(0, 11), new Cas(3, 59), new Cas(21, 19), new Cas(14, 0), new Cas(17, 12), new Cas(20, 14), new Cas(2, 38), new Cas(2, 5), new Cas(9, 34), new Cas(22, 36), new Cas(9, 49), new Cas(8, 26), new Cas(5, 49), new Cas(9, 22), new Cas(21, 30), new Cas(1, 24), new Cas(20, 48), new Cas(12, 43), new Cas(10, 51), new Cas(7, 4), new Cas(23, 9), new Cas(0, 48), new Cas(9, 22), new Cas(5, 31), new Cas(7, 55), new Cas(3, 39), new Cas(6, 39)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(4, 30), new Cas(14, 2), new Cas(19, 0), new Cas(17, 1), new Cas(13, 28), new Cas(17, 31), new Cas(15, 5), new Cas(21, 48), new Cas(13, 46), new Cas(20, 15), new Cas(5, 22), new Cas(22, 27), new Cas(5, 29), new Cas(8, 48), new Cas(2, 30), new Cas(5, 25), new Cas(6, 0), new Cas(23, 4), new Cas(11, 27), new Cas(6, 46), new Cas(5, 26), new Cas(11, 39), new Cas(23, 16), new Cas(14, 44), new Cas(5, 25), new Cas(18, 42), new Cas(17, 36), new Cas(5, 38), new Cas(13, 31), new Cas(13, 47), new Cas(4, 52), new Cas(6, 28), new Cas(5, 55), new Cas(18, 30), new Cas(1, 32), new Cas(9, 36), new Cas(13, 46)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
