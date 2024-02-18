
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(1.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 10),
                    new Tretja.Najdba("Janez", 30),
                    new Tretja.Najdba("Maja", 52),
                    new Tretja.Najdba("Zinka", 76),
                    new Tretja.Najdba("Petra", 115),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(6.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 65),
                    new Tretja.Najdba("Klara", 144),
                    new Tretja.Najdba("Tone", 166),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(0.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 50),
                    new Tretja.Najdba("Simona", 126),
                    new Tretja.Najdba("Hilda", 151),
                    new Tretja.Najdba("Simona", 199),
                    new Tretja.Najdba("Vita", 262),
                    new Tretja.Najdba("Klara", 311),
                    new Tretja.Najdba("Hilda", 398),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-2.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Matej", 53),
                    new Tretja.Najdba("Emil", 82),
                    new Tretja.Najdba("Janez", 125),
                    new Tretja.Najdba("Vlado", 206),
                    new Tretja.Najdba("Simon", 298),
                    new Tretja.Najdba("Andrej", 373),
                    new Tretja.Najdba("Janez", 433),
                    new Tretja.Najdba("Zoran", 524),
                    new Tretja.Najdba("Gabrijela", 554),
                    new Tretja.Najdba("Barbara", 592),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(17.0, 17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 77),
                    new Tretja.Najdba("Cene", 131),
                    new Tretja.Najdba("Simon", 149),
                    new Tretja.Najdba("Iva", 215),
                    new Tretja.Najdba("Ivan", 221),
                    new Tretja.Najdba("Oton", 231),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(15.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 73),
                    new Tretja.Najdba("Simon", 122),
                    new Tretja.Najdba("Maja", 210),
                    new Tretja.Najdba("Hilda", 302),
                    new Tretja.Najdba("Emil", 337),
                    new Tretja.Najdba("Vlado", 428),
                    new Tretja.Najdba("Ana", 495),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-12.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 79),
                    new Tretja.Najdba("Petra", 174),
                    new Tretja.Najdba("Zinka", 175),
                    new Tretja.Najdba("Peter", 268),
                    new Tretja.Najdba("Cene", 284),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(18.0, 18.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-3.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 39),
                    new Tretja.Najdba("Hilda", 86),
                    new Tretja.Najdba("Simona", 164),
                    new Tretja.Najdba("Francka", 254),
                    new Tretja.Najdba("Emil", 334),
                    new Tretja.Najdba("Dejan", 342),
                    new Tretja.Najdba("Cvetka", 435),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-5.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 86),
                    new Tretja.Najdba("Klara", 171),
                    new Tretja.Najdba("Lidija", 181),
                    new Tretja.Najdba("Andrej", 268),
                    new Tretja.Najdba("Franci", 302),
                    new Tretja.Najdba("Ivan", 388),
                    new Tretja.Najdba("Tatjana", 476),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(9.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 82),
                    new Tretja.Najdba("Simon", 144),
                    new Tretja.Najdba("Vita", 200),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-13.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nikolaj", 68),
                    new Tretja.Najdba("Cvetka", 152),
                    new Tretja.Najdba("Leon", 238),
                    new Tretja.Najdba("Tone", 275),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(5.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 35),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-10.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 51),
                    new Tretja.Najdba("Franci", 79),
                    new Tretja.Najdba("Vita", 98),
                    new Tretja.Najdba("Rok", 130),
                    new Tretja.Najdba("Urban", 146),
                    new Tretja.Najdba("Franci", 201),
                    new Tretja.Najdba("Peter", 217),
                }
            ),
            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(11.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vlado", 20),
                    new Tretja.Najdba("Zoran", 79),
                    new Tretja.Najdba("Ivan", 160),
                }
            ),
            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(-10.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 71),
                }
            ),
            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(16.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 48),
                }
            ),
            new Tretja.Zaklad(
                "Z18",
                new Tretja.Tocka(-7.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 87),
                    new Tretja.Najdba("Rok", 172),
                    new Tretja.Najdba("Karel", 182),
                    new Tretja.Najdba("Gorazd", 190),
                    new Tretja.Najdba("Tone", 254),
                }
            ),
            new Tretja.Zaklad(
                "Z19",
                new Tretja.Tocka(13.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 36),
                    new Tretja.Najdba("Cvetka", 85),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-20.0, 17.0));
        System.out.println(Math.abs(pot - 484.02) < 0.02);
    }
}
