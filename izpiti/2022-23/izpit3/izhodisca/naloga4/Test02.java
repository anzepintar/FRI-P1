
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("Ana", "Bojan", "Cvetka"));
        Set<String> mnozica = new TreeSet<>(List.of("Novak", "Dolenc", "Gorenc"));

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
