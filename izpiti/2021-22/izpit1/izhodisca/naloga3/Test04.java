
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(-4.0, 9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 13),
                    new Tretja.Najdba("Emil", 45),
                    new Tretja.Najdba("Lidija", 127),
                    new Tretja.Najdba("Cene", 162),
                    new Tretja.Najdba("Cene", 237),
                    new Tretja.Najdba("Andrej", 272),
                    new Tretja.Najdba("Rok", 363),
                    new Tretja.Najdba("Hilda", 377),
                    new Tretja.Najdba("Nina", 428),
                    new Tretja.Najdba("Nina", 442),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(15.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simon", 31),
                    new Tretja.Najdba("Ula", 103),
                    new Tretja.Najdba("Dejan", 167),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(8.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 22),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-1.0, 14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 49),
                    new Tretja.Najdba("Ivan", 55),
                    new Tretja.Najdba("Franci", 80),
                    new Tretja.Najdba("Maja", 144),
                    new Tretja.Najdba("Bojan", 210),
                    new Tretja.Najdba("Franci", 247),
                    new Tretja.Najdba("Nina", 271),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(5.0, 18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Ana", 88),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-7.0, 2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Simona", 67),
                    new Tretja.Najdba("Dejan", 164),
                    new Tretja.Najdba("Hilda", 169),
                    new Tretja.Najdba("Peter", 251),
                    new Tretja.Najdba("Bojan", 319),
                    new Tretja.Najdba("Jana", 406),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-13.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Jana", 98),
                    new Tretja.Najdba("Andrej", 146),
                    new Tretja.Najdba("Dejan", 176),
                    new Tretja.Najdba("Simon", 183),
                    new Tretja.Najdba("Gabrijela", 239),
                    new Tretja.Najdba("Eva", 330),
                    new Tretja.Najdba("Ivan", 375),
                    new Tretja.Najdba("Matej", 472),
                    new Tretja.Najdba("Rozalija", 559),
                    new Tretja.Najdba("Zinka", 638),
                }
            ),
            new Tretja.Zaklad(
                "Z8",
                new Tretja.Tocka(15.0, 11.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z9",
                new Tretja.Tocka(-16.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 42),
                    new Tretja.Najdba("Bojan", 84),
                    new Tretja.Najdba("Ula", 147),
                    new Tretja.Najdba("Ula", 196),
                    new Tretja.Najdba("Rok", 204),
                    new Tretja.Najdba("Jana", 236),
                    new Tretja.Najdba("Olga", 323),
                    new Tretja.Najdba("Petra", 330),
                    new Tretja.Najdba("Lidija", 332),
                    new Tretja.Najdba("Dejan", 415),
                }
            ),
            new Tretja.Zaklad(
                "Z10",
                new Tretja.Tocka(4.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 97),
                    new Tretja.Najdba("Vita", 175),
                    new Tretja.Najdba("Barbara", 270),
                    new Tretja.Najdba("Dejan", 336),
                    new Tretja.Najdba("Nikolaj", 373),
                    new Tretja.Najdba("Petra", 438),
                    new Tretja.Najdba("Barbara", 502),
                }
            ),
            new Tretja.Zaklad(
                "Z11",
                new Tretja.Tocka(11.0, 2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Eva", 64),
                    new Tretja.Najdba("Simon", 141),
                    new Tretja.Najdba("Cvetka", 147),
                }
            ),
            new Tretja.Zaklad(
                "Z12",
                new Tretja.Tocka(17.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 55),
                    new Tretja.Najdba("Bojan", 77),
                    new Tretja.Najdba("Peter", 127),
                    new Tretja.Najdba("Petra", 141),
                    new Tretja.Najdba("Nikolaj", 182),
                    new Tretja.Najdba("Hinko", 232),
                    new Tretja.Najdba("Leon", 244),
                    new Tretja.Najdba("Franci", 296),
                }
            ),
            new Tretja.Zaklad(
                "Z13",
                new Tretja.Tocka(-19.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 82),
                    new Tretja.Najdba("Rok", 85),
                    new Tretja.Najdba("Andrej", 156),
                    new Tretja.Najdba("Tatjana", 249),
                }
            ),
            new Tretja.Zaklad(
                "Z14",
                new Tretja.Tocka(-1.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Tatjana", 46),
                    new Tretja.Najdba("Bojan", 108),
                    new Tretja.Najdba("Matej", 126),
                    new Tretja.Najdba("Ivan", 207),
                }
            ),
            new Tretja.Zaklad(
                "Z15",
                new Tretja.Tocka(9.0, -12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 73),
                }
            ),
            new Tretja.Zaklad(
                "Z16",
                new Tretja.Tocka(17.0, -4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 74),
                    new Tretja.Najdba("Maja", 170),
                    new Tretja.Najdba("Nikolaj", 181),
                    new Tretja.Najdba("Iva", 223),
                    new Tretja.Najdba("Rok", 238),
                }
            ),
            new Tretja.Zaklad(
                "Z17",
                new Tretja.Tocka(17.0, -14.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 7),
                    new Tretja.Najdba("Peter", 43),
                    new Tretja.Najdba("Andrej", 139),
                    new Tretja.Najdba("Ivan", 162),
                    new Tretja.Najdba("Simona", 227),
                    new Tretja.Najdba("Franci", 236),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(0.0, -6.0));
        System.out.println(Math.abs(pot - 345.60) < 0.02);
    }
}
