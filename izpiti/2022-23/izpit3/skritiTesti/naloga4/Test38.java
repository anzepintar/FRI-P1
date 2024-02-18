
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("wvFSy", "S", "Mct4", "Mh7Jx"));
        Set<String> mnozica = new TreeSet<>(List.of("DiB", "P9", "xYI", "d", "c", "he", "zOa", "SPiI", "c1OPH", "T", "XuWDu", "pXK", "0", "wo", "pZ", "Y1", "8Tr", "aet", "k_5", "4r", "y", "TkJ", "1", "1ttgF", "dDe", "YCgr", "26O", "H", "a7Nq", "B0R", "rgVs", "h7fAm", "HtuF", "Di4", "T6XNv", "w5es", "Y6zGd", "hob", "Xm"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
