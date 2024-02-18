
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(1, 4, 63, 74, 61, 59, 64, 89, 5, 19, 7, 33, 20, 8, 33, 99, 51, 94, 63, 48, 28, 71, 97, 92, 64, 85, 5, 64, 60, 86, 73, 24, 28, 35));
        Set<Integer> mnozica = new TreeSet<>(List.of(73, 4, 10, 84, 80, 19, 93, 25, 91, 28, 30, 47, 32, 51, 50, 64, 48, 35, 71, 14, 46, 46, 24, 13, 13, 67, 44, 74, 7, 37, 33, 93, 23, 45, 16, 51, 37, 84, 53, 10, 37, 58, 30, 35, 22));

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
