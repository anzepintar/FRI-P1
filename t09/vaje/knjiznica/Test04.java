
public class Test04 {

    public static void main(String[] args) {
        int stClanov = 3;
        int stNaslovov = 5;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 10);

        System.out.println(knjiznica.posodi(0, 4));
        System.out.println(knjiznica.posodi(2, 3));
        System.out.println(knjiznica.posodi(1, 2));
        System.out.println(knjiznica.posodi(1, 4));
        System.out.println(knjiznica.posodi(0, 1));
        System.out.println(knjiznica.posodi(1, 2));
        System.out.println(knjiznica.posodi(2, 2));
        System.out.println(knjiznica.posodi(2, 3));
        System.out.println(knjiznica.posodi(2, 1));
        System.out.println(knjiznica.posodi(0, 2));

        System.out.println("Posojeni izvodi za posamezne naslove:");
        for (int naslov = 0;  naslov < stNaslovov;  naslov++) {
            System.out.printf("%d -> %d%n", naslov, knjiznica.posojeni(naslov));
        }

        System.out.println("Posojeni izvodi za posamezne clane:");
        for (int clan = 0;  clan < stClanov;  clan++) {
            System.out.printf("%d -> %d%n", clan, knjiznica.priClanu(clan));
        }
    }
}
