
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(48, 78);
        slovar.put(51, 49);
        slovar.put(73, 37);
        slovar.put(42, 81);
        slovar.put(44, 63);
        slovar.put(56, 6);
        slovar.put(68, 4);
        slovar.put(69, 80);
        slovar.put(98, 7);
        slovar.put(94, 62);
        slovar.put(13, 42);
        slovar.put(4, 14);
        slovar.put(59, 51);
        slovar.put(57, 50);
        slovar.put(71, 93);
        slovar.put(14, 90);
        slovar.put(16, 71);
        slovar.put(91, 24);
        slovar.put(81, 26);
        slovar.put(46, 98);
        slovar.put(62, 97);
        slovar.put(22, 57);
        slovar.put(72, 65);
        slovar.put(20, 64);
        slovar.put(79, 48);
        slovar.put(88, 18);
        slovar.put(67, 92);
        slovar.put(95, 40);
        slovar.put(25, 33);
        slovar.put(26, 67);
        slovar.put(7, 74);
        slovar.put(86, 75);
        slovar.put(12, 72);
        slovar.put(19, 56);
        slovar.put(89, 76);
        slovar.put(27, 69);
        slovar.put(21, 77);
        slovar.put(3, 41);
        slovar.put(75, 20);
        slovar.put(35, 30);
        slovar.put(18, 79);
        slovar.put(65, 54);
        slovar.put(66, 27);
        slovar.put(32, 35);
        slovar.put(17, 84);
        slovar.put(61, 3);
        slovar.put(30, 61);
        slovar.put(43, 31);
        slovar.put(31, 29);
        slovar.put(39, 38);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
