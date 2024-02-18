
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("K1C", "If", "Sk", "xouD2"));
        Set<String> mnozica = new TreeSet<>(List.of("Ig5", "9AqrM", "ZQ1X", "7Q99i", "C", "az", "y", "jeA5V", "TGjE", "LR", "DQShM", "tG4", "U", "93Rg", "ITT", "lL6IG", "3fAHb", "z7qon", "F"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        miks.zamenjaj();

        List<String> noviSeznam = new ArrayList<>(miks.vrniSeznam());
        noviSeznam.sort(null);

        List<String> lstNovaMnozica = new ArrayList<>(miks.vrniMnozico());
        lstNovaMnozica.sort(null);

        System.out.println(noviSeznam);
        System.out.println(lstNovaMnozica);
    }
}
