
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-13.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 34),
                    new Tretja.Najdba("Simona", 115),
                    new Tretja.Najdba("Francka", 158),
                    new Tretja.Najdba("Emil", 256),
                    new Tretja.Najdba("Rozalija", 283),
                    new Tretja.Najdba("Ula", 299),
                    new Tretja.Najdba("Maja", 377),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(13.0, 12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 96),
                    new Tretja.Najdba("Darja", 106),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-12.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 41),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-14.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Matej", 3),
                    new Tretja.Najdba("Tone", 84),
                    new Tretja.Najdba("Tatjana", 147),
                    new Tretja.Najdba("Ivan", 153),
                    new Tretja.Najdba("Jana", 161),
                    new Tretja.Najdba("Karel", 164),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-10.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 19),
                    new Tretja.Najdba("Karel", 57),
                    new Tretja.Najdba("Darja", 99),
                    new Tretja.Najdba("Franci", 199),
                    new Tretja.Najdba("Andrej", 256),
                    new Tretja.Najdba("Tone", 258),
                    new Tretja.Najdba("Maja", 271),
                    new Tretja.Najdba("Urban", 359),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(0.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 82),
                    new Tretja.Najdba("Gorazd", 116),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-9.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 18),
                    new Tretja.Najdba("Cvetka", 107),
                    new Tretja.Najdba("Oton", 152),
                    new Tretja.Najdba("Cene", 184),
                    new Tretja.Najdba("Gabrijela", 271),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-10.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 13),
                    new Tretja.Najdba("Andrej", 108),
                    new Tretja.Najdba("Gorazd", 167),
                    new Tretja.Najdba("Dejan", 177),
                    new Tretja.Najdba("Emil", 259),
                    new Tretja.Najdba("Ula", 339),
                    new Tretja.Najdba("Gorazd", 384),
                    new Tretja.Najdba("Tone", 453),
                    new Tretja.Najdba("Iva", 524),
                    new Tretja.Najdba("Hinko", 609),
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-14.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 46),
                    new Tretja.Najdba("Simon", 124),
                    new Tretja.Najdba("Jana", 144),
                    new Tretja.Najdba("Zinka", 194),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-2.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 64),
                    new Tretja.Najdba("Karel", 86),
                    new Tretja.Najdba("Bojan", 119),
                    new Tretja.Najdba("Francka", 129),
                    new Tretja.Najdba("Maja", 217),
                    new Tretja.Najdba("Bojan", 316),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(3.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 4),
                    new Tretja.Najdba("Jana", 104),
                    new Tretja.Najdba("Maja", 143),
                    new Tretja.Najdba("Urban", 242),
                    new Tretja.Najdba("Franci", 248),
                    new Tretja.Najdba("Emil", 254),
                    new Tretja.Najdba("Simona", 331),
                    new Tretja.Najdba("Peter", 399),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(6.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 90),
                    new Tretja.Najdba("Ana", 166),
                    new Tretja.Najdba("Simon", 231),
                    new Tretja.Najdba("Matej", 239),
                    new Tretja.Najdba("Ana", 265),
                    new Tretja.Najdba("Petra", 327),
                    new Tretja.Najdba("Bojan", 423),
                    new Tretja.Najdba("Jana", 495),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(1.0, 16.0));
        System.out.println(Math.abs(pot - 239.24) < 0.02);
    }
}
