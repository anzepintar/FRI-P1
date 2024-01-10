
public class Test06 {

    public static void main(String[] args) {
        int stClanov = 3;
        int stNaslovov = 5;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 2);

        System.out.println(knjiznica.posodi(0, 1));
        System.out.println(knjiznica.posodi(0, 3));
        System.out.println(knjiznica.posodi(0, 1));
        knjiznica.clanVrne(0);
        System.out.println(knjiznica.posodi(0, 1));
        System.out.println(knjiznica.posodi(1, 0));
        System.out.println(knjiznica.posodi(1, 1));
        System.out.println(knjiznica.posodi(2, 1));
        knjiznica.clanVrne(1);
        System.out.println(knjiznica.posodi(2, 4));
        System.out.println(knjiznica.posodi(2, 1));
    }
}
