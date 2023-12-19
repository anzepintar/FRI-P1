
/*
 * Testni razred za razred VektorObject.
 */

public class TestVektorObject {

    public static void main(String[] args) {
        VektorObject v = new VektorObject();
        v.dodaj("tralala");
        v.dodaj(new Cas(11, 20));
        v.dodaj(42);
        System.out.println(v);

        String niz = (String) v.vrni(0);
        Cas cas = (Cas) v.vrni(1);
        Integer n = (Integer) v.vrni(2);

        System.out.println(niz);
        System.out.println(cas);
        System.out.println(n);
    }
}
