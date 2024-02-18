
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(27, 13);
        slovar.put(81, 86);
        slovar.put(99, 65);
        slovar.put(78, 59);
        slovar.put(39, 46);
        slovar.put(76, 31);
        slovar.put(14, 84);
        slovar.put(2, 68);
        slovar.put(90, 91);
        slovar.put(6, 71);
        slovar.put(70, 78);
        slovar.put(95, 22);
        slovar.put(50, 37);
        slovar.put(67, 66);
        slovar.put(97, 23);
        slovar.put(43, 24);
        slovar.put(86, 44);
        slovar.put(79, 70);
        slovar.put(62, 28);
        slovar.put(17, 72);
        slovar.put(11, 47);
        slovar.put(37, 8);
        slovar.put(49, 98);
        slovar.put(61, 94);
        slovar.put(60, 56);
        slovar.put(75, 18);
        slovar.put(48, 55);
        slovar.put(65, 19);
        slovar.put(88, 14);
        slovar.put(31, 79);
        slovar.put(28, 50);
        slovar.put(10, 15);
        slovar.put(72, 75);
        slovar.put(26, 30);
        slovar.put(46, 34);
        slovar.put(51, 97);
        slovar.put(89, 80);
        slovar.put(42, 4);
        slovar.put(12, 45);
        slovar.put(8, 9);
        slovar.put(41, 41);
        slovar.put(74, 92);
        slovar.put(98, 17);
        slovar.put(7, 53);
        slovar.put(47, 90);
        slovar.put(63, 57);
        slovar.put(94, 40);
        slovar.put(52, 1);
        slovar.put(40, 21);
        slovar.put(30, 63);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
