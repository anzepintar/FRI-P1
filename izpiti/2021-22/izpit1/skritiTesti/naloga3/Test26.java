
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(5.0, -3.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-20.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 45),
                    new Tretja.Najdba("Gabrijela", 136),
                    new Tretja.Najdba("Nikolaj", 156),
                    new Tretja.Najdba("Ula", 182),
                    new Tretja.Najdba("Eva", 209),
                    new Tretja.Najdba("Ula", 251),
                    new Tretja.Najdba("Ivan", 310),
                    new Tretja.Najdba("Oton", 349),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(8.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 73),
                    new Tretja.Najdba("Urban", 75),
                    new Tretja.Najdba("Lidija", 174),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-20.0, -14.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(17.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tone", 36),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(10.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 72),
                    new Tretja.Najdba("Zoran", 154),
                    new Tretja.Najdba("Matej", 216),
                    new Tretja.Najdba("Ana", 259),
                    new Tretja.Najdba("Karel", 337),
                    new Tretja.Najdba("Leon", 341),
                    new Tretja.Najdba("Francka", 372),
                    new Tretja.Najdba("Olga", 376),
                    new Tretja.Najdba("Gorazd", 383),
                    new Tretja.Najdba("Petra", 479),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(13.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 39),
                    new Tretja.Najdba("Matej", 136),
                    new Tretja.Najdba("Gabrijela", 219),
                    new Tretja.Najdba("Ana", 282),
                    new Tretja.Najdba("Ivan", 359),
                    new Tretja.Najdba("Gorazd", 441),
                    new Tretja.Najdba("Darja", 476),
                    new Tretja.Najdba("Eva", 501),
                    new Tretja.Najdba("Rok", 521),
                    new Tretja.Najdba("Matej", 592),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(7.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 93),
                    new Tretja.Najdba("Rok", 189),
                    new Tretja.Najdba("Klara", 253),
                    new Tretja.Najdba("Vlado", 337),
                    new Tretja.Najdba("Ivan", 394),
                    new Tretja.Najdba("Rok", 438),
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(14.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 27),
                    new Tretja.Najdba("Rozalija", 38),
                    new Tretja.Najdba("Cvetka", 135),
                    new Tretja.Najdba("Janez", 185),
                    new Tretja.Najdba("Nikolaj", 216),
                    new Tretja.Najdba("Peter", 294),
                    new Tretja.Najdba("Cvetka", 359),
                    new Tretja.Najdba("Peter", 383),
                    new Tretja.Najdba("Ula", 473),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-19.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 80),
                    new Tretja.Najdba("Nikolaj", 153),
                    new Tretja.Najdba("Gorazd", 169),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-12.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 6),
                    new Tretja.Najdba("Rozalija", 103),
                    new Tretja.Najdba("Vita", 198),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-1.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 79),
                    new Tretja.Najdba("Olga", 178),
                    new Tretja.Najdba("Rozalija", 205),
                    new Tretja.Najdba("Nina", 218),
                    new Tretja.Najdba("Vita", 265),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(0.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 87),
                    new Tretja.Najdba("Olga", 149),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(11.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 61),
                    new Tretja.Najdba("Cene", 82),
                    new Tretja.Najdba("Simon", 126),
                    new Tretja.Najdba("Franci", 222),
                    new Tretja.Najdba("Barbara", 249),
                    new Tretja.Najdba("Gorazd", 317),
                    new Tretja.Najdba("Vita", 389),
                    new Tretja.Najdba("Oton", 472),
                }
            ),
            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(-12.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 64),
                    new Tretja.Najdba("Barbara", 96),
                    new Tretja.Najdba("Andrej", 136),
                    new Tretja.Najdba("Urban", 231),
                    new Tretja.Najdba("Eva", 258),
                    new Tretja.Najdba("Simon", 290),
                    new Tretja.Najdba("Matej", 342),
                    new Tretja.Najdba("Zoran", 421),
                    new Tretja.Najdba("Oton", 509),
                    new Tretja.Najdba("Simona", 569),
                }
            ),
            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(20.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 74),
                    new Tretja.Najdba("Francka", 113),
                    new Tretja.Najdba("Lidija", 210),
                    new Tretja.Najdba("Jana", 287),
                    new Tretja.Najdba("Barbara", 311),
                    new Tretja.Najdba("Maja", 385),
                    new Tretja.Najdba("Rok", 446),
                    new Tretja.Najdba("Vlado", 450),
                    new Tretja.Najdba("Petra", 501),
                    new Tretja.Najdba("Peter", 547),
                }
            ),
            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(14.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 39),
                    new Tretja.Najdba("Cvetka", 99),
                    new Tretja.Najdba("Gabrijela", 125),
                }
            ),
            new Tretja.Zaklad(
                "Z18",
                new Tretja.Tocka(14.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 46),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(12.0, 0.0));
        System.out.println(Math.abs(pot - 392.67) < 0.02);
    }
}
