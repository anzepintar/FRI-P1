
public class Test08 {

    public static void main(String[] args) {
        Tretja.Tiskalnik t = new Tretja.Tiskalnik();
        System.out.println(t.natisni());
        System.out.println("---");

        t.prejmi(new Tretja.Docent(), "prviDoc");
        t.prejmi(new Tretja.Profesor(), "prviProf");
        t.prejmi(new Tretja.Asistent(), "prviAs");
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println("---");

        t.prejmi(new Tretja.Profesor(), "drugiProf");
        t.prejmi(new Tretja.Docent(), "drugiDoc");
        t.prejmi(new Tretja.Docent(), "tretjiDoc");
        t.prejmi(new Tretja.Asistent(), "drugiAs");
        t.prejmi(new Tretja.Profesor(), "tretjiProf");
        t.prejmi(new Tretja.Docent(), "cetrtiDoc");
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println("---");

        t.prejmi(new Tretja.Profesor(), "cetrtiProf");
        t.prejmi(new Tretja.Docent(), "petiDoc");
        t.prejmi(new Tretja.Asistent(), "tretjiAs");
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
        System.out.println(t.natisni());
    }
}
