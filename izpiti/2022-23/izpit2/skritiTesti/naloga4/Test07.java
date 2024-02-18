
import java.util.*;

public class Test07 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hm", Set.of("hm", "fwn", "ludwk"));
        sinonimi.put("fwn", Set.of("hm", "fwn", "ludwk"));
        sinonimi.put("ludwk", Set.of("hm", "fwn", "ludwk"));
        sinonimi.put("ehmat", Set.of("ehmat", "mi", "zznt", "dbc"));
        sinonimi.put("mi", Set.of("ehmat", "mi", "zznt", "dbc"));
        sinonimi.put("zznt", Set.of("ehmat", "mi", "zznt", "dbc"));
        sinonimi.put("dbc", Set.of("ehmat", "mi", "zznt", "dbc"));
        sinonimi.put("liq", Set.of("liq", "tc"));
        sinonimi.put("tc", Set.of("liq", "tc"));
        sinonimi.put("purg", Set.of("purg", "pyy"));
        sinonimi.put("pyy", Set.of("purg", "pyy"));
        sinonimi.put("ejg", Set.of("ejg", "lqzyf", "rloh"));
        sinonimi.put("lqzyf", Set.of("ejg", "lqzyf", "rloh"));
        sinonimi.put("rloh", Set.of("ejg", "lqzyf", "rloh"));
        sinonimi.put("x", Set.of("x", "cz"));
        sinonimi.put("cz", Set.of("x", "cz"));
        sinonimi.put("riihx", Set.of("riihx", "nn", "ymseg"));
        sinonimi.put("nn", Set.of("riihx", "nn", "ymseg"));
        sinonimi.put("ymseg", Set.of("riihx", "nn", "ymseg"));
        sinonimi.put("pxlkj", Set.of("pxlkj"));
        sinonimi.put("wqeu", Set.of("wqeu", "znl", "qtspm"));
        sinonimi.put("znl", Set.of("wqeu", "znl", "qtspm"));
        sinonimi.put("qtspm", Set.of("wqeu", "znl", "qtspm"));
        sinonimi.put("fskpe", Set.of("fskpe", "ddyv"));
        sinonimi.put("ddyv", Set.of("fskpe", "ddyv"));
        sinonimi.put("qixbj", Set.of("qixbj", "hl"));
        sinonimi.put("hl", Set.of("qixbj", "hl"));
        sinonimi.put("o", Set.of("o", "gki"));
        sinonimi.put("gki", Set.of("o", "gki"));
        sinonimi.put("njk", Set.of("njk"));
        sinonimi.put("qzk", Set.of("qzk", "exf", "aj"));
        sinonimi.put("exf", Set.of("qzk", "exf", "aj"));
        sinonimi.put("aj", Set.of("qzk", "exf", "aj"));
        sinonimi.put("ilo", Set.of("ilo"));
        sinonimi.put("dpqkc", Set.of("dpqkc", "ehaa", "aid"));
        sinonimi.put("ehaa", Set.of("dpqkc", "ehaa", "aid"));
        sinonimi.put("aid", Set.of("dpqkc", "ehaa", "aid"));
        sinonimi.put("yazrq", Set.of("yazrq", "onkn"));
        sinonimi.put("onkn", Set.of("yazrq", "onkn"));
        sinonimi.put("sh", Set.of("sh", "rorqh", "ssxfe"));
        sinonimi.put("rorqh", Set.of("sh", "rorqh", "ssxfe"));
        sinonimi.put("ssxfe", Set.of("sh", "rorqh", "ssxfe"));
        sinonimi.put("qd", Set.of("qd"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
