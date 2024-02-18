
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-1.0, 20.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Hilda", 93),
            new Tretja.Najdba("Bojan", 104),
            new Tretja.Najdba("Rok", 141),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
