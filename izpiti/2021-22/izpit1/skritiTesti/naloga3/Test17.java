
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-19.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 56),
                    new Tretja.Najdba("Eva", 124),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(9.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Emil", 2),
                    new Tretja.Najdba("Francka", 66),
                    new Tretja.Najdba("Matej", 163),
                    new Tretja.Najdba("Hilda", 184),
                    new Tretja.Najdba("Janez", 229),
                    new Tretja.Najdba("Klara", 307),
                    new Tretja.Najdba("Peter", 381),
                    new Tretja.Najdba("Janez", 474),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(17.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 40),
                    new Tretja.Najdba("Ana", 133),
                    new Tretja.Najdba("Franci", 150),
                    new Tretja.Najdba("Peter", 224),
                    new Tretja.Najdba("Klara", 298),
                    new Tretja.Najdba("Janez", 356),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(0.0, 11.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(3.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 65),
                    new Tretja.Najdba("Ana", 75),
                    new Tretja.Najdba("Simon", 94),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-11.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Francka", 54),
                    new Tretja.Najdba("Gabrijela", 98),
                    new Tretja.Najdba("Klara", 197),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-3.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ula", 28),
                    new Tretja.Najdba("Maja", 101),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(2.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 28),
                    new Tretja.Najdba("Urban", 39),
                    new Tretja.Najdba("Peter", 94),
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(0.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 18),
                    new Tretja.Najdba("Vlado", 35),
                    new Tretja.Najdba("Nina", 50),
                    new Tretja.Najdba("Gorazd", 115),
                    new Tretja.Najdba("Rok", 129),
                    new Tretja.Najdba("Oton", 190),
                    new Tretja.Najdba("Karel", 191),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(-4.0, -16.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 50),
                    new Tretja.Najdba("Nina", 119),
                    new Tretja.Najdba("Darja", 195),
                    new Tretja.Najdba("Barbara", 278),
                    new Tretja.Najdba("Rok", 354),
                    new Tretja.Najdba("Vlado", 386),
                    new Tretja.Najdba("Nina", 443),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(-8.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Urban", 4),
                    new Tretja.Najdba("Simona", 65),
                    new Tretja.Najdba("Simon", 77),
                    new Tretja.Najdba("Olga", 123),
                    new Tretja.Najdba("Andrej", 181),
                    new Tretja.Najdba("Hilda", 272),
                    new Tretja.Najdba("Cene", 325),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(16.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 52),
                    new Tretja.Najdba("Ana", 109),
                    new Tretja.Najdba("Darja", 113),
                    new Tretja.Najdba("Zoran", 202),
                    new Tretja.Najdba("Gabrijela", 223),
                    new Tretja.Najdba("Cene", 256),
                    new Tretja.Najdba("Janez", 301),
                    new Tretja.Najdba("Emil", 362),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-10.0, 19.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 17),
                    new Tretja.Najdba("Emil", 37),
                    new Tretja.Najdba("Cene", 45),
                    new Tretja.Najdba("Simona", 124),
                    new Tretja.Najdba("Zinka", 178),
                    new Tretja.Najdba("Simon", 271),
                    new Tretja.Najdba("Ula", 322),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-20.0, 13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Lidija", 49),
                    new Tretja.Najdba("Gabrijela", 95),
                    new Tretja.Najdba("Zinka", 124),
                    new Tretja.Najdba("Bojan", 185),
                    new Tretja.Najdba("Ana", 202),
                    new Tretja.Najdba("Vlado", 243),
                    new Tretja.Najdba("Oton", 315),
                }
            ),
            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(-13.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 24),
                    new Tretja.Najdba("Rozalija", 93),
                    new Tretja.Najdba("Cvetka", 156),
                }
            ),
            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(16.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 75),
                }
            ),
            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(7.0, 8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 57),
                    new Tretja.Najdba("Nikolaj", 82),
                    new Tretja.Najdba("Ula", 101),
                    new Tretja.Najdba("Eva", 106),
                    new Tretja.Najdba("Simon", 148),
                }
            ),
            new Tretja.Zaklad(
                "Z18",
                new Tretja.Tocka(-2.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 17),
                    new Tretja.Najdba("Oton", 68),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(14.0, -10.0));
        System.out.println(Math.abs(pot - 366.39) < 0.02);
    }
}
