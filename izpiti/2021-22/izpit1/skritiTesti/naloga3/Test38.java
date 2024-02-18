
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(0.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 66),
                    new Tretja.Najdba("Ana", 112),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(15.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 79),
                    new Tretja.Najdba("Oton", 96),
                    new Tretja.Najdba("Francka", 181),
                    new Tretja.Najdba("Zinka", 189),
                    new Tretja.Najdba("Nikolaj", 279),
                    new Tretja.Najdba("Lidija", 349),
                    new Tretja.Najdba("Maja", 438),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(4.0, 20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 44),
                    new Tretja.Najdba("Ula", 108),
                    new Tretja.Najdba("Ana", 116),
                    new Tretja.Najdba("Ivan", 122),
                    new Tretja.Najdba("Emil", 214),
                    new Tretja.Najdba("Karel", 312),
                    new Tretja.Najdba("Tone", 391),
                    new Tretja.Najdba("Gabrijela", 488),
                    new Tretja.Najdba("Leon", 562),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-7.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 45),
                    new Tretja.Najdba("Emil", 81),
                    new Tretja.Najdba("Iva", 136),
                    new Tretja.Najdba("Franci", 178),
                    new Tretja.Najdba("Zoran", 241),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-10.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 67),
                    new Tretja.Najdba("Karel", 165),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(3.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Iva", 5),
                    new Tretja.Najdba("Tatjana", 37),
                    new Tretja.Najdba("Gorazd", 111),
                    new Tretja.Najdba("Olga", 117),
                    new Tretja.Najdba("Karel", 160),
                    new Tretja.Najdba("Zoran", 218),
                    new Tretja.Najdba("Jana", 315),
                    new Tretja.Najdba("Barbara", 408),
                    new Tretja.Najdba("Hilda", 500),
                    new Tretja.Najdba("Andrej", 561),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(10.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Bojan", 30),
                    new Tretja.Najdba("Rok", 67),
                    new Tretja.Najdba("Barbara", 95),
                    new Tretja.Najdba("Dejan", 182),
                    new Tretja.Najdba("Olga", 187),
                    new Tretja.Najdba("Ivan", 229),
                }
            ),

            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(-1.0, -20.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 41),
                    new Tretja.Najdba("Ana", 126),
                    new Tretja.Najdba("Rozalija", 165),
                    new Tretja.Najdba("Klara", 188),
                    new Tretja.Najdba("Olga", 283),
                    new Tretja.Najdba("Karel", 319),
                    new Tretja.Najdba("Tone", 330),
                    new Tretja.Najdba("Zinka", 372),
                }
            ),

            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(0.0, 5.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 18),
                    new Tretja.Najdba("Nina", 48),
                    new Tretja.Najdba("Jana", 79),
                    new Tretja.Najdba("Simon", 112),
                    new Tretja.Najdba("Dejan", 156),
                    new Tretja.Najdba("Gabrijela", 245),
                    new Tretja.Najdba("Zinka", 285),
                    new Tretja.Najdba("Petra", 293),
                    new Tretja.Najdba("Hilda", 349),
                    new Tretja.Najdba("Gabrijela", 420),
                }
            ),

            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-4.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 36),
                    new Tretja.Najdba("Karel", 45),
                    new Tretja.Najdba("Eva", 137),
                    new Tretja.Najdba("Dejan", 161),
                    new Tretja.Najdba("Emil", 179),
                }
            ),

            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-6.0, -3.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 50),
                    new Tretja.Najdba("Petra", 69),
                    new Tretja.Najdba("Ula", 89),
                    new Tretja.Najdba("Francka", 109),
                }
            ),

            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(-7.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 39),
                    new Tretja.Najdba("Zinka", 104),
                    new Tretja.Najdba("Urban", 166),
                    new Tretja.Najdba("Janez", 226),
                    new Tretja.Najdba("Urban", 234),
                    new Tretja.Najdba("Dejan", 272),
                    new Tretja.Najdba("Vita", 279),
                    new Tretja.Najdba("Zoran", 284),
                    new Tretja.Najdba("Hinko", 332),
                }
            ),

            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(12.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Karel", 47),
                }
            ),

            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-14.0, -19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 59),
                    new Tretja.Najdba("Hilda", 107),
                    new Tretja.Najdba("Dejan", 129),
                }
            ),

            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(-8.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nikolaj", 69),
                }
            ),

            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(-14.0, 11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 54),
                    new Tretja.Najdba("Rozalija", 112),
                    new Tretja.Najdba("Oton", 131),
                    new Tretja.Najdba("Nikolaj", 181),
                    new Tretja.Najdba("Peter", 231),
                    new Tretja.Najdba("Karel", 306),
                    new Tretja.Najdba("Vlado", 339),
                    new Tretja.Najdba("Tone", 377),
                    new Tretja.Najdba("Dejan", 427),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
