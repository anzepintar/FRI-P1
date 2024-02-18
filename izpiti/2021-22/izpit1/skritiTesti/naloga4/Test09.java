
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            626, 982, 631, 357, 147, 577, 908, 630, 126, 188
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 0, 9));
    }
}
