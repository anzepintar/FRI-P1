
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Ana", "Bojan", "Cvetko", "Denis", "Eva", "Franci", "Gabrijela", "Hinko", "Iva", "Janez", "Karel", "Lea", "Mojca", "Nina"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 2, 7));
    }
}
