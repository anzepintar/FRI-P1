
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(34, 70);
        slovar.put(41, 22);
        slovar.put(74, 48);
        slovar.put(82, 29);
        slovar.put(72, 38);
        slovar.put(91, 18);
        slovar.put(87, 52);
        slovar.put(88, 12);
        slovar.put(59, 6);
        slovar.put(70, 90);
        slovar.put(36, 95);
        slovar.put(76, 1);
        slovar.put(23, 19);
        slovar.put(79, 60);
        slovar.put(80, 23);
        slovar.put(11, 89);
        slovar.put(18, 98);
        slovar.put(32, 28);
        slovar.put(4, 86);
        slovar.put(46, 5);
        slovar.put(77, 54);
        slovar.put(92, 50);
        slovar.put(5, 15);
        slovar.put(25, 73);
        slovar.put(33, 40);
        slovar.put(75, 77);
        slovar.put(94, 24);
        slovar.put(9, 66);
        slovar.put(7, 51);
        slovar.put(2, 96);
        slovar.put(69, 71);
        slovar.put(98, 85);
        slovar.put(47, 39);
        slovar.put(38, 87);
        slovar.put(8, 26);
        slovar.put(30, 34);
        slovar.put(1, 74);
        slovar.put(73, 84);
        slovar.put(14, 56);
        slovar.put(66, 93);
        slovar.put(62, 72);
        slovar.put(50, 83);
        slovar.put(28, 30);
        slovar.put(93, 7);
        slovar.put(54, 99);
        slovar.put(22, 88);
        slovar.put(83, 43);
        slovar.put(53, 16);
        slovar.put(55, 64);
        slovar.put(89, 42);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
