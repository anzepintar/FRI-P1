
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("zi", "L", "K", "3J", "d5", "86", "vC", "R", "waczS", "1", "rbu", "DW", "4j", "bOB", "8LgM", "bTIe", "ij", "tf9c", "Z0", "yFs6", "Qy", "c", "W", "QK", "Er203", "IB", "k", "Qx", "Hz", "8A_", "OG", "ypjv", "m7By", "9l5G", "W", "dp", "H", "fk7v", "Cd", "Q", "9", "kd9a", "4yKb", "8RnNj", "iF", "8i", "j40", "BnW2", "U7l7k", "yL"));
        Set<String> mnozica = new TreeSet<>(List.of("JOoy", "raGEd", "6", "D8", "C", "LIc", "rX", "M8", "k6P", "G6I", "kDQ", "Drev", "Sina7", "q", "ItyHc", "Chu", "t", "GQLI", "dklup", "XZ0ex", "T", "PU", "OuTG", "Jx3s", "H9", "6S", "RYcD1", "z2D"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
