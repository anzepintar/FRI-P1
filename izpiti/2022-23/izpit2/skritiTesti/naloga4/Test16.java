
import java.util.*;

public class Test16 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ptcj", Set.of("ptcj"));
        sinonimi.put("ykzcq", Set.of("ykzcq"));
        sinonimi.put("ebvr", Set.of("ebvr"));
        sinonimi.put("fyhyh", Set.of("fyhyh"));
        sinonimi.put("boa", Set.of("boa", "tf"));
        sinonimi.put("tf", Set.of("boa", "tf"));
        sinonimi.put("yzqnq", Set.of("yzqnq", "sbbm"));
        sinonimi.put("sbbm", Set.of("yzqnq", "sbbm"));
        sinonimi.put("vhgh", Set.of("vhgh"));
        sinonimi.put("dyinr", Set.of("dyinr", "ghv"));
        sinonimi.put("ghv", Set.of("dyinr", "ghv"));
        sinonimi.put("xgfxt", Set.of("xgfxt"));
        sinonimi.put("ma", Set.of("ma"));
        sinonimi.put("vf", Set.of("vf"));
        sinonimi.put("ivd", Set.of("ivd", "wettt", "agk"));
        sinonimi.put("wettt", Set.of("ivd", "wettt", "agk"));
        sinonimi.put("agk", Set.of("ivd", "wettt", "agk"));
        sinonimi.put("yu", Set.of("yu", "cxpd"));
        sinonimi.put("cxpd", Set.of("yu", "cxpd"));
        sinonimi.put("mek", Set.of("mek"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
