
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad(
                "Z1",
                new Tretja.Tocka(20.0, -9.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Janez", 69),
                    new Tretja.Najdba("Karel", 76),
                    new Tretja.Najdba("Simon", 170),
                    new Tretja.Najdba("Gorazd", 211),
                    new Tretja.Najdba("Barbara", 234),
                }
            ),
            new Tretja.Zaklad(
                "Z2",
                new Tretja.Tocka(-18.0, -7.0),
                new Tretja.Najdba[]{
                    new Tretja.Najdba("Hilda", 66),
                    new Tretja.Najdba("Cene", 128),
                    new Tretja.Najdba("Maja", 129),
                    new Tretja.Najdba("Karel", 212),
                    new Tretja.Najdba("Lidija", 216),
                    new Tretja.Najdba("Maja", 290),
                    new Tretja.Najdba("Hilda", 336),
                }
            ),
        });

        double pot = geolov.pot(new Tretja.Tocka(-18.0, 1.0));
        System.out.println(Math.abs(pot - 85.35) < 0.02);
    }
}
