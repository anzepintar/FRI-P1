
import java.util.*;

public class Test25 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ggiv", Set.of("ggiv", "zikpi"));
        sinonimi.put("zikpi", Set.of("ggiv", "zikpi"));
        sinonimi.put("ys", Set.of("ys"));
        sinonimi.put("vf", Set.of("vf"));
        sinonimi.put("fh", Set.of("fh", "kafs"));
        sinonimi.put("kafs", Set.of("fh", "kafs"));
        sinonimi.put("zvcit", Set.of("zvcit", "nmwv"));
        sinonimi.put("nmwv", Set.of("zvcit", "nmwv"));
        sinonimi.put("c", Set.of("c", "wk"));
        sinonimi.put("wk", Set.of("c", "wk"));
        sinonimi.put("lg", Set.of("lg"));
        sinonimi.put("zqs", Set.of("zqs", "u", "inyn"));
        sinonimi.put("u", Set.of("zqs", "u", "inyn"));
        sinonimi.put("inyn", Set.of("zqs", "u", "inyn"));
        sinonimi.put("v", Set.of("v", "wqv", "bu", "rxc"));
        sinonimi.put("wqv", Set.of("v", "wqv", "bu", "rxc"));
        sinonimi.put("bu", Set.of("v", "wqv", "bu", "rxc"));
        sinonimi.put("rxc", Set.of("v", "wqv", "bu", "rxc"));
        sinonimi.put("aww", Set.of("aww"));
        sinonimi.put("aq", Set.of("aq", "ww"));
        sinonimi.put("ww", Set.of("aq", "ww"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
