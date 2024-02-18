
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(18, 57), new Cas(4, 20), new Cas(14, 44), new Cas(16, 15), new Cas(4, 15), new Cas(4, 18), new Cas(19, 56), new Cas(5, 45), new Cas(7, 17), new Cas(7, 54), new Cas(5, 33), new Cas(16, 1), new Cas(10, 2), new Cas(5, 27), new Cas(0, 44), new Cas(12, 44), new Cas(13, 57), new Cas(16, 1), new Cas(20, 6), new Cas(17, 12), new Cas(11, 16), new Cas(1, 35), new Cas(22, 26), new Cas(23, 18), new Cas(13, 58), new Cas(19, 48)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(4, 40)));

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
