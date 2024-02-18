
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(99, 89, 19, 61, 44, 97, 27, 98, 82, 10, 92, 39, 24, 1, 58, 56, 72, 38, 59, 78, 66, 83, 58, 27, 8, 14, 79, 39, 88, 79, 18, 87, 18, 79, 87, 52, 27));
        Set<Integer> mnozica = new TreeSet<>(List.of(59, 85, 82, 76, 33, 37, 26, 88, 91, 55, 45, 71, 38, 99, 11, 11, 3, 39, 77, 7, 68, 27, 66, 87, 59, 64, 3, 38, 35, 62));

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
