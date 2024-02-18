
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(80, 70);
        slovar.put(67, 88);
        slovar.put(22, 30);
        slovar.put(56, 3);
        slovar.put(47, 64);
        slovar.put(9, 33);
        slovar.put(2, 44);
        slovar.put(32, 4);
        slovar.put(98, 10);
        slovar.put(97, 79);
        slovar.put(8, 90);
        slovar.put(77, 53);
        slovar.put(76, 45);
        slovar.put(70, 57);
        slovar.put(52, 27);
        slovar.put(61, 68);
        slovar.put(17, 93);
        slovar.put(90, 17);
        slovar.put(65, 22);
        slovar.put(71, 52);
        slovar.put(60, 31);
        slovar.put(34, 15);
        slovar.put(88, 46);
        slovar.put(92, 94);
        slovar.put(49, 38);
        slovar.put(27, 6);
        slovar.put(73, 76);
        slovar.put(21, 99);
        slovar.put(53, 56);
        slovar.put(16, 83);
        slovar.put(48, 91);
        slovar.put(85, 39);
        slovar.put(91, 67);
        slovar.put(15, 47);
        slovar.put(1, 36);
        slovar.put(78, 42);
        slovar.put(36, 71);
        slovar.put(30, 18);
        slovar.put(5, 24);
        slovar.put(12, 74);
        slovar.put(4, 61);
        slovar.put(35, 95);
        slovar.put(57, 92);
        slovar.put(13, 20);
        slovar.put(38, 82);
        slovar.put(44, 16);
        slovar.put(25, 75);
        slovar.put(10, 97);
        slovar.put(28, 29);
        slovar.put(37, 81);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
