
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(8.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 37),
                    new Tretja.Najdba("Cene", 64),
                    new Tretja.Najdba("Olga", 106),
                    new Tretja.Najdba("Emil", 141),
                    new Tretja.Najdba("Nina", 228),
                    new Tretja.Najdba("Maja", 281),
                    new Tretja.Najdba("Gorazd", 316),
                    new Tretja.Najdba("Eva", 330),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(16.0, -15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 46),
                    new Tretja.Najdba("Gabrijela", 122),
                    new Tretja.Najdba("Olga", 197),
                    new Tretja.Najdba("Lidija", 295),
                    new Tretja.Najdba("Gabrijela", 322),
                    new Tretja.Najdba("Ivan", 332),
                    new Tretja.Najdba("Rozalija", 364),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-18.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Andrej", 16),
                    new Tretja.Najdba("Bojan", 40),
                    new Tretja.Najdba("Nina", 80),
                    new Tretja.Najdba("Francka", 177),
                    new Tretja.Najdba("Rozalija", 216),
                    new Tretja.Najdba("Olga", 269),
                    new Tretja.Najdba("Jana", 291),
                    new Tretja.Najdba("Maja", 379),
                    new Tretja.Najdba("Ana", 383),
                    new Tretja.Najdba("Olga", 465),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(15.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 68),
                    new Tretja.Najdba("Hilda", 157),
                    new Tretja.Najdba("Andrej", 200),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(2.0, -18.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-18.0, -15.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-18.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 26),
                    new Tretja.Najdba("Zinka", 59),
                    new Tretja.Najdba("Gorazd", 117),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-5.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 53),
                    new Tretja.Najdba("Nina", 152),
                    new Tretja.Najdba("Andrej", 237),
                    new Tretja.Najdba("Olga", 264),
                    new Tretja.Najdba("Leon", 278),
                    new Tretja.Najdba("Rozalija", 378),
                    new Tretja.Najdba("Barbara", 405),
                    new Tretja.Najdba("Simona", 486),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-8.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 80),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-3.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 99),
                    new Tretja.Najdba("Maja", 137),
                    new Tretja.Najdba("Franci", 159),
                    new Tretja.Najdba("Ula", 180),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(10.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 8),
                    new Tretja.Najdba("Tatjana", 103),
                    new Tretja.Najdba("Olga", 145),
                    new Tretja.Najdba("Andrej", 177),
                    new Tretja.Najdba("Oton", 208),
                    new Tretja.Najdba("Ivan", 303),
                    new Tretja.Najdba("Nikolaj", 347),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-18.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 58),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-4.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 4),
                    new Tretja.Najdba("Matej", 22),
                    new Tretja.Najdba("Cvetka", 90),
                    new Tretja.Najdba("Simona", 108),
                    new Tretja.Najdba("Gorazd", 144),
                    new Tretja.Najdba("Francka", 158),
                    new Tretja.Najdba("Gorazd", 192),
                    new Tretja.Najdba("Simona", 205),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(2.0, 12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nikolaj", 36),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
