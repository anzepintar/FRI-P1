
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Janez", "Nina", "Nikolaj", "Darja", "Ana", "Tone", "Eva", "Oton", "Rozalija", "Iva", "Iva", "Ana", "Zoran", "Rozalija", "Cvetka", "Iva", "Hinko", "Tatjana", "Simona", "Peter", "Olga", "Barbara", "Jana", "Zinka", "Rok", "Klara", "Emil", "Rozalija", "Francka", "Nikolaj", "Zinka", "Bojan", "Karel", "Urban", "Andrej", "Vlado", "Ula", "Ana", "Simon", "Ivan", "Maja", "Rok", "Ana", "Tatjana", "Klara", "Iva", "Zinka", "Eva", "Iva", "Gorazd", "Petra", "Karel", "Simona", "Jana", "Zinka", "Matej", "Simon", "Rozalija", "Lidija"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 4, 10));
    }
}
