
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(19.0, -18.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Gabrijela", 52),
            new Tretja.Najdba("Emil", 142),
            new Tretja.Najdba("Olga", 160),
            new Tretja.Najdba("Vlado", 215),
            new Tretja.Najdba("Cvetka", 310),
            new Tretja.Najdba("Olga", 342),
            new Tretja.Najdba("Matej", 381),
            new Tretja.Najdba("Nikolaj", 477),
            new Tretja.Najdba("Maja", 499),
            new Tretja.Najdba("Tatjana", 547),
            new Tretja.Najdba("Gorazd", 606),
            new Tretja.Najdba("Francka", 632),
            new Tretja.Najdba("Franci", 723),
            new Tretja.Najdba("Lidija", 808),
            new Tretja.Najdba("Peter", 846),
            new Tretja.Najdba("Urban", 914),
            new Tretja.Najdba("Darja", 954),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
