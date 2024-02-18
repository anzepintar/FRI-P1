
import java.util.*;

public class Test02 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("gehz", Set.of("gehz"));
        sinonimi.put("eb", Set.of("eb"));
        sinonimi.put("seo", Set.of("seo", "xiugb", "eba", "pupp"));
        sinonimi.put("xiugb", Set.of("seo", "xiugb", "eba", "pupp"));
        sinonimi.put("eba", Set.of("seo", "xiugb", "eba", "pupp"));
        sinonimi.put("pupp", Set.of("seo", "xiugb", "eba", "pupp"));
        sinonimi.put("qckv", Set.of("qckv"));
        sinonimi.put("nvyr", Set.of("nvyr", "zino"));
        sinonimi.put("zino", Set.of("nvyr", "zino"));
        sinonimi.put("mint", Set.of("mint", "lg"));
        sinonimi.put("lg", Set.of("mint", "lg"));
        sinonimi.put("ns", Set.of("ns"));
        sinonimi.put("zl", Set.of("zl"));
        sinonimi.put("zta", Set.of("zta"));
        sinonimi.put("xang", Set.of("xang", "gg"));
        sinonimi.put("gg", Set.of("xang", "gg"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
