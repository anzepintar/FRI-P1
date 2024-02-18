
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-1.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 63),
                    new Tretja.Najdba("Rok", 84),
                    new Tretja.Najdba("Nikolaj", 117),
                    new Tretja.Najdba("Tatjana", 202),
                    new Tretja.Najdba("Franci", 302),
                    new Tretja.Najdba("Dejan", 390),
                    new Tretja.Najdba("Urban", 416),
                    new Tretja.Najdba("Maja", 470),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-10.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 5),
                    new Tretja.Najdba("Hilda", 64),
                    new Tretja.Najdba("Cene", 148),
                    new Tretja.Najdba("Hinko", 150),
                    new Tretja.Najdba("Francka", 222),
                    new Tretja.Najdba("Oton", 309),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(12.0, 3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 92),
                    new Tretja.Najdba("Gabrijela", 137),
                    new Tretja.Najdba("Nikolaj", 234),
                    new Tretja.Najdba("Ula", 287),
                    new Tretja.Najdba("Janez", 358),
                    new Tretja.Najdba("Hilda", 390),
                    new Tretja.Najdba("Hinko", 463),
                    new Tretja.Najdba("Darja", 492),
                    new Tretja.Najdba("Simona", 525),
                    new Tretja.Najdba("Simon", 581),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(9.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 46),
                    new Tretja.Najdba("Andrej", 58),
                    new Tretja.Najdba("Simona", 72),
                    new Tretja.Najdba("Janez", 133),
                    new Tretja.Najdba("Bojan", 163),
                    new Tretja.Najdba("Rok", 257),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(2.0, 17.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(0.0, 16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 79),
                    new Tretja.Najdba("Darja", 150),
                    new Tretja.Najdba("Olga", 220),
                    new Tretja.Najdba("Franci", 243),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-13.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 30),
                    new Tretja.Najdba("Hilda", 81),
                    new Tretja.Najdba("Emil", 89),
                    new Tretja.Najdba("Eva", 181),
                    new Tretja.Najdba("Ana", 270),
                    new Tretja.Najdba("Lidija", 275),
                    new Tretja.Najdba("Olga", 338),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-17.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 76),
                    new Tretja.Najdba("Zinka", 104),
                    new Tretja.Najdba("Vita", 142),
                    new Tretja.Najdba("Leon", 148),
                    new Tretja.Najdba("Franci", 157),
                    new Tretja.Najdba("Karel", 249),
                    new Tretja.Najdba("Maja", 255),
                    new Tretja.Najdba("Dejan", 353),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-15.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 27),
                    new Tretja.Najdba("Barbara", 113),
                    new Tretja.Najdba("Peter", 120),
                    new Tretja.Najdba("Lidija", 202),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(2.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 2),
                    new Tretja.Najdba("Nikolaj", 100),
                    new Tretja.Najdba("Peter", 163),
                    new Tretja.Najdba("Dejan", 244),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(8.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 39),
                    new Tretja.Najdba("Hilda", 117),
                    new Tretja.Najdba("Franci", 154),
                    new Tretja.Najdba("Vlado", 193),
                    new Tretja.Najdba("Gabrijela", 273),
                    new Tretja.Najdba("Petra", 310),
                    new Tretja.Najdba("Andrej", 400),
                    new Tretja.Najdba("Klara", 495),
                    new Tretja.Najdba("Cene", 502),
                    new Tretja.Najdba("Maja", 553),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(10.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 72),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-1.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 9),
                    new Tretja.Najdba("Ivan", 10),
                    new Tretja.Najdba("Ivan", 61),
                    new Tretja.Najdba("Hinko", 150),
                    new Tretja.Najdba("Barbara", 245),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-15.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 90),
                    new Tretja.Najdba("Nina", 100),
                }
            ),

            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(16.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 75),
                    new Tretja.Najdba("Oton", 138),
                    new Tretja.Najdba("Gabrijela", 170),
                    new Tretja.Najdba("Klara", 244),
                    new Tretja.Najdba("Olga", 307),
                    new Tretja.Najdba("Simona", 331),
                }
            ),

            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(4.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 69),
                    new Tretja.Najdba("Peter", 153),
                }
            ),

            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(14.0, 11.0),
                new Tretja.Najdba[]{
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
