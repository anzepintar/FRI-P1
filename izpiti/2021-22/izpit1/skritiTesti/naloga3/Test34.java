
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(2.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 9),
                    new Tretja.Najdba("Karel", 30),
                    new Tretja.Najdba("Zoran", 80),
                    new Tretja.Najdba("Hinko", 143),
                    new Tretja.Najdba("Cene", 237),
                    new Tretja.Najdba("Urban", 296),
                    new Tretja.Najdba("Simona", 318),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(17.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 17),
                    new Tretja.Najdba("Cene", 79),
                    new Tretja.Najdba("Bojan", 136),
                    new Tretja.Najdba("Rok", 227),
                    new Tretja.Najdba("Cvetka", 311),
                    new Tretja.Najdba("Leon", 391),
                    new Tretja.Najdba("Urban", 428),
                    new Tretja.Najdba("Nikolaj", 499),
                    new Tretja.Najdba("Oton", 523),
                    new Tretja.Najdba("Klara", 588),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-7.0, -13.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Matej", 3),
                    new Tretja.Najdba("Franci", 103),
                    new Tretja.Najdba("Vita", 148),
                    new Tretja.Najdba("Karel", 218),
                    new Tretja.Najdba("Lidija", 222),
                    new Tretja.Najdba("Franci", 233),
                    new Tretja.Najdba("Lidija", 293),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(16.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 32),
                    new Tretja.Najdba("Emil", 93),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(20.0, -13.0),
                new Tretja.Najdba[]{
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-20.0, -4.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cene", 56),
                    new Tretja.Najdba("Janez", 99),
                    new Tretja.Najdba("Urban", 156),
                }
            ),

            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(-11.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Zoran", 83),
                    new Tretja.Najdba("Ivan", 180),
                    new Tretja.Najdba("Barbara", 218),
                    new Tretja.Najdba("Gorazd", 229),
                    new Tretja.Najdba("Cene", 311),
                    new Tretja.Najdba("Nikolaj", 335),
                    new Tretja.Najdba("Hinko", 405),
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
