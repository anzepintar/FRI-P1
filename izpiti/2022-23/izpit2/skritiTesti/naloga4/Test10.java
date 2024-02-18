
import java.util.*;

public class Test10 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("jds", Set.of("jds", "dmcef"));
        sinonimi.put("dmcef", Set.of("jds", "dmcef"));
        sinonimi.put("owyb", Set.of("owyb", "zqzcc"));
        sinonimi.put("zqzcc", Set.of("owyb", "zqzcc"));
        sinonimi.put("kch", Set.of("kch"));
        sinonimi.put("bdx", Set.of("bdx", "ttxe", "bidtl"));
        sinonimi.put("ttxe", Set.of("bdx", "ttxe", "bidtl"));
        sinonimi.put("bidtl", Set.of("bdx", "ttxe", "bidtl"));
        sinonimi.put("b", Set.of("b", "huja", "q", "ufiw"));
        sinonimi.put("huja", Set.of("b", "huja", "q", "ufiw"));
        sinonimi.put("q", Set.of("b", "huja", "q", "ufiw"));
        sinonimi.put("ufiw", Set.of("b", "huja", "q", "ufiw"));
        sinonimi.put("ijpes", Set.of("ijpes", "eyt"));
        sinonimi.put("eyt", Set.of("ijpes", "eyt"));
        sinonimi.put("zfub", Set.of("zfub", "zvl", "fn"));
        sinonimi.put("zvl", Set.of("zfub", "zvl", "fn"));
        sinonimi.put("fn", Set.of("zfub", "zvl", "fn"));
        sinonimi.put("bzm", Set.of("bzm"));
        sinonimi.put("iid", Set.of("iid", "enbc"));
        sinonimi.put("enbc", Set.of("iid", "enbc"));
        sinonimi.put("nplh", Set.of("nplh", "wymcg"));
        sinonimi.put("wymcg", Set.of("nplh", "wymcg"));
        sinonimi.put("f", Set.of("f", "gpdii", "lxjhe"));
        sinonimi.put("gpdii", Set.of("f", "gpdii", "lxjhe"));
        sinonimi.put("lxjhe", Set.of("f", "gpdii", "lxjhe"));
        sinonimi.put("qmw", Set.of("qmw", "u"));
        sinonimi.put("u", Set.of("qmw", "u"));
        sinonimi.put("psd", Set.of("psd"));
        sinonimi.put("vhplb", Set.of("vhplb", "mk"));
        sinonimi.put("mk", Set.of("vhplb", "mk"));
        sinonimi.put("ljij", Set.of("ljij", "hd"));
        sinonimi.put("hd", Set.of("ljij", "hd"));
        sinonimi.put("bvihb", Set.of("bvihb"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
