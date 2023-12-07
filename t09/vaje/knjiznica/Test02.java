
public class Test02 {

    public static void main(String[] args) {
        int stNaslovov = 5;
        Knjiznica knjiznica = new Knjiznica(3, stNaslovov, 10);

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
    }
}
