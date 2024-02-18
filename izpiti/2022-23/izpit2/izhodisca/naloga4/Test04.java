
import java.util.*;

public class Test04 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("zki", Set.of("zki", "xhjkr", "ufh"));
        sinonimi.put("xhjkr", Set.of("zki", "xhjkr", "ufh"));
        sinonimi.put("ufh", Set.of("zki", "xhjkr", "ufh"));
        sinonimi.put("sqt", Set.of("sqt", "zr", "kx", "ntk", "m"));
        sinonimi.put("zr", Set.of("sqt", "zr", "kx", "ntk", "m"));
        sinonimi.put("kx", Set.of("sqt", "zr", "kx", "ntk", "m"));
        sinonimi.put("ntk", Set.of("sqt", "zr", "kx", "ntk", "m"));
        sinonimi.put("m", Set.of("sqt", "zr", "kx", "ntk", "m"));
        sinonimi.put("pcg", Set.of("pcg", "duknb", "obz", "sx", "ebn"));
        sinonimi.put("duknb", Set.of("pcg", "duknb", "obz", "sx", "ebn"));
        sinonimi.put("obz", Set.of("pcg", "duknb", "obz", "sx", "ebn"));
        sinonimi.put("sx", Set.of("pcg", "duknb", "obz", "sx", "ebn"));
        sinonimi.put("ebn", Set.of("pcg", "duknb", "obz", "sx", "ebn"));
        sinonimi.put("cl", Set.of("cl"));
        sinonimi.put("o", Set.of("o", "egfn", "vd", "vqtln"));
        sinonimi.put("egfn", Set.of("o", "egfn", "vd", "vqtln"));
        sinonimi.put("vd", Set.of("o", "egfn", "vd", "vqtln"));
        sinonimi.put("vqtln", Set.of("o", "egfn", "vd", "vqtln"));
        sinonimi.put("ckl", Set.of("ckl"));
        sinonimi.put("bipc", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("nqgka", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("uycmx", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("mo", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("foqbz", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("epdq", Set.of("bipc", "nqgka", "uycmx", "mo", "foqbz", "epdq"));
        sinonimi.put("eeznh", Set.of("eeznh", "yno", "jyd", "xcoe"));
        sinonimi.put("yno", Set.of("eeznh", "yno", "jyd", "xcoe"));
        sinonimi.put("jyd", Set.of("eeznh", "yno", "jyd", "xcoe"));
        sinonimi.put("xcoe", Set.of("eeznh", "yno", "jyd", "xcoe"));
        sinonimi.put("zl", Set.of("zl", "egqu", "cugm", "irl", "ece"));
        sinonimi.put("egqu", Set.of("zl", "egqu", "cugm", "irl", "ece"));
        sinonimi.put("cugm", Set.of("zl", "egqu", "cugm", "irl", "ece"));
        sinonimi.put("irl", Set.of("zl", "egqu", "cugm", "irl", "ece"));
        sinonimi.put("ece", Set.of("zl", "egqu", "cugm", "irl", "ece"));
        sinonimi.put("sy", Set.of("sy", "qftz", "like", "gjepo"));
        sinonimi.put("qftz", Set.of("sy", "qftz", "like", "gjepo"));
        sinonimi.put("like", Set.of("sy", "qftz", "like", "gjepo"));
        sinonimi.put("gjepo", Set.of("sy", "qftz", "like", "gjepo"));
        sinonimi.put("btltm", Set.of("btltm", "reedy", "umkm", "njnsc", "j"));
        sinonimi.put("reedy", Set.of("btltm", "reedy", "umkm", "njnsc", "j"));
        sinonimi.put("umkm", Set.of("btltm", "reedy", "umkm", "njnsc", "j"));
        sinonimi.put("njnsc", Set.of("btltm", "reedy", "umkm", "njnsc", "j"));
        sinonimi.put("j", Set.of("btltm", "reedy", "umkm", "njnsc", "j"));
        sinonimi.put("kjzeg", Set.of("kjzeg", "wh", "exjrj", "jy"));
        sinonimi.put("wh", Set.of("kjzeg", "wh", "exjrj", "jy"));
        sinonimi.put("exjrj", Set.of("kjzeg", "wh", "exjrj", "jy"));
        sinonimi.put("jy", Set.of("kjzeg", "wh", "exjrj", "jy"));
        sinonimi.put("wlsyn", Set.of("wlsyn", "noo"));
        sinonimi.put("noo", Set.of("wlsyn", "noo"));
        sinonimi.put("gknlo", Set.of("gknlo", "ev", "pri"));
        sinonimi.put("ev", Set.of("gknlo", "ev", "pri"));
        sinonimi.put("pri", Set.of("gknlo", "ev", "pri"));
        sinonimi.put("hn", Set.of("hn", "hnkpt", "xwnv", "vwdk", "hbzac"));
        sinonimi.put("hnkpt", Set.of("hn", "hnkpt", "xwnv", "vwdk", "hbzac"));
        sinonimi.put("xwnv", Set.of("hn", "hnkpt", "xwnv", "vwdk", "hbzac"));
        sinonimi.put("vwdk", Set.of("hn", "hnkpt", "xwnv", "vwdk", "hbzac"));
        sinonimi.put("hbzac", Set.of("hn", "hnkpt", "xwnv", "vwdk", "hbzac"));
        sinonimi.put("pnw", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("qwz", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("oov", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("xpm", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("uqje", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("gbr", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("fdob", Set.of("pnw", "qwz", "oov", "xpm", "uqje", "gbr", "fdob"));
        sinonimi.put("snc", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("iog", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("dwj", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("jtw", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("zf", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("co", Set.of("snc", "iog", "dwj", "jtw", "zf", "co"));
        sinonimi.put("eq", Set.of("eq", "mgllq", "ocffm"));
        sinonimi.put("mgllq", Set.of("eq", "mgllq", "ocffm"));
        sinonimi.put("ocffm", Set.of("eq", "mgllq", "ocffm"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
