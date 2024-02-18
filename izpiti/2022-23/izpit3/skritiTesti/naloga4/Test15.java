
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(10, 21)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(12, 28), new Cas(7, 25), new Cas(0, 40), new Cas(11, 20), new Cas(23, 47), new Cas(23, 40), new Cas(2, 57), new Cas(19, 17), new Cas(1, 49), new Cas(21, 53)));

        Cetrta.Miks<Cas> miks = new Cetrta.Miks<>(seznam, mnozica);
        miks.zamenjaj();

        List<Cas> noviSeznam = new ArrayList<>(miks.vrniSeznam());
        noviSeznam.sort(null);

        List<Cas> lstNovaMnozica = new ArrayList<>(miks.vrniMnozico());
        lstNovaMnozica.sort(null);

        System.out.println(noviSeznam);
        System.out.println(lstNovaMnozica);
    }
}
