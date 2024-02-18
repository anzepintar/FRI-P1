
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = {
            new Tretja.Tablica(new char[]{'L', 'J'}, 7654, false),
            new Tretja.Tablica(new char[]{'L', 'J'}, 7654, true),
            new Tretja.Tablica(new char[]{'M', 'B'}, 1234, false),
            new Tretja.Tablica(new char[]{'L', 'J'}, 7654, false),
            new Tretja.Tablica(new char[]{'M', 'S'}, 1234, false),
            new Tretja.Tablica(new char[]{'L', 'J'}, 6745, false),
        };

        for (Tretja.Tablica t: tablice) {
            for (Tretja.Tablica u: tablice) {
                System.out.print(t.equals(u) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
