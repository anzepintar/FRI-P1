
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<Character, Character> slovarChar = new HashMap<>();
        slovarChar.put('a', 'z');
        slovarChar.put('r', 'r');
        slovarChar.put('p', 'c');
        slovarChar.put('b', 'e');
        slovarChar.put('u', 'w');
        slovarChar.put('s', 'k');
        izvedi(slovarChar, (a, b) -> a - b);
        izvedi(slovarChar, (a, b) -> b - a);
        System.out.println("---");

        Map<String, String> slovarStr = new HashMap<>();
        slovarStr.put("Janez", "Marjan");
        slovarStr.put("Miha", "Ana");
        slovarStr.put("Mojca", "Stanislava");
        slovarStr.put("Jernej", "Darja");
        slovarStr.put("Barbara", "Tone");
        slovarStr.put("Maksimilijan", "Lea");
        slovarStr.put("Peter", "Petra");
        slovarStr.put("Jana", "Jana");
        izvedi(slovarStr, (a, b) -> a.compareTo(b));
        izvedi(slovarStr, (a, b) -> b.compareTo(a));
        izvedi(slovarStr, (a, b) -> a.length() - b.length());
        izvedi(slovarStr, (a, b) -> b.length() - a.length());
        System.out.println("---");

        Map<Cas, Cas> slovarCas = new HashMap<>();
        slovarCas.put(new Cas(10, 35), new Cas(10, 35));
        slovarCas.put(new Cas(11, 40), new Cas(7, 50));
        slovarCas.put(new Cas(23, 20), new Cas(0, 30));
        slovarCas.put(new Cas(15, 5), new Cas(17, 0));
        slovarCas.put(new Cas(12, 40), new Cas(12, 30));
        slovarCas.put(new Cas(18, 10), new Cas(21, 25));
        izvedi(slovarCas, (a, b) -> a.compareTo(b));
        izvedi(slovarCas, (a, b) -> b.compareTo(a));
    }

    private static <T> void izvedi(Map<T, T> slovar, Comparator<T> primerjalnik) {
        Set<T> mnozica = Cetrta.vecjiPrim(slovar, primerjalnik);
        List<T> seznam = new ArrayList<>(mnozica);
        seznam.sort(null);
        System.out.println(seznam);
    }
}
