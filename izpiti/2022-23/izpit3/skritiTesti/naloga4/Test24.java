
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(20, 20), new Cas(11, 7), new Cas(3, 11), new Cas(0, 49), new Cas(12, 28), new Cas(8, 17), new Cas(2, 32), new Cas(10, 52), new Cas(21, 43), new Cas(18, 28), new Cas(0, 12), new Cas(6, 10), new Cas(7, 36), new Cas(19, 37), new Cas(11, 43), new Cas(23, 24), new Cas(7, 56), new Cas(11, 27), new Cas(17, 32), new Cas(6, 6), new Cas(9, 25), new Cas(15, 16), new Cas(4, 25), new Cas(9, 59), new Cas(20, 14), new Cas(20, 39), new Cas(10, 0), new Cas(1, 3), new Cas(21, 50), new Cas(1, 31), new Cas(19, 17), new Cas(23, 18), new Cas(1, 48), new Cas(2, 54), new Cas(10, 56), new Cas(20, 9), new Cas(21, 43)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(2, 11), new Cas(3, 7)));

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
