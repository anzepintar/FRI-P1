
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Klara", "Franci", "Zinka", "Eva", "Cvetka", "Iva", "Nina", "Tone", "Zinka", "Nikolaj", "Eva", "Nina", "Jana", "Nina", "Zoran", "Francka", "Andrej", "Darja", "Vita", "Gabrijela", "Maja", "Franci", "Oton", "Emil", "Cvetka", "Barbara", "Dejan", "Nikolaj", "Karel", "Janez", "Leon", "Vlado", "Zinka", "Simona", "Franci", "Dejan", "Vita", "Jana", "Francka", "Bojan", "Bojan", "Matej", "Karel", "Janez", "Maja", "Urban", "Oton", "Andrej", "Zoran", "Rok", "Francka", "Andrej", "Franci", "Rok", "Klara", "Andrej", "Simon", "Janez", "Zoran", "Vlado", "Oton", "Gorazd", "Eva", "Gorazd", "Peter", "Dejan", "Maja", "Leon", "Simon", "Leon", "Urban", "Gabrijela", "Urban", "Bojan", "Urban", "Tatjana", "Oton", "Ula", "Rok", "Peter", "Hinko", "Karel", "Cene", "Barbara", "Vlado", "Oton", "Hinko", "Dejan", "Peter", "Janez", "Leon", "Simona"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 36, 40));
    }
}
