
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(16.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 53),
                    new Tretja.Najdba("Bojan", 77),
                    new Tretja.Najdba("Eva", 78),
                    new Tretja.Najdba("Peter", 135),
                    new Tretja.Najdba("Vlado", 138),
                    new Tretja.Najdba("Iva", 222),
                    new Tretja.Najdba("Zinka", 278),
                    new Tretja.Najdba("Zinka", 368),
                    new Tretja.Najdba("Ana", 441),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-13.0, -8.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Barbara", 89),
                    new Tretja.Najdba("Francka", 156),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-19.0, 10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Cvetka", 63),
                    new Tretja.Najdba("Barbara", 144),
                    new Tretja.Najdba("Andrej", 224),
                    new Tretja.Najdba("Ivan", 303),
                    new Tretja.Najdba("Ana", 315),
                    new Tretja.Najdba("Franci", 358),
                    new Tretja.Najdba("Simona", 448),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(16.0, -3.0),
                new Tretja.Najdba[]{
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(-6.0, -1.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hinko", 16),
                    new Tretja.Najdba("Gorazd", 19),
                    new Tretja.Najdba("Maja", 87),
                    new Tretja.Najdba("Rozalija", 148),
                    new Tretja.Najdba("Peter", 176),
                    new Tretja.Najdba("Rok", 231),
                    new Tretja.Najdba("Petra", 289),
                    new Tretja.Najdba("Karel", 353),
                    new Tretja.Najdba("Tatjana", 384),
                    new Tretja.Najdba("Ula", 400),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(7.0, -20.0));
        System.out.println(Math.abs(pot - 151.16) < 0.02);
    }
}
