
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        String zacetno = "q13";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q0");
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
        prehodi.put("q12", new HashMap<>());
        prehodi.put("q13", new HashMap<>());
        prehodi.put("q14", new HashMap<>());
        prehodi.get("q0").put('b', "q3");
        prehodi.get("q0").put('c', "q10");
        prehodi.get("q0").put('d', "q12");
        prehodi.get("q1").put('a', "q14");
        prehodi.get("q1").put('b', "q13");
        prehodi.get("q1").put('c', "q6");
        prehodi.get("q1").put('d', "q1");
        prehodi.get("q2").put('a', "q10");
        prehodi.get("q2").put('b', "q0");
        prehodi.get("q2").put('c', "q14");
        prehodi.get("q2").put('d', "q9");
        prehodi.get("q3").put('a', "q2");
        prehodi.get("q3").put('b', "q8");
        prehodi.get("q3").put('c', "q4");
        prehodi.get("q3").put('d', "q11");
        prehodi.get("q4").put('a', "q14");
        prehodi.get("q4").put('b', "q7");
        prehodi.get("q4").put('c', "q1");
        prehodi.get("q4").put('d', "q9");
        prehodi.get("q5").put('a', "q4");
        prehodi.get("q5").put('b', "q8");
        prehodi.get("q5").put('c', "q13");
        prehodi.get("q5").put('d', "q2");
        prehodi.get("q6").put('a', "q9");
        prehodi.get("q6").put('b', "q0");
        prehodi.get("q6").put('c', "q5");
        prehodi.get("q6").put('d', "q14");
        prehodi.get("q7").put('a', "q6");
        prehodi.get("q7").put('b', "q4");
        prehodi.get("q7").put('c', "q8");
        prehodi.get("q7").put('d', "q5");
        prehodi.get("q8").put('a', "q8");
        prehodi.get("q8").put('b', "q7");
        prehodi.get("q8").put('c', "q12");
        prehodi.get("q8").put('d', "q14");
        prehodi.get("q9").put('a', "q4");
        prehodi.get("q9").put('b', "q11");
        prehodi.get("q9").put('c', "q2");
        prehodi.get("q9").put('d', "q13");
        prehodi.get("q10").put('a', "q11");
        prehodi.get("q10").put('b', "q4");
        prehodi.get("q10").put('c', "q9");
        prehodi.get("q10").put('d', "q2");
        prehodi.get("q11").put('a', "q3");
        prehodi.get("q11").put('b', "q10");
        prehodi.get("q11").put('c', "q8");
        prehodi.get("q11").put('d', "q11");
        prehodi.get("q12").put('a', "q11");
        prehodi.get("q12").put('b', "q14");
        prehodi.get("q12").put('c', "q7");
        prehodi.get("q12").put('d', "q9");
        prehodi.get("q13").put('a', "q11");
        prehodi.get("q13").put('c', "q6");
        prehodi.get("q13").put('d', "q9");
        prehodi.get("q14").put('a', "q12");
        prehodi.get("q14").put('b', "q4");
        prehodi.get("q14").put('c', "q2");
        prehodi.get("q14").put('d', "q6");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("adddcd"));
        System.out.println(avtomat.kam("dbdbca"));
        System.out.println(avtomat.kam("daaacb"));
        System.out.println(avtomat.kam("accacd"));
        System.out.println(avtomat.kam("dccabc"));
        System.out.println(avtomat.kam("dacd"));
        System.out.println(avtomat.kam("dbbdda"));
        System.out.println(avtomat.kam("accbcd"));
        System.out.println(avtomat.kam("cacacc"));
        System.out.println(avtomat.kam("abadab"));
        System.out.println(avtomat.kam("aaacaa"));
        System.out.println(avtomat.kam("dc"));
        System.out.println(avtomat.kam("aacbcc"));
        System.out.println(avtomat.kam("ddabac"));
        System.out.println(avtomat.kam("dacaab"));
        System.out.println(avtomat.kam("abcdad"));
        System.out.println(avtomat.kam("cdacbb"));
    }
}
