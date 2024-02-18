
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(13.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 19),
                    new Tretja.Najdba("Darja", 111),
                    new Tretja.Najdba("Janez", 200),
                    new Tretja.Najdba("Simon", 264),
                    new Tretja.Najdba("Simona", 326),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(20.0, 2.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(9.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 80),
                    new Tretja.Najdba("Ula", 136),
                    new Tretja.Najdba("Zoran", 210),
                    new Tretja.Najdba("Tatjana", 250),
                    new Tretja.Najdba("Ana", 324),
                    new Tretja.Najdba("Tatjana", 412),
                    new Tretja.Najdba("Nina", 449),
                    new Tretja.Najdba("Vita", 549),
                    new Tretja.Najdba("Rozalija", 623),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-2.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 34),
                    new Tretja.Najdba("Karel", 103),
                    new Tretja.Najdba("Matej", 149),
                    new Tretja.Najdba("Dejan", 158),
                    new Tretja.Najdba("Ula", 202),
                    new Tretja.Najdba("Vita", 248),
                    new Tretja.Najdba("Leon", 250),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-13.0, 6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 100),
                    new Tretja.Najdba("Zinka", 179),
                    new Tretja.Najdba("Bojan", 258),
                    new Tretja.Najdba("Matej", 347),
                    new Tretja.Najdba("Janez", 376),
                    new Tretja.Najdba("Karel", 470),
                    new Tretja.Najdba("Petra", 524),
                    new Tretja.Najdba("Ana", 543),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-8.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 40),
                    new Tretja.Najdba("Oton", 139),
                    new Tretja.Najdba("Barbara", 196),
                    new Tretja.Najdba("Karel", 245),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-1.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 23),
                    new Tretja.Najdba("Nikolaj", 30),
                    new Tretja.Najdba("Klara", 120),
                    new Tretja.Najdba("Matej", 148),
                    new Tretja.Najdba("Hilda", 236),
                    new Tretja.Najdba("Rozalija", 251),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(16.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 22),
                    new Tretja.Najdba("Urban", 76),
                    new Tretja.Najdba("Cvetka", 152),
                    new Tretja.Najdba("Maja", 217),
                    new Tretja.Najdba("Gorazd", 272),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(9.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 69),
                    new Tretja.Najdba("Eva", 153),
                    new Tretja.Najdba("Ivan", 222),
                    new Tretja.Najdba("Nina", 303),
                    new Tretja.Najdba("Urban", 358),
                    new Tretja.Najdba("Hilda", 381),
                    new Tretja.Najdba("Francka", 424),
                    new Tretja.Najdba("Iva", 478),
                    new Tretja.Najdba("Simona", 559),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-6.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 4),
                    new Tretja.Najdba("Peter", 78),
                    new Tretja.Najdba("Hinko", 121),
                    new Tretja.Najdba("Rok", 137),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(4.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 26),
                    new Tretja.Najdba("Leon", 126),
                    new Tretja.Najdba("Hilda", 197),
                    new Tretja.Najdba("Gabrijela", 231),
                    new Tretja.Najdba("Vlado", 256),
                    new Tretja.Najdba("Dejan", 274),
                    new Tretja.Najdba("Franci", 282),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-16.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zinka", 86),
                    new Tretja.Najdba("Hinko", 146),
                    new Tretja.Najdba("Eva", 228),
                    new Tretja.Najdba("Simon", 315),
                    new Tretja.Najdba("Karel", 344),
                    new Tretja.Najdba("Simon", 395),
                    new Tretja.Najdba("Tatjana", 479),
                    new Tretja.Najdba("Rozalija", 524),
                    new Tretja.Najdba("Ana", 606),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(9.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 32),
                    new Tretja.Najdba("Dejan", 78),
                    new Tretja.Najdba("Simon", 89),
                    new Tretja.Najdba("Urban", 175),
                    new Tretja.Najdba("Nikolaj", 256),
                    new Tretja.Najdba("Dejan", 265),
                    new Tretja.Najdba("Iva", 360),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(5.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Matej", 77),
                    new Tretja.Najdba("Eva", 128),
                    new Tretja.Najdba("Gabrijela", 209),
                }
            ),

            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(7.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zinka", 14),
                    new Tretja.Najdba("Zoran", 108),
                    new Tretja.Najdba("Tatjana", 149),
                    new Tretja.Najdba("Gorazd", 232),
                }
            ),

            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(-15.0, 2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 68),
                    new Tretja.Najdba("Nikolaj", 122),
                    new Tretja.Najdba("Maja", 152),
                    new Tretja.Najdba("Simon", 238),
                    new Tretja.Najdba("Iva", 328),
                }
            ),

            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(-18.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 65),
                    new Tretja.Najdba("Urban", 94),
                    new Tretja.Najdba("Jana", 155),
                    new Tretja.Najdba("Darja", 207),
                    new Tretja.Najdba("Ana", 267),
                    new Tretja.Najdba("Bojan", 282),
                    new Tretja.Najdba("Klara", 311),
                }
            ),

            new Tretja.Zaklad(
                "Z18",
                new Tretja.Tocka(-19.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tone", 35),
                    new Tretja.Najdba("Matej", 131),
                    new Tretja.Najdba("Cvetka", 166),
                    new Tretja.Najdba("Oton", 194),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
