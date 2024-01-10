
public class Test25 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();
        Plazilec plazilec = new Plazilec();
        Macka macka = new Macka();
        Sesalec sesalec = new Sesalec();
        Zival zival = new Zival();

        kaca.seHrani();
        tiger.seHrani();
        lev.seHrani();
        zelva.seHrani();
        lev.seHrani();
        medved.seHrani();
        medved.seHrani();
        zelva.seHrani();
        zival.seHrani();
        macka.seHrani();
        sesalec.seHrani();
        medved.seHrani();
        kaca.seHrani();
        zival.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
        System.out.println(plazilec.steviloHranjenj());
        System.out.println(macka.steviloHranjenj());
        System.out.println(sesalec.steviloHranjenj());
        System.out.println(zival.steviloHranjenj());
    }
}
