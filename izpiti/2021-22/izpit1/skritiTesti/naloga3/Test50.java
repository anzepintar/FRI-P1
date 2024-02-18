
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(6.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 23),
                    new Tretja.Najdba("Tatjana", 53),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(19.0, -5.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-13.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Oton", 52),
                    new Tretja.Najdba("Maja", 88),
                    new Tretja.Najdba("Petra", 146),
                    new Tretja.Najdba("Maja", 214),
                    new Tretja.Najdba("Francka", 283),
                    new Tretja.Najdba("Ula", 364),
                    new Tretja.Najdba("Bojan", 370),
                    new Tretja.Najdba("Bojan", 386),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(18.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Eva", 92),
                    new Tretja.Najdba("Vita", 167),
                    new Tretja.Najdba("Olga", 221),
                    new Tretja.Najdba("Jana", 275),
                    new Tretja.Najdba("Rok", 276),
                    new Tretja.Najdba("Bojan", 311),
                    new Tretja.Najdba("Gabrijela", 389),
                    new Tretja.Najdba("Janez", 410),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(13.0, -3.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-1.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 65),
                    new Tretja.Najdba("Vita", 150),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(14.0, -13.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(2.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 9),
                    new Tretja.Najdba("Tatjana", 52),
                    new Tretja.Najdba("Olga", 131),
                    new Tretja.Najdba("Maja", 223),
                    new Tretja.Najdba("Hilda", 227),
                    new Tretja.Najdba("Peter", 237),
                    new Tretja.Najdba("Dejan", 303),
                    new Tretja.Najdba("Oton", 319),
                    new Tretja.Najdba("Darja", 327),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(20.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 66),
                    new Tretja.Najdba("Petra", 148),
                    new Tretja.Najdba("Francka", 163),
                    new Tretja.Najdba("Simona", 190),
                    new Tretja.Najdba("Tatjana", 207),
                    new Tretja.Najdba("Bojan", 298),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(1.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 77),
                    new Tretja.Najdba("Tatjana", 149),
                    new Tretja.Najdba("Urban", 230),
                    new Tretja.Najdba("Dejan", 273),
                    new Tretja.Najdba("Simona", 369),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-8.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 33),
                    new Tretja.Najdba("Klara", 64),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(11.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 54),
                    new Tretja.Najdba("Dejan", 116),
                    new Tretja.Najdba("Janez", 209),
                    new Tretja.Najdba("Simona", 264),
                    new Tretja.Najdba("Simon", 286),
                    new Tretja.Najdba("Rok", 317),
                    new Tretja.Najdba("Karel", 354),
                    new Tretja.Najdba("Tatjana", 373),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(3.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 22),
                    new Tretja.Najdba("Klara", 72),
                    new Tretja.Najdba("Rozalija", 124),
                    new Tretja.Najdba("Bojan", 194),
                    new Tretja.Najdba("Franci", 285),
                    new Tretja.Najdba("Eva", 363),
                    new Tretja.Najdba("Emil", 375),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-19.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 25),
                    new Tretja.Najdba("Peter", 60),
                    new Tretja.Najdba("Darja", 92),
                    new Tretja.Najdba("Jana", 129),
                    new Tretja.Najdba("Urban", 148),
                }
            ),

            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(1.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 27),
                    new Tretja.Najdba("Janez", 44),
                    new Tretja.Najdba("Lidija", 107),
                }
            ),

            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(17.0, 15.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(2.0, 15.0),
                new Tretja.Najdba[]{
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
