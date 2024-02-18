
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(31, 66, 87, 28, 28, 25, 1, 93, 90, 55, 61, 75, 80));
        Set<Integer> mnozica = new TreeSet<>(List.of(75, 59, 21, 96, 85, 9, 4, 42, 91, 51, 25, 50, 78, 56, 50, 85, 40, 3, 34, 86, 90, 51, 95, 65, 43, 85, 14, 44, 24, 9, 40, 29, 78, 22, 97, 94, 19, 17, 13, 64, 14, 9, 59, 5, 92, 69, 36, 54));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
