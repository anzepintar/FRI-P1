
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(89, 89);
        slovar.put(90, 25);
        slovar.put(46, 68);
        slovar.put(15, 4);
        slovar.put(56, 51);
        slovar.put(40, 5);
        slovar.put(93, 41);
        slovar.put(74, 44);
        slovar.put(41, 17);
        slovar.put(67, 40);
        slovar.put(44, 87);
        slovar.put(24, 55);
        slovar.put(71, 11);
        slovar.put(54, 77);
        slovar.put(63, 22);
        slovar.put(87, 59);
        slovar.put(16, 64);
        slovar.put(96, 26);
        slovar.put(98, 24);
        slovar.put(5, 67);
        slovar.put(81, 28);
        slovar.put(75, 45);
        slovar.put(35, 84);
        slovar.put(18, 35);
        slovar.put(28, 71);
        slovar.put(6, 98);
        slovar.put(10, 10);
        slovar.put(78, 23);
        slovar.put(83, 52);
        slovar.put(57, 33);
        slovar.put(19, 58);
        slovar.put(11, 42);
        slovar.put(48, 60);
        slovar.put(62, 74);
        slovar.put(7, 8);
        slovar.put(79, 96);
        slovar.put(84, 100);
        slovar.put(8, 78);
        slovar.put(59, 73);
        slovar.put(4, 30);
        slovar.put(76, 37);
        slovar.put(97, 97);
        slovar.put(14, 34);
        slovar.put(12, 38);
        slovar.put(100, 85);
        slovar.put(68, 65);
        slovar.put(77, 31);
        slovar.put(92, 94);
        slovar.put(25, 46);
        slovar.put(99, 83);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
