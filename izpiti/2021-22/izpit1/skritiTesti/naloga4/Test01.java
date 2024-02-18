
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            48, 872, 841, 151, 606, 236, 28, 776, 551, 328, 697, 845, 971, 222
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 12, 12));
    }
}
