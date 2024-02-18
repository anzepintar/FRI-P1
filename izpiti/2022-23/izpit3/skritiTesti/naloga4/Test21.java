
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(17, 53), new Cas(18, 19), new Cas(9, 19), new Cas(1, 43), new Cas(14, 11), new Cas(11, 47), new Cas(12, 47), new Cas(18, 45), new Cas(1, 57), new Cas(20, 8), new Cas(2, 58), new Cas(7, 12), new Cas(10, 21), new Cas(4, 8), new Cas(23, 6), new Cas(18, 13), new Cas(5, 55), new Cas(7, 31), new Cas(5, 43), new Cas(17, 50), new Cas(14, 25), new Cas(15, 25), new Cas(20, 43), new Cas(20, 46), new Cas(20, 29), new Cas(8, 10), new Cas(14, 43), new Cas(12, 51), new Cas(14, 21), new Cas(2, 33), new Cas(9, 9)));
        Set<Cas> mnozica = new TreeSet<>(List.of(new Cas(6, 11), new Cas(11, 2), new Cas(15, 40), new Cas(12, 26), new Cas(4, 2), new Cas(22, 13), new Cas(4, 11), new Cas(9, 29), new Cas(9, 18), new Cas(18, 14), new Cas(18, 52), new Cas(15, 51), new Cas(20, 51), new Cas(20, 43), new Cas(4, 33), new Cas(6, 45), new Cas(10, 57), new Cas(21, 39), new Cas(5, 27), new Cas(3, 28), new Cas(4, 31), new Cas(13, 27), new Cas(2, 10), new Cas(22, 53), new Cas(19, 57), new Cas(14, 48), new Cas(4, 27), new Cas(0, 27), new Cas(4, 56), new Cas(4, 47), new Cas(20, 8), new Cas(23, 13), new Cas(18, 37), new Cas(21, 58), new Cas(3, 19), new Cas(23, 20), new Cas(14, 42), new Cas(6, 45), new Cas(17, 38), new Cas(14, 31), new Cas(13, 11), new Cas(12, 3), new Cas(10, 45), new Cas(5, 15), new Cas(15, 4), new Cas(3, 27), new Cas(8, 54)));

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
