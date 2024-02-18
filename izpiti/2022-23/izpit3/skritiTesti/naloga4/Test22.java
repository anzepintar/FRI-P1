
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(14, 75, 43, 75, 79));
        Set<Integer> mnozica = new TreeSet<>(List.of(1, 100, 61, 60, 81, 71, 95, 5, 97, 60, 84, 78, 51, 19, 44, 1, 95, 34, 26, 46, 100));

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
