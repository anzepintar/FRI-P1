
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(87, 2);
        slovar.put(89, 39);
        slovar.put(55, 99);
        slovar.put(61, 4);
        slovar.put(11, 32);
        slovar.put(7, 46);
        slovar.put(31, 7);
        slovar.put(15, 81);
        slovar.put(72, 28);
        slovar.put(12, 16);
        slovar.put(95, 12);
        slovar.put(2, 90);
        slovar.put(10, 8);
        slovar.put(4, 57);
        slovar.put(1, 91);
        slovar.put(60, 53);
        slovar.put(6, 21);
        slovar.put(68, 22);
        slovar.put(39, 48);
        slovar.put(25, 9);
        slovar.put(78, 89);
        slovar.put(85, 30);
        slovar.put(35, 61);
        slovar.put(9, 40);
        slovar.put(5, 41);
        slovar.put(50, 49);
        slovar.put(66, 100);
        slovar.put(8, 55);
        slovar.put(92, 19);
        slovar.put(70, 64);
        slovar.put(83, 70);
        slovar.put(44, 58);
        slovar.put(23, 29);
        slovar.put(100, 1);
        slovar.put(80, 47);
        slovar.put(62, 65);
        slovar.put(52, 6);
        slovar.put(54, 25);
        slovar.put(75, 86);
        slovar.put(81, 56);
        slovar.put(47, 67);
        slovar.put(90, 17);
        slovar.put(27, 76);
        slovar.put(64, 35);
        slovar.put(49, 13);
        slovar.put(22, 93);
        slovar.put(88, 95);
        slovar.put(45, 88);
        slovar.put(48, 68);
        slovar.put(82, 54);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
