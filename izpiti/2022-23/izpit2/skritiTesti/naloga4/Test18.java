
import java.util.*;

public class Test18 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("fex", Set.of("fex"));
        sinonimi.put("xfku", Set.of("xfku"));
        sinonimi.put("uxm", Set.of("uxm"));
        sinonimi.put("nh", Set.of("nh", "jlma", "ohad"));
        sinonimi.put("jlma", Set.of("nh", "jlma", "ohad"));
        sinonimi.put("ohad", Set.of("nh", "jlma", "ohad"));
        sinonimi.put("skvvb", Set.of("skvvb", "dfsa"));
        sinonimi.put("dfsa", Set.of("skvvb", "dfsa"));
        sinonimi.put("mjbd", Set.of("mjbd", "ubn", "tcd"));
        sinonimi.put("ubn", Set.of("mjbd", "ubn", "tcd"));
        sinonimi.put("tcd", Set.of("mjbd", "ubn", "tcd"));
        sinonimi.put("d", Set.of("d", "pjpgy", "dmh", "nmmpm"));
        sinonimi.put("pjpgy", Set.of("d", "pjpgy", "dmh", "nmmpm"));
        sinonimi.put("dmh", Set.of("d", "pjpgy", "dmh", "nmmpm"));
        sinonimi.put("nmmpm", Set.of("d", "pjpgy", "dmh", "nmmpm"));
        sinonimi.put("js", Set.of("js", "tp", "hn"));
        sinonimi.put("tp", Set.of("js", "tp", "hn"));
        sinonimi.put("hn", Set.of("js", "tp", "hn"));
        sinonimi.put("yv", Set.of("yv", "crosl"));
        sinonimi.put("crosl", Set.of("yv", "crosl"));
        sinonimi.put("xku", Set.of("xku", "mryba", "iec"));
        sinonimi.put("mryba", Set.of("xku", "mryba", "iec"));
        sinonimi.put("iec", Set.of("xku", "mryba", "iec"));
        sinonimi.put("spsq", Set.of("spsq", "xypq", "bawi"));
        sinonimi.put("xypq", Set.of("spsq", "xypq", "bawi"));
        sinonimi.put("bawi", Set.of("spsq", "xypq", "bawi"));
        sinonimi.put("hcrl", Set.of("hcrl", "hbr", "mhpc"));
        sinonimi.put("hbr", Set.of("hcrl", "hbr", "mhpc"));
        sinonimi.put("mhpc", Set.of("hcrl", "hbr", "mhpc"));
        sinonimi.put("rpol", Set.of("rpol", "awd", "fhnlv"));
        sinonimi.put("awd", Set.of("rpol", "awd", "fhnlv"));
        sinonimi.put("fhnlv", Set.of("rpol", "awd", "fhnlv"));
        sinonimi.put("t", Set.of("t", "efjc"));
        sinonimi.put("efjc", Set.of("t", "efjc"));
        sinonimi.put("rn", Set.of("rn", "ywxho"));
        sinonimi.put("ywxho", Set.of("rn", "ywxho"));
        sinonimi.put("ly", Set.of("ly"));
        sinonimi.put("ghcy", Set.of("ghcy", "ufosu"));
        sinonimi.put("ufosu", Set.of("ghcy", "ufosu"));
        sinonimi.put("lh", Set.of("lh"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
