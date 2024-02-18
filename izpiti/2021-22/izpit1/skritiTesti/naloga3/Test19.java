
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-11.0, -8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 79),
                    new Tretja.Najdba("Olga", 149),
                    new Tretja.Najdba("Andrej", 195),
                    new Tretja.Najdba("Ula", 222),
                    new Tretja.Najdba("Maja", 302),
                    new Tretja.Najdba("Zinka", 369),
                    new Tretja.Najdba("Janez", 382),
                    new Tretja.Najdba("Simon", 472),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-18.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 21),
                    new Tretja.Najdba("Maja", 117),
                    new Tretja.Najdba("Matej", 217),
                    new Tretja.Najdba("Karel", 228),
                    new Tretja.Najdba("Matej", 282),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(11.0, 17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 45),
                    new Tretja.Najdba("Simona", 90),
                    new Tretja.Najdba("Nina", 125),
                    new Tretja.Najdba("Janez", 181),
                    new Tretja.Najdba("Franci", 219),
                    new Tretja.Najdba("Peter", 312),
                    new Tretja.Najdba("Dejan", 407),
                    new Tretja.Najdba("Tone", 503),
                    new Tretja.Najdba("Franci", 588),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(7.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 33),
                    new Tretja.Najdba("Rok", 66),
                    new Tretja.Najdba("Dejan", 105),
                    new Tretja.Najdba("Gorazd", 152),
                    new Tretja.Najdba("Emil", 160),
                    new Tretja.Najdba("Jana", 251),
                    new Tretja.Najdba("Maja", 285),
                    new Tretja.Najdba("Emil", 344),
                    new Tretja.Najdba("Klara", 425),
                    new Tretja.Najdba("Rozalija", 439),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(11.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 2),
                    new Tretja.Najdba("Petra", 15),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(6.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 25),
                    new Tretja.Najdba("Zoran", 112),
                    new Tretja.Najdba("Karel", 180),
                    new Tretja.Najdba("Francka", 210),
                    new Tretja.Najdba("Leon", 235),
                    new Tretja.Najdba("Tatjana", 256),
                    new Tretja.Najdba("Eva", 343),
                    new Tretja.Najdba("Janez", 344),
                    new Tretja.Najdba("Ivan", 396),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(1.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 46),
                    new Tretja.Najdba("Rok", 135),
                    new Tretja.Najdba("Olga", 202),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(1.0, 7.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(14.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 26),
                    new Tretja.Najdba("Gabrijela", 123),
                    new Tretja.Najdba("Zinka", 154),
                    new Tretja.Najdba("Vlado", 252),
                    new Tretja.Najdba("Bojan", 269),
                    new Tretja.Najdba("Zinka", 369),
                    new Tretja.Najdba("Simon", 459),
                    new Tretja.Najdba("Emil", 515),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(11.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 23),
                    new Tretja.Najdba("Klara", 27),
                    new Tretja.Najdba("Ana", 119),
                    new Tretja.Najdba("Dejan", 203),
                    new Tretja.Najdba("Zinka", 292),
                    new Tretja.Najdba("Ivan", 353),
                    new Tretja.Najdba("Simona", 425),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-13.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 15),
                    new Tretja.Najdba("Hinko", 112),
                    new Tretja.Najdba("Jana", 129),
                    new Tretja.Najdba("Barbara", 222),
                    new Tretja.Najdba("Matej", 282),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-5.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 61),
                    new Tretja.Najdba("Ivan", 100),
                    new Tretja.Najdba("Simon", 182),
                    new Tretja.Najdba("Vita", 188),
                    new Tretja.Najdba("Dejan", 214),
                    new Tretja.Najdba("Tatjana", 306),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(19.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zinka", 71),
                    new Tretja.Najdba("Rok", 138),
                    new Tretja.Najdba("Tone", 220),
                    new Tretja.Najdba("Ula", 246),
                    new Tretja.Najdba("Simon", 291),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-10.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 75),
                    new Tretja.Najdba("Emil", 165),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(13.0, -15.0));
        System.out.println(Math.abs(pot - 337.76) < 0.02);
    }
}
