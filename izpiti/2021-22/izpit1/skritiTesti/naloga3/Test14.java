
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-17.0, -15.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Rozalija", 78),
            new Tretja.Najdba("Rozalija", 92),
            new Tretja.Najdba("Nikolaj", 99),
            new Tretja.Najdba("Bojan", 138),
            new Tretja.Najdba("Dejan", 146),
            new Tretja.Najdba("Zinka", 212),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
