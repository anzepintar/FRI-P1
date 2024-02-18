
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(17.0, -11.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 65),
                    new Tretja.Najdba("Bojan", 129),
                    new Tretja.Najdba("Maja", 224),
                    new Tretja.Najdba("Bojan", 297),
                    new Tretja.Najdba("Emil", 344),
                    new Tretja.Najdba("Oton", 431),
                    new Tretja.Najdba("Emil", 475),
                    new Tretja.Najdba("Iva", 480),
                    new Tretja.Najdba("Cene", 502),
                }
            ),

            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(15.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 30),
                    new Tretja.Najdba("Francka", 92),
                    new Tretja.Najdba("Tatjana", 113),
                    new Tretja.Najdba("Maja", 184),
                    new Tretja.Najdba("Cene", 257),
                    new Tretja.Najdba("Iva", 321),
                }
            ),

            new Tretja.Zaklad(
                "Z3",
                new Tretja.Tocka(1.0, 17.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Olga", 34),
                    new Tretja.Najdba("Hilda", 73),
                    new Tretja.Najdba("Ula", 155),
                    new Tretja.Najdba("Gorazd", 239),
                    new Tretja.Najdba("Maja", 313),
                    new Tretja.Najdba("Simona", 400),
                    new Tretja.Najdba("Andrej", 418),
                    new Tretja.Najdba("Cene", 428),
                }
            ),

            new Tretja.Zaklad(
                "Z4",
                new Tretja.Tocka(11.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Franci", 57),
                    new Tretja.Najdba("Hilda", 66),
                    new Tretja.Najdba("Oton", 91),
                    new Tretja.Najdba("Cvetka", 158),
                }
            ),

            new Tretja.Zaklad(
                "Z5",
                new Tretja.Tocka(6.0, -18.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Rok", 97),
                    new Tretja.Najdba("Iva", 186),
                    new Tretja.Najdba("Nina", 286),
                    new Tretja.Najdba("Jana", 339),
                    new Tretja.Najdba("Barbara", 434),
                    new Tretja.Najdba("Gorazd", 525),
                    new Tretja.Najdba("Hinko", 538),
                    new Tretja.Najdba("Darja", 548),
                    new Tretja.Najdba("Barbara", 578),
                }
            ),

            new Tretja.Zaklad(
                "Z6",
                new Tretja.Tocka(6.0, 6.0),
                new Tretja.Najdba[]{
                }
            ),

        });

        System.out.println(geolov.nazadnjeOdkrit());
    }
}
