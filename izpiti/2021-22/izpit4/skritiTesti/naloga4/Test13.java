
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(64, 32);
        slovar.put(11, 18);
        slovar.put(32, 100);
        slovar.put(22, 1);
        slovar.put(85, 8);
        slovar.put(78, 19);
        slovar.put(6, 35);
        slovar.put(34, 31);
        slovar.put(26, 52);
        slovar.put(86, 4);
        slovar.put(56, 93);
        slovar.put(83, 41);
        slovar.put(4, 66);
        slovar.put(28, 99);
        slovar.put(71, 11);
        slovar.put(35, 81);
        slovar.put(88, 24);
        slovar.put(92, 29);
        slovar.put(19, 53);
        slovar.put(65, 73);
        slovar.put(15, 37);
        slovar.put(3, 40);
        slovar.put(68, 72);
        slovar.put(43, 58);
        slovar.put(50, 67);
        slovar.put(23, 94);
        slovar.put(47, 70);
        slovar.put(100, 21);
        slovar.put(54, 96);
        slovar.put(84, 44);
        slovar.put(59, 9);
        slovar.put(49, 17);
        slovar.put(46, 84);
        slovar.put(29, 56);
        slovar.put(39, 36);
        slovar.put(14, 48);
        slovar.put(75, 63);
        slovar.put(10, 65);
        slovar.put(66, 88);
        slovar.put(58, 43);
        slovar.put(79, 61);
        slovar.put(96, 80);
        slovar.put(31, 39);
        slovar.put(18, 87);
        slovar.put(67, 15);
        slovar.put(1, 83);
        slovar.put(16, 54);
        slovar.put(74, 79);
        slovar.put(21, 42);
        slovar.put(27, 49);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
