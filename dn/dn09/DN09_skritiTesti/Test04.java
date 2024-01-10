
public class Test04 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        kaca.seHrani();
        lev.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        zelva.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        zelva.seHrani();
        medved.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
    }
}
