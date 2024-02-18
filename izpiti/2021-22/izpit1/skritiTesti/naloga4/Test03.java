
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            780, 958, 536, 95, 182, 184, 84, 669, 742, 193, 818, 247, 622, 100, 955, 126, 234
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 8, 13));
    }
}
