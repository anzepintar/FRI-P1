
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(36, 37, 42, 28, 69, 1, 48, 52, 86, 30, 75, 19, 99, 71, 16, 55, 9, 21, 44, 29, 48, 9, 5, 1, 13, 25, 53, 29, 48, 31, 28, 60, 12, 22, 48, 85, 55, 36, 99, 40, 3, 45, 76, 21, 78, 46, 6, 20, 92));
        Set<Integer> mnozica = new TreeSet<>(List.of(61, 69, 5, 34, 49, 76, 11, 79, 30, 13, 17, 74, 84, 48, 56, 91, 36));

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
