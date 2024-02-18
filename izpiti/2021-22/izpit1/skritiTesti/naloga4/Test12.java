
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Oton", "Hinko", "Iva", "Peter", "Nikolaj", "Ivan", "Oton", "Urban", "Ula", "Jana", "Rozalija", "Gorazd", "Rok", "Gabrijela"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 3, 6));
    }
}
