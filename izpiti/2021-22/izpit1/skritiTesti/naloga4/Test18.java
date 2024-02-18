
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Gabrijela", "Ivan", "Darja", "Ivan", "Andrej", "Klara", "Eva", "Petra", "Urban", "Nina", "Janez", "Karel", "Vita", "Klara", "Urban", "Ana", "Iva", "Andrej", "Simona", "Matej", "Eva"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 4, 16));
    }
}
