
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(92, 81, 46, 61, 86, 95, 71, 85, 63, 18, 57));
        Set<Integer> mnozica = new TreeSet<>(List.of(62, 96, 32, 83));

        Cetrta.Miks<Integer> miks = new Cetrta.Miks<>(seznam, mnozica);
        miks.zamenjaj();

        List<Integer> noviSeznam = new ArrayList<>(miks.vrniSeznam());
        noviSeznam.sort(null);

        List<Integer> lstNovaMnozica = new ArrayList<>(miks.vrniMnozico());
        lstNovaMnozica.sort(null);

        System.out.println(noviSeznam);
        System.out.println(lstNovaMnozica);
    }
}
