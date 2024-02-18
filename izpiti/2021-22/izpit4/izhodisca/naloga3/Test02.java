
public class Test02 {

    public static void main(String[] args) {
        Tretja.Tiskalnik t = new Tretja.Tiskalnik();
        System.out.println(t.dolzinaVrste());

        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        t.prejmi(new Tretja.Asistent(), "");
        System.out.println(t.dolzinaVrste());

        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        t.prejmi(new Tretja.Profesor(), "");
        System.out.println(t.dolzinaVrste());

        t.prejmi(new Tretja.Asistent(), "");
        t.prejmi(new Tretja.Asistent(), "");
        t.prejmi(new Tretja.Docent(), "");
        t.prejmi(new Tretja.Profesor(), "");
        System.out.println(t.dolzinaVrste());
    }
}
