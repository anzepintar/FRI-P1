
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(4, 57, 63, 1, 73, 90, 20, 41, 58, 17, 33, 51, 18, 15, 35, 1, 48, 94, 71, 29, 97, 16, 75, 68, 67, 16, 85));
        Set<Integer> mnozica = new TreeSet<>(List.of(16, 96, 98, 43, 98, 45, 93, 33, 58, 75, 97, 15, 57, 19, 60, 75, 44, 13, 6, 30, 78, 58, 99, 7, 24, 13, 71, 31, 3, 71, 23, 22, 37, 88, 10, 31, 56, 12, 90, 25, 49, 40, 19, 32, 55));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<Integer> skupaj = new ArrayList<>();
        for (Integer element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
