
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(82, 88);
        slovar.put(59, 16);
        slovar.put(17, 89);
        slovar.put(40, 45);
        slovar.put(1, 81);
        slovar.put(64, 49);
        slovar.put(99, 77);
        slovar.put(93, 3);
        slovar.put(53, 14);
        slovar.put(23, 65);
        slovar.put(81, 93);
        slovar.put(66, 20);
        slovar.put(37, 8);
        slovar.put(92, 82);
        slovar.put(91, 54);
        slovar.put(46, 23);
        slovar.put(50, 50);
        slovar.put(39, 34);
        slovar.put(69, 28);
        slovar.put(72, 63);
        slovar.put(90, 70);
        slovar.put(55, 97);
        slovar.put(26, 25);
        slovar.put(74, 94);
        slovar.put(95, 67);
        slovar.put(52, 99);
        slovar.put(51, 47);
        slovar.put(11, 38);
        slovar.put(25, 74);
        slovar.put(77, 53);
        slovar.put(2, 43);
        slovar.put(9, 24);
        slovar.put(8, 1);
        slovar.put(89, 17);
        slovar.put(45, 79);
        slovar.put(86, 26);
        slovar.put(100, 75);
        slovar.put(33, 37);
        slovar.put(41, 100);
        slovar.put(73, 60);
        slovar.put(22, 56);
        slovar.put(85, 7);
        slovar.put(47, 11);
        slovar.put(14, 21);
        slovar.put(63, 84);
        slovar.put(16, 62);
        slovar.put(32, 64);
        slovar.put(61, 35);
        slovar.put(12, 2);
        slovar.put(68, 58);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
