
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            957, 120, 754, 475, 616, 738, 91, 453, 505, 488, 991, 915, 347, 158, 812, 683, 740, 330, 561, 462, 997, 526, 57, 829, 199, 525, 32, 151, 59, 159, 509, 287
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 3, 5));
    }
}
