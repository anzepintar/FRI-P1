
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("zUiYI", "gBL2", "rr", "gCe", "vpId", "X_639", "q5", "4LDuJ", "QnX", "0o8", "lSXq", "n", "U", "N_", "0HV", "DF", "9pW", "df", "WukJ", "YQi", "IzR", "yE8Fh", "QS1V", "d2h4G", "LclKz"));
        Set<String> mnozica = new TreeSet<>(List.of("ZXUL", "WQNcd", "RE", "GQI", "6hC", "onS", "64Q", "Ng", "I", "kq", "B", "L", "SMnm4", "QeC7u", "r", "230", "C", "e0", "A1", "BwPy", "2zgU", "yfx2d", "7Sl", "E", "R", "4", "l", "5", "BxFl", "rCzlA", "1GyR", "Gv", "cJ6", "u7WR", "oqv", "d4", "KfR", "ib", "yqqq2", "q1X_M", "zdvz", "LEel", "S19i", "m2"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
