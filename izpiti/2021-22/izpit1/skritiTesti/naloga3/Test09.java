
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(16.0, -11.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Hinko", 32),
            new Tretja.Najdba("Ana", 39),
            new Tretja.Najdba("Simon", 119),
            new Tretja.Najdba("Vlado", 199),
            new Tretja.Najdba("Dejan", 267),
            new Tretja.Najdba("Zinka", 276),
            new Tretja.Najdba("Cene", 328),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
