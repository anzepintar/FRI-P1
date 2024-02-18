
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-10.0, 16.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Nina", 76),
            new Tretja.Najdba("Maja", 109),
            new Tretja.Najdba("Zinka", 166),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
