
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>(List.of(new Cas(20, 10), new Cas(10, 35)));
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
