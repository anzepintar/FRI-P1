
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(16.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 72),
                    new Tretja.Najdba("Simona", 94),
                    new Tretja.Najdba("Darja", 170),
                    new Tretja.Najdba("Leon", 250),
                    new Tretja.Najdba("Dejan", 297),
                    new Tretja.Najdba("Hilda", 336),
                    new Tretja.Najdba("Darja", 394),
                    new Tretja.Najdba("Petra", 419),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(9.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 2),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(17.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tone", 38),
                    new Tretja.Najdba("Zoran", 122),
                    new Tretja.Najdba("Franci", 164),
                    new Tretja.Najdba("Gorazd", 225),
                    new Tretja.Najdba("Hilda", 253),
                    new Tretja.Najdba("Darja", 346),
                    new Tretja.Najdba("Cvetka", 407),
                    new Tretja.Najdba("Olga", 417),
                    new Tretja.Najdba("Peter", 486),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(1.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 95),
                    new Tretja.Najdba("Leon", 140),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-18.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 27),
                    new Tretja.Najdba("Eva", 112),
                    new Tretja.Najdba("Eva", 134),
                    new Tretja.Najdba("Cene", 216),
                    new Tretja.Najdba("Petra", 294),
                    new Tretja.Najdba("Franci", 394),
                    new Tretja.Najdba("Leon", 458),
                    new Tretja.Najdba("Leon", 498),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(3.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 58),
                    new Tretja.Najdba("Francka", 145),
                    new Tretja.Najdba("Oton", 219),
                    new Tretja.Najdba("Zinka", 287),
                    new Tretja.Najdba("Simona", 303),
                    new Tretja.Najdba("Barbara", 359),
                    new Tretja.Najdba("Vita", 407),
                    new Tretja.Najdba("Gorazd", 417),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(3.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 17),
                    new Tretja.Najdba("Ivan", 105),
                    new Tretja.Najdba("Janez", 189),
                    new Tretja.Najdba("Rozalija", 258),
                    new Tretja.Najdba("Tone", 307),
                    new Tretja.Najdba("Dejan", 308),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-5.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 31),
                    new Tretja.Najdba("Emil", 89),
                    new Tretja.Najdba("Janez", 177),
                    new Tretja.Najdba("Hinko", 190),
                    new Tretja.Najdba("Janez", 223),
                    new Tretja.Najdba("Rozalija", 293),
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-6.0, -15.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-12.0, -14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 62),
                    new Tretja.Najdba("Andrej", 89),
                    new Tretja.Najdba("Gorazd", 105),
                    new Tretja.Najdba("Gabrijela", 165),
                    new Tretja.Najdba("Janez", 259),
                    new Tretja.Najdba("Olga", 285),
                    new Tretja.Najdba("Janez", 309),
                    new Tretja.Najdba("Simon", 368),
                    new Tretja.Najdba("Vita", 431),
                    new Tretja.Najdba("Dejan", 482),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(6.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 29),
                    new Tretja.Najdba("Peter", 100),
                    new Tretja.Najdba("Emil", 170),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(6.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 29),
                    new Tretja.Najdba("Peter", 56),
                    new Tretja.Najdba("Hilda", 80),
                    new Tretja.Najdba("Petra", 149),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(12.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 93),
                    new Tretja.Najdba("Eva", 135),
                    new Tretja.Najdba("Ana", 196),
                    new Tretja.Najdba("Dejan", 224),
                    new Tretja.Najdba("Oton", 317),
                    new Tretja.Najdba("Urban", 378),
                    new Tretja.Najdba("Barbara", 416),
                    new Tretja.Najdba("Maja", 485),
                    new Tretja.Najdba("Tone", 548),
                    new Tretja.Najdba("Iva", 566),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(0.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 65),
                    new Tretja.Najdba("Emil", 117),
                    new Tretja.Najdba("Gabrijela", 184),
                    new Tretja.Najdba("Jana", 222),
                    new Tretja.Najdba("Leon", 297),
                    new Tretja.Najdba("Janez", 309),
                    new Tretja.Najdba("Francka", 402),
                    new Tretja.Najdba("Dejan", 477),
                    new Tretja.Najdba("Iva", 509),
                    new Tretja.Najdba("Matej", 549),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(13.0, -14.0));
        System.out.println(Math.abs(pot - 325.52) < 0.02);
    }
}
