
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(11.0, 12.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Gorazd", 100),
            new Tretja.Najdba("Karel", 165),
            new Tretja.Najdba("Simon", 178),
            new Tretja.Najdba("Emil", 223),
            new Tretja.Najdba("Dejan", 237),
            new Tretja.Najdba("Hilda", 299),
            new Tretja.Najdba("Ana", 349),
            new Tretja.Najdba("Francka", 445),
            new Tretja.Najdba("Simon", 460),
            new Tretja.Najdba("Andrej", 495),
            new Tretja.Najdba("Karel", 539),
            new Tretja.Najdba("Barbara", 573),
            new Tretja.Najdba("Hinko", 669),
            new Tretja.Najdba("Barbara", 690),
            new Tretja.Najdba("Cvetka", 721),
            new Tretja.Najdba("Eva", 781),
            new Tretja.Najdba("Zinka", 825),
            new Tretja.Najdba("Simona", 842),
            new Tretja.Najdba("Matej", 899),
            new Tretja.Najdba("Matej", 950),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
