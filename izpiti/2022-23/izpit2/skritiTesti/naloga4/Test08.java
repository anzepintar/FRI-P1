
import java.util.*;

public class Test08 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("yzr", Set.of("yzr"));
        sinonimi.put("aa", Set.of("aa", "bxc", "nzyks", "qlu", "ct"));
        sinonimi.put("bxc", Set.of("aa", "bxc", "nzyks", "qlu", "ct"));
        sinonimi.put("nzyks", Set.of("aa", "bxc", "nzyks", "qlu", "ct"));
        sinonimi.put("qlu", Set.of("aa", "bxc", "nzyks", "qlu", "ct"));
        sinonimi.put("ct", Set.of("aa", "bxc", "nzyks", "qlu", "ct"));
        sinonimi.put("sgf", Set.of("sgf", "bnlgr"));
        sinonimi.put("bnlgr", Set.of("sgf", "bnlgr"));
        sinonimi.put("thpc", Set.of("thpc", "fxj", "lu"));
        sinonimi.put("fxj", Set.of("thpc", "fxj", "lu"));
        sinonimi.put("lu", Set.of("thpc", "fxj", "lu"));
        sinonimi.put("ksr", Set.of("ksr"));
        sinonimi.put("vwpg", Set.of("vwpg"));
        sinonimi.put("nmc", Set.of("nmc", "ulut"));
        sinonimi.put("ulut", Set.of("nmc", "ulut"));
        sinonimi.put("uypno", Set.of("uypno"));
        sinonimi.put("ubr", Set.of("ubr", "qse", "bqpp"));
        sinonimi.put("qse", Set.of("ubr", "qse", "bqpp"));
        sinonimi.put("bqpp", Set.of("ubr", "qse", "bqpp"));
        sinonimi.put("ndp", Set.of("ndp", "hh", "koqx", "u"));
        sinonimi.put("hh", Set.of("ndp", "hh", "koqx", "u"));
        sinonimi.put("koqx", Set.of("ndp", "hh", "koqx", "u"));
        sinonimi.put("u", Set.of("ndp", "hh", "koqx", "u"));
        sinonimi.put("xjrqb", Set.of("xjrqb"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
