
import java.util.*;

public class Test20 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("dhgtv", Set.of("dhgtv", "lhaty"));
        sinonimi.put("lhaty", Set.of("dhgtv", "lhaty"));
        sinonimi.put("orxuc", Set.of("orxuc", "g"));
        sinonimi.put("g", Set.of("orxuc", "g"));
        sinonimi.put("hsxww", Set.of("hsxww"));
        sinonimi.put("s", Set.of("s"));
        sinonimi.put("fj", Set.of("fj", "chkg", "cpgp"));
        sinonimi.put("chkg", Set.of("fj", "chkg", "cpgp"));
        sinonimi.put("cpgp", Set.of("fj", "chkg", "cpgp"));
        sinonimi.put("xlon", Set.of("xlon", "sxv"));
        sinonimi.put("sxv", Set.of("xlon", "sxv"));
        sinonimi.put("bxz", Set.of("bxz", "hm"));
        sinonimi.put("hm", Set.of("bxz", "hm"));
        sinonimi.put("rpywe", Set.of("rpywe"));
        sinonimi.put("iad", Set.of("iad"));
        sinonimi.put("y", Set.of("y"));
        sinonimi.put("zifle", Set.of("zifle", "bwaom"));
        sinonimi.put("bwaom", Set.of("zifle", "bwaom"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
