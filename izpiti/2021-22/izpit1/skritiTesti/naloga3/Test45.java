
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-19.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 46),
                    new Tretja.Najdba("Vlado", 142),
                    new Tretja.Najdba("Simon", 187),
                    new Tretja.Najdba("Hilda", 267),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-9.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 55),
                    new Tretja.Najdba("Jana", 143),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(6.0, -20.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(10.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 2),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-12.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 31),
                    new Tretja.Najdba("Gabrijela", 89),
                    new Tretja.Najdba("Urban", 142),
                    new Tretja.Najdba("Nikolaj", 206),
                    new Tretja.Najdba("Urban", 305),
                    new Tretja.Najdba("Cvetka", 370),
                    new Tretja.Najdba("Barbara", 437),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
