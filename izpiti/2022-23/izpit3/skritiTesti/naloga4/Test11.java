
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("z", "jzQ", "ID", "R", "9KYz", "ab8v_", "GmOHW", "52Rje", "LTRl", "aiL1Y", "aAO", "gCQfj", "qH", "X", "FHqJh", "RG7", "t", "Hrfp", "iN", "j", "SR39", "jry_4"));
        Set<String> mnozica = new TreeSet<>(List.of("DFyW", "P", "VOl", "9"));

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
