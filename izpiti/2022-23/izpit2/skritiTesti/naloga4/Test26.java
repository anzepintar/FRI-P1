
import java.util.*;

public class Test26 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("llun", Set.of("llun", "rs"));
        sinonimi.put("rs", Set.of("llun", "rs"));
        sinonimi.put("q", Set.of("q", "wghh", "czsi", "cns", "lft"));
        sinonimi.put("wghh", Set.of("q", "wghh", "czsi", "cns", "lft"));
        sinonimi.put("czsi", Set.of("q", "wghh", "czsi", "cns", "lft"));
        sinonimi.put("cns", Set.of("q", "wghh", "czsi", "cns", "lft"));
        sinonimi.put("lft", Set.of("q", "wghh", "czsi", "cns", "lft"));
        sinonimi.put("jdml", Set.of("jdml", "zywyh", "hkcuf", "txevr", "ls"));
        sinonimi.put("zywyh", Set.of("jdml", "zywyh", "hkcuf", "txevr", "ls"));
        sinonimi.put("hkcuf", Set.of("jdml", "zywyh", "hkcuf", "txevr", "ls"));
        sinonimi.put("txevr", Set.of("jdml", "zywyh", "hkcuf", "txevr", "ls"));
        sinonimi.put("ls", Set.of("jdml", "zywyh", "hkcuf", "txevr", "ls"));
        sinonimi.put("ip", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("az", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("wy", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("grkhp", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("gas", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("qexm", Set.of("ip", "az", "wy", "grkhp", "gas", "qexm"));
        sinonimi.put("rwm", Set.of("rwm", "zka"));
        sinonimi.put("zka", Set.of("rwm", "zka"));
        sinonimi.put("sjbv", Set.of("sjbv", "emeq", "siutx"));
        sinonimi.put("emeq", Set.of("sjbv", "emeq", "siutx"));
        sinonimi.put("siutx", Set.of("sjbv", "emeq", "siutx"));
        sinonimi.put("tlc", Set.of("tlc", "nnmbr", "aas", "noy"));
        sinonimi.put("nnmbr", Set.of("tlc", "nnmbr", "aas", "noy"));
        sinonimi.put("aas", Set.of("tlc", "nnmbr", "aas", "noy"));
        sinonimi.put("noy", Set.of("tlc", "nnmbr", "aas", "noy"));
        sinonimi.put("hyr", Set.of("hyr"));
        sinonimi.put("j", Set.of("j", "qtkjm", "cekg"));
        sinonimi.put("qtkjm", Set.of("j", "qtkjm", "cekg"));
        sinonimi.put("cekg", Set.of("j", "qtkjm", "cekg"));
        sinonimi.put("vf", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("gl", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("qeadl", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("hkhxk", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("spv", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("mfoep", Set.of("vf", "gl", "qeadl", "hkhxk", "spv", "mfoep"));
        sinonimi.put("hp", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("dd", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("jpp", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("ja", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("xqhc", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("pp", Set.of("hp", "dd", "jpp", "ja", "xqhc", "pp"));
        sinonimi.put("jc", Set.of("jc", "tdptt", "ni", "vx", "yiey"));
        sinonimi.put("tdptt", Set.of("jc", "tdptt", "ni", "vx", "yiey"));
        sinonimi.put("ni", Set.of("jc", "tdptt", "ni", "vx", "yiey"));
        sinonimi.put("vx", Set.of("jc", "tdptt", "ni", "vx", "yiey"));
        sinonimi.put("yiey", Set.of("jc", "tdptt", "ni", "vx", "yiey"));
        sinonimi.put("uxe", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("yf", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("vn", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("f", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("ylxx", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("g", Set.of("uxe", "yf", "vn", "f", "ylxx", "g"));
        sinonimi.put("ko", Set.of("ko", "twhw", "hzcd", "dzlt"));
        sinonimi.put("twhw", Set.of("ko", "twhw", "hzcd", "dzlt"));
        sinonimi.put("hzcd", Set.of("ko", "twhw", "hzcd", "dzlt"));
        sinonimi.put("dzlt", Set.of("ko", "twhw", "hzcd", "dzlt"));
        sinonimi.put("qhcw", Set.of("qhcw"));
        sinonimi.put("rhwzm", Set.of("rhwzm"));
        sinonimi.put("nglc", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("cpdm", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("u", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("yau", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("skiq", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("rhyfc", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("w", Set.of("nglc", "cpdm", "u", "yau", "skiq", "rhyfc", "w"));
        sinonimi.put("nm", Set.of("nm"));
        sinonimi.put("upmoi", Set.of("upmoi", "zkcy"));
        sinonimi.put("zkcy", Set.of("upmoi", "zkcy"));
        sinonimi.put("on", Set.of("on", "kadp", "tmqsr"));
        sinonimi.put("kadp", Set.of("on", "kadp", "tmqsr"));
        sinonimi.put("tmqsr", Set.of("on", "kadp", "tmqsr"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("us zka xelj qeadl ytng nglc igvu b nskm bn baq sq liuoj sex uwsaz pkki sfanq pmezt vyqls cfcfi kjr ven tmqsr r ihz ja qexm rjzyh hba qgnh xuesa wicy tq fgb grvs xzzts gab yaxn cpdm fvl noy gtwwx kvg hg pofhc vyqls ptulw uwsaz crm gab noy gqrz cekg nefat cz vtzbg ave gab az rhyfc ua yqnoz gqrz fx kbi xilv sq o xqhc aas ozsft mkw nc oy xtqp nlb d czsi atej jlj iw tldj jfg wls nfxka drtny qzg cpdm jrd mzkgj jjila ti mahl isosv zgix lhvf xixbe zh gas fgb lqtw yaxn yydvg mnci xd ko z xymop cekg ncw seqkk rjzyh rhyfc kcrfv kmb crm xazca oy uaw xzzts hatf dwpp nc xtqp", sinonimi);
        List<String> seznam = new ArrayList<>();
        for (Set<String> mnozica: slovar.keySet()) {
            List<String> lstMnozica = new ArrayList<>(mnozica);
            lstMnozica.sort(null);
            seznam.add(String.format("%s -> %d", lstMnozica, slovar.get(mnozica)));
        }
        seznam.sort(null);
        for (String s: seznam) {
            System.out.println(s);
        }
    }
}
