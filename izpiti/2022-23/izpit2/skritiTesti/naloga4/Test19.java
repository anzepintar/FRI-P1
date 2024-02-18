
import java.util.*;

public class Test19 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("mbax", Set.of("mbax", "ix", "vofw"));
        sinonimi.put("ix", Set.of("mbax", "ix", "vofw"));
        sinonimi.put("vofw", Set.of("mbax", "ix", "vofw"));
        sinonimi.put("xk", Set.of("xk"));
        sinonimi.put("xrhkk", Set.of("xrhkk", "iwwo", "rwz"));
        sinonimi.put("iwwo", Set.of("xrhkk", "iwwo", "rwz"));
        sinonimi.put("rwz", Set.of("xrhkk", "iwwo", "rwz"));
        sinonimi.put("r", Set.of("r", "o"));
        sinonimi.put("o", Set.of("r", "o"));
        sinonimi.put("cf", Set.of("cf"));
        sinonimi.put("et", Set.of("et", "dyn"));
        sinonimi.put("dyn", Set.of("et", "dyn"));
        sinonimi.put("smjdt", Set.of("smjdt"));
        sinonimi.put("aync", Set.of("aync", "cuou", "umnuu"));
        sinonimi.put("cuou", Set.of("aync", "cuou", "umnuu"));
        sinonimi.put("umnuu", Set.of("aync", "cuou", "umnuu"));
        sinonimi.put("psy", Set.of("psy", "dd"));
        sinonimi.put("dd", Set.of("psy", "dd"));
        sinonimi.put("sljqn", Set.of("sljqn", "cvauq", "milaw"));
        sinonimi.put("cvauq", Set.of("sljqn", "cvauq", "milaw"));
        sinonimi.put("milaw", Set.of("sljqn", "cvauq", "milaw"));
        sinonimi.put("manz", Set.of("manz", "ci", "uu"));
        sinonimi.put("ci", Set.of("manz", "ci", "uu"));
        sinonimi.put("uu", Set.of("manz", "ci", "uu"));
        sinonimi.put("xco", Set.of("xco"));
        sinonimi.put("jabgp", Set.of("jabgp"));
        sinonimi.put("ia", Set.of("ia", "pfto", "aov", "byakr"));
        sinonimi.put("pfto", Set.of("ia", "pfto", "aov", "byakr"));
        sinonimi.put("aov", Set.of("ia", "pfto", "aov", "byakr"));
        sinonimi.put("byakr", Set.of("ia", "pfto", "aov", "byakr"));
        sinonimi.put("ztwak", Set.of("ztwak", "mel", "olge"));
        sinonimi.put("mel", Set.of("ztwak", "mel", "olge"));
        sinonimi.put("olge", Set.of("ztwak", "mel", "olge"));
        sinonimi.put("thv", Set.of("thv"));
        sinonimi.put("pagh", Set.of("pagh", "w"));
        sinonimi.put("w", Set.of("pagh", "w"));
        sinonimi.put("fa", Set.of("fa", "cene"));
        sinonimi.put("cene", Set.of("fa", "cene"));
        sinonimi.put("zv", Set.of("zv", "bkfx"));
        sinonimi.put("bkfx", Set.of("zv", "bkfx"));
        sinonimi.put("h", Set.of("h", "iwz", "rxs"));
        sinonimi.put("iwz", Set.of("h", "iwz", "rxs"));
        sinonimi.put("rxs", Set.of("h", "iwz", "rxs"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
