
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Klara", "Hinko", "Ula", "Franci", "Cene", "Oton", "Bojan", "Karel", "Lidija", "Maja", "Cene", "Matej", "Ana", "Olga", "Ivan", "Cene", "Rok", "Gabrijela", "Maja", "Lidija", "Cene", "Janez", "Nikolaj", "Karel", "Hinko", "Hinko", "Nina", "Simona", "Rok", "Eva", "Jana", "Oton", "Iva", "Nina", "Cene", "Darja", "Nina", "Iva", "Petra", "Olga", "Ivan", "Urban", "Andrej", "Gorazd", "Hilda", "Lidija", "Nikolaj", "Eva", "Vita", "Vlado", "Gabrijela", "Vlado", "Peter", "Bojan", "Cvetka", "Ula", "Andrej", "Dejan", "Emil", "Cene", "Karel", "Jana", "Nikolaj", "Maja", "Klara", "Ula", "Vlado", "Rozalija", "Peter", "Rozalija", "Francka", "Oton", "Tatjana", "Olga", "Lidija", "Janez", "Peter", "Barbara", "Dejan", "Rok", "Oton", "Franci"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 39, 50));
    }
}
