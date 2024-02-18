
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(2.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Peter", 41),
                    new Tretja.Najdba("Bojan", 119),
                    new Tretja.Najdba("Cvetka", 147),
                    new Tretja.Najdba("Andrej", 195),
                    new Tretja.Najdba("Matej", 293),
                    new Tretja.Najdba("Franci", 382),
                    new Tretja.Najdba("Cvetka", 455),
                    new Tretja.Najdba("Janez", 513),
                    new Tretja.Najdba("Janez", 589),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(18.0, 1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 54),
                    new Tretja.Najdba("Vlado", 80),
                    new Tretja.Najdba("Andrej", 131),
                    new Tretja.Najdba("Klara", 133),
                    new Tretja.Najdba("Barbara", 220),
                    new Tretja.Najdba("Bojan", 259),
                    new Tretja.Najdba("Lidija", 309),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-17.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Leon", 31),
                    new Tretja.Najdba("Franci", 71),
                    new Tretja.Najdba("Zoran", 84),
                    new Tretja.Najdba("Karel", 156),
                    new Tretja.Najdba("Leon", 175),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(-8.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 40),
                    new Tretja.Najdba("Oton", 44),
                    new Tretja.Najdba("Petra", 96),
                    new Tretja.Najdba("Oton", 183),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(0.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Petra", 27),
                    new Tretja.Najdba("Klara", 31),
                    new Tretja.Najdba("Urban", 63),
                    new Tretja.Najdba("Maja", 65),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-17.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Dejan", 75),
                    new Tretja.Najdba("Urban", 172),
                    new Tretja.Najdba("Janez", 226),
                    new Tretja.Najdba("Simona", 302),
                    new Tretja.Najdba("Simona", 390),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(12.0, 4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Maja", 68),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
