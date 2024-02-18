
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-5.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 89),
                    new Tretja.Najdba("Oton", 97),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(10.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 71),
                    new Tretja.Najdba("Lidija", 163),
                    new Tretja.Najdba("Rok", 238),
                    new Tretja.Najdba("Barbara", 248),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-17.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 8),
                    new Tretja.Najdba("Vlado", 82),
                    new Tretja.Najdba("Francka", 130),
                    new Tretja.Najdba("Oton", 185),
                    new Tretja.Najdba("Rok", 245),
                    new Tretja.Najdba("Barbara", 312),
                    new Tretja.Najdba("Bojan", 365),
                    new Tretja.Najdba("Klara", 442),
                    new Tretja.Najdba("Maja", 476),
                    new Tretja.Najdba("Ula", 571),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(15.0, -12.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(15.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gabrijela", 2),
                    new Tretja.Najdba("Tone", 66),
                    new Tretja.Najdba("Maja", 99),
                    new Tretja.Najdba("Lidija", 161),
                    new Tretja.Najdba("Barbara", 234),
                    new Tretja.Najdba("Leon", 257),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(16.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 89),
                    new Tretja.Najdba("Gabrijela", 91),
                    new Tretja.Najdba("Vlado", 187),
                    new Tretja.Najdba("Eva", 191),
                    new Tretja.Najdba("Klara", 195),
                    new Tretja.Najdba("Nina", 281),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(19.0, 20.0));
        System.out.println(Math.abs(pot - 142.91) < 0.02);
    }
}
