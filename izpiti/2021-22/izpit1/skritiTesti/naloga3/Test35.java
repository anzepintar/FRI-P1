
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(19.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 4),
                    new Tretja.Najdba("Darja", 57),
                    new Tretja.Najdba("Jana", 107),
                    new Tretja.Najdba("Cene", 176),
                    new Tretja.Najdba("Bojan", 209),
                    new Tretja.Najdba("Petra", 275),
                    new Tretja.Najdba("Cene", 317),
                    new Tretja.Najdba("Hilda", 408),
                    new Tretja.Najdba("Darja", 486),
                    new Tretja.Najdba("Leon", 550),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-10.0, -13.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(11.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Andrej", 42),
                    new Tretja.Najdba("Tone", 126),
                    new Tretja.Najdba("Nina", 181),
                    new Tretja.Najdba("Peter", 200),
                    new Tretja.Najdba("Leon", 282),
                    new Tretja.Najdba("Leon", 378),
                    new Tretja.Najdba("Urban", 403),
                    new Tretja.Najdba("Gorazd", 467),
                    new Tretja.Najdba("Oton", 477),
                    new Tretja.Najdba("Ula", 571),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-19.0, -5.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-14.0, -15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 6),
                    new Tretja.Najdba("Ula", 101),
                    new Tretja.Najdba("Zinka", 126),
                    new Tretja.Najdba("Iva", 197),
                    new Tretja.Najdba("Oton", 199),
                    new Tretja.Najdba("Petra", 268),
                    new Tretja.Najdba("Karel", 347),
                    new Tretja.Najdba("Klara", 406),
                    new Tretja.Najdba("Zoran", 475),
                    new Tretja.Najdba("Maja", 480),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(4.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 63),
                    new Tretja.Najdba("Tone", 146),
                    new Tretja.Najdba("Nina", 149),
                    new Tretja.Najdba("Rozalija", 166),
                    new Tretja.Najdba("Peter", 211),
                    new Tretja.Najdba("Tatjana", 237),
                    new Tretja.Najdba("Rozalija", 270),
                    new Tretja.Najdba("Maja", 305),
                    new Tretja.Najdba("Cene", 403),
                    new Tretja.Najdba("Tatjana", 456),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-8.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 72),
                    new Tretja.Najdba("Nina", 152),
                    new Tretja.Najdba("Peter", 180),
                    new Tretja.Najdba("Jana", 277),
                    new Tretja.Najdba("Jana", 359),
                    new Tretja.Najdba("Simon", 416),
                    new Tretja.Najdba("Rok", 482),
                    new Tretja.Najdba("Oton", 489),
                    new Tretja.Najdba("Rok", 528),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-11.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vlado", 19),
                    new Tretja.Najdba("Andrej", 51),
                    new Tretja.Najdba("Olga", 136),
                    new Tretja.Najdba("Zinka", 195),
                    new Tretja.Najdba("Petra", 294),
                    new Tretja.Najdba("Petra", 320),
                    new Tretja.Najdba("Olga", 398),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(2.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 46),
                    new Tretja.Najdba("Nikolaj", 91),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-2.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 83),
                    new Tretja.Najdba("Maja", 133),
                    new Tretja.Najdba("Franci", 209),
                    new Tretja.Najdba("Iva", 227),
                    new Tretja.Najdba("Karel", 300),
                    new Tretja.Najdba("Darja", 331),
                    new Tretja.Najdba("Maja", 372),
                    new Tretja.Najdba("Darja", 442),
                    new Tretja.Najdba("Franci", 476),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-12.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 81),
                    new Tretja.Najdba("Simona", 171),
                    new Tretja.Najdba("Karel", 208),
                    new Tretja.Najdba("Tone", 282),
                    new Tretja.Najdba("Cene", 305),
                    new Tretja.Najdba("Franci", 385),
                    new Tretja.Najdba("Nina", 435),
                    new Tretja.Najdba("Klara", 457),
                    new Tretja.Najdba("Hilda", 485),
                    new Tretja.Najdba("Karel", 551),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(7.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 76),
                    new Tretja.Najdba("Matej", 130),
                    new Tretja.Najdba("Urban", 214),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-12.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 67),
                    new Tretja.Najdba("Iva", 135),
                    new Tretja.Najdba("Oton", 141),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
