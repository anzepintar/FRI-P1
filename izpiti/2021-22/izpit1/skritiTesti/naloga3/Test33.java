
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(8.0, 17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 92),
                    new Tretja.Najdba("Cvetka", 109),
                    new Tretja.Najdba("Ana", 135),
                    new Tretja.Najdba("Matej", 229),
                    new Tretja.Najdba("Peter", 267),
                    new Tretja.Najdba("Nikolaj", 292),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-16.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 64),
                    new Tretja.Najdba("Zinka", 70),
                    new Tretja.Najdba("Klara", 108),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(14.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 79),
                    new Tretja.Najdba("Zinka", 110),
                    new Tretja.Najdba("Andrej", 162),
                    new Tretja.Najdba("Zoran", 210),
                    new Tretja.Najdba("Cvetka", 224),
                    new Tretja.Najdba("Nina", 249),
                    new Tretja.Najdba("Ula", 335),
                    new Tretja.Najdba("Olga", 435),
                    new Tretja.Najdba("Franci", 463),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(1.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 19),
                    new Tretja.Najdba("Matej", 63),
                    new Tretja.Najdba("Matej", 153),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(18.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tone", 37),
                    new Tretja.Najdba("Klara", 98),
                    new Tretja.Najdba("Urban", 188),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(16.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 14),
                    new Tretja.Najdba("Franci", 61),
                    new Tretja.Najdba("Karel", 142),
                    new Tretja.Najdba("Tone", 154),
                    new Tretja.Najdba("Andrej", 205),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-14.0, -8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 12),
                    new Tretja.Najdba("Peter", 110),
                    new Tretja.Najdba("Vita", 201),
                    new Tretja.Najdba("Oton", 255),
                    new Tretja.Najdba("Ivan", 346),
                    new Tretja.Najdba("Vlado", 421),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-16.0, -20.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-9.0, 1.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-7.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ivan", 80),
                    new Tretja.Najdba("Simon", 180),
                    new Tretja.Najdba("Maja", 262),
                    new Tretja.Najdba("Franci", 335),
                    new Tretja.Najdba("Simona", 342),
                    new Tretja.Najdba("Rozalija", 366),
                    new Tretja.Najdba("Dejan", 398),
                    new Tretja.Najdba("Zinka", 410),
                    new Tretja.Najdba("Zinka", 493),
                    new Tretja.Najdba("Iva", 537),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(10.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 92),
                    new Tretja.Najdba("Matej", 149),
                    new Tretja.Najdba("Maja", 151),
                    new Tretja.Najdba("Nikolaj", 241),
                    new Tretja.Najdba("Franci", 315),
                    new Tretja.Najdba("Klara", 325),
                    new Tretja.Najdba("Eva", 386),
                    new Tretja.Najdba("Nikolaj", 440),
                    new Tretja.Najdba("Jana", 540),
                    new Tretja.Najdba("Emil", 622),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(13.0, 10.0));
        System.out.println(Math.abs(pot - 238.70) < 0.02);
    }
}
