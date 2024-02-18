
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(62, 24, 75, 80, 9, 57));
        Set<Integer> mnozica = new TreeSet<>(List.of(37, 27, 99, 31, 20, 16, 71, 69, 35, 97, 19, 3, 53, 33, 48, 13, 67, 37, 40, 16, 44, 86, 14, 72, 1, 81, 32, 55, 2, 77, 56, 37, 29, 13, 30, 23, 52, 15, 78, 43, 3, 47, 6, 33, 46, 74));

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
