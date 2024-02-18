
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(5.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 90),
                    new Tretja.Najdba("Lidija", 158),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(11.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 98),
                    new Tretja.Najdba("Tone", 137),
                    new Tretja.Najdba("Vlado", 183),
                    new Tretja.Najdba("Rozalija", 258),
                    new Tretja.Najdba("Petra", 292),
                    new Tretja.Najdba("Cene", 339),
                    new Tretja.Najdba("Bojan", 354),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(1.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nikolaj", 75),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-15.0, -8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 23),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(14.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 22),
                    new Tretja.Najdba("Oton", 69),
                    new Tretja.Najdba("Vita", 76),
                    new Tretja.Najdba("Nina", 99),
                    new Tretja.Najdba("Ula", 199),
                    new Tretja.Najdba("Peter", 229),
                    new Tretja.Najdba("Cene", 310),
                    new Tretja.Najdba("Oton", 340),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(4.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Andrej", 39),
                    new Tretja.Najdba("Urban", 114),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(0.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 8),
                    new Tretja.Najdba("Simon", 72),
                    new Tretja.Najdba("Nikolaj", 168),
                    new Tretja.Najdba("Franci", 219),
                    new Tretja.Najdba("Dejan", 304),
                    new Tretja.Najdba("Iva", 314),
                    new Tretja.Najdba("Matej", 390),
                    new Tretja.Najdba("Dejan", 453),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-17.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 85),
                    new Tretja.Najdba("Zinka", 108),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(0.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 73),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-18.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 48),
                    new Tretja.Najdba("Zinka", 120),
                    new Tretja.Najdba("Rozalija", 127),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-7.0, 4.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(6.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 89),
                    new Tretja.Najdba("Nikolaj", 158),
                    new Tretja.Najdba("Ana", 244),
                    new Tretja.Najdba("Ana", 303),
                    new Tretja.Najdba("Simon", 363),
                    new Tretja.Najdba("Andrej", 402),
                    new Tretja.Najdba("Vlado", 440),
                    new Tretja.Najdba("Zinka", 448),
                    new Tretja.Najdba("Olga", 457),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(3.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 32),
                    new Tretja.Najdba("Francka", 115),
                    new Tretja.Najdba("Vlado", 142),
                    new Tretja.Najdba("Maja", 201),
                    new Tretja.Najdba("Barbara", 222),
                    new Tretja.Najdba("Nikolaj", 226),
                    new Tretja.Najdba("Olga", 268),
                    new Tretja.Najdba("Tone", 318),
                    new Tretja.Najdba("Franci", 343),
                    new Tretja.Najdba("Olga", 375),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-5.0, 16.0),
                new Tretja.Najdba[]{
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
