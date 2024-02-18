
import java.util.*;

public class Test14 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("z", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("qfa", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("xomg", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("zuopn", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("ms", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("obxb", Set.of("z", "qfa", "xomg", "zuopn", "ms", "obxb"));
        sinonimi.put("pcxuh", Set.of("pcxuh"));
        sinonimi.put("jjb", Set.of("jjb", "evrig", "kcs"));
        sinonimi.put("evrig", Set.of("jjb", "evrig", "kcs"));
        sinonimi.put("kcs", Set.of("jjb", "evrig", "kcs"));
        sinonimi.put("blhup", Set.of("blhup", "vsn"));
        sinonimi.put("vsn", Set.of("blhup", "vsn"));
        sinonimi.put("eyk", Set.of("eyk", "dlft", "fst"));
        sinonimi.put("dlft", Set.of("eyk", "dlft", "fst"));
        sinonimi.put("fst", Set.of("eyk", "dlft", "fst"));
        sinonimi.put("nar", Set.of("nar", "rkczw", "s", "wi"));
        sinonimi.put("rkczw", Set.of("nar", "rkczw", "s", "wi"));
        sinonimi.put("s", Set.of("nar", "rkczw", "s", "wi"));
        sinonimi.put("wi", Set.of("nar", "rkczw", "s", "wi"));
        sinonimi.put("jul", Set.of("jul", "iy"));
        sinonimi.put("iy", Set.of("jul", "iy"));
        sinonimi.put("hb", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("up", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("dyn", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("ghfc", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("tt", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("bmikh", Set.of("hb", "up", "dyn", "ghfc", "tt", "bmikh"));
        sinonimi.put("g", Set.of("g", "vgzgg", "iz", "lpg"));
        sinonimi.put("vgzgg", Set.of("g", "vgzgg", "iz", "lpg"));
        sinonimi.put("iz", Set.of("g", "vgzgg", "iz", "lpg"));
        sinonimi.put("lpg", Set.of("g", "vgzgg", "iz", "lpg"));
        sinonimi.put("mn", Set.of("mn", "x"));
        sinonimi.put("x", Set.of("mn", "x"));
        sinonimi.put("cprgp", Set.of("cprgp", "pxubt"));
        sinonimi.put("pxubt", Set.of("cprgp", "pxubt"));
        sinonimi.put("jvd", Set.of("jvd", "svma", "uu", "nb"));
        sinonimi.put("svma", Set.of("jvd", "svma", "uu", "nb"));
        sinonimi.put("uu", Set.of("jvd", "svma", "uu", "nb"));
        sinonimi.put("nb", Set.of("jvd", "svma", "uu", "nb"));
        sinonimi.put("hpb", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("ikkf", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("difnl", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("scd", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("f", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("hhlds", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));
        sinonimi.put("tye", Set.of("hpb", "ikkf", "difnl", "scd", "f", "hhlds", "tye"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
