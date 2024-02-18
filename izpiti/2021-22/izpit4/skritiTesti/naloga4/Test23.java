
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = (a, b) -> a.compareTo(b);

        Map<Cas, Cas> slovar = new HashMap<>();
        slovar.put(new Cas(1, 8), new Cas(10, 36));
        slovar.put(new Cas(2, 50), new Cas(12, 2));
        slovar.put(new Cas(11, 13), new Cas(23, 59));
        slovar.put(new Cas(14, 11), new Cas(18, 22));
        slovar.put(new Cas(4, 35), new Cas(0, 40));
        slovar.put(new Cas(3, 49), new Cas(7, 4));
        slovar.put(new Cas(3, 18), new Cas(10, 18));
        slovar.put(new Cas(4, 9), new Cas(23, 33));
        slovar.put(new Cas(7, 36), new Cas(23, 12));
        slovar.put(new Cas(9, 16), new Cas(10, 43));
        slovar.put(new Cas(8, 5), new Cas(22, 6));
        slovar.put(new Cas(12, 2), new Cas(16, 4));
        slovar.put(new Cas(1, 13), new Cas(12, 28));
        slovar.put(new Cas(19, 28), new Cas(1, 14));
        slovar.put(new Cas(10, 32), new Cas(5, 10));
        slovar.put(new Cas(7, 8), new Cas(10, 53));
        slovar.put(new Cas(12, 34), new Cas(15, 38));
        slovar.put(new Cas(15, 30), new Cas(13, 58));
        slovar.put(new Cas(12, 27), new Cas(22, 49));
        slovar.put(new Cas(22, 5), new Cas(8, 42));
        slovar.put(new Cas(19, 58), new Cas(22, 59));
        slovar.put(new Cas(13, 49), new Cas(12, 14));
        slovar.put(new Cas(17, 56), new Cas(3, 13));
        slovar.put(new Cas(8, 16), new Cas(20, 59));
        slovar.put(new Cas(3, 9), new Cas(12, 44));
        slovar.put(new Cas(3, 48), new Cas(0, 8));
        slovar.put(new Cas(10, 53), new Cas(12, 4));
        slovar.put(new Cas(10, 23), new Cas(12, 50));
        slovar.put(new Cas(10, 6), new Cas(20, 3));
        slovar.put(new Cas(18, 47), new Cas(4, 23));
        slovar.put(new Cas(17, 30), new Cas(2, 35));
        slovar.put(new Cas(7, 7), new Cas(5, 53));
        slovar.put(new Cas(20, 47), new Cas(6, 45));
        slovar.put(new Cas(8, 26), new Cas(6, 39));
        slovar.put(new Cas(4, 45), new Cas(9, 34));
        slovar.put(new Cas(6, 21), new Cas(9, 11));
        slovar.put(new Cas(7, 58), new Cas(2, 0));
        slovar.put(new Cas(17, 42), new Cas(14, 12));
        slovar.put(new Cas(21, 35), new Cas(16, 32));
        slovar.put(new Cas(9, 54), new Cas(22, 23));
        slovar.put(new Cas(14, 53), new Cas(11, 40));
        slovar.put(new Cas(16, 48), new Cas(19, 36));
        slovar.put(new Cas(13, 2), new Cas(18, 21));
        slovar.put(new Cas(18, 38), new Cas(12, 32));
        slovar.put(new Cas(14, 58), new Cas(14, 45));
        slovar.put(new Cas(6, 22), new Cas(7, 0));
        slovar.put(new Cas(5, 20), new Cas(23, 2));
        slovar.put(new Cas(16, 2), new Cas(18, 41));
        slovar.put(new Cas(1, 26), new Cas(13, 49));
        slovar.put(new Cas(16, 57), new Cas(0, 25));

        Set<Cas> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Cas> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
