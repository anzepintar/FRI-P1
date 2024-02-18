
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(68, 67);
        slovar.put(53, 66);
        slovar.put(32, 68);
        slovar.put(92, 50);
        slovar.put(6, 98);
        slovar.put(91, 65);
        slovar.put(82, 56);
        slovar.put(96, 35);
        slovar.put(31, 14);
        slovar.put(55, 92);
        slovar.put(14, 18);
        slovar.put(9, 32);
        slovar.put(88, 43);
        slovar.put(8, 55);
        slovar.put(87, 85);
        slovar.put(100, 20);
        slovar.put(74, 96);
        slovar.put(37, 4);
        slovar.put(51, 11);
        slovar.put(76, 64);
        slovar.put(72, 84);
        slovar.put(45, 79);
        slovar.put(27, 72);
        slovar.put(36, 44);
        slovar.put(85, 48);
        slovar.put(79, 24);
        slovar.put(40, 21);
        slovar.put(99, 16);
        slovar.put(30, 63);
        slovar.put(64, 93);
        slovar.put(49, 58);
        slovar.put(77, 40);
        slovar.put(57, 80);
        slovar.put(61, 42);
        slovar.put(5, 82);
        slovar.put(67, 73);
        slovar.put(71, 52);
        slovar.put(35, 23);
        slovar.put(89, 22);
        slovar.put(50, 3);
        slovar.put(12, 62);
        slovar.put(13, 34);
        slovar.put(81, 6);
        slovar.put(98, 86);
        slovar.put(19, 39);
        slovar.put(54, 77);
        slovar.put(44, 100);
        slovar.put(20, 60);
        slovar.put(75, 10);
        slovar.put(94, 78);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
