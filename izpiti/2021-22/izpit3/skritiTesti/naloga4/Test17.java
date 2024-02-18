
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        String zacetno = "q1";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q3");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q7");
        sprejemna.add("q10");
        sprejemna.add("q11");
        sprejemna.add("q12");
        sprejemna.add("q13");
        sprejemna.add("q14");
        sprejemna.add("q15");
        sprejemna.add("q16");

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
        prehodi.put("q15", new HashMap<>());
        prehodi.put("q16", new HashMap<>());
        prehodi.get("q0").put('b', "q8");
        prehodi.get("q0").put('c', "q13");
        prehodi.get("q0").put('d', "q6");
        prehodi.get("q1").put('a', "q14");
        prehodi.get("q1").put('c', "q9");
        prehodi.get("q1").put('d', "q16");
        prehodi.get("q2").put('a', "q15");
        prehodi.get("q2").put('b', "q4");
        prehodi.get("q2").put('d', "q5");
        prehodi.get("q3").put('a', "q1");
        prehodi.get("q3").put('b', "q5");
        prehodi.get("q3").put('c', "q12");
        prehodi.get("q3").put('d', "q4");
        prehodi.get("q4").put('a', "q14");
        prehodi.get("q4").put('b', "q11");
        prehodi.get("q4").put('d', "q16");
        prehodi.get("q5").put('a', "q8");
        prehodi.get("q5").put('b', "q4");
        prehodi.get("q6").put('a', "q9");
        prehodi.get("q6").put('b', "q15");
        prehodi.get("q6").put('c', "q8");
        prehodi.get("q6").put('d', "q7");
        prehodi.get("q7").put('a', "q11");
        prehodi.get("q7").put('b', "q13");
        prehodi.get("q7").put('d', "q6");
        prehodi.get("q8").put('a', "q3");
        prehodi.get("q8").put('b', "q10");
        prehodi.get("q8").put('c', "q13");
        prehodi.get("q9").put('b', "q1");
        prehodi.get("q9").put('c', "q16");
        prehodi.get("q9").put('d', "q14");
        prehodi.get("q10").put('a', "q1");
        prehodi.get("q10").put('b', "q15");
        prehodi.get("q10").put('c', "q2");
        prehodi.get("q10").put('d', "q13");
        prehodi.get("q11").put('b', "q1");
        prehodi.get("q11").put('c', "q3");
        prehodi.get("q11").put('d', "q8");
        prehodi.get("q12").put('b', "q2");
        prehodi.get("q12").put('c', "q1");
        prehodi.get("q12").put('d', "q10");
        prehodi.get("q13").put('a', "q0");
        prehodi.get("q13").put('b', "q9");
        prehodi.get("q13").put('c', "q6");
        prehodi.get("q14").put('a', "q2");
        prehodi.get("q14").put('b', "q14");
        prehodi.get("q14").put('d', "q4");
        prehodi.get("q15").put('a', "q10");
        prehodi.get("q15").put('d', "q3");
        prehodi.get("q16").put('a', "q10");
        prehodi.get("q16").put('c', "q11");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("ccaacdb"));
        System.out.println(avtomat.kam("cdaad"));
        System.out.println(avtomat.kam("cbdadc"));
        System.out.println(avtomat.kam("abdaba"));
        System.out.println(avtomat.kam("adadd"));
        System.out.println(avtomat.kam("dacba"));
        System.out.println(avtomat.kam("aadbadd"));
        System.out.println(avtomat.kam("addcdcc"));
        System.out.println(avtomat.kam("cddaad"));
        System.out.println(avtomat.kam("dacbaad"));
        System.out.println(avtomat.kam("adaaadd"));
    }
}
