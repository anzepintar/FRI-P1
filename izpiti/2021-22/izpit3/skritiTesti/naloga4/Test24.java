
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        String zacetno = "q5";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q2");
        sprejemna.add("q6");

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
        prehodi.get("q0").put('a', "q7");
        prehodi.get("q0").put('b', "q9");
        prehodi.get("q0").put('c', "q10");
        prehodi.get("q1").put('a', "q7");
        prehodi.get("q1").put('b', "q1");
        prehodi.get("q1").put('c', "q5");
        prehodi.get("q1").put('d', "q4");
        prehodi.get("q2").put('a', "q8");
        prehodi.get("q2").put('c', "q5");
        prehodi.get("q3").put('a', "q10");
        prehodi.get("q3").put('b', "q4");
        prehodi.get("q3").put('c', "q9");
        prehodi.get("q4").put('b', "q4");
        prehodi.get("q4").put('c', "q7");
        prehodi.get("q4").put('d', "q0");
        prehodi.get("q5").put('a', "q8");
        prehodi.get("q5").put('b', "q11");
        prehodi.get("q5").put('c', "q9");
        prehodi.get("q5").put('d', "q4");
        prehodi.get("q6").put('a', "q2");
        prehodi.get("q6").put('b', "q3");
        prehodi.get("q6").put('d', "q7");
        prehodi.get("q7").put('a', "q6");
        prehodi.get("q7").put('b', "q3");
        prehodi.get("q7").put('c', "q11");
        prehodi.get("q7").put('d', "q1");
        prehodi.get("q8").put('a', "q0");
        prehodi.get("q8").put('b', "q3");
        prehodi.get("q8").put('c', "q7");
        prehodi.get("q8").put('d', "q5");
        prehodi.get("q9").put('a', "q5");
        prehodi.get("q9").put('b', "q9");
        prehodi.get("q9").put('c', "q1");
        prehodi.get("q9").put('d', "q7");
        prehodi.get("q10").put('a', "q9");
        prehodi.get("q10").put('b', "q2");
        prehodi.get("q10").put('c', "q11");
        prehodi.get("q10").put('d', "q6");
        prehodi.get("q11").put('b', "q3");
        prehodi.get("q11").put('c', "q10");
        prehodi.get("q11").put('d', "q9");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("dbbdbb"));
        System.out.println(avtomat.kam("abadac"));
        System.out.println(avtomat.kam("ddcbacb"));
        System.out.println(avtomat.kam("ddacdad"));
        System.out.println(avtomat.kam("bbaadb"));
        System.out.println(avtomat.kam("cabddd"));
        System.out.println(avtomat.kam("cddbaa"));
        System.out.println(avtomat.kam("cadccd"));
        System.out.println(avtomat.kam("ddadbca"));
        System.out.println(avtomat.kam("abcbbc"));
        System.out.println(avtomat.kam("bdbca"));
    }
}
