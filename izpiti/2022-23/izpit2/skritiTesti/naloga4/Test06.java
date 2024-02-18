
import java.util.*;

public class Test06 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("eol", Set.of("eol"));
        sinonimi.put("cq", Set.of("cq", "hbzd", "f"));
        sinonimi.put("hbzd", Set.of("cq", "hbzd", "f"));
        sinonimi.put("f", Set.of("cq", "hbzd", "f"));
        sinonimi.put("def", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("mg", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("ztzi", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("ildvp", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("udvf", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("mgml", Set.of("def", "mg", "ztzi", "ildvp", "udvf", "mgml"));
        sinonimi.put("tgrj", Set.of("tgrj", "ykx", "todr", "rrdo", "gexa"));
        sinonimi.put("ykx", Set.of("tgrj", "ykx", "todr", "rrdo", "gexa"));
        sinonimi.put("todr", Set.of("tgrj", "ykx", "todr", "rrdo", "gexa"));
        sinonimi.put("rrdo", Set.of("tgrj", "ykx", "todr", "rrdo", "gexa"));
        sinonimi.put("gexa", Set.of("tgrj", "ykx", "todr", "rrdo", "gexa"));
        sinonimi.put("wx", Set.of("wx", "k"));
        sinonimi.put("k", Set.of("wx", "k"));
        sinonimi.put("syzrj", Set.of("syzrj", "lv"));
        sinonimi.put("lv", Set.of("syzrj", "lv"));
        sinonimi.put("glfa", Set.of("glfa"));
        sinonimi.put("iaiql", Set.of("iaiql", "x", "uuds", "vn"));
        sinonimi.put("x", Set.of("iaiql", "x", "uuds", "vn"));
        sinonimi.put("uuds", Set.of("iaiql", "x", "uuds", "vn"));
        sinonimi.put("vn", Set.of("iaiql", "x", "uuds", "vn"));
        sinonimi.put("fz", Set.of("fz", "myf", "szvma", "rsoad"));
        sinonimi.put("myf", Set.of("fz", "myf", "szvma", "rsoad"));
        sinonimi.put("szvma", Set.of("fz", "myf", "szvma", "rsoad"));
        sinonimi.put("rsoad", Set.of("fz", "myf", "szvma", "rsoad"));
        sinonimi.put("n", Set.of("n", "kdlp", "kdj", "nm"));
        sinonimi.put("kdlp", Set.of("n", "kdlp", "kdj", "nm"));
        sinonimi.put("kdj", Set.of("n", "kdlp", "kdj", "nm"));
        sinonimi.put("nm", Set.of("n", "kdlp", "kdj", "nm"));
        sinonimi.put("uto", Set.of("uto", "aagxj", "fl", "se", "qyiel"));
        sinonimi.put("aagxj", Set.of("uto", "aagxj", "fl", "se", "qyiel"));
        sinonimi.put("fl", Set.of("uto", "aagxj", "fl", "se", "qyiel"));
        sinonimi.put("se", Set.of("uto", "aagxj", "fl", "se", "qyiel"));
        sinonimi.put("qyiel", Set.of("uto", "aagxj", "fl", "se", "qyiel"));
        sinonimi.put("fsqzg", Set.of("fsqzg", "vdli", "blibb", "kwo"));
        sinonimi.put("vdli", Set.of("fsqzg", "vdli", "blibb", "kwo"));
        sinonimi.put("blibb", Set.of("fsqzg", "vdli", "blibb", "kwo"));
        sinonimi.put("kwo", Set.of("fsqzg", "vdli", "blibb", "kwo"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
