
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(42, 95);
        slovar.put(17, 66);
        slovar.put(29, 81);
        slovar.put(99, 39);
        slovar.put(72, 60);
        slovar.put(96, 97);
        slovar.put(10, 55);
        slovar.put(1, 22);
        slovar.put(98, 56);
        slovar.put(67, 54);
        slovar.put(34, 24);
        slovar.put(23, 13);
        slovar.put(12, 63);
        slovar.put(39, 10);
        slovar.put(90, 25);
        slovar.put(16, 70);
        slovar.put(13, 19);
        slovar.put(69, 15);
        slovar.put(6, 85);
        slovar.put(64, 75);
        slovar.put(41, 38);
        slovar.put(77, 98);
        slovar.put(25, 5);
        slovar.put(63, 21);
        slovar.put(18, 79);
        slovar.put(83, 100);
        slovar.put(52, 12);
        slovar.put(94, 31);
        slovar.put(73, 67);
        slovar.put(31, 61);
        slovar.put(62, 9);
        slovar.put(3, 52);
        slovar.put(11, 35);
        slovar.put(85, 86);
        slovar.put(75, 68);
        slovar.put(48, 92);
        slovar.put(28, 89);
        slovar.put(21, 99);
        slovar.put(66, 26);
        slovar.put(20, 1);
        slovar.put(84, 91);
        slovar.put(91, 72);
        slovar.put(57, 53);
        slovar.put(35, 14);
        slovar.put(82, 51);
        slovar.put(26, 23);
        slovar.put(55, 62);
        slovar.put(89, 44);
        slovar.put(61, 36);
        slovar.put(9, 58);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
