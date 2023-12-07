
public class Test01 {

    public static void main(String[] args) {
        Knjiznica knjiznica = new Knjiznica(3, 5, 10);

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
    }
}
