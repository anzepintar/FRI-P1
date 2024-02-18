
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-10.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 24),
                    new Tretja.Najdba("Tatjana", 95),
                    new Tretja.Najdba("Leon", 146),
                    new Tretja.Najdba("Iva", 217),
                    new Tretja.Najdba("Peter", 292),
                    new Tretja.Najdba("Janez", 358),
                    new Tretja.Najdba("Bojan", 368),
                    new Tretja.Najdba("Lidija", 390),
                    new Tretja.Najdba("Simon", 416),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-2.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 60),
                    new Tretja.Najdba("Olga", 158),
                    new Tretja.Najdba("Vlado", 248),
                    new Tretja.Najdba("Simona", 282),
                    new Tretja.Najdba("Tatjana", 299),
                    new Tretja.Najdba("Jana", 326),
                    new Tretja.Najdba("Tone", 375),
                    new Tretja.Najdba("Hilda", 428),
                    new Tretja.Najdba("Barbara", 465),
                    new Tretja.Najdba("Nina", 524),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-14.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 22),
                    new Tretja.Najdba("Franci", 57),
                    new Tretja.Najdba("Tone", 95),
                    new Tretja.Najdba("Zoran", 189),
                    new Tretja.Najdba("Nikolaj", 275),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(8.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 20),
                    new Tretja.Najdba("Jana", 23),
                    new Tretja.Najdba("Ana", 100),
                    new Tretja.Najdba("Simona", 104),
                    new Tretja.Najdba("Gorazd", 160),
                    new Tretja.Najdba("Ivan", 174),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(13.0, -11.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-10.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 36),
                    new Tretja.Najdba("Nina", 112),
                    new Tretja.Najdba("Urban", 149),
                    new Tretja.Najdba("Dejan", 181),
                    new Tretja.Najdba("Janez", 257),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-10.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 91),
                    new Tretja.Najdba("Zoran", 128),
                    new Tretja.Najdba("Peter", 202),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-8.0, 6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 57),
                    new Tretja.Najdba("Vita", 107),
                    new Tretja.Najdba("Lidija", 186),
                    new Tretja.Najdba("Simon", 286),
                    new Tretja.Najdba("Zoran", 334),
                    new Tretja.Najdba("Karel", 370),
                    new Tretja.Najdba("Vita", 376),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-16.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nikolaj", 83),
                    new Tretja.Najdba("Dejan", 106),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(1.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 79),
                    new Tretja.Najdba("Andrej", 145),
                    new Tretja.Najdba("Lidija", 167),
                    new Tretja.Najdba("Zoran", 244),
                    new Tretja.Najdba("Ula", 325),
                    new Tretja.Najdba("Ula", 353),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-8.0, -4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 15),
                    new Tretja.Najdba("Hinko", 107),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(9.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 39),
                    new Tretja.Najdba("Francka", 50),
                    new Tretja.Najdba("Vita", 141),
                    new Tretja.Najdba("Klara", 167),
                    new Tretja.Najdba("Urban", 174),
                    new Tretja.Najdba("Rok", 256),
                    new Tretja.Najdba("Hinko", 310),
                    new Tretja.Najdba("Hinko", 314),
                    new Tretja.Najdba("Klara", 406),
                    new Tretja.Najdba("Bojan", 493),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-11.0, -8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 13),
                    new Tretja.Najdba("Dejan", 113),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
