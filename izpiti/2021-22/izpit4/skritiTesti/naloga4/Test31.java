
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = (a, b) -> a.compareTo(b);

        Map<Cas, Cas> slovar = new HashMap<>();
        slovar.put(new Cas(9, 24), new Cas(15, 40));
        slovar.put(new Cas(6, 55), new Cas(3, 27));
        slovar.put(new Cas(20, 20), new Cas(6, 34));
        slovar.put(new Cas(13, 41), new Cas(6, 20));
        slovar.put(new Cas(3, 2), new Cas(15, 32));
        slovar.put(new Cas(17, 8), new Cas(17, 10));
        slovar.put(new Cas(1, 46), new Cas(3, 22));
        slovar.put(new Cas(8, 14), new Cas(20, 5));
        slovar.put(new Cas(1, 14), new Cas(14, 0));
        slovar.put(new Cas(22, 59), new Cas(6, 13));
        slovar.put(new Cas(12, 49), new Cas(4, 34));
        slovar.put(new Cas(9, 50), new Cas(4, 14));
        slovar.put(new Cas(11, 40), new Cas(6, 27));
        slovar.put(new Cas(15, 20), new Cas(1, 7));
        slovar.put(new Cas(8, 33), new Cas(22, 52));
        slovar.put(new Cas(13, 58), new Cas(16, 57));
        slovar.put(new Cas(18, 58), new Cas(3, 10));
        slovar.put(new Cas(11, 4), new Cas(11, 39));
        slovar.put(new Cas(6, 36), new Cas(10, 8));
        slovar.put(new Cas(5, 55), new Cas(5, 13));
        slovar.put(new Cas(17, 4), new Cas(3, 48));
        slovar.put(new Cas(12, 35), new Cas(19, 30));
        slovar.put(new Cas(17, 40), new Cas(0, 1));
        slovar.put(new Cas(17, 39), new Cas(0, 34));
        slovar.put(new Cas(15, 46), new Cas(21, 24));
        slovar.put(new Cas(18, 2), new Cas(7, 27));
        slovar.put(new Cas(7, 30), new Cas(18, 10));
        slovar.put(new Cas(14, 46), new Cas(7, 15));
        slovar.put(new Cas(4, 12), new Cas(20, 36));
        slovar.put(new Cas(23, 30), new Cas(5, 32));
        slovar.put(new Cas(3, 32), new Cas(15, 0));
        slovar.put(new Cas(17, 13), new Cas(9, 9));
        slovar.put(new Cas(3, 19), new Cas(7, 29));
        slovar.put(new Cas(20, 11), new Cas(1, 13));
        slovar.put(new Cas(22, 12), new Cas(7, 13));
        slovar.put(new Cas(12, 9), new Cas(5, 58));
        slovar.put(new Cas(5, 3), new Cas(3, 0));
        slovar.put(new Cas(0, 14), new Cas(7, 8));
        slovar.put(new Cas(21, 52), new Cas(10, 35));
        slovar.put(new Cas(5, 48), new Cas(23, 52));
        slovar.put(new Cas(2, 25), new Cas(10, 45));
        slovar.put(new Cas(12, 3), new Cas(22, 17));
        slovar.put(new Cas(20, 6), new Cas(15, 10));
        slovar.put(new Cas(12, 59), new Cas(15, 17));
        slovar.put(new Cas(5, 10), new Cas(10, 30));
        slovar.put(new Cas(11, 23), new Cas(18, 28));
        slovar.put(new Cas(18, 20), new Cas(6, 2));
        slovar.put(new Cas(16, 29), new Cas(22, 9));
        slovar.put(new Cas(4, 19), new Cas(1, 23));
        slovar.put(new Cas(5, 52), new Cas(5, 3));

        Set<Cas> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Cas> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
