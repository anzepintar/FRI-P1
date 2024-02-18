
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(80, 62);
        slovar.put(91, 56);
        slovar.put(62, 7);
        slovar.put(47, 31);
        slovar.put(77, 97);
        slovar.put(5, 53);
        slovar.put(35, 39);
        slovar.put(21, 36);
        slovar.put(28, 78);
        slovar.put(45, 95);
        slovar.put(42, 65);
        slovar.put(74, 61);
        slovar.put(51, 57);
        slovar.put(12, 14);
        slovar.put(16, 83);
        slovar.put(38, 40);
        slovar.put(83, 72);
        slovar.put(24, 44);
        slovar.put(96, 26);
        slovar.put(88, 58);
        slovar.put(58, 13);
        slovar.put(79, 43);
        slovar.put(90, 34);
        slovar.put(9, 87);
        slovar.put(81, 50);
        slovar.put(67, 84);
        slovar.put(85, 81);
        slovar.put(87, 21);
        slovar.put(63, 5);
        slovar.put(95, 41);
        slovar.put(25, 4);
        slovar.put(10, 67);
        slovar.put(99, 28);
        slovar.put(97, 24);
        slovar.put(18, 90);
        slovar.put(30, 16);
        slovar.put(19, 64);
        slovar.put(1, 19);
        slovar.put(27, 23);
        slovar.put(64, 54);
        slovar.put(23, 11);
        slovar.put(70, 68);
        slovar.put(56, 6);
        slovar.put(49, 38);
        slovar.put(3, 91);
        slovar.put(92, 86);
        slovar.put(65, 30);
        slovar.put(98, 35);
        slovar.put(37, 66);
        slovar.put(15, 70);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
