
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(10, 56), new Cas(13, 19), new Cas(15, 40), new Cas(7, 43), new Cas(19, 28), new Cas(13, 41), new Cas(4, 46), new Cas(16, 59), new Cas(20, 43), new Cas(15, 39), new Cas(0, 20), new Cas(9, 14), new Cas(18, 47), new Cas(15, 30), new Cas(23, 36), new Cas(16, 46)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(13, 36), new Cas(4, 2), new Cas(17, 47), new Cas(2, 32), new Cas(13, 54), new Cas(23, 40), new Cas(3, 6), new Cas(23, 17), new Cas(4, 20), new Cas(10, 50), new Cas(11, 47), new Cas(1, 59), new Cas(0, 33), new Cas(22, 11), new Cas(11, 47), new Cas(17, 21), new Cas(13, 5), new Cas(15, 51), new Cas(20, 41), new Cas(20, 6), new Cas(8, 22), new Cas(9, 27), new Cas(8, 14), new Cas(11, 38), new Cas(16, 2), new Cas(10, 19), new Cas(4, 25), new Cas(1, 18), new Cas(19, 43), new Cas(15, 14), new Cas(14, 53), new Cas(12, 16), new Cas(15, 27), new Cas(8, 8), new Cas(1, 33), new Cas(12, 39)));

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
