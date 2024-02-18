
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Comparator<Cas> primerjalnik = (a, b) -> a.compareTo(b);

        Map<Cas, Cas> slovar = new HashMap<>();
        slovar.put(new Cas(16, 21), new Cas(13, 0));
        slovar.put(new Cas(20, 23), new Cas(21, 33));
        slovar.put(new Cas(18, 21), new Cas(23, 57));
        slovar.put(new Cas(15, 0), new Cas(16, 59));
        slovar.put(new Cas(16, 6), new Cas(23, 11));
        slovar.put(new Cas(19, 25), new Cas(22, 49));
        slovar.put(new Cas(3, 23), new Cas(17, 3));
        slovar.put(new Cas(6, 28), new Cas(17, 41));
        slovar.put(new Cas(7, 59), new Cas(19, 57));
        slovar.put(new Cas(4, 0), new Cas(1, 24));
        slovar.put(new Cas(14, 17), new Cas(3, 21));
        slovar.put(new Cas(16, 42), new Cas(12, 54));
        slovar.put(new Cas(6, 23), new Cas(9, 48));
        slovar.put(new Cas(12, 46), new Cas(8, 16));
        slovar.put(new Cas(20, 55), new Cas(1, 35));
        slovar.put(new Cas(8, 30), new Cas(20, 15));
        slovar.put(new Cas(23, 22), new Cas(10, 13));
        slovar.put(new Cas(1, 33), new Cas(15, 44));
        slovar.put(new Cas(7, 30), new Cas(5, 5));
        slovar.put(new Cas(17, 59), new Cas(10, 40));
        slovar.put(new Cas(20, 26), new Cas(13, 24));
        slovar.put(new Cas(1, 1), new Cas(1, 0));
        slovar.put(new Cas(21, 21), new Cas(7, 0));
        slovar.put(new Cas(8, 24), new Cas(11, 38));
        slovar.put(new Cas(10, 56), new Cas(11, 17));
        slovar.put(new Cas(10, 54), new Cas(6, 29));
        slovar.put(new Cas(23, 14), new Cas(15, 16));
        slovar.put(new Cas(6, 34), new Cas(21, 38));
        slovar.put(new Cas(14, 48), new Cas(11, 42));
        slovar.put(new Cas(13, 31), new Cas(9, 15));
        slovar.put(new Cas(10, 13), new Cas(14, 57));
        slovar.put(new Cas(10, 49), new Cas(7, 26));
        slovar.put(new Cas(19, 43), new Cas(4, 11));
        slovar.put(new Cas(0, 48), new Cas(23, 23));
        slovar.put(new Cas(19, 40), new Cas(8, 49));
        slovar.put(new Cas(7, 7), new Cas(11, 59));
        slovar.put(new Cas(4, 48), new Cas(8, 29));
        slovar.put(new Cas(14, 57), new Cas(6, 59));
        slovar.put(new Cas(20, 44), new Cas(7, 11));
        slovar.put(new Cas(2, 6), new Cas(20, 29));
        slovar.put(new Cas(20, 17), new Cas(14, 52));
        slovar.put(new Cas(11, 34), new Cas(5, 40));
        slovar.put(new Cas(1, 47), new Cas(6, 10));
        slovar.put(new Cas(7, 45), new Cas(13, 18));
        slovar.put(new Cas(15, 16), new Cas(3, 14));
        slovar.put(new Cas(5, 35), new Cas(5, 25));
        slovar.put(new Cas(14, 31), new Cas(16, 16));
        slovar.put(new Cas(4, 16), new Cas(7, 1));
        slovar.put(new Cas(9, 13), new Cas(19, 59));
        slovar.put(new Cas(17, 39), new Cas(20, 38));

        Set<Cas> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);

        List<Cas> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
