
import java.util.*;

public class Test13 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("wpb", Set.of("wpb", "wcgdo"));
        sinonimi.put("wcgdo", Set.of("wpb", "wcgdo"));
        sinonimi.put("wx", Set.of("wx", "dxw", "z"));
        sinonimi.put("dxw", Set.of("wx", "dxw", "z"));
        sinonimi.put("z", Set.of("wx", "dxw", "z"));
        sinonimi.put("bn", Set.of("bn"));
        sinonimi.put("wurwm", Set.of("wurwm"));
        sinonimi.put("iwn", Set.of("iwn", "gicv"));
        sinonimi.put("gicv", Set.of("iwn", "gicv"));
        sinonimi.put("fkod", Set.of("fkod", "cxft"));
        sinonimi.put("cxft", Set.of("fkod", "cxft"));
        sinonimi.put("wpvm", Set.of("wpvm"));
        sinonimi.put("qdosm", Set.of("qdosm"));
        sinonimi.put("ftsnn", Set.of("ftsnn", "uxc"));
        sinonimi.put("uxc", Set.of("ftsnn", "uxc"));
        sinonimi.put("vajr", Set.of("vajr", "cykf"));
        sinonimi.put("cykf", Set.of("vajr", "cykf"));
        sinonimi.put("vc", Set.of("vc"));
        sinonimi.put("cfro", Set.of("cfro", "lsekq"));
        sinonimi.put("lsekq", Set.of("cfro", "lsekq"));
        sinonimi.put("un", Set.of("un", "uqob"));
        sinonimi.put("uqob", Set.of("un", "uqob"));
        sinonimi.put("xss", Set.of("xss"));
        sinonimi.put("azoz", Set.of("azoz", "xql"));
        sinonimi.put("xql", Set.of("azoz", "xql"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
