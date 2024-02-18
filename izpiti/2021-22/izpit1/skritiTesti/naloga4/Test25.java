
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            991, 59, 485, 628, 182, 137, 496, 228, 900, 584, 639, 708, 489, 526, 782, 473, 967, 301, 863, 475, 719, 71, 953, 676, 767, 886, 2, 357, 137, 175, 442, 587, 667, 559, 173, 645, 290, 248, 49, 51, 794
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 0, 10));
    }
}
