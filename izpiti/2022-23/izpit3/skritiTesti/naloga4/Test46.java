
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(24, 39, 8, 37, 100, 62, 84, 73, 18, 92, 48, 84, 14, 71, 82, 26, 44, 48, 20, 86));
        Set<Integer> mnozica = new TreeSet<>(List.of(9, 90, 16, 46, 85, 49));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
