
public class Test01 {

    public static void main(String[] args) {
        Zival zival = new Zival();
        Sesalec sesalec = new Sesalec();
        Macka macka = new Macka();
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Plazilec plazilec = new Plazilec();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        tiger.seHrani();
        medved.seHrani();
        zelva.seHrani();
        plazilec.seHrani();

        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
        System.out.println(plazilec.steviloHranjenj());
        System.out.println(macka.steviloHranjenj());
        System.out.println(sesalec.steviloHranjenj());
        System.out.println(zival.steviloHranjenj());
        System.out.println("---------");

        tiger.preganja(medved);
        sesalec.preganja(kaca);
        zelva.preganja(zival);
        tiger.preganja(medved);
        lev.preganja(lev);
        plazilec.preganja(lev);

        System.out.println(tiger.steviloPreganjanj(medved));
        System.out.println(macka.steviloPreganjanj(lev));
        System.out.println(macka.steviloPreganjanj(sesalec));
        System.out.println(macka.steviloPreganjanj(plazilec));
        System.out.println(zelva.steviloPreganjanj(sesalec));
        System.out.println(sesalec.steviloPreganjanj(plazilec));
        System.out.println(plazilec.steviloPreganjanj(zival));
        System.out.println(zival.steviloPreganjanj(plazilec));
        System.out.println(zival.steviloPreganjanj(zival));
    }
}
