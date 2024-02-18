
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("xJwBX", "3kPA8", "D9", "60", "iRDm", "PxSi", "KhZkH", "zT", "1XLO_", "B0ys", "gJq", "j", "9v", "ArU", "7", "bftlI", "npe", "f", "kO7xO", "2IBl", "i", "z", "T", "10Y", "snS6h", "E", "KNjr", "q", "IT", "K", "vW", "kLD", "xe", "Zpwj", "z", "XBl", "lq", "o12g", "n9x", "DnP1", "8iUvC", "T", "m", "40", "_V", "TvuUf", "PW", "gVOv", "Wx5QA"));
        Set<String> mnozica = new TreeSet<>(List.of("7GIG", "GHasS", "Bqx2", "t0p", "JNkYF", "N", "s", "tEV8", "1YQL", "3Uh", "gLN", "wJOE", "xo9", "f88n", "E", "X", "hE6", "s4v", "p"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
