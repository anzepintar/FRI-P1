
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("u7ZTZ", "vFL", "moJi", "B71", "TP5_f", "9TVx6", "Yg3Y", "QMf", "nLaW", "7uo", "J", "G_w2", "ilWq", "W", "xXFAs", "m", "cx33W", "6", "U_asv", "cVd", "LuU", "c2", "kNe", "JG", "5fm", "Fo", "abP", "z", "C", "F", "jW3", "b"));
        Set<String> mnozica = new TreeSet<>(List.of("b", "sOs", "GK", "Mik", "CjDo", "5", "r", "g", "N", "AIBO", "u6Ch", "QKF"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        miks.zamenjaj();

        List<String> noviSeznam = new ArrayList<>(miks.vrniSeznam());
        noviSeznam.sort(null);

        List<String> lstNovaMnozica = new ArrayList<>(miks.vrniMnozico());
        lstNovaMnozica.sort(null);

        System.out.println(noviSeznam);
        System.out.println(lstNovaMnozica);
    }
}
