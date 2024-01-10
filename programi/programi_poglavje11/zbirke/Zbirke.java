
import java.util.*;
import java.util.function.*;

public class Zbirke {

    public static void main(String[] args) {
        List<Integer> stevila = List.of(20, 42, 6, 17, 15, 25, 23, 30, 40, 50);
        List<String> imena = List.of("Boris", "Ivan", "Majda", "Tilen", "Eva", "Branko", "Maksimilijan", "Ana", "Mojca", "Marko");

        // prestej
        System.out.println(prestej(stevila, stevilo -> stevilo % 5 == 0 ));
        System.out.println(prestej(imena, ime -> ime.length() >= 6));
        System.out.println();

        // zaVsak
        zaVsak(stevila, stevilo -> { System.out.println(stevilo); });
        Map<String, Integer> ime2dolzina = new TreeMap<>();
        zaVsak(imena, ime -> { ime2dolzina.put(ime, ime.length()); });
        System.out.println(ime2dolzina);
        System.out.println();

        // zdruzi
        System.out.println(zdruzi(stevila, (a, b) -> a + b, 0));
        System.out.println(zdruzi(imena, (a, b) -> (a.length() >= b.length() ? a : b), ""));
        System.out.println();

        // grupiraj
        System.out.println(grupiraj(stevila, stevilo -> stevilo % 3));
        System.out.println(grupiraj(stevila, stevilo -> stevilo % 5 == 0));
        System.out.println(grupiraj(imena, ime -> ime.length()));
    }

    // Vrne "stevilo elementov zbirke, ki izpolnjujejo podani pogoj.
    public static <T> int prestej(Collection<T> zbirka, Predicate<T> pogoj) {
        int stevec = 0;
        for (T element: zbirka) {
            if (pogoj.test(element)) {
                stevec++;
            }
        }
        return stevec;
    }

    // Za vsak element zbirke izvr"si podano opravilo.
    public static <T> void zaVsak(Collection<T> zbirka, Consumer<T> opravilo) {
        for (T element: zbirka) {
            opravilo.accept(element);
        }
    }

    // Vrne rezultat izraza 
    // ((((zacetek op e_0) op e_1) op e_2) ... ) op e_{n-1},
    // kjer so e_0, e_1, ..., e_{n-1} zaporedni elementi zbirke, op pa je
    // podani operator.
    public static <T> T zdruzi(Collection<T> zbirka, BinaryOperator<T> operator, T zacetek) {
        T rezultat = zacetek;
        for (T element: zbirka) {
            rezultat = operator.apply(rezultat, element);
        }
        return rezultat;
    }

    // Vrne slovar, ki objekt r preslika v seznam vseh elementov zbirke, pri
    // katerih je rezultat podane funkcije enak r.
    public static <T, R> Map<R, List<T>> grupiraj(Collection<T> zbirka, Function<T, R> funkcija) {
        Map<R, List<T>> slovar = new HashMap<>();
        for (T element: zbirka) {
            R rezultat = funkcija.apply(element);
            List<T> elementiZaRezultat = slovar.get(rezultat);
            if (elementiZaRezultat == null) {
                elementiZaRezultat = new ArrayList<T>();
                slovar.put(rezultat, elementiZaRezultat);
            }
            elementiZaRezultat.add(element);
        }
        return slovar;
    }
}
