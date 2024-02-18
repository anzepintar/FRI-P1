
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of());
        Set<String> mnozica = new TreeSet<>(List.of("A", "003", "zaMX", "5WeC", "9x", "Lb", "v", "wPIOk", "jR", "Mp", "E", "g", "poc", "Kb0", "5", "8K", "m", "N", "F", "s9ht", "V8MhW", "x4", "CbyE", "2FFkE", "tqCgT", "l8gTs", "H", "e4", "odNb", "mMa", "br", "CAW", "QBoq", "qZ7D", "zo9n", "E", "g"));

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
