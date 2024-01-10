
public class Test22 {

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

        lev.seHrani();
        kaca.seHrani();
        plazilec.seHrani();
        zelva.seHrani();
        zelva.seHrani();
        medved.seHrani();
        sesalec.seHrani();
        medved.seHrani();
        macka.seHrani();
        medved.seHrani();
        medved.seHrani();
        zival.seHrani();
        plazilec.seHrani();
        lev.seHrani();
        zival.seHrani();
        zelva.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        zival.seHrani();
        plazilec.seHrani();

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
