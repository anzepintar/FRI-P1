
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-10.0, -4.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Olga", 4),
            new Tretja.Najdba("Tone", 39),
            new Tretja.Najdba("Iva", 138),
            new Tretja.Najdba("Matej", 157),
            new Tretja.Najdba("Maja", 211),
            new Tretja.Najdba("Leon", 240),
            new Tretja.Najdba("Darja", 261),
            new Tretja.Najdba("Dejan", 268),
            new Tretja.Najdba("Cene", 346),
            new Tretja.Najdba("Karel", 347),
            new Tretja.Najdba("Gorazd", 371),
            new Tretja.Najdba("Rok", 375),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
