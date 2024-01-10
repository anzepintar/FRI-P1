
import java.util.*;

public class TestOseba {

    public static void main(String[] args) {
        List<Oseba> osebe = new ArrayList<>(List.of(
            new Oseba("Janez", "Novak", 'M', 1960),
            new Oseba("Miha", "Peklar", 'M', 1970),
            new Oseba("Mojca", "Novak", 'Z', 1965),
            new Oseba("Nina", "Gorjan", 'Z', 1967),
            new Oseba("Bojan", "Debeljak", 'M', 1975),
            new Oseba("Iva", "Pavlin", 'Z', 1982),
            new Oseba("Eva", "Medved", 'Z', 1963),
            new Oseba("Ivan", "Mihevc", 'M', 1955),
            new Oseba("Franci", "Rant", 'M', 1981),
            new Oseba("Doris", "Klemenc", 'Z', 1977)
        ));

        Urejanje.uredi(osebe, Oseba.primerjalnikPoPriimku());
        System.out.println(osebe);
        System.out.println();

        Urejanje.uredi(osebe, Oseba.primerjalnikPoSpoluInStarosti());
        System.out.println(osebe);
    }
}
