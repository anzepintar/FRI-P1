
import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ax", Set.of("ax", "rqm", "wosuy", "no"));
        sinonimi.put("rqm", Set.of("ax", "rqm", "wosuy", "no"));
        sinonimi.put("wosuy", Set.of("ax", "rqm", "wosuy", "no"));
        sinonimi.put("no", Set.of("ax", "rqm", "wosuy", "no"));
        sinonimi.put("uuub", Set.of("uuub"));
        sinonimi.put("fcf", Set.of("fcf", "thw"));
        sinonimi.put("thw", Set.of("fcf", "thw"));
        sinonimi.put("gqmu", Set.of("gqmu", "xhb", "pmuc", "ivggn"));
        sinonimi.put("xhb", Set.of("gqmu", "xhb", "pmuc", "ivggn"));
        sinonimi.put("pmuc", Set.of("gqmu", "xhb", "pmuc", "ivggn"));
        sinonimi.put("ivggn", Set.of("gqmu", "xhb", "pmuc", "ivggn"));
        sinonimi.put("xbaob", Set.of("xbaob", "vna"));
        sinonimi.put("vna", Set.of("xbaob", "vna"));
        sinonimi.put("z", Set.of("z", "lz", "pqec", "hs"));
        sinonimi.put("lz", Set.of("z", "lz", "pqec", "hs"));
        sinonimi.put("pqec", Set.of("z", "lz", "pqec", "hs"));
        sinonimi.put("hs", Set.of("z", "lz", "pqec", "hs"));
        sinonimi.put("obc", Set.of("obc"));
        sinonimi.put("zspq", Set.of("zspq", "lcyk", "actx", "ar"));
        sinonimi.put("lcyk", Set.of("zspq", "lcyk", "actx", "ar"));
        sinonimi.put("actx", Set.of("zspq", "lcyk", "actx", "ar"));
        sinonimi.put("ar", Set.of("zspq", "lcyk", "actx", "ar"));
        sinonimi.put("zssz", Set.of("zssz", "zrdr"));
        sinonimi.put("zrdr", Set.of("zssz", "zrdr"));
        sinonimi.put("lr", Set.of("lr", "dom", "zc", "u"));
        sinonimi.put("dom", Set.of("lr", "dom", "zc", "u"));
        sinonimi.put("zc", Set.of("lr", "dom", "zc", "u"));
        sinonimi.put("u", Set.of("lr", "dom", "zc", "u"));
        sinonimi.put("wq", Set.of("wq", "podni", "oso"));
        sinonimi.put("podni", Set.of("wq", "podni", "oso"));
        sinonimi.put("oso", Set.of("wq", "podni", "oso"));
        sinonimi.put("sqr", Set.of("sqr", "d", "r"));
        sinonimi.put("d", Set.of("sqr", "d", "r"));
        sinonimi.put("r", Set.of("sqr", "d", "r"));
        sinonimi.put("fccl", Set.of("fccl", "jtk", "syg", "wokv", "vfnc"));
        sinonimi.put("jtk", Set.of("fccl", "jtk", "syg", "wokv", "vfnc"));
        sinonimi.put("syg", Set.of("fccl", "jtk", "syg", "wokv", "vfnc"));
        sinonimi.put("wokv", Set.of("fccl", "jtk", "syg", "wokv", "vfnc"));
        sinonimi.put("vfnc", Set.of("fccl", "jtk", "syg", "wokv", "vfnc"));
        sinonimi.put("fiyrx", Set.of("fiyrx", "pa"));
        sinonimi.put("pa", Set.of("fiyrx", "pa"));
        sinonimi.put("ywqp", Set.of("ywqp"));
        sinonimi.put("woxj", Set.of("woxj", "mkgnh", "uml", "eyqus"));
        sinonimi.put("mkgnh", Set.of("woxj", "mkgnh", "uml", "eyqus"));
        sinonimi.put("uml", Set.of("woxj", "mkgnh", "uml", "eyqus"));
        sinonimi.put("eyqus", Set.of("woxj", "mkgnh", "uml", "eyqus"));
        sinonimi.put("th", Set.of("th"));
        sinonimi.put("afzj", Set.of("afzj", "mtnv", "wbouo", "eus"));
        sinonimi.put("mtnv", Set.of("afzj", "mtnv", "wbouo", "eus"));
        sinonimi.put("wbouo", Set.of("afzj", "mtnv", "wbouo", "eus"));
        sinonimi.put("eus", Set.of("afzj", "mtnv", "wbouo", "eus"));
        sinonimi.put("sb", Set.of("sb", "ku", "yuqtt"));
        sinonimi.put("ku", Set.of("sb", "ku", "yuqtt"));
        sinonimi.put("yuqtt", Set.of("sb", "ku", "yuqtt"));
        sinonimi.put("g", Set.of("g"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
