
import java.util.*;

public class Test24 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("xwru", Set.of("xwru", "nl"));
        sinonimi.put("nl", Set.of("xwru", "nl"));
        sinonimi.put("gngjl", Set.of("gngjl"));
        sinonimi.put("xaoui", Set.of("xaoui"));
        sinonimi.put("qgc", Set.of("qgc", "dmc", "lsyu"));
        sinonimi.put("dmc", Set.of("qgc", "dmc", "lsyu"));
        sinonimi.put("lsyu", Set.of("qgc", "dmc", "lsyu"));
        sinonimi.put("qpict", Set.of("qpict", "sj"));
        sinonimi.put("sj", Set.of("qpict", "sj"));
        sinonimi.put("hacwr", Set.of("hacwr", "mauoa"));
        sinonimi.put("mauoa", Set.of("hacwr", "mauoa"));
        sinonimi.put("zve", Set.of("zve"));
        sinonimi.put("znfd", Set.of("znfd"));
        sinonimi.put("tjc", Set.of("tjc"));
        sinonimi.put("pkhv", Set.of("pkhv", "jlrm"));
        sinonimi.put("jlrm", Set.of("pkhv", "jlrm"));
        sinonimi.put("anuqn", Set.of("anuqn", "w"));
        sinonimi.put("w", Set.of("anuqn", "w"));
        sinonimi.put("ks", Set.of("ks", "xjdp"));
        sinonimi.put("xjdp", Set.of("ks", "xjdp"));
        sinonimi.put("inaq", Set.of("inaq", "lkjum"));
        sinonimi.put("lkjum", Set.of("inaq", "lkjum"));
        sinonimi.put("dj", Set.of("dj", "pubwx"));
        sinonimi.put("pubwx", Set.of("dj", "pubwx"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
