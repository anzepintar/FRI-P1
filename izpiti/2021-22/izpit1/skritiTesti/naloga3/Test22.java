
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-1.0, 6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 15),
                    new Tretja.Najdba("Nikolaj", 24),
                    new Tretja.Najdba("Nina", 37),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(7.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 44),
                    new Tretja.Najdba("Nikolaj", 107),
                    new Tretja.Najdba("Cvetka", 197),
                    new Tretja.Najdba("Oton", 232),
                    new Tretja.Najdba("Gabrijela", 250),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(5.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 39),
                    new Tretja.Najdba("Vlado", 77),
                    new Tretja.Najdba("Oton", 146),
                    new Tretja.Najdba("Gabrijela", 212),
                    new Tretja.Najdba("Cene", 238),
                    new Tretja.Najdba("Ana", 302),
                    new Tretja.Najdba("Hilda", 333),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(20.0, -15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zinka", 1),
                    new Tretja.Najdba("Janez", 16),
                    new Tretja.Najdba("Ana", 114),
                    new Tretja.Najdba("Gorazd", 124),
                    new Tretja.Najdba("Matej", 154),
                    new Tretja.Najdba("Andrej", 213),
                    new Tretja.Najdba("Urban", 313),
                    new Tretja.Najdba("Simon", 367),
                    new Tretja.Najdba("Tatjana", 368),
                    new Tretja.Najdba("Lidija", 446),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-2.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 36),
                    new Tretja.Najdba("Rok", 135),
                    new Tretja.Najdba("Simon", 195),
                    new Tretja.Najdba("Emil", 232),
                    new Tretja.Najdba("Olga", 313),
                    new Tretja.Najdba("Maja", 387),
                    new Tretja.Najdba("Emil", 455),
                    new Tretja.Najdba("Dejan", 532),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-10.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 66),
                    new Tretja.Najdba("Jana", 97),
                    new Tretja.Najdba("Zoran", 142),
                    new Tretja.Najdba("Emil", 198),
                    new Tretja.Najdba("Tone", 203),
                    new Tretja.Najdba("Simona", 236),
                    new Tretja.Najdba("Nikolaj", 257),
                    new Tretja.Najdba("Rok", 311),
                    new Tretja.Najdba("Darja", 401),
                    new Tretja.Najdba("Maja", 496),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(2.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 43),
                    new Tretja.Najdba("Simona", 107),
                    new Tretja.Najdba("Janez", 111),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(5.0, 9.0));
        System.out.println(Math.abs(pot - 125.50) < 0.02);
    }
}
