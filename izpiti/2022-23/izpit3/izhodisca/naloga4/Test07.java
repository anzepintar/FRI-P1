
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("Ana", "Bojan", "Cvetka"));
        Set<String> mnozica = new TreeSet<>(List.of("Novak", "Dolenc", "Gorenc"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
