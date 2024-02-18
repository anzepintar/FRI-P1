
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(84, 12, 65, 26, 38, 22, 78, 47, 29, 1, 10, 16, 85, 44));
        Set<Integer> mnozica = new TreeSet<>(List.of(64, 78, 36, 81, 65));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
