
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>(List.of("U", "UNOM1", "TXoPj", "lvtH", "w81", "AV3I", "pgr6", "tQ", "LO1K", "owQmY", "bTnfH", "nXT3J", "E8HN", "JdwX", "laIMl", "2m", "6egH", "C", "Wc", "PENuj", "SVAVm", "hfG", "B", "QvMa0", "TGh", "Pv8kd", "JRg", "sjM", "NV", "o", "6OBa", "Udp", "R", "k", "qO", "XLVE", "DQI", "Pe", "Q", "I", "TqRk", "SIV", "2_C8", "3kWG", "g3txK", "X", "l7Zc"));
        Set<String> mnozica = new TreeSet<>(List.of("MqbOm", "whE", "56lj", "r", "bihIM", "f", "l", "1Lz", "a4", "C8yJ", "gEAk_", "QAGKf", "xsR", "9XfEw", "FHcRw", "QIUG", "q6_LY", "9UHx", "2T", "i", "OoguT", "58CQ", "jNo_", "g", "EjoT", "f6r", "Jau6", "Z", "8vW_", "1bDB", "xs", "jhu9", "idV", "j", "7vI5", "2VfE", "lYZ", "ENLm", "ljft", "UNQd"));

        Cetrta.Miks<String> miks = new Cetrta.Miks<>(seznam, mnozica);
        List<String> skupaj = new ArrayList<>();
        for (String element: miks) {
            skupaj.add(element);
        }
        System.out.println(skupaj);
    }
}
