
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Rozalija", "Hinko", "Nina", "Gabrijela", "Ana", "Gabrijela", "Olga", "Franci", "Ivan", "Franci", "Dejan", "Cvetka", "Vita", "Rozalija", "Tone", "Zinka", "Bojan", "Cvetka", "Vita", "Bojan", "Franci", "Urban", "Bojan", "Darja", "Rok", "Cene", "Gorazd", "Petra", "Matej", "Eva", "Cene", "Andrej", "Cvetka", "Zoran", "Nina", "Simona", "Bojan", "Rok", "Ana", "Maja", "Matej", "Iva", "Jana", "Vita", "Maja", "Simon", "Rozalija", "Olga", "Leon", "Tone", "Maja", "Franci", "Francka", "Nikolaj", "Matej", "Barbara", "Nikolaj", "Peter", "Nina", "Zinka", "Ula"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 4, 10));
    }
}
