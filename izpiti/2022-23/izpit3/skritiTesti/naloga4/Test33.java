
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(10, 52), new Cas(15, 19), new Cas(11, 28), new Cas(13, 26), new Cas(10, 53), new Cas(3, 59), new Cas(9, 57), new Cas(20, 25), new Cas(5, 13)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(22, 48), new Cas(20, 21), new Cas(4, 7), new Cas(21, 1), new Cas(7, 39), new Cas(6, 38), new Cas(17, 17)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Cas> skupaj = new ArrayList<>();
        for (Cas element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
