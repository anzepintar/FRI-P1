
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(92, 39, 37, 94, 13, 7, 73, 94, 67, 27, 19, 98, 32, 85, 21, 28, 74, 39, 13, 58));
        Set<Integer> mnozica = new TreeSet<>(List.of(68, 35, 66, 42, 13, 68, 26, 76, 14, 18, 54));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
