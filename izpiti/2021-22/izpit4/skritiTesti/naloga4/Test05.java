
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(25, 23);
        slovar.put(6, 25);
        slovar.put(81, 38);
        slovar.put(80, 83);
        slovar.put(4, 18);
        slovar.put(7, 71);
        slovar.put(55, 66);
        slovar.put(32, 32);
        slovar.put(15, 10);
        slovar.put(57, 49);
        slovar.put(22, 12);
        slovar.put(94, 6);
        slovar.put(44, 57);
        slovar.put(48, 44);
        slovar.put(84, 69);
        slovar.put(100, 8);
        slovar.put(49, 82);
        slovar.put(77, 3);
        slovar.put(92, 79);
        slovar.put(34, 89);
        slovar.put(10, 65);
        slovar.put(26, 80);
        slovar.put(46, 90);
        slovar.put(17, 61);
        slovar.put(18, 56);
        slovar.put(50, 59);
        slovar.put(20, 64);
        slovar.put(5, 58);
        slovar.put(83, 54);
        slovar.put(90, 68);
        slovar.put(96, 86);
        slovar.put(75, 40);
        slovar.put(64, 75);
        slovar.put(30, 20);
        slovar.put(28, 51);
        slovar.put(86, 9);
        slovar.put(85, 95);
        slovar.put(89, 94);
        slovar.put(8, 22);
        slovar.put(78, 81);
        slovar.put(95, 74);
        slovar.put(53, 100);
        slovar.put(52, 98);
        slovar.put(45, 21);
        slovar.put(72, 72);
        slovar.put(2, 63);
        slovar.put(29, 43);
        slovar.put(11, 46);
        slovar.put(98, 17);
        slovar.put(97, 97);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
