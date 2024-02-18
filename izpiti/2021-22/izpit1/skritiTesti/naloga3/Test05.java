
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(19.0, 2.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Leon", 98),
            new Tretja.Najdba("Ana", 157),
            new Tretja.Najdba("Hinko", 180),
            new Tretja.Najdba("Vita", 250),
            new Tretja.Najdba("Ana", 272),
            new Tretja.Najdba("Vlado", 347),
            new Tretja.Najdba("Rozalija", 377),
            new Tretja.Najdba("Darja", 436),
            new Tretja.Najdba("Urban", 475),
            new Tretja.Najdba("Maja", 573),
            new Tretja.Najdba("Zoran", 638),
            new Tretja.Najdba("Zinka", 675),
            new Tretja.Najdba("Zoran", 724),
            new Tretja.Najdba("Nikolaj", 737),
            new Tretja.Najdba("Nina", 740),
            new Tretja.Najdba("Eva", 795),
            new Tretja.Najdba("Matej", 826),
            new Tretja.Najdba("Simon", 857),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
