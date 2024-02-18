
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Peter", "Eva", "Barbara", "Darja", "Simon", "Oton", "Ula", "Ivan", "Andrej", "Peter", "Janez", "Zoran", "Eva", "Zinka", "Vlado", "Ula", "Leon", "Zoran", "Rozalija", "Darja", "Cene", "Vita", "Petra", "Karel", "Tatjana", "Jana", "Bojan", "Zinka", "Nina", "Ivan", "Francka", "Dejan", "Zoran", "Rok", "Ula", "Vlado", "Leon", "Nikolaj", "Urban", "Emil", "Maja", "Darja", "Vlado", "Olga", "Ana", "Gorazd", "Zoran", "Franci", "Ivan", "Emil", "Tone", "Jana", "Zoran", "Ula", "Oton", "Hilda", "Eva", "Bojan", "Urban", "Zoran", "Zoran", "Vlado", "Gorazd", "Tone", "Darja", "Ula", "Lidija", "Franci", "Cene", "Emil", "Eva", "Simon", "Rok", "Franci", "Rok", "Eva", "Andrej", "Zoran", "Klara", "Hinko", "Jana", "Iva", "Simon", "Zoran", "Jana", "Dejan", "Peter", "Peter", "Tone", "Nikolaj", "Ula"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 18, 81));
    }
}
