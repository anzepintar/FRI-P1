
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(6.0, -7.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Bojan", 73),
            new Tretja.Najdba("Rok", 163),
            new Tretja.Najdba("Iva", 170),
            new Tretja.Najdba("Hilda", 176),
            new Tretja.Najdba("Zoran", 212),
            new Tretja.Najdba("Vlado", 274),
            new Tretja.Najdba("Rok", 299),
            new Tretja.Najdba("Vlado", 394),
            new Tretja.Najdba("Klara", 440),
            new Tretja.Najdba("Tone", 540),
            new Tretja.Najdba("Zoran", 593),
            new Tretja.Najdba("Ana", 650),
            new Tretja.Najdba("Jana", 717),
            new Tretja.Najdba("Eva", 738),
            new Tretja.Najdba("Zoran", 744),
            new Tretja.Najdba("Barbara", 826),
            new Tretja.Najdba("Ivan", 893),
            new Tretja.Najdba("Urban", 904),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
