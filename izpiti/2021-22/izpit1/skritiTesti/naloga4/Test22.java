
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<String> seznam = List.of(
            "Urban", "Oton", "Francka", "Darja", "Ivan", "Rok", "Matej", "Rok", "Simona", "Ana", "Simona", "Eva", "Emil", "Karel", "Zinka", "Cene", "Peter", "Vlado", "Matej", "Eva", "Cene", "Vita", "Vita", "Leon", "Nina", "Darja", "Rozalija", "Matej", "Vlado", "Emil", "Gabrijela", "Eva", "Rok", "Hinko", "Peter", "Karel", "Nina", "Gabrijela", "Oton", "Eva", "Darja", "Urban", "Zinka", "Lidija", "Maja", "Simon", "Vlado", "Gabrijela", "Rozalija", "Simon", "Barbara", "Ivan", "Zinka", "Lidija", "Andrej", "Rozalija", "Tatjana", "Dejan", "Lidija", "Urban", "Emil", "Peter", "Francka", "Ana", "Cene", "Simon", "Tone", "Emil", "Barbara", "Maja", "Gorazd", "Karel", "Vlado", "Gorazd", "Olga", "Zoran", "Bojan", "Hinko"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 16, 41));
    }
}
