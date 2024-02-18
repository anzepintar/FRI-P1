
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        String zacetno = "q13";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q3");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q9");
        sprejemna.add("q10");
        sprejemna.add("q12");
        sprejemna.add("q13");

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
        prehodi.put("q12", new HashMap<>());
        prehodi.put("q13", new HashMap<>());
        prehodi.get("q0").put('a', "q3");
        prehodi.get("q0").put('b', "q9");
        prehodi.get("q0").put('c', "q2");
        prehodi.get("q0").put('d', "q5");
        prehodi.get("q1").put('b', "q7");
        prehodi.get("q1").put('c', "q3");
        prehodi.get("q1").put('d', "q2");
        prehodi.get("q2").put('a', "q9");
        prehodi.get("q2").put('c', "q6");
        prehodi.get("q2").put('d', "q13");
        prehodi.get("q3").put('a', "q4");
        prehodi.get("q3").put('d', "q3");
        prehodi.get("q4").put('a', "q1");
        prehodi.get("q4").put('b', "q9");
        prehodi.get("q4").put('c', "q11");
        prehodi.get("q4").put('d', "q13");
        prehodi.get("q5").put('a', "q0");
        prehodi.get("q5").put('b', "q2");
        prehodi.get("q5").put('c', "q13");
        prehodi.get("q5").put('d', "q5");
        prehodi.get("q6").put('a', "q4");
        prehodi.get("q6").put('b', "q12");
        prehodi.get("q6").put('c', "q5");
        prehodi.get("q6").put('d', "q7");
        prehodi.get("q7").put('a', "q6");
        prehodi.get("q7").put('b', "q11");
        prehodi.get("q7").put('c', "q4");
        prehodi.get("q7").put('d', "q8");
        prehodi.get("q8").put('a', "q11");
        prehodi.get("q8").put('b', "q3");
        prehodi.get("q8").put('d', "q13");
        prehodi.get("q9").put('a', "q11");
        prehodi.get("q9").put('b', "q13");
        prehodi.get("q9").put('c', "q7");
        prehodi.get("q9").put('d', "q4");
        prehodi.get("q10").put('a', "q1");
        prehodi.get("q10").put('b', "q2");
        prehodi.get("q10").put('c', "q13");
        prehodi.get("q10").put('d', "q6");
        prehodi.get("q11").put('a', "q4");
        prehodi.get("q11").put('b', "q3");
        prehodi.get("q11").put('d', "q12");
        prehodi.get("q12").put('a', "q9");
        prehodi.get("q12").put('b', "q8");
        prehodi.get("q12").put('c', "q2");
        prehodi.get("q12").put('d', "q5");
        prehodi.get("q13").put('a', "q6");
        prehodi.get("q13").put('c', "q0");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("acbcd"));
        System.out.println(avtomat.kam("ccaabac"));
        System.out.println(avtomat.kam("abcdcdc"));
        System.out.println(avtomat.kam("acab"));
        System.out.println(avtomat.kam("cdd"));
        System.out.println(avtomat.kam("cdccad"));
        System.out.println(avtomat.kam("abccbac"));
        System.out.println(avtomat.kam("cddacd"));
        System.out.println(avtomat.kam("aacdc"));
        System.out.println(avtomat.kam("cbaacda"));
        System.out.println(avtomat.kam("cdccddc"));
    }
}
