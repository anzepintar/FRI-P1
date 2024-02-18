
public class Test01 {

    public static void main(String[] args) {
        Tretja.Stavek stavek = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("veliki", 'Z', 1, 2),
            new Tretja.Pridevnik("leseni", 'Z', 1, 2),
            new Tretja.Samostalnik("mizi", 'Z', 1, 2),
            new Tretja.Glagol("stojita", 3, 2),
            new Tretja.Beseda("na"),
            new Tretja.Pridevnik("kamnitih", 'S', 5, 3),
            new Tretja.Samostalnik("tleh", 'S', 5, 3)
        });

        Tretja.Glagol glagol = stavek.poisciGlagol();
        System.out.println(glagol);
    }
}
