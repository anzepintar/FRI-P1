
public class Test34 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();

        kaca.seHrani();
        kaca.seHrani();
        lev.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        medved.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        lev.seHrani();
        tiger.seHrani();
        tiger.seHrani();
        zelva.seHrani();
        zelva.seHrani();
        zelva.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());

        System.out.println("---");

        zelva.preganja(tiger);
        kaca.preganja(lev);
        tiger.preganja(lev);
        tiger.preganja(tiger);
        lev.preganja(lev);
        tiger.preganja(zelva);
        lev.preganja(zelva);
        kaca.preganja(tiger);
        kaca.preganja(zelva);
        lev.preganja(kaca);
        medved.preganja(zelva);
        lev.preganja(tiger);
        medved.preganja(kaca);
        zelva.preganja(zelva);
        kaca.preganja(lev);
        medved.preganja(tiger);
        tiger.preganja(lev);
        medved.preganja(medved);
        kaca.preganja(medved);
        lev.preganja(kaca);
        tiger.preganja(medved);
        kaca.preganja(lev);
        kaca.preganja(medved);
        lev.preganja(lev);
        medved.preganja(tiger);
        kaca.preganja(tiger);
        kaca.preganja(tiger);
        zelva.preganja(tiger);
        tiger.preganja(tiger);
        lev.preganja(medved);
        kaca.preganja(kaca);
        zelva.preganja(tiger);
        medved.preganja(kaca);
        lev.preganja(tiger);
        tiger.preganja(tiger);
        medved.preganja(medved);
        kaca.preganja(zelva);
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
