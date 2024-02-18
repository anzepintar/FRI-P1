
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(45, 60);
        slovar.put(29, 46);
        slovar.put(19, 76);
        slovar.put(89, 90);
        slovar.put(65, 23);
        slovar.put(8, 18);
        slovar.put(99, 53);
        slovar.put(50, 91);
        slovar.put(90, 36);
        slovar.put(98, 45);
        slovar.put(88, 55);
        slovar.put(10, 37);
        slovar.put(53, 24);
        slovar.put(37, 88);
        slovar.put(16, 39);
        slovar.put(41, 38);
        slovar.put(80, 84);
        slovar.put(63, 10);
        slovar.put(70, 33);
        slovar.put(86, 77);
        slovar.put(27, 32);
        slovar.put(1, 22);
        slovar.put(78, 59);
        slovar.put(84, 43);
        slovar.put(66, 96);
        slovar.put(23, 19);
        slovar.put(2, 83);
        slovar.put(61, 50);
        slovar.put(67, 82);
        slovar.put(91, 66);
        slovar.put(92, 68);
        slovar.put(82, 9);
        slovar.put(93, 95);
        slovar.put(7, 99);
        slovar.put(87, 7);
        slovar.put(21, 29);
        slovar.put(17, 42);
        slovar.put(59, 56);
        slovar.put(42, 61);
        slovar.put(83, 47);
        slovar.put(28, 71);
        slovar.put(15, 20);
        slovar.put(81, 14);
        slovar.put(57, 44);
        slovar.put(77, 89);
        slovar.put(55, 62);
        slovar.put(18, 79);
        slovar.put(71, 48);
        slovar.put(94, 34);
        slovar.put(36, 85);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
