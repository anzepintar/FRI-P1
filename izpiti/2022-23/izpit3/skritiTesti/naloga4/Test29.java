
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("x", "_6Q", "kywD", "QW", "By", "T", "pRo", "b", "IHp", "H", "7_", "8WiK", "8DS2_", "8G", "yX", "WW", "eE", "nb", "YR7", "uw", "g76", "uEHsu", "SNHlx", "k9h", "smy", "MxBbi", "7_", "oi69c", "GHXjo", "WcuX", "_thA", "zD", "4x", "2Kc", "4", "9", "FWbo", "oM", "XnhUW", "nCHXD", "yO", "e", "R", "il", "Px"));
        Set<String> mnozica = new TreeSet<>(List.of("fub7", "T14s", "Cw", "C", "ygZ", "ti", "q4R", "8M9", "HRjm", "Jx", "023qX", "ykRvC", "qd", "7K", "uh", "FTr6R", "E", "wkru", "OAfD", "xnbji", "F", "I", "z2H", "AHiE", "va", "y5H4E", "VtXQ", "GwbV", "3i7x", "NqJX"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
