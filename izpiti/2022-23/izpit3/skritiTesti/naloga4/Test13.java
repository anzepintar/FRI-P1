
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(65, 29, 59, 79, 46, 79, 2, 82, 80, 58, 12, 8, 84, 85, 1, 92, 52, 27, 22, 99));
        Set<Integer> mnozica = new TreeSet<>(List.of(12, 68, 83, 46, 98, 57, 80, 69, 82, 26, 18, 76));

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
