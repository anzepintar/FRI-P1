
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-12.0, -7.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Simona", 32),
            new Tretja.Najdba("Rozalija", 68),
            new Tretja.Najdba("Jana", 121),
            new Tretja.Najdba("Matej", 178),
            new Tretja.Najdba("Simona", 201),
            new Tretja.Najdba("Karel", 255),
            new Tretja.Najdba("Ana", 323),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
