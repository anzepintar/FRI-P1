
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("eDTo9", "KqEW", "e", "M", "lEg", "yzl", "KKr7", "v", "MN3", "c3_BA", "usAo", "1KW", "vLpVR", "J", "fSVk", "Kw", "a4THv", "Sp", "jS", "S7DJI", "81k", "4DXp", "UJmh", "AGsVT", "8", "scV", "2w", "6ta", "gC", "U2v", "I", "az4o1", "0Vop", "Uk", "BNr8", "fJBJ", "koqP", "FM3h", "g1P", "bs7", "Og", "nNMy", "YAFMw", "h", "R", "894", "0", "b", "kgEY_", "t"));
        Set<String> mnozica = new TreeSet<>(List.of("G", "XZVvM", "hlWAC", "W9", "23Etb", "T2Oso", "Fark", "O4", "W7l", "to0", "T", "E", "e", "Mr", "iq", "3bwWB", "U", "m7q", "rw4F", "AO", "1E", "qd8bl", "7ds", "q", "przp", "x8", "nM", "Bk7U", "wXnoe", "eYn", "8Y", "I"));

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
