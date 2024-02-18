
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(-9.0, 12.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Rok", 97),
            new Tretja.Najdba("Vlado", 168),
            new Tretja.Najdba("Petra", 235),
            new Tretja.Najdba("Tatjana", 261),
            new Tretja.Najdba("Ula", 278),
            new Tretja.Najdba("Andrej", 348),
            new Tretja.Najdba("Peter", 419),
            new Tretja.Najdba("Eva", 513),
            new Tretja.Najdba("Oton", 515),
            new Tretja.Najdba("Nina", 600),
            new Tretja.Najdba("Leon", 656),
            new Tretja.Najdba("Rozalija", 690),
            new Tretja.Najdba("Eva", 787),
            new Tretja.Najdba("Franci", 879),
            new Tretja.Najdba("Francka", 959),
            new Tretja.Najdba("Olga", 976),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
