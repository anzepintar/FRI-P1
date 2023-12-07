
public class Test07 {

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

        System.out.println("Posojeni izvodi za posamezne naslove ...");

        System.out.println("... na zacetku:");
        izpisiPosojeneIzvode(knjiznica, stNaslovov);

        knjiznica.clanVrne(2);
        System.out.println("... ko clan 2 vrne vse izposojene izvode:");
        izpisiPosojeneIzvode(knjiznica, stNaslovov);

        knjiznica.clanVrne(1);
        System.out.println("... ko clan 1 vrne vse izposojene izvode:");
        izpisiPosojeneIzvode(knjiznica, stNaslovov);
    }

    private static void izpisiPosojeneIzvode(Knjiznica knjiznica, int stNaslovov) {
        for (int naslov = 0;  naslov < stNaslovov;  naslov++) {
            System.out.printf("%d -> %d%n", naslov, knjiznica.posojeni(naslov));
        }
    }
}
