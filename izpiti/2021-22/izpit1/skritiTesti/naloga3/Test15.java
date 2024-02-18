
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-6.0, 16.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Zinka", 67),
            new Tretja.Najdba("Barbara", 120),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
