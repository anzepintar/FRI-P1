
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(20.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 52),
                    new Tretja.Najdba("Cene", 98),
                    new Tretja.Najdba("Nikolaj", 154),
                    new Tretja.Najdba("Petra", 205),
                    new Tretja.Najdba("Francka", 236),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-1.0, -15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 68),
                    new Tretja.Najdba("Vita", 118),
                    new Tretja.Najdba("Vlado", 195),
                    new Tretja.Najdba("Darja", 224),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(5.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 100),
                    new Tretja.Najdba("Urban", 156),
                    new Tretja.Najdba("Gabrijela", 242),
                    new Tretja.Najdba("Matej", 260),
                    new Tretja.Najdba("Andrej", 271),
                    new Tretja.Najdba("Simona", 305),
                    new Tretja.Najdba("Tatjana", 369),
                    new Tretja.Najdba("Ivan", 412),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(13.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 25),
                    new Tretja.Najdba("Nina", 66),
                    new Tretja.Najdba("Vlado", 72),
                    new Tretja.Najdba("Nina", 98),
                    new Tretja.Najdba("Gabrijela", 170),
                    new Tretja.Najdba("Petra", 181),
                    new Tretja.Najdba("Hinko", 224),
                    new Tretja.Najdba("Urban", 319),
                    new Tretja.Najdba("Tatjana", 382),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-20.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 2),
                    new Tretja.Najdba("Darja", 23),
                    new Tretja.Najdba("Nikolaj", 58),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(4.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tone", 14),
                    new Tretja.Najdba("Tone", 46),
                    new Tretja.Najdba("Ula", 81),
                    new Tretja.Najdba("Simon", 122),
                    new Tretja.Najdba("Tone", 156),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-14.0, -13.0));
        System.out.println(Math.abs(pot - 193.52) < 0.02);
    }
}
