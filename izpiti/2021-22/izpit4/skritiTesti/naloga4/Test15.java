
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(76, 13);
        slovar.put(80, 20);
        slovar.put(84, 97);
        slovar.put(78, 21);
        slovar.put(36, 62);
        slovar.put(99, 46);
        slovar.put(100, 78);
        slovar.put(74, 53);
        slovar.put(49, 45);
        slovar.put(24, 12);
        slovar.put(16, 98);
        slovar.put(67, 89);
        slovar.put(46, 23);
        slovar.put(97, 79);
        slovar.put(88, 74);
        slovar.put(23, 95);
        slovar.put(96, 55);
        slovar.put(82, 96);
        slovar.put(90, 85);
        slovar.put(58, 72);
        slovar.put(64, 88);
        slovar.put(15, 92);
        slovar.put(47, 100);
        slovar.put(93, 48);
        slovar.put(61, 67);
        slovar.put(92, 66);
        slovar.put(29, 71);
        slovar.put(27, 76);
        slovar.put(68, 30);
        slovar.put(65, 82);
        slovar.put(17, 52);
        slovar.put(38, 18);
        slovar.put(11, 47);
        slovar.put(87, 93);
        slovar.put(91, 83);
        slovar.put(52, 84);
        slovar.put(25, 70);
        slovar.put(21, 90);
        slovar.put(34, 19);
        slovar.put(81, 1);
        slovar.put(83, 27);
        slovar.put(14, 80);
        slovar.put(37, 59);
        slovar.put(10, 60);
        slovar.put(98, 43);
        slovar.put(43, 29);
        slovar.put(75, 35);
        slovar.put(94, 15);
        slovar.put(2, 3);
        slovar.put(3, 28);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
