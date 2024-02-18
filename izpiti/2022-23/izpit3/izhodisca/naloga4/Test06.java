
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(20, 10, 40, 30));
        Set<Integer> mnozica = new TreeSet<>(List.of(50, 70, 60, 50));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
