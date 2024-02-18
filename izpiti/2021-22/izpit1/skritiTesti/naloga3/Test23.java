
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-15.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 31),
                    new Tretja.Najdba("Rok", 37),
                    new Tretja.Najdba("Bojan", 55),
                    new Tretja.Najdba("Gorazd", 120),
                    new Tretja.Najdba("Iva", 128),
                    new Tretja.Najdba("Peter", 213),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-16.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 23),
                    new Tretja.Najdba("Leon", 25),
                    new Tretja.Najdba("Simon", 64),
                    new Tretja.Najdba("Janez", 108),
                    new Tretja.Najdba("Tatjana", 128),
                    new Tretja.Najdba("Vita", 144),
                    new Tretja.Najdba("Cene", 223),
                    new Tretja.Najdba("Dejan", 276),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-13.0, -20.0));
        System.out.println(Math.abs(pot - 19.18) < 0.02);
    }
}
