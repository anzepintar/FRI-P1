
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(2.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vlado", 89),
                    new Tretja.Najdba("Ana", 154),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(7.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 12),
                    new Tretja.Najdba("Jana", 29),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(17.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 15),
                    new Tretja.Najdba("Nina", 102),
                    new Tretja.Najdba("Nikolaj", 170),
                    new Tretja.Najdba("Rozalija", 205),
                    new Tretja.Najdba("Gabrijela", 220),
                    new Tretja.Najdba("Franci", 283),
                    new Tretja.Najdba("Simon", 287),
                    new Tretja.Najdba("Tone", 366),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-4.0, 6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 7),
                    new Tretja.Najdba("Leon", 36),
                    new Tretja.Najdba("Leon", 37),
                    new Tretja.Najdba("Eva", 77),
                    new Tretja.Najdba("Hinko", 109),
                    new Tretja.Najdba("Zinka", 199),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(1.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 84),
                    new Tretja.Najdba("Peter", 148),
                    new Tretja.Najdba("Cvetka", 156),
                    new Tretja.Najdba("Simona", 242),
                    new Tretja.Najdba("Oton", 247),
                    new Tretja.Najdba("Rozalija", 322),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-12.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 92),
                    new Tretja.Najdba("Gorazd", 139),
                    new Tretja.Najdba("Ula", 237),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-6.0, -9.0));
        System.out.println(Math.abs(pot - 92.92) < 0.02);
    }
}
