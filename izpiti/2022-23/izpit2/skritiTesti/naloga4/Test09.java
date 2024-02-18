
import java.util.*;

public class Test09 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("wdap", Set.of("wdap"));
        sinonimi.put("fpfm", Set.of("fpfm", "nddi"));
        sinonimi.put("nddi", Set.of("fpfm", "nddi"));
        sinonimi.put("xoho", Set.of("xoho"));
        sinonimi.put("lja", Set.of("lja"));
        sinonimi.put("snju", Set.of("snju"));
        sinonimi.put("agn", Set.of("agn"));
        sinonimi.put("vcyy", Set.of("vcyy", "yk"));
        sinonimi.put("yk", Set.of("vcyy", "yk"));
        sinonimi.put("zcvp", Set.of("zcvp", "fj", "gg"));
        sinonimi.put("fj", Set.of("zcvp", "fj", "gg"));
        sinonimi.put("gg", Set.of("zcvp", "fj", "gg"));
        sinonimi.put("afm", Set.of("afm"));
        sinonimi.put("hgj", Set.of("hgj"));
        sinonimi.put("aqkxe", Set.of("aqkxe", "ahe", "prhox", "aa"));
        sinonimi.put("ahe", Set.of("aqkxe", "ahe", "prhox", "aa"));
        sinonimi.put("prhox", Set.of("aqkxe", "ahe", "prhox", "aa"));
        sinonimi.put("aa", Set.of("aqkxe", "ahe", "prhox", "aa"));
        sinonimi.put("lj", Set.of("lj", "h", "cqq", "pdpi"));
        sinonimi.put("h", Set.of("lj", "h", "cqq", "pdpi"));
        sinonimi.put("cqq", Set.of("lj", "h", "cqq", "pdpi"));
        sinonimi.put("pdpi", Set.of("lj", "h", "cqq", "pdpi"));
        sinonimi.put("ca", Set.of("ca"));
        sinonimi.put("siop", Set.of("siop", "ofje", "vgiaw", "ra", "jqs"));
        sinonimi.put("ofje", Set.of("siop", "ofje", "vgiaw", "ra", "jqs"));
        sinonimi.put("vgiaw", Set.of("siop", "ofje", "vgiaw", "ra", "jqs"));
        sinonimi.put("ra", Set.of("siop", "ofje", "vgiaw", "ra", "jqs"));
        sinonimi.put("jqs", Set.of("siop", "ofje", "vgiaw", "ra", "jqs"));
        sinonimi.put("gea", Set.of("gea", "wgcdo"));
        sinonimi.put("wgcdo", Set.of("gea", "wgcdo"));
        sinonimi.put("qk", Set.of("qk"));
        sinonimi.put("pru", Set.of("pru", "fiwu", "ljr"));
        sinonimi.put("fiwu", Set.of("pru", "fiwu", "ljr"));
        sinonimi.put("ljr", Set.of("pru", "fiwu", "ljr"));
        sinonimi.put("lglgb", Set.of("lglgb", "arr"));
        sinonimi.put("arr", Set.of("lglgb", "arr"));
        sinonimi.put("kb", Set.of("kb", "cxo"));
        sinonimi.put("cxo", Set.of("kb", "cxo"));
        sinonimi.put("mffhi", Set.of("mffhi"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
