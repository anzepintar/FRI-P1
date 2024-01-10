
public class Test01 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        kaca.seHrani();
        zelva.seHrani();
        lev.seHrani();
        zelva.seHrani();
        tiger.seHrani();
        lev.seHrani();
        tiger.seHrani();
        medved.seHrani();
        zelva.seHrani();
        tiger.seHrani();
        medved.seHrani();
        kaca.seHrani();
        lev.seHrani();
        kaca.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
    }
}
