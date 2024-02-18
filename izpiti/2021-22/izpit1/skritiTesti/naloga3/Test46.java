
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(7.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 28),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-1.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 16),
                    new Tretja.Najdba("Franci", 70),
                    new Tretja.Najdba("Janez", 73),
                    new Tretja.Najdba("Jana", 110),
                    new Tretja.Najdba("Ana", 203),
                    new Tretja.Najdba("Bojan", 277),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-19.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 97),
                    new Tretja.Najdba("Hilda", 141),
                    new Tretja.Najdba("Emil", 234),
                    new Tretja.Najdba("Rok", 252),
                    new Tretja.Najdba("Zinka", 319),
                    new Tretja.Najdba("Hilda", 327),
                    new Tretja.Najdba("Cene", 408),
                    new Tretja.Najdba("Ula", 466),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(11.0, -15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gabrijela", 80),
                    new Tretja.Najdba("Tone", 88),
                    new Tretja.Najdba("Eva", 185),
                    new Tretja.Najdba("Peter", 193),
                    new Tretja.Najdba("Karel", 288),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-15.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 18),
                    new Tretja.Najdba("Rok", 44),
                    new Tretja.Najdba("Emil", 74),
                    new Tretja.Najdba("Barbara", 119),
                    new Tretja.Najdba("Ivan", 142),
                    new Tretja.Najdba("Olga", 202),
                    new Tretja.Najdba("Nikolaj", 285),
                    new Tretja.Najdba("Dejan", 385),
                    new Tretja.Najdba("Urban", 434),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-3.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 91),
                    new Tretja.Najdba("Hilda", 163),
                    new Tretja.Najdba("Cene", 263),
                    new Tretja.Najdba("Zinka", 318),
                    new Tretja.Najdba("Gorazd", 366),
                    new Tretja.Najdba("Vita", 378),
                    new Tretja.Najdba("Hinko", 385),
                    new Tretja.Najdba("Nikolaj", 465),
                    new Tretja.Najdba("Hinko", 531),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
