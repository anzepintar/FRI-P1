
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(36, 45, 7, 11, 2, 75, 9, 29, 49, 80, 89, 54, 34, 85, 13, 94, 25, 65, 1, 75, 53, 38, 33, 44, 68, 9, 82, 58, 84, 50, 48, 14, 31, 58, 45, 11, 73, 2, 21, 90, 15, 48, 20, 37, 3, 73, 38, 81, 23));
        Set<Integer> mnozica = new TreeSet<>(List.of(55, 43, 41, 57, 39, 71, 58, 27, 12, 97, 17, 21, 60, 73, 45, 8, 4, 57, 81, 82, 91, 41, 84, 47, 13, 53, 46, 32, 16, 5, 5, 51, 31, 74, 42, 6));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
