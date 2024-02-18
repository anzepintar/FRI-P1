
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(72, 75);
        slovar.put(81, 71);
        slovar.put(77, 5);
        slovar.put(38, 17);
        slovar.put(86, 19);
        slovar.put(50, 54);
        slovar.put(6, 89);
        slovar.put(25, 79);
        slovar.put(7, 100);
        slovar.put(47, 52);
        slovar.put(14, 58);
        slovar.put(29, 99);
        slovar.put(84, 44);
        slovar.put(26, 84);
        slovar.put(34, 35);
        slovar.put(20, 14);
        slovar.put(90, 74);
        slovar.put(98, 96);
        slovar.put(56, 66);
        slovar.put(11, 1);
        slovar.put(80, 27);
        slovar.put(15, 8);
        slovar.put(99, 91);
        slovar.put(74, 2);
        slovar.put(61, 59);
        slovar.put(28, 85);
        slovar.put(51, 97);
        slovar.put(68, 15);
        slovar.put(71, 64);
        slovar.put(62, 70);
        slovar.put(22, 32);
        slovar.put(19, 37);
        slovar.put(85, 21);
        slovar.put(91, 20);
        slovar.put(97, 80);
        slovar.put(45, 48);
        slovar.put(40, 13);
        slovar.put(4, 45);
        slovar.put(65, 81);
        slovar.put(41, 69);
        slovar.put(27, 25);
        slovar.put(73, 87);
        slovar.put(54, 56);
        slovar.put(52, 60);
        slovar.put(2, 29);
        slovar.put(79, 9);
        slovar.put(44, 39);
        slovar.put(67, 28);
        slovar.put(46, 78);
        slovar.put(24, 11);

        Set<Integer> mnozica = Cetrta.vecji(slovar);

        List<Integer> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
