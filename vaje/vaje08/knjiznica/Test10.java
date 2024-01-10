
public class Test10 {

    public static void main(String[] args) {
        int stClanov = 5;
        int stNaslovov = 3;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 2);

        System.out.println(knjiznica.posodi(0, 1));
        System.out.println(knjiznica.posodi(1, 2));
        System.out.println(knjiznica.posodi(2, 0));
        System.out.println(knjiznica.posodi(2, 1));
        System.out.println(knjiznica.posodi(2, 2));
        System.out.println(knjiznica.posodi(4, 0));
        System.out.println(knjiznica.priClanu(0));
        System.out.println(knjiznica.priClanu(1));
        System.out.println(knjiznica.priClanu(2));
        System.out.println(knjiznica.priClanu(3));
        System.out.println(knjiznica.priClanu(4));
        System.out.println("-----");

        knjiznica.clanVrne(2);
        System.out.println(knjiznica.posodi(3, 1));
        System.out.println(knjiznica.posodi(4, 1));
        System.out.println(knjiznica.posodi(4, 0));
        System.out.println(knjiznica.posodi(1, 0));
        System.out.println(knjiznica.posojeni(0));
        System.out.println(knjiznica.posojeni(1));
        System.out.println(knjiznica.posojeni(2));
        System.out.println("-----");

        knjiznica.clanVrne(3);
        System.out.println(knjiznica.posodi(2, 1));
        System.out.println(knjiznica.najNaslov());
    }
}
