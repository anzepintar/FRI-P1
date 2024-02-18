
import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
            new Tretja.Tocka(1.0, -3.0), 
            new Tretja.Najdba[]{
                new Tretja.Najdba("Eva",    25),
                new Tretja.Najdba("Boris",  40),
                new Tretja.Najdba("Cvetka", 50),
                new Tretja.Najdba("Denis",  55),
                new Tretja.Najdba("Ana",    70),
            }
        );

        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
