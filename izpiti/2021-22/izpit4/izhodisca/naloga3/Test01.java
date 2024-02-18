
public class Test01 {

    public static void main(String[] args) {
        Tretja.Tiskalnik t = new Tretja.Tiskalnik();
        System.out.println(t.natisni());
        t.prejmi(new Tretja.Docent(), "d1");
        t.prejmi(new Tretja.Profesor(), "p1");
        t.prejmi(new Tretja.Asistent(), "a1");
        t.prejmi(new Tretja.Docent(), "d2");
        t.prejmi(new Tretja.Profesor(), "p2");
        System.out.println(t.natisni());
        t.prejmi(new Tretja.Profesor(), "p3");
        System.out.println(t.dolzinaVrste());
        System.out.println(t.steviloDokumentov(new Tretja.Profesor()));
    }
}
