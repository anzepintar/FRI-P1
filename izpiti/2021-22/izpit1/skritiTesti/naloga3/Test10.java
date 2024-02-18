
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(13.0, -4.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Urban", 90),
            new Tretja.Najdba("Tatjana", 128),
            new Tretja.Najdba("Matej", 210),
            new Tretja.Najdba("Olga", 279),
            new Tretja.Najdba("Gorazd", 318),
            new Tretja.Najdba("Hilda", 321),
            new Tretja.Najdba("Lidija", 334),
            new Tretja.Najdba("Janez", 359),
            new Tretja.Najdba("Peter", 401),
            new Tretja.Najdba("Leon", 418),
            new Tretja.Najdba("Olga", 430),
            new Tretja.Najdba("Dejan", 463),
            new Tretja.Najdba("Jana", 539),
            new Tretja.Najdba("Iva", 564),
            new Tretja.Najdba("Jana", 627),
            new Tretja.Najdba("Cene", 688),
            new Tretja.Najdba("Rok", 746),
            new Tretja.Najdba("Darja", 766),
            new Tretja.Najdba("Dejan", 776),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
