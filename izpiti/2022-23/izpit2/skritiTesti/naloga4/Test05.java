
import java.util.*;

public class Test05 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hupdy", Set.of("hupdy"));
        sinonimi.put("azv", Set.of("azv"));
        sinonimi.put("lh", Set.of("lh", "faju"));
        sinonimi.put("faju", Set.of("lh", "faju"));
        sinonimi.put("kkee", Set.of("kkee"));
        sinonimi.put("p", Set.of("p"));
        sinonimi.put("rrw", Set.of("rrw", "msa"));
        sinonimi.put("msa", Set.of("rrw", "msa"));
        sinonimi.put("krspn", Set.of("krspn", "pi"));
        sinonimi.put("pi", Set.of("krspn", "pi"));
        sinonimi.put("htyge", Set.of("htyge"));
        sinonimi.put("hcbrv", Set.of("hcbrv", "ztvn"));
        sinonimi.put("ztvn", Set.of("hcbrv", "ztvn"));
        sinonimi.put("i", Set.of("i", "eyfv"));
        sinonimi.put("eyfv", Set.of("i", "eyfv"));
        sinonimi.put("dvvv", Set.of("dvvv"));
        sinonimi.put("st", Set.of("st"));
        sinonimi.put("zoz", Set.of("zoz"));
        sinonimi.put("arzbn", Set.of("arzbn"));
        sinonimi.put("pr", Set.of("pr", "xzlan"));
        sinonimi.put("xzlan", Set.of("pr", "xzlan"));
        sinonimi.put("ozhj", Set.of("ozhj"));
        sinonimi.put("nfpv", Set.of("nfpv", "cqex", "u"));
        sinonimi.put("cqex", Set.of("nfpv", "cqex", "u"));
        sinonimi.put("u", Set.of("nfpv", "cqex", "u"));
        sinonimi.put("n", Set.of("n", "ekkv"));
        sinonimi.put("ekkv", Set.of("n", "ekkv"));
        sinonimi.put("exg", Set.of("exg"));
        sinonimi.put("upgm", Set.of("upgm", "gvxfx"));
        sinonimi.put("gvxfx", Set.of("upgm", "gvxfx"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
