
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(0, 39), new Cas(15, 10), new Cas(15, 27), new Cas(21, 21), new Cas(8, 2), new Cas(6, 58), new Cas(16, 13), new Cas(6, 15), new Cas(10, 55), new Cas(8, 8)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(6, 55), new Cas(3, 50), new Cas(0, 55), new Cas(19, 31), new Cas(6, 53), new Cas(9, 20), new Cas(1, 2), new Cas(16, 53), new Cas(5, 58), new Cas(5, 43), new Cas(8, 40), new Cas(23, 15), new Cas(19, 59), new Cas(13, 22), new Cas(3, 40), new Cas(1, 10), new Cas(16, 52)));

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
