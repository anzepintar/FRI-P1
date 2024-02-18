
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(7.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 96),
                    new Tretja.Najdba("Nikolaj", 156),
                    new Tretja.Najdba("Gabrijela", 254),
                    new Tretja.Najdba("Zinka", 331),
                    new Tretja.Najdba("Matej", 341),
                    new Tretja.Najdba("Hilda", 344),
                    new Tretja.Najdba("Franci", 346),
                    new Tretja.Najdba("Peter", 394),
                    new Tretja.Najdba("Urban", 419),
                    new Tretja.Najdba("Emil", 445),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(11.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 31),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(11.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 44),
                    new Tretja.Najdba("Maja", 123),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-2.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 8),
                    new Tretja.Najdba("Rok", 53),
                    new Tretja.Najdba("Bojan", 55),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-10.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ivan", 24),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-15.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 66),
                    new Tretja.Najdba("Barbara", 164),
                    new Tretja.Najdba("Vita", 204),
                    new Tretja.Najdba("Urban", 231),
                    new Tretja.Najdba("Vita", 304),
                    new Tretja.Najdba("Barbara", 349),
                    new Tretja.Najdba("Cene", 350),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
