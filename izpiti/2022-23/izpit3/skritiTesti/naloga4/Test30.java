
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(8, 29), new Cas(21, 37), new Cas(20, 52), new Cas(17, 57), new Cas(9, 24), new Cas(15, 52), new Cas(20, 41), new Cas(0, 6), new Cas(22, 3), new Cas(11, 52), new Cas(0, 42), new Cas(0, 41), new Cas(1, 40), new Cas(10, 25), new Cas(19, 26), new Cas(8, 54), new Cas(12, 18), new Cas(23, 22), new Cas(3, 48), new Cas(5, 56), new Cas(9, 45), new Cas(2, 22), new Cas(5, 0), new Cas(4, 28), new Cas(15, 57), new Cas(18, 18), new Cas(12, 38), new Cas(18, 46), new Cas(12, 9), new Cas(0, 44), new Cas(18, 53), new Cas(5, 4), new Cas(5, 35), new Cas(9, 11), new Cas(11, 3), new Cas(11, 24), new Cas(10, 21), new Cas(20, 51), new Cas(16, 2), new Cas(19, 34), new Cas(18, 57), new Cas(20, 58), new Cas(3, 47), new Cas(10, 3), new Cas(13, 7), new Cas(9, 58), new Cas(12, 29)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(20, 16), new Cas(16, 21), new Cas(22, 27), new Cas(14, 44), new Cas(15, 4), new Cas(6, 53), new Cas(17, 54), new Cas(13, 5), new Cas(15, 26)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
