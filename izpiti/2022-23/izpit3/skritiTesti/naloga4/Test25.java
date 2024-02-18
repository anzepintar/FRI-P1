
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(37, 89, 52, 74, 84));
        Set<Integer> mnozica = new TreeSet<>(List.of(6, 7, 42, 29, 63, 95, 59, 86, 32, 100, 86, 34, 71, 11, 63));

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
