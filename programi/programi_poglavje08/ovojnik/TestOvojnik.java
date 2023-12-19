
/*
 * Testni razred za razred Ovojnik
 */

public class TestOvojnik {

    public static void main(String[] args) {
        Ovojnik<String> ov1 = new Ovojnik<String>("dober dan");
        // krajše:
        // Ovojnik<String> ov1 = new Ovojnik<>("dober dan");

        Ovojnik<Cas> ov2 = new Ovojnik<>(new Cas(14, 40));
        Ovojnik<Integer> ov3 = new Ovojnik<>(42);

        // Ovojnik ov4 = new Ovojnik("tralala");
        //
        // to pomeni ...
        // Ovojnik<Object> ov4 = new Ovojnik<>("tralala");
        // ... sicer pa vedno pišemo Ovojnik<Tip>, nikoli samo Ovojnik

        String niz = ov1.vrni();
        Cas cas = ov2.vrni();
        Integer n = ov3.vrni();

        System.out.println(niz);
        System.out.println(cas);
        System.out.println(n);

        // Integer n1 = ov1.vrni();  // se ne prevede!
    }
}
