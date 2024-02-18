
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-15.0, -11.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Ana", 27),
            new Tretja.Najdba("Nina", 112),
            new Tretja.Najdba("Gorazd", 197),
            new Tretja.Najdba("Lidija", 215),
            new Tretja.Najdba("Zinka", 244),
            new Tretja.Najdba("Emil", 302),
            new Tretja.Najdba("Iva", 373),
            new Tretja.Najdba("Ivan", 438),
            new Tretja.Najdba("Peter", 515),
            new Tretja.Najdba("Oton", 530),
            new Tretja.Najdba("Ivan", 560),
            new Tretja.Najdba("Simon", 643),
            new Tretja.Najdba("Gorazd", 731),
            new Tretja.Najdba("Cvetka", 740),
            new Tretja.Najdba("Leon", 789),
            new Tretja.Najdba("Ula", 840),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
