
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(20, 33, 1, 27, 6, 68, 10, 69, 93, 1, 91, 97, 54, 78, 93, 83, 27, 71, 46, 39, 39, 27));
        Set<Integer> mnozica = new TreeSet<>(List.of(75, 58, 14, 46, 88, 63, 41, 48, 53, 54, 83, 1, 98, 97, 38, 39, 82, 99, 47, 25));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
