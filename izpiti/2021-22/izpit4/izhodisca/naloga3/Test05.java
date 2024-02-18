
public class Test05 {

    public static void main(String[] args) {
        Tretja.Tiskalnik t = new Tretja.Tiskalnik();
        System.out.println(t.steviloDokumentov(new Tretja.Asistent()));
        System.out.println(t.steviloDokumentov(new Tretja.Docent()));
        System.out.println(t.steviloDokumentov(new Tretja.Profesor()));
        System.out.println("---");

        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        t.prejmi(new Tretja.Asistent(), "");
        System.out.println(t.steviloDokumentov(new Tretja.Asistent()));
        System.out.println(t.steviloDokumentov(new Tretja.Docent()));
        System.out.println(t.steviloDokumentov(new Tretja.Profesor()));
        System.out.println("---");

        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        t.prejmi(new Tretja.Profesor(), "");
        System.out.println(t.steviloDokumentov(new Tretja.Asistent()));
        System.out.println(t.steviloDokumentov(new Tretja.Docent()));
        System.out.println(t.steviloDokumentov(new Tretja.Profesor()));
        System.out.println("---");

        t.prejmi(new Tretja.Asistent(), "");
        t.prejmi(new Tretja.Asistent(), "");
        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        System.out.println(t.steviloDokumentov(new Tretja.Asistent()));
        System.out.println(t.steviloDokumentov(new Tretja.Docent()));
        System.out.println(t.steviloDokumentov(new Tretja.Profesor()));
    }
}
