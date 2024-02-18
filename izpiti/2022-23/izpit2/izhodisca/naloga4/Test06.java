
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hisa", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("bajta", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("koca", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("dom", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("veselje", Set.of("veselje", "radost"));
        sinonimi.put("radost", Set.of("veselje", "radost"));
        sinonimi.put("spet", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("zopet", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("ponovno", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("znova", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("vnovic", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost(
            "hisa ni velika je pa veselje spet in zopet in znova veselje " +
            "in radost in znova in vnovic in spet in zopet veselje " +
            "ta bajta je res pravi dom moj prvi pravi dom " +
            "ceprav je bolj koca kot hisa",
            sinonimi
        );

        List<String> seznam = new ArrayList<>();
        for (Set<String> mnozica: slovar.keySet()) {
            List<String> lstMnozica = new ArrayList<>(mnozica);
            lstMnozica.sort(null);
            seznam.add(String.format("%s -> %d", lstMnozica, slovar.get(mnozica)));
        }
        seznam.sort(null);
        for (String s: seznam) {
            System.out.println(s);
        }
    }
}
