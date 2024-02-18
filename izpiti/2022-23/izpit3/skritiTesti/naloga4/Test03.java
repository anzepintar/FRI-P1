
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(5, 17), new Cas(12, 22), new Cas(9, 23), new Cas(0, 32), new Cas(10, 14), new Cas(11, 56), new Cas(0, 38), new Cas(0, 36), new Cas(4, 53), new Cas(23, 51), new Cas(3, 14), new Cas(17, 52), new Cas(18, 34), new Cas(13, 6), new Cas(11, 44), new Cas(12, 59), new Cas(1, 5), new Cas(17, 50), new Cas(7, 46), new Cas(11, 7), new Cas(11, 18), new Cas(2, 48), new Cas(15, 8), new Cas(19, 24)));
        Set<Cas> mnozica = new TreeSet<>(List.of());

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
