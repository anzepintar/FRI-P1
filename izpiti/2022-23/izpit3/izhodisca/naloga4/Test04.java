
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("ube", "f", "Y", "1", "TEET", "E", "wIZk_", "GOVl", "sDs", "fW9", "wHs", "Ta", "bv", "C", "o", "U", "h2m", "R0", "8x96", "Bk", "e"));
        Set<String> mnozica = new TreeSet<>(List.of("62N", "2bJ", "sDk", "L", "cA1r", "YET", "jatIW", "bVfM", "2", "xnUi6", "d", "nth9m", "_33vS", "mpMP", "tEL", "cuSW", "v2", "80CmY", "ssC", "RW", "gVQ", "wNFO", "dKG"));

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
