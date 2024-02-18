
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("1FC", "_", "ivtJ", "TB", "itqL", "AuC", "SY", "lc", "A0", "sq", "JM8", "ESwv", "5v", "elPE"));
        Set<String> mnozica = new TreeSet<>(List.of("6x71", "w9X", "ygg7", "XtNt", "g", "wiz", "73doV", "q", "35I", "vBDL7", "na", "Wq", "pZKt9", "XoUT", "im", "Mv", "WbJm", "I", "ZoS", "jzVe", "a_pX", "8", "o", "Zmo2"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
