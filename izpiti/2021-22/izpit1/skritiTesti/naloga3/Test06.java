
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-16.0, 9.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Cvetka", 80),
            new Tretja.Najdba("Oton", 105),
            new Tretja.Najdba("Olga", 191),
            new Tretja.Najdba("Gorazd", 200),
            new Tretja.Najdba("Gorazd", 231),
            new Tretja.Najdba("Oton", 326),
            new Tretja.Najdba("Iva", 374),
            new Tretja.Najdba("Hinko", 460),
            new Tretja.Najdba("Lidija", 520),
            new Tretja.Najdba("Tone", 572),
            new Tretja.Najdba("Tatjana", 577),
            new Tretja.Najdba("Tatjana", 677),
            new Tretja.Najdba("Maja", 714),
            new Tretja.Najdba("Oton", 745),
            new Tretja.Najdba("Janez", 826),
            new Tretja.Najdba("Ula", 856),
            new Tretja.Najdba("Iva", 956),
            new Tretja.Najdba("Maja", 1050),
            new Tretja.Najdba("Ana", 1113),
            new Tretja.Najdba("Simona", 1209),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
