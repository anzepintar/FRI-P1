
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(15, 63);
        slovar.put(2, 72);
        slovar.put(49, 19);
        slovar.put(83, 42);
        slovar.put(27, 24);
        slovar.put(5, 66);
        slovar.put(99, 2);
        slovar.put(56, 51);
        slovar.put(57, 29);
        slovar.put(85, 41);
        slovar.put(90, 13);
        slovar.put(47, 79);
        slovar.put(25, 70);
        slovar.put(74, 37);
        slovar.put(53, 74);
        slovar.put(38, 28);
        slovar.put(71, 84);
        slovar.put(20, 61);
        slovar.put(40, 18);
        slovar.put(66, 32);
        slovar.put(97, 91);
        slovar.put(18, 62);
        slovar.put(28, 58);
        slovar.put(12, 59);
        slovar.put(88, 47);
        slovar.put(35, 23);
        slovar.put(94, 69);
        slovar.put(48, 95);
        slovar.put(21, 55);
        slovar.put(77, 98);
        slovar.put(76, 94);
        slovar.put(78, 11);
        slovar.put(68, 78);
        slovar.put(33, 10);
        slovar.put(86, 86);
        slovar.put(89, 56);
        slovar.put(26, 76);
        slovar.put(61, 3);
        slovar.put(36, 22);
        slovar.put(43, 99);
        slovar.put(17, 17);
        slovar.put(67, 5);
        slovar.put(34, 96);
        slovar.put(84, 9);
        slovar.put(64, 68);
        slovar.put(32, 52);
        slovar.put(93, 64);
        slovar.put(4, 12);
        slovar.put(19, 89);
        slovar.put(9, 21);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
