
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(75, 41);
        slovar.put(18, 82);
        slovar.put(46, 40);
        slovar.put(78, 50);
        slovar.put(38, 84);
        slovar.put(32, 8);
        slovar.put(17, 66);
        slovar.put(90, 30);
        slovar.put(57, 54);
        slovar.put(98, 92);
        slovar.put(10, 45);
        slovar.put(12, 2);
        slovar.put(79, 68);
        slovar.put(61, 63);
        slovar.put(96, 100);
        slovar.put(91, 35);
        slovar.put(89, 6);
        slovar.put(35, 99);
        slovar.put(36, 60);
        slovar.put(42, 58);
        slovar.put(24, 94);
        slovar.put(11, 1);
        slovar.put(64, 77);
        slovar.put(66, 16);
        slovar.put(34, 47);
        slovar.put(70, 49);
        slovar.put(25, 90);
        slovar.put(4, 37);
        slovar.put(95, 62);
        slovar.put(26, 56);
        slovar.put(47, 23);
        slovar.put(22, 83);
        slovar.put(49, 65);
        slovar.put(55, 15);
        slovar.put(88, 89);
        slovar.put(68, 61);
        slovar.put(100, 21);
        slovar.put(80, 91);
        slovar.put(29, 46);
        slovar.put(67, 53);
        slovar.put(51, 34);
        slovar.put(43, 7);
        slovar.put(92, 38);
        slovar.put(37, 13);
        slovar.put(33, 97);
        slovar.put(62, 52);
        slovar.put(50, 93);
        slovar.put(81, 39);
        slovar.put(52, 11);
        slovar.put(31, 70);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
