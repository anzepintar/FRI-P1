
import java.util.*;

public class Test22 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("xy", Set.of("xy", "jjrv"));
        sinonimi.put("jjrv", Set.of("xy", "jjrv"));
        sinonimi.put("ammnk", Set.of("ammnk", "zhpsw", "wk"));
        sinonimi.put("zhpsw", Set.of("ammnk", "zhpsw", "wk"));
        sinonimi.put("wk", Set.of("ammnk", "zhpsw", "wk"));
        sinonimi.put("spmwt", Set.of("spmwt"));
        sinonimi.put("qiml", Set.of("qiml"));
        sinonimi.put("ltjcf", Set.of("ltjcf", "vyoo", "ggi"));
        sinonimi.put("vyoo", Set.of("ltjcf", "vyoo", "ggi"));
        sinonimi.put("ggi", Set.of("ltjcf", "vyoo", "ggi"));
        sinonimi.put("fz", Set.of("fz", "omp", "mr"));
        sinonimi.put("omp", Set.of("fz", "omp", "mr"));
        sinonimi.put("mr", Set.of("fz", "omp", "mr"));
        sinonimi.put("w", Set.of("w"));
        sinonimi.put("ejuw", Set.of("ejuw", "sprcz", "adzm"));
        sinonimi.put("sprcz", Set.of("ejuw", "sprcz", "adzm"));
        sinonimi.put("adzm", Set.of("ejuw", "sprcz", "adzm"));
        sinonimi.put("bp", Set.of("bp", "jmj", "cunn"));
        sinonimi.put("jmj", Set.of("bp", "jmj", "cunn"));
        sinonimi.put("cunn", Set.of("bp", "jmj", "cunn"));
        sinonimi.put("mocm", Set.of("mocm", "xqoc", "ao"));
        sinonimi.put("xqoc", Set.of("mocm", "xqoc", "ao"));
        sinonimi.put("ao", Set.of("mocm", "xqoc", "ao"));
        sinonimi.put("mw", Set.of("mw", "r", "kaxla", "datou"));
        sinonimi.put("r", Set.of("mw", "r", "kaxla", "datou"));
        sinonimi.put("kaxla", Set.of("mw", "r", "kaxla", "datou"));
        sinonimi.put("datou", Set.of("mw", "r", "kaxla", "datou"));
        sinonimi.put("pl", Set.of("pl", "htvrs", "saciv"));
        sinonimi.put("htvrs", Set.of("pl", "htvrs", "saciv"));
        sinonimi.put("saciv", Set.of("pl", "htvrs", "saciv"));
        sinonimi.put("bj", Set.of("bj", "wttqk"));
        sinonimi.put("wttqk", Set.of("bj", "wttqk"));
        sinonimi.put("yqnvz", Set.of("yqnvz", "bmu", "vkddm"));
        sinonimi.put("bmu", Set.of("yqnvz", "bmu", "vkddm"));
        sinonimi.put("vkddm", Set.of("yqnvz", "bmu", "vkddm"));
        sinonimi.put("dyal", Set.of("dyal", "bwg", "hy"));
        sinonimi.put("bwg", Set.of("dyal", "bwg", "hy"));
        sinonimi.put("hy", Set.of("dyal", "bwg", "hy"));
        sinonimi.put("ktuhm", Set.of("ktuhm"));
        sinonimi.put("mhx", Set.of("mhx", "zkyso", "trfsa"));
        sinonimi.put("zkyso", Set.of("mhx", "zkyso", "trfsa"));
        sinonimi.put("trfsa", Set.of("mhx", "zkyso", "trfsa"));
        sinonimi.put("lmwu", Set.of("lmwu", "suomd"));
        sinonimi.put("suomd", Set.of("lmwu", "suomd"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
