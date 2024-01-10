
public class Test31 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        tiger.seHrani();
        zelva.seHrani();
        lev.seHrani();
        zelva.seHrani();
        lev.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        medved.seHrani();
        lev.seHrani();
        lev.seHrani();
        tiger.seHrani();
        medved.seHrani();
        zelva.seHrani();
        lev.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        zelva.seHrani();
        medved.seHrani();
        lev.seHrani();
        lev.seHrani();
        zelva.seHrani();
        medved.seHrani();
        lev.seHrani();
        medved.seHrani();
        lev.seHrani();
        medved.seHrani();
        medved.seHrani();
        medved.seHrani();
        medved.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());

        System.out.println("---");

        kaca.preganja(tiger);
        tiger.preganja(medved);
        lev.preganja(zelva);
        tiger.preganja(zelva);
        medved.preganja(medved);
        kaca.preganja(zelva);
        lev.preganja(tiger);
        tiger.preganja(tiger);
        lev.preganja(lev);
        tiger.preganja(lev);
        kaca.preganja(zelva);
        kaca.preganja(kaca);
        lev.preganja(kaca);
        medved.preganja(zelva);
        zelva.preganja(kaca);

        System.out.println(tiger.steviloPreganjanj(tiger));
        System.out.println(tiger.steviloPreganjanj(lev));
        System.out.println(tiger.steviloPreganjanj(medved));
        System.out.println(tiger.steviloPreganjanj(zelva));
        System.out.println(tiger.steviloPreganjanj(kaca));
        System.out.println(lev.steviloPreganjanj(tiger));
        System.out.println(lev.steviloPreganjanj(lev));
        System.out.println(lev.steviloPreganjanj(medved));
        System.out.println(lev.steviloPreganjanj(zelva));
        System.out.println(lev.steviloPreganjanj(kaca));
        System.out.println(medved.steviloPreganjanj(tiger));
        System.out.println(medved.steviloPreganjanj(lev));
        System.out.println(medved.steviloPreganjanj(medved));
        System.out.println(medved.steviloPreganjanj(zelva));
        System.out.println(medved.steviloPreganjanj(kaca));
        System.out.println(zelva.steviloPreganjanj(tiger));
        System.out.println(zelva.steviloPreganjanj(lev));
        System.out.println(zelva.steviloPreganjanj(medved));
        System.out.println(zelva.steviloPreganjanj(zelva));
        System.out.println(zelva.steviloPreganjanj(kaca));
        System.out.println(kaca.steviloPreganjanj(tiger));
        System.out.println(kaca.steviloPreganjanj(lev));
        System.out.println(kaca.steviloPreganjanj(medved));
        System.out.println(kaca.steviloPreganjanj(zelva));
        System.out.println(kaca.steviloPreganjanj(kaca));
    }
}
