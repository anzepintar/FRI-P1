
public class Test10 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        lev.seHrani();
        medved.seHrani();
        lev.seHrani();
        lev.seHrani();
        lev.seHrani();
        zelva.seHrani();
        lev.seHrani();
        tiger.seHrani();
        lev.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        lev.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        zelva.seHrani();
        lev.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        medved.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        tiger.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
    }
}
