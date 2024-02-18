
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(7.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 94),
                    new Tretja.Najdba("Klara", 158),
                    new Tretja.Najdba("Barbara", 242),
                    new Tretja.Najdba("Olga", 269),
                    new Tretja.Najdba("Zinka", 331),
                    new Tretja.Najdba("Gabrijela", 397),
                    new Tretja.Najdba("Barbara", 451),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-4.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 1),
                    new Tretja.Najdba("Maja", 11),
                    new Tretja.Najdba("Franci", 89),
                    new Tretja.Najdba("Janez", 132),
                    new Tretja.Najdba("Eva", 152),
                    new Tretja.Najdba("Tone", 213),
                    new Tretja.Najdba("Petra", 277),
                    new Tretja.Najdba("Klara", 341),
                    new Tretja.Najdba("Ula", 395),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(12.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 9),
                    new Tretja.Najdba("Cene", 88),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(10.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 50),
                    new Tretja.Najdba("Cene", 129),
                    new Tretja.Najdba("Hinko", 211),
                    new Tretja.Najdba("Nikolaj", 264),
                    new Tretja.Najdba("Simona", 304),
                    new Tretja.Najdba("Emil", 384),
                    new Tretja.Najdba("Petra", 467),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(6.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 44),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-16.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 34),
                    new Tretja.Najdba("Franci", 66),
                    new Tretja.Najdba("Andrej", 85),
                    new Tretja.Najdba("Peter", 165),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-4.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 100),
                    new Tretja.Najdba("Rok", 162),
                    new Tretja.Najdba("Rozalija", 173),
                    new Tretja.Najdba("Andrej", 188),
                    new Tretja.Najdba("Leon", 214),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
