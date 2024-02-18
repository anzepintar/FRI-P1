
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Rozalija", "Barbara", "Klara", "Matej", "Simona", "Maja", "Rozalija", "Klara", "Olga", "Emil", "Nikolaj", "Bojan", "Janez", "Iva", "Simona", "Francka", "Tone", "Hilda", "Nina", "Nina", "Tone", "Gabrijela", "Simona", "Vlado", "Nikolaj", "Hilda", "Nikolaj", "Simona", "Barbara", "Simona", "Franci", "Cvetka", "Ula", "Cene", "Klara", "Eva", "Hinko", "Ana", "Bojan"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 15, 31));
    }
}
