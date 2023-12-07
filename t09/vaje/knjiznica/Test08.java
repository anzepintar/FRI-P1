
public class Test08 {

    public static void main(String[] args) {
        int stClanov = 3;
        int stNaslovov = 5;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 10);

        knjiznica.posodi(0, 1);
        knjiznica.posodi(0, 3);
        knjiznica.posodi(1, 2);
        knjiznica.posodi(1, 3);
        knjiznica.posodi(1, 4);
        knjiznica.posodi(2, 0);
        knjiznica.posodi(2, 4);

        System.out.println("Izvodi pri posameznih clanih ...");

        System.out.println("... na zacetku:");
        izpisiIzvodePriClanih(knjiznica, stClanov);

        knjiznica.clanVrne(2);
        System.out.println("... ko clan 2 vrne vse izposojene izvode:");
        izpisiIzvodePriClanih(knjiznica, stClanov);

        knjiznica.clanVrne(1);
        System.out.println("... ko clan 1 vrne vse izposojene izvode:");
        izpisiIzvodePriClanih(knjiznica, stClanov);
    }

    private static void izpisiIzvodePriClanih(Knjiznica knjiznica, int stClanov) {
        for (int clan = 0;  clan < stClanov;  clan++) {
            System.out.printf("%d -> %d%n", clan, knjiznica.priClanu(clan));
        }
    }

}
