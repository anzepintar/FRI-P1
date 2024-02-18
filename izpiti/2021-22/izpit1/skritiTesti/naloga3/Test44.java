
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(12.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 53),
                    new Tretja.Najdba("Simona", 101),
                    new Tretja.Najdba("Simon", 111),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(20.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 37),
                    new Tretja.Najdba("Dejan", 94),
                    new Tretja.Najdba("Simona", 105),
                    new Tretja.Najdba("Tone", 151),
                    new Tretja.Najdba("Ana", 221),
                    new Tretja.Najdba("Simon", 268),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-8.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 72),
                    new Tretja.Najdba("Peter", 101),
                    new Tretja.Najdba("Barbara", 156),
                    new Tretja.Najdba("Nina", 212),
                    new Tretja.Najdba("Jana", 213),
                    new Tretja.Najdba("Ula", 290),
                    new Tretja.Najdba("Rok", 329),
                    new Tretja.Najdba("Vita", 339),
                    new Tretja.Najdba("Matej", 394),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(15.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 54),
                    new Tretja.Najdba("Urban", 146),
                    new Tretja.Najdba("Olga", 186),
                    new Tretja.Najdba("Hilda", 219),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-1.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 69),
                    new Tretja.Najdba("Andrej", 123),
                    new Tretja.Najdba("Peter", 199),
                    new Tretja.Najdba("Vlado", 252),
                    new Tretja.Najdba("Vita", 339),
                    new Tretja.Najdba("Leon", 343),
                    new Tretja.Najdba("Oton", 441),
                    new Tretja.Najdba("Zoran", 466),
                    new Tretja.Najdba("Eva", 550),
                    new Tretja.Najdba("Maja", 613),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-19.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 66),
                    new Tretja.Najdba("Nina", 93),
                    new Tretja.Najdba("Ula", 151),
                    new Tretja.Najdba("Rok", 164),
                    new Tretja.Najdba("Dejan", 231),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(5.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 9),
                    new Tretja.Najdba("Darja", 72),
                    new Tretja.Najdba("Urban", 80),
                    new Tretja.Najdba("Cene", 163),
                    new Tretja.Najdba("Francka", 237),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-9.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 5),
                    new Tretja.Najdba("Maja", 57),
                    new Tretja.Najdba("Francka", 79),
                    new Tretja.Najdba("Dejan", 172),
                    new Tretja.Najdba("Franci", 187),
                    new Tretja.Najdba("Leon", 200),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(0.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 96),
                    new Tretja.Najdba("Darja", 194),
                    new Tretja.Najdba("Urban", 207),
                    new Tretja.Najdba("Cene", 241),
                    new Tretja.Najdba("Maja", 262),
                    new Tretja.Najdba("Rozalija", 352),
                    new Tretja.Najdba("Cene", 439),
                    new Tretja.Najdba("Peter", 536),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(19.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 46),
                    new Tretja.Najdba("Nikolaj", 134),
                    new Tretja.Najdba("Leon", 189),
                    new Tretja.Najdba("Gorazd", 273),
                    new Tretja.Najdba("Petra", 292),
                    new Tretja.Najdba("Urban", 360),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(5.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 36),
                    new Tretja.Najdba("Darja", 71),
                    new Tretja.Najdba("Maja", 104),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
