
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>(List.of(1));
        Set<Integer> mnozica = new TreeSet<>(List.of(2));

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
