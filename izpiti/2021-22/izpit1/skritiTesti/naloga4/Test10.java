
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Hilda", "Emil", "Janez", "Iva", "Ivan", "Zoran", "Oton", "Lidija", "Hinko", "Simon", "Dejan", "Ana", "Simon", "Simon", "Dejan", "Cene", "Dejan", "Barbara", "Janez", "Cene", "Ana", "Janez", "Tone", "Maja", "Hilda", "Jana", "Eva", "Vita", "Simon", "Cene", "Vita", "Olga", "Nikolaj", "Janez", "Gorazd", "Vlado", "Karel", "Ana", "Dejan", "Klara", "Maja", "Matej", "Lidija", "Andrej", "Janez", "Klara", "Franci", "Karel", "Simona", "Franci", "Nikolaj"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 13, 34));
    }
}
