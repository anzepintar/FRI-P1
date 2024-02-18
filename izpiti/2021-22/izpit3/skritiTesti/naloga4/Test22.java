
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        String zacetno = "q6";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q2");
        sprejemna.add("q4");
        sprejemna.add("q6");
        sprejemna.add("q7");

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
        prehodi.get("q0").put('a', "q8");
        prehodi.get("q0").put('b', "q1");
        prehodi.get("q0").put('c', "q3");
        prehodi.get("q0").put('d', "q2");
        prehodi.get("q1").put('a', "q1");
        prehodi.get("q1").put('b', "q3");
        prehodi.get("q1").put('c', "q7");
        prehodi.get("q1").put('d', "q5");
        prehodi.get("q2").put('a', "q6");
        prehodi.get("q2").put('b', "q0");
        prehodi.get("q2").put('c', "q9");
        prehodi.get("q3").put('a', "q5");
        prehodi.get("q3").put('b', "q0");
        prehodi.get("q3").put('c', "q3");
        prehodi.get("q3").put('d', "q1");
        prehodi.get("q4").put('a', "q5");
        prehodi.get("q4").put('b', "q4");
        prehodi.get("q4").put('c', "q3");
        prehodi.get("q4").put('d', "q1");
        prehodi.get("q5").put('a', "q9");
        prehodi.get("q5").put('b', "q7");
        prehodi.get("q5").put('c', "q8");
        prehodi.get("q5").put('d', "q2");
        prehodi.get("q6").put('a', "q0");
        prehodi.get("q6").put('c', "q4");
        prehodi.get("q6").put('d', "q5");
        prehodi.get("q7").put('a', "q8");
        prehodi.get("q7").put('b', "q9");
        prehodi.get("q7").put('c', "q0");
        prehodi.get("q7").put('d', "q2");
        prehodi.get("q8").put('a', "q2");
        prehodi.get("q8").put('b', "q1");
        prehodi.get("q8").put('c', "q5");
        prehodi.get("q8").put('d', "q7");
        prehodi.get("q9").put('a', "q0");
        prehodi.get("q9").put('b', "q6");
        prehodi.get("q9").put('c', "q9");
        prehodi.get("q9").put('d', "q3");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("cacabc"));
        System.out.println(avtomat.kam("aaabc"));
        System.out.println(avtomat.kam("daadcb"));
        System.out.println(avtomat.kam("acdabc"));
        System.out.println(avtomat.kam("abdcab"));
        System.out.println(avtomat.kam("caabdc"));
        System.out.println(avtomat.kam("adccdd"));
        System.out.println(avtomat.kam("dccda"));
        System.out.println(avtomat.kam("abdbbd"));
        System.out.println(avtomat.kam("abbdab"));
        System.out.println(avtomat.kam("adcad"));
        System.out.println(avtomat.kam("dbcbc"));
        System.out.println(avtomat.kam("adadbd"));
        System.out.println(avtomat.kam("abbdcd"));
        System.out.println(avtomat.kam("cabcb"));
        System.out.println(avtomat.kam("adadab"));
        System.out.println(avtomat.kam("dbaac"));
    }
}
