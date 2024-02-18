
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(14, 37), new Cas(12, 40), new Cas(0, 10), new Cas(21, 42), new Cas(3, 55), new Cas(2, 7), new Cas(16, 28), new Cas(7, 15), new Cas(3, 40), new Cas(19, 4), new Cas(2, 5), new Cas(9, 50), new Cas(4, 0), new Cas(20, 37), new Cas(9, 33), new Cas(11, 42), new Cas(17, 31), new Cas(20, 24), new Cas(17, 7), new Cas(1, 11), new Cas(7, 47), new Cas(0, 27), new Cas(1, 22), new Cas(11, 49), new Cas(13, 6), new Cas(6, 39), new Cas(1, 11), new Cas(9, 54), new Cas(3, 18), new Cas(23, 1), new Cas(6, 27), new Cas(5, 38), new Cas(9, 34), new Cas(4, 23), new Cas(11, 39), new Cas(4, 36), new Cas(7, 0), new Cas(13, 15), new Cas(5, 27), new Cas(11, 47), new Cas(13, 38), new Cas(17, 41), new Cas(13, 24), new Cas(3, 49), new Cas(8, 24), new Cas(23, 20), new Cas(19, 3), new Cas(2, 56)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(1, 19), new Cas(12, 15), new Cas(5, 23), new Cas(13, 48), new Cas(6, 30), new Cas(14, 26), new Cas(3, 15), new Cas(9, 16), new Cas(17, 39), new Cas(10, 4), new Cas(0, 54), new Cas(13, 7), new Cas(7, 28), new Cas(11, 23), new Cas(19, 6), new Cas(0, 8), new Cas(1, 17), new Cas(19, 23), new Cas(7, 22), new Cas(13, 13), new Cas(20, 45), new Cas(7, 27), new Cas(3, 18), new Cas(14, 39), new Cas(0, 51), new Cas(12, 13), new Cas(7, 2), new Cas(11, 55), new Cas(0, 37), new Cas(5, 20), new Cas(4, 30), new Cas(15, 22), new Cas(19, 28), new Cas(4, 19), new Cas(0, 13), new Cas(22, 20), new Cas(20, 37), new Cas(6, 43), new Cas(21, 21), new Cas(20, 29), new Cas(4, 38), new Cas(6, 25), new Cas(13, 11), new Cas(14, 23), new Cas(18, 50), new Cas(21, 52), new Cas(18, 29), new Cas(6, 0), new Cas(4, 22)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
