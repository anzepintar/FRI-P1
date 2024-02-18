
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        String zacetno = "q6";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q0");
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q7");
        sprejemna.add("q8");
        sprejemna.add("q9");
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
        prehodi.get("q0").put('b', "q7");
        prehodi.get("q0").put('c', "q10");
        prehodi.get("q0").put('d', "q4");
        prehodi.get("q1").put('a', "q9");
        prehodi.get("q1").put('c', "q4");
        prehodi.get("q1").put('d', "q1");
        prehodi.get("q2").put('a', "q6");
        prehodi.get("q2").put('b', "q1");
        prehodi.get("q2").put('c', "q9");
        prehodi.get("q3").put('b', "q8");
        prehodi.get("q3").put('c', "q5");
        prehodi.get("q3").put('d', "q4");
        prehodi.get("q4").put('b', "q1");
        prehodi.get("q4").put('d', "q7");
        prehodi.get("q5").put('a', "q5");
        prehodi.get("q5").put('c', "q2");
        prehodi.get("q5").put('d', "q8");
        prehodi.get("q6").put('a', "q9");
        prehodi.get("q6").put('b', "q3");
        prehodi.get("q6").put('c', "q11");
        prehodi.get("q6").put('d', "q7");
        prehodi.get("q7").put('a', "q3");
        prehodi.get("q7").put('b', "q1");
        prehodi.get("q7").put('d', "q11");
        prehodi.get("q8").put('a', "q3");
        prehodi.get("q8").put('c', "q6");
        prehodi.get("q9").put('a', "q4");
        prehodi.get("q9").put('b', "q6");
        prehodi.get("q9").put('c', "q5");
        prehodi.get("q10").put('a', "q2");
        prehodi.get("q10").put('c', "q6");
        prehodi.get("q10").put('d', "q7");
        prehodi.get("q11").put('a', "q9");
        prehodi.get("q11").put('b', "q3");
        prehodi.get("q11").put('c', "q4");
        prehodi.get("q11").put('d', "q1");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("cddaabc"));
        System.out.println(avtomat.kam("cbddadb"));
        System.out.println(avtomat.kam("aabdcba"));
        System.out.println(avtomat.kam("bdbabdd"));
        System.out.println(avtomat.kam("cdaadad"));
        System.out.println(avtomat.kam("cddabb"));
        System.out.println(avtomat.kam("ccddabb"));
        System.out.println(avtomat.kam("ababac"));
        System.out.println(avtomat.kam("bccacbd"));
        System.out.println(avtomat.kam("cdcdda"));
        System.out.println(avtomat.kam("cacda"));
        System.out.println(avtomat.kam("ccdbac"));
        System.out.println(avtomat.kam("ccddcd"));
        System.out.println(avtomat.kam("ccdbcd"));
    }
}
