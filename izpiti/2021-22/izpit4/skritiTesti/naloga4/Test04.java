
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(96, 23);
        slovar.put(79, 18);
        slovar.put(52, 10);
        slovar.put(42, 81);
        slovar.put(90, 28);
        slovar.put(12, 79);
        slovar.put(58, 17);
        slovar.put(97, 35);
        slovar.put(62, 62);
        slovar.put(64, 34);
        slovar.put(81, 24);
        slovar.put(27, 36);
        slovar.put(71, 88);
        slovar.put(11, 82);
        slovar.put(47, 2);
        slovar.put(45, 90);
        slovar.put(74, 33);
        slovar.put(22, 47);
        slovar.put(82, 74);
        slovar.put(55, 60);
        slovar.put(49, 95);
        slovar.put(95, 78);
        slovar.put(73, 39);
        slovar.put(67, 98);
        slovar.put(44, 97);
        slovar.put(78, 71);
        slovar.put(70, 70);
        slovar.put(24, 84);
        slovar.put(57, 49);
        slovar.put(87, 3);
        slovar.put(9, 83);
        slovar.put(94, 59);
        slovar.put(31, 51);
        slovar.put(92, 61);
        slovar.put(5, 55);
        slovar.put(8, 87);
        slovar.put(100, 85);
        slovar.put(39, 76);
        slovar.put(17, 63);
        slovar.put(16, 46);
        slovar.put(10, 69);
        slovar.put(4, 91);
        slovar.put(29, 93);
        slovar.put(6, 67);
        slovar.put(72, 99);
        slovar.put(83, 16);
        slovar.put(28, 30);
        slovar.put(65, 100);
        slovar.put(75, 12);
        slovar.put(56, 50);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
