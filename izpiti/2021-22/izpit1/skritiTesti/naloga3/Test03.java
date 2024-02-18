
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Zaklad zaklad = new Tretja.Zaklad("A",
        new Tretja.Tocka(13.0, 10.0),
        new Tretja.Najdba[]{
            new Tretja.Najdba("Gabrijela", 48),
            new Tretja.Najdba("Petra", 73),
            new Tretja.Najdba("Maja", 154),
            new Tretja.Najdba("Oton", 182),
            new Tretja.Najdba("Nina", 268),
            new Tretja.Najdba("Cvetka", 302),
            new Tretja.Najdba("Rozalija", 402),
            new Tretja.Najdba("Gorazd", 434),
            new Tretja.Najdba("Ivan", 524),
            new Tretja.Najdba("Bojan", 613),
        });
        System.out.println(Arrays.toString(zaklad.najditelji()));
    }
}
