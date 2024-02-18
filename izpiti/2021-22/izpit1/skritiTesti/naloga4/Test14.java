
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Emil", "Jana", "Hinko", "Lidija", "Tone", "Iva", "Iva", "Simona", "Tone", "Barbara", "Olga", "Peter", "Urban", "Tatjana", "Eva", "Ivan", "Tone", "Ivan", "Cvetka", "Olga", "Vita", "Lidija", "Vita", "Peter", "Simona", "Matej", "Rok", "Karel", "Emil", "Nikolaj", "Bojan", "Barbara", "Zinka", "Zinka", "Leon", "Simona", "Vlado", "Hinko", "Oton", "Klara", "Leon", "Janez", "Emil", "Eva", "Francka", "Iva", "Janez", "Emil", "Zoran", "Barbara", "Barbara"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 4, 10));
    }
}
