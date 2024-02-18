
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        String zacetno = "q2";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q0");
        sprejemna.add("q1");
        sprejemna.add("q6");
        sprejemna.add("q7");
        sprejemna.add("q10");
        sprejemna.add("q11");

        Map<String, Map<Character, String>> prehodi = new HashMap<>();
        prehodi.put("q0", new HashMap<>());
        prehodi.put("q1", new HashMap<>());
        prehodi.put("q2", new HashMap<>());
        prehodi.put("q3", new HashMap<>());
        prehodi.put("q4", new HashMap<>());
        prehodi.put("q5", new HashMap<>());
        prehodi.put("q6", new HashMap<>());
        prehodi.put("q7", new HashMap<>());
        prehodi.put("q8", new HashMap<>());
        prehodi.put("q9", new HashMap<>());
        prehodi.put("q10", new HashMap<>());
        prehodi.put("q11", new HashMap<>());
        prehodi.get("q0").put('b', "q10");
        prehodi.get("q1").put('a', "q0");
        prehodi.get("q2").put('c', "q3");
        prehodi.get("q3").put('b', "q11");
        prehodi.get("q4").put('d', "q2");
        prehodi.get("q5").put('a', "q6");
        prehodi.get("q5").put('b', "q10");
        prehodi.get("q6").put('b', "q4");
        prehodi.get("q7").put('a', "q8");
        prehodi.get("q9").put('a', "q1");
        prehodi.get("q10").put('a', "q5");
        prehodi.get("q11").put('b', "q7");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("cb"));
        System.out.println(avtomat.kam("c"));
        System.out.println(avtomat.kam(""));
        System.out.println(avtomat.kam("cbba"));
        System.out.println(avtomat.kam("cbb"));
    }
}
