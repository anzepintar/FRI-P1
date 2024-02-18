
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Ivan", "Vlado", "Darja", "Simon"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 2, 2));
    }
}
