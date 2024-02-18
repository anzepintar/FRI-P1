
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(2.0, 15.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Vita", 23),
                    new Tretja.Najdba("Karel", 74),
                    new Tretja.Najdba("Franci", 152),
                    new Tretja.Najdba("Zoran", 238),
                    new Tretja.Najdba("Francka", 323),
                    new Tretja.Najdba("Matej", 396),
                    new Tretja.Najdba("Klara", 442),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(14.0, -10.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Nina", 15),
                }
            ),
            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(-4.0, 7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gorazd", 70),
                    new Tretja.Najdba("Petra", 156),
                }
            ),
            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(18.0, 0.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rozalija", 17),
                    new Tretja.Najdba("Vlado", 42),
                    new Tretja.Najdba("Petra", 49),
                    new Tretja.Najdba("Hinko", 59),
                }
            ),
            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(20.0, 12.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Klara", 44),
                }
            ),
            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(-16.0, -6.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Darja", 32),
                    new Tretja.Najdba("Jana", 71),
                    new Tretja.Najdba("Andrej", 102),
                    new Tretja.Najdba("Oton", 181),
                    new Tretja.Najdba("Dejan", 220),
                    new Tretja.Najdba("Matej", 284),
                    new Tretja.Najdba("Jana", 351),
                    new Tretja.Najdba("Iva", 385),
                }
            ),
            new Tretja.Zaklad(
                "Z7",
                new Tretja.Tocka(5.0, -2.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Gabrijela", 31),
                    new Tretja.Najdba("Rok", 54),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(15.0, 18.0));
        System.out.println(Math.abs(pot - 185.07) < 0.02);
    }
}
