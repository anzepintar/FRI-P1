
public class Test09 {

    public static void main(String[] args) {
        int stClanov = 3;
        int stNaslovov = 5;
        Knjiznica knjiznica = new Knjiznica(stClanov, stNaslovov, 10);

        knjiznica.posodi(1, 3);
        knjiznica.clanVrne(1);
        knjiznica.posodi(1, 3);
        knjiznica.posodi(2, 3);
        knjiznica.posodi(0, 3);
        knjiznica.clanVrne(0);
        knjiznica.clanVrne(2);
        knjiznica.posodi(0, 0);
        knjiznica.posodi(1, 0);
        knjiznica.posodi(2, 0);

        System.out.println(knjiznica.najNaslov());
    }
}
