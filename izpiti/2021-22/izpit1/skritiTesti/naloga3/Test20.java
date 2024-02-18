
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-11.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 100),
                    new Tretja.Najdba("Simona", 133),
                    new Tretja.Najdba("Matej", 153),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(13.0, -4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 78),
                    new Tretja.Najdba("Nikolaj", 152),
                    new Tretja.Najdba("Cvetka", 170),
                    new Tretja.Najdba("Ula", 178),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(7.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 10),
                    new Tretja.Najdba("Petra", 72),
                    new Tretja.Najdba("Eva", 120),
                    new Tretja.Najdba("Tone", 165),
                    new Tretja.Najdba("Hilda", 243),
                    new Tretja.Najdba("Simona", 313),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-18.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vlado", 57),
                    new Tretja.Najdba("Emil", 114),
                    new Tretja.Najdba("Urban", 214),
                    new Tretja.Najdba("Andrej", 263),
                    new Tretja.Najdba("Simona", 327),
                    new Tretja.Najdba("Janez", 401),
                    new Tretja.Najdba("Hinko", 423),
                    new Tretja.Najdba("Nina", 497),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-9.0, 5.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(14.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 34),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-18.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vlado", 82),
                    new Tretja.Najdba("Iva", 89),
                    new Tretja.Najdba("Lidija", 138),
                    new Tretja.Najdba("Rok", 206),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-18.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 17),
                    new Tretja.Najdba("Dejan", 69),
                    new Tretja.Najdba("Olga", 158),
                    new Tretja.Najdba("Vlado", 252),
                    new Tretja.Najdba("Iva", 268),
                    new Tretja.Najdba("Oton", 337),
                    new Tretja.Najdba("Tone", 402),
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-2.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Matej", 74),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-15.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 28),
                    new Tretja.Najdba("Emil", 34),
                    new Tretja.Najdba("Olga", 67),
                    new Tretja.Najdba("Zoran", 149),
                    new Tretja.Najdba("Nina", 160),
                    new Tretja.Najdba("Janez", 186),
                    new Tretja.Najdba("Matej", 278),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-7.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 54),
                    new Tretja.Najdba("Janez", 128),
                    new Tretja.Najdba("Hilda", 225),
                    new Tretja.Najdba("Bojan", 277),
                    new Tretja.Najdba("Zinka", 310),
                    new Tretja.Najdba("Ula", 409),
                    new Tretja.Najdba("Olga", 430),
                    new Tretja.Najdba("Cvetka", 511),
                    new Tretja.Najdba("Jana", 594),
                    new Tretja.Najdba("Andrej", 625),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(2.0, -2.0));
        System.out.println(Math.abs(pot - 239.08) < 0.02);
    }
}
