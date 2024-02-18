
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-17.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 4),
                    new Tretja.Najdba("Simon", 87),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-11.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 5),
                    new Tretja.Najdba("Maja", 103),
                    new Tretja.Najdba("Zinka", 183),
                    new Tretja.Najdba("Ana", 186),
                    new Tretja.Najdba("Ana", 285),
                    new Tretja.Najdba("Oton", 367),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
