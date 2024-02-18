
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("s64qa", "9ypy", "B", "J5PF", "vIg", "zNawW", "kCkY", "6gN", "Jp", "gIM1G", "x60Ln", "Y", "zE", "hlk", "a"));
        Set<String> mnozica = new TreeSet<>(List.of("zR", "Ap", "Lg", "d", "9Inw", "o", "bO", "qKkcS", "9O", "hUGyr", "CnnG", "Qqeb", "GGue", "B1", "O6e", "0k9Q", "5L", "MiVC", "CfU0", "Y", "q"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
