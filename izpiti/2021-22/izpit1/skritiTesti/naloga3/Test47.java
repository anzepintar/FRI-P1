
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(2.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 38),
                    new Tretja.Najdba("Andrej", 69),
                    new Tretja.Najdba("Eva", 71),
                    new Tretja.Najdba("Andrej", 84),
                    new Tretja.Najdba("Francka", 130),
                    new Tretja.Najdba("Olga", 224),
                    new Tretja.Najdba("Francka", 295),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-18.0, 2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 45),
                    new Tretja.Najdba("Janez", 89),
                    new Tretja.Najdba("Gabrijela", 133),
                    new Tretja.Najdba("Karel", 218),
                    new Tretja.Najdba("Zinka", 306),
                    new Tretja.Najdba("Ana", 399),
                    new Tretja.Najdba("Dejan", 443),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-16.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 10),
                    new Tretja.Najdba("Oton", 22),
                    new Tretja.Najdba("Tone", 44),
                    new Tretja.Najdba("Darja", 59),
                    new Tretja.Najdba("Barbara", 113),
                    new Tretja.Najdba("Barbara", 130),
                    new Tretja.Najdba("Ula", 158),
                    new Tretja.Najdba("Hinko", 210),
                    new Tretja.Najdba("Peter", 219),
                    new Tretja.Najdba("Gabrijela", 247),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-13.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 68),
                    new Tretja.Najdba("Zoran", 115),
                    new Tretja.Najdba("Zinka", 136),
                    new Tretja.Najdba("Dejan", 149),
                    new Tretja.Najdba("Cene", 168),
                    new Tretja.Najdba("Klara", 255),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(3.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Eva", 7),
                    new Tretja.Najdba("Maja", 12),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-11.0, -5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 80),
                    new Tretja.Najdba("Gabrijela", 94),
                    new Tretja.Najdba("Lidija", 101),
                    new Tretja.Najdba("Nikolaj", 104),
                    new Tretja.Najdba("Oton", 112),
                    new Tretja.Najdba("Petra", 174),
                    new Tretja.Najdba("Emil", 203),
                    new Tretja.Najdba("Vita", 239),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(18.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 29),
                    new Tretja.Najdba("Simon", 59),
                    new Tretja.Najdba("Franci", 74),
                    new Tretja.Najdba("Klara", 119),
                    new Tretja.Najdba("Franci", 129),
                    new Tretja.Najdba("Rozalija", 210),
                    new Tretja.Najdba("Darja", 270),
                    new Tretja.Najdba("Dejan", 330),
                    new Tretja.Najdba("Barbara", 387),
                    new Tretja.Najdba("Hinko", 477),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(19.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 28),
                    new Tretja.Najdba("Dejan", 59),
                    new Tretja.Najdba("Emil", 103),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(16.0, -8.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(4.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Eva", 57),
                    new Tretja.Najdba("Nina", 120),
                    new Tretja.Najdba("Simon", 220),
                    new Tretja.Najdba("Nikolaj", 267),
                    new Tretja.Najdba("Zinka", 310),
                    new Tretja.Najdba("Ana", 343),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-2.0, -12.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-4.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ula", 4),
                    new Tretja.Najdba("Gabrijela", 91),
                    new Tretja.Najdba("Matej", 171),
                    new Tretja.Najdba("Iva", 206),
                    new Tretja.Najdba("Ula", 270),
                    new Tretja.Najdba("Hinko", 367),
                    new Tretja.Najdba("Tone", 403),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-12.0, -17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 22),
                    new Tretja.Najdba("Ana", 60),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-18.0, -4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 12),
                    new Tretja.Najdba("Nina", 17),
                    new Tretja.Najdba("Ana", 60),
                    new Tretja.Najdba("Maja", 135),
                    new Tretja.Najdba("Ivan", 148),
                    new Tretja.Najdba("Jana", 182),
                }
            ),

            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(4.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ivan", 90),
                }
            ),

            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(-20.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 98),
                    new Tretja.Najdba("Darja", 99),
                    new Tretja.Najdba("Rozalija", 199),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
