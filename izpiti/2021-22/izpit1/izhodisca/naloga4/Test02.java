
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<List<Integer>> seznam = List.of(
            List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8, 9)
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 0, 2));
    }
}
