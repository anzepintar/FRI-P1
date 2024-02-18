
import java.util.*;

public class Test21 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("agyf", Set.of("agyf", "lwit"));
        sinonimi.put("lwit", Set.of("agyf", "lwit"));
        sinonimi.put("soti", Set.of("soti", "xvwp"));
        sinonimi.put("xvwp", Set.of("soti", "xvwp"));
        sinonimi.put("xea", Set.of("xea", "pdqu", "vf"));
        sinonimi.put("pdqu", Set.of("xea", "pdqu", "vf"));
        sinonimi.put("vf", Set.of("xea", "pdqu", "vf"));
        sinonimi.put("ffir", Set.of("ffir"));
        sinonimi.put("uh", Set.of("uh", "vgvzn", "mw", "ibu", "scc"));
        sinonimi.put("vgvzn", Set.of("uh", "vgvzn", "mw", "ibu", "scc"));
        sinonimi.put("mw", Set.of("uh", "vgvzn", "mw", "ibu", "scc"));
        sinonimi.put("ibu", Set.of("uh", "vgvzn", "mw", "ibu", "scc"));
        sinonimi.put("scc", Set.of("uh", "vgvzn", "mw", "ibu", "scc"));
        sinonimi.put("yhr", Set.of("yhr"));
        sinonimi.put("orddi", Set.of("orddi", "ea"));
        sinonimi.put("ea", Set.of("orddi", "ea"));
        sinonimi.put("ftj", Set.of("ftj"));
        sinonimi.put("jbxu", Set.of("jbxu", "nldya", "zn", "ucvjc"));
        sinonimi.put("nldya", Set.of("jbxu", "nldya", "zn", "ucvjc"));
        sinonimi.put("zn", Set.of("jbxu", "nldya", "zn", "ucvjc"));
        sinonimi.put("ucvjc", Set.of("jbxu", "nldya", "zn", "ucvjc"));
        sinonimi.put("u", Set.of("u"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
