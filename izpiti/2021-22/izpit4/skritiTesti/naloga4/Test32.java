
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = (a, b) -> b.compareTo(a);

        Map<Cas, Cas> slovar = new HashMap<>();
        slovar.put(new Cas(5, 56), new Cas(12, 39));
        slovar.put(new Cas(18, 8), new Cas(8, 35));
        slovar.put(new Cas(1, 7), new Cas(7, 1));
        slovar.put(new Cas(0, 8), new Cas(1, 0));
        slovar.put(new Cas(10, 43), new Cas(1, 25));
        slovar.put(new Cas(21, 27), new Cas(2, 40));
        slovar.put(new Cas(3, 32), new Cas(18, 27));
        slovar.put(new Cas(18, 27), new Cas(2, 37));
        slovar.put(new Cas(20, 10), new Cas(7, 39));
        slovar.put(new Cas(6, 13), new Cas(23, 37));
        slovar.put(new Cas(7, 10), new Cas(20, 43));
        slovar.put(new Cas(4, 23), new Cas(18, 2));
        slovar.put(new Cas(5, 54), new Cas(8, 13));
        slovar.put(new Cas(3, 49), new Cas(3, 32));
        slovar.put(new Cas(10, 45), new Cas(5, 10));
        slovar.put(new Cas(21, 49), new Cas(16, 55));
        slovar.put(new Cas(23, 53), new Cas(16, 58));
        slovar.put(new Cas(10, 59), new Cas(1, 24));
        slovar.put(new Cas(23, 29), new Cas(19, 3));
        slovar.put(new Cas(14, 19), new Cas(1, 21));
        slovar.put(new Cas(15, 55), new Cas(5, 35));
        slovar.put(new Cas(12, 7), new Cas(14, 21));
        slovar.put(new Cas(11, 46), new Cas(21, 26));
        slovar.put(new Cas(7, 16), new Cas(8, 39));
        slovar.put(new Cas(22, 25), new Cas(12, 5));
        slovar.put(new Cas(23, 33), new Cas(7, 41));
        slovar.put(new Cas(7, 35), new Cas(7, 37));
        slovar.put(new Cas(20, 49), new Cas(0, 41));
        slovar.put(new Cas(2, 23), new Cas(11, 40));
        slovar.put(new Cas(19, 43), new Cas(18, 25));
        slovar.put(new Cas(13, 23), new Cas(0, 44));
        slovar.put(new Cas(22, 42), new Cas(3, 12));
        slovar.put(new Cas(4, 32), new Cas(19, 30));
        slovar.put(new Cas(18, 3), new Cas(11, 1));
        slovar.put(new Cas(0, 47), new Cas(19, 7));
        slovar.put(new Cas(14, 3), new Cas(15, 9));
        slovar.put(new Cas(18, 24), new Cas(15, 10));
        slovar.put(new Cas(2, 52), new Cas(15, 19));
        slovar.put(new Cas(7, 42), new Cas(16, 9));
        slovar.put(new Cas(22, 31), new Cas(1, 49));
        slovar.put(new Cas(19, 23), new Cas(11, 11));
        slovar.put(new Cas(9, 40), new Cas(6, 35));
        slovar.put(new Cas(22, 40), new Cas(16, 25));
        slovar.put(new Cas(2, 53), new Cas(7, 40));
        slovar.put(new Cas(7, 34), new Cas(14, 4));
        slovar.put(new Cas(11, 21), new Cas(17, 3));
        slovar.put(new Cas(4, 55), new Cas(8, 59));
        slovar.put(new Cas(7, 43), new Cas(14, 20));
        slovar.put(new Cas(12, 43), new Cas(15, 14));
        slovar.put(new Cas(7, 37), new Cas(18, 51));

        Set<Cas> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Cas> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
