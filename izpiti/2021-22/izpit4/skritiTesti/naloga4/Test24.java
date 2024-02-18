
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = (a, b) -> b.compareTo(a);

        Map<Cas, Cas> slovar = new HashMap<>();
        slovar.put(new Cas(5, 19), new Cas(12, 2));
        slovar.put(new Cas(4, 43), new Cas(20, 29));
        slovar.put(new Cas(10, 9), new Cas(1, 32));
        slovar.put(new Cas(9, 10), new Cas(4, 28));
        slovar.put(new Cas(11, 14), new Cas(14, 56));
        slovar.put(new Cas(15, 6), new Cas(22, 35));
        slovar.put(new Cas(3, 15), new Cas(14, 53));
        slovar.put(new Cas(19, 28), new Cas(16, 31));
        slovar.put(new Cas(16, 27), new Cas(7, 56));
        slovar.put(new Cas(19, 31), new Cas(13, 35));
        slovar.put(new Cas(14, 36), new Cas(17, 15));
        slovar.put(new Cas(23, 18), new Cas(10, 59));
        slovar.put(new Cas(16, 3), new Cas(1, 41));
        slovar.put(new Cas(22, 12), new Cas(1, 23));
        slovar.put(new Cas(17, 57), new Cas(8, 2));
        slovar.put(new Cas(11, 4), new Cas(10, 31));
        slovar.put(new Cas(21, 17), new Cas(7, 6));
        slovar.put(new Cas(7, 26), new Cas(4, 6));
        slovar.put(new Cas(11, 49), new Cas(20, 22));
        slovar.put(new Cas(3, 12), new Cas(20, 8));
        slovar.put(new Cas(7, 4), new Cas(19, 23));
        slovar.put(new Cas(18, 49), new Cas(22, 18));
        slovar.put(new Cas(21, 12), new Cas(2, 55));
        slovar.put(new Cas(5, 59), new Cas(15, 56));
        slovar.put(new Cas(19, 24), new Cas(4, 30));
        slovar.put(new Cas(8, 2), new Cas(19, 36));
        slovar.put(new Cas(5, 16), new Cas(11, 54));
        slovar.put(new Cas(18, 47), new Cas(22, 27));
        slovar.put(new Cas(13, 46), new Cas(4, 57));
        slovar.put(new Cas(23, 47), new Cas(18, 4));
        slovar.put(new Cas(10, 42), new Cas(2, 33));
        slovar.put(new Cas(8, 56), new Cas(15, 39));
        slovar.put(new Cas(14, 9), new Cas(15, 52));
        slovar.put(new Cas(12, 43), new Cas(1, 1));
        slovar.put(new Cas(17, 17), new Cas(7, 49));
        slovar.put(new Cas(3, 18), new Cas(18, 43));
        slovar.put(new Cas(11, 58), new Cas(20, 45));
        slovar.put(new Cas(20, 50), new Cas(9, 45));
        slovar.put(new Cas(19, 14), new Cas(17, 52));
        slovar.put(new Cas(16, 14), new Cas(16, 2));
        slovar.put(new Cas(10, 6), new Cas(1, 16));
        slovar.put(new Cas(9, 34), new Cas(0, 31));
        slovar.put(new Cas(2, 24), new Cas(23, 33));
        slovar.put(new Cas(8, 50), new Cas(8, 30));
        slovar.put(new Cas(2, 50), new Cas(11, 46));
        slovar.put(new Cas(4, 51), new Cas(19, 26));
        slovar.put(new Cas(11, 29), new Cas(14, 4));
        slovar.put(new Cas(12, 44), new Cas(15, 11));
        slovar.put(new Cas(8, 52), new Cas(12, 47));
        slovar.put(new Cas(13, 54), new Cas(4, 17));

        Set<Cas> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Cas> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
