
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(69, 57, 4, 2, 69, 51, 67, 54, 30));
        Set<Integer> mnozica = new TreeSet<>(List.of(3, 51, 13, 35, 61, 12, 55, 20, 64, 49, 90, 50, 45, 64, 53, 12, 95, 4, 21, 2, 88, 89, 94, 20, 87, 33, 27, 7, 16));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
