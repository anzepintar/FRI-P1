
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-10.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 44),
                    new Tretja.Najdba("Barbara", 51),
                    new Tretja.Najdba("Gabrijela", 84),
                    new Tretja.Najdba("Ivan", 168),
                    new Tretja.Najdba("Oton", 174),
                    new Tretja.Najdba("Ana", 252),
                    new Tretja.Najdba("Ivan", 347),
                    new Tretja.Najdba("Leon", 436),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-3.0, -18.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(18.0, -15.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(17.0, -13.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-3.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 18),
                    new Tretja.Najdba("Olga", 48),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(17.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 70),
                    new Tretja.Najdba("Vita", 135),
                    new Tretja.Najdba("Leon", 192),
                    new Tretja.Najdba("Lidija", 240),
                    new Tretja.Najdba("Andrej", 274),
                    new Tretja.Najdba("Hinko", 281),
                    new Tretja.Najdba("Nikolaj", 311),
                    new Tretja.Najdba("Klara", 386),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(14.0, 8.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(16.0, 3.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(20.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 5),
                    new Tretja.Najdba("Oton", 68),
                    new Tretja.Najdba("Nikolaj", 127),
                    new Tretja.Najdba("Matej", 140),
                    new Tretja.Najdba("Rok", 174),
                    new Tretja.Najdba("Tatjana", 223),
                    new Tretja.Najdba("Bojan", 265),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-18.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 50),
                    new Tretja.Najdba("Ana", 87),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(7.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 36),
                    new Tretja.Najdba("Hilda", 43),
                    new Tretja.Najdba("Leon", 70),
                    new Tretja.Najdba("Iva", 87),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-13.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 91),
                    new Tretja.Najdba("Vita", 184),
                    new Tretja.Najdba("Tone", 266),
                    new Tretja.Najdba("Ivan", 304),
                    new Tretja.Najdba("Peter", 392),
                    new Tretja.Najdba("Petra", 403),
                    new Tretja.Najdba("Iva", 406),
                    new Tretja.Najdba("Iva", 459),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(16.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 45),
                    new Tretja.Najdba("Karel", 82),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(9.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 40),
                    new Tretja.Najdba("Rok", 134),
                    new Tretja.Najdba("Klara", 233),
                    new Tretja.Najdba("Leon", 313),
                    new Tretja.Najdba("Tone", 333),
                    new Tretja.Najdba("Tatjana", 432),
                    new Tretja.Najdba("Zoran", 437),
                    new Tretja.Najdba("Eva", 465),
                }
            ),
            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(5.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 98),
                    new Tretja.Najdba("Olga", 160),
                }
            ),
            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(-20.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 30),
                    new Tretja.Najdba("Cene", 60),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-19.0, 12.0));
        System.out.println(Math.abs(pot - 357.63) < 0.02);
    }
}
