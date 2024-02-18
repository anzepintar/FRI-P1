
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(9, 35), new Cas(1, 45), new Cas(4, 23), new Cas(11, 57), new Cas(2, 56), new Cas(5, 4), new Cas(16, 0), new Cas(0, 32), new Cas(5, 25), new Cas(15, 7), new Cas(3, 42), new Cas(12, 55), new Cas(5, 58)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(15, 56), new Cas(7, 44), new Cas(9, 43), new Cas(18, 19), new Cas(1, 30), new Cas(6, 47), new Cas(23, 50), new Cas(8, 50), new Cas(4, 2), new Cas(8, 38), new Cas(13, 59), new Cas(14, 57), new Cas(12, 31), new Cas(22, 10), new Cas(10, 13), new Cas(20, 29), new Cas(16, 58), new Cas(4, 2), new Cas(10, 4), new Cas(11, 16), new Cas(11, 57), new Cas(5, 0), new Cas(13, 16), new Cas(23, 35), new Cas(4, 29), new Cas(12, 13), new Cas(22, 1), new Cas(23, 5), new Cas(5, 56), new Cas(18, 17), new Cas(9, 14), new Cas(1, 59), new Cas(3, 26), new Cas(16, 42), new Cas(18, 42), new Cas(16, 50), new Cas(5, 38), new Cas(20, 19), new Cas(16, 1), new Cas(8, 55), new Cas(11, 32), new Cas(3, 16), new Cas(5, 29), new Cas(5, 27)));

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
