
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(9.0, -9.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Iva", 48),
            new Tretja.Najdba("Karel", 90),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
