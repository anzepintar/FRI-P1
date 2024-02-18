
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Integer obj5 = 5;
        Integer obj10 = 10;
        Integer obj15 = 15;
        Integer obj20 = 20;
        Integer obj30 = 30;
        Integer obj39 = 39;
        Integer obj40 = 40;
        Integer obj50 = 50;

        Map<Integer, Integer> slovar = new HashMap<>();
        slovar.put(obj10, obj5);
        slovar.put(obj20, obj30);
        slovar.put(obj30, obj30);
        slovar.put(obj40, obj39);
        slovar.put(obj50, obj15);

        Set<Integer> mnozica = Set.of(obj10, obj40);

        Comparator<Integer> prim = Cetrta.primerjalnik(slovar, mnozica);
        System.out.println(prim.compare(obj10, obj5) > 0);
        System.out.println(prim.compare(obj20, obj30) > 0);
        System.out.println(prim.compare(obj30, obj30) > 0);
        System.out.println(prim.compare(obj40, obj39) > 0);
        System.out.println(prim.compare(obj50, obj15) > 0);

        System.out.println(prim.compare(obj10, obj30) > 0);
        System.out.println(prim.compare(obj40, obj30) > 0);
        System.out.println(prim.compare(obj10, obj40) > 0);
        System.out.println(prim.compare(obj5, obj10) > 0);
        System.out.println(prim.compare(obj39, obj40) > 0);
    }
}
