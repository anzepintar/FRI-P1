
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        String zacetno = "q8";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q7");
        sprejemna.add("q9");
        sprejemna.add("q11");
        sprejemna.add("q12");
        sprejemna.add("q13");
        sprejemna.add("q15");
        sprejemna.add("q17");

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
        prehodi.put("q17", new HashMap<>());
        prehodi.get("q0").put('a', "q11");
        prehodi.get("q0").put('b', "q14");
        prehodi.get("q0").put('c', "q12");
        prehodi.get("q0").put('d', "q3");
        prehodi.get("q1").put('a', "q8");
        prehodi.get("q1").put('b', "q3");
        prehodi.get("q1").put('c', "q6");
        prehodi.get("q1").put('d', "q4");
        prehodi.get("q2").put('c', "q8");
        prehodi.get("q2").put('d', "q12");
        prehodi.get("q3").put('a', "q9");
        prehodi.get("q3").put('b', "q4");
        prehodi.get("q3").put('c', "q3");
        prehodi.get("q3").put('d', "q0");
        prehodi.get("q4").put('a', "q17");
        prehodi.get("q4").put('b', "q5");
        prehodi.get("q4").put('c', "q13");
        prehodi.get("q4").put('d', "q3");
        prehodi.get("q5").put('a', "q10");
        prehodi.get("q5").put('b', "q16");
        prehodi.get("q5").put('c', "q5");
        prehodi.get("q5").put('d', "q8");
        prehodi.get("q6").put('a', "q16");
        prehodi.get("q6").put('b', "q0");
        prehodi.get("q6").put('c', "q6");
        prehodi.get("q6").put('d', "q17");
        prehodi.get("q7").put('a', "q10");
        prehodi.get("q7").put('b', "q6");
        prehodi.get("q7").put('c', "q11");
        prehodi.get("q7").put('d', "q3");
        prehodi.get("q8").put('a', "q6");
        prehodi.get("q8").put('c', "q5");
        prehodi.get("q8").put('d', "q7");
        prehodi.get("q9").put('c', "q6");
        prehodi.get("q9").put('d', "q5");
        prehodi.get("q10").put('a', "q7");
        prehodi.get("q10").put('b', "q16");
        prehodi.get("q10").put('c', "q4");
        prehodi.get("q10").put('d', "q11");
        prehodi.get("q11").put('a', "q10");
        prehodi.get("q11").put('c', "q8");
        prehodi.get("q11").put('d', "q3");
        prehodi.get("q12").put('a', "q5");
        prehodi.get("q12").put('b', "q12");
        prehodi.get("q12").put('c', "q17");
        prehodi.get("q12").put('d', "q2");
        prehodi.get("q13").put('a', "q14");
        prehodi.get("q13").put('b', "q16");
        prehodi.get("q13").put('c', "q6");
        prehodi.get("q13").put('d', "q2");
        prehodi.get("q14").put('a', "q1");
        prehodi.get("q14").put('b', "q2");
        prehodi.get("q14").put('d', "q14");
        prehodi.get("q15").put('a', "q9");
        prehodi.get("q15").put('c', "q17");
        prehodi.get("q15").put('d', "q13");
        prehodi.get("q16").put('a', "q11");
        prehodi.get("q16").put('b', "q8");
        prehodi.get("q16").put('c', "q14");
        prehodi.get("q16").put('d', "q5");
        prehodi.get("q17").put('a', "q15");
        prehodi.get("q17").put('b', "q6");
        prehodi.get("q17").put('c', "q17");
        prehodi.get("q17").put('d', "q2");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("daaa"));
        System.out.println(avtomat.kam("daccccc"));
        System.out.println(avtomat.kam("cbdddc"));
        System.out.println(avtomat.kam("dbadcb"));
        System.out.println(avtomat.kam("acdbbc"));
        System.out.println(avtomat.kam("accad"));
        System.out.println(avtomat.kam("dcabdb"));
        System.out.println(avtomat.kam("aadaa"));
        System.out.println(avtomat.kam("dbcdcb"));
        System.out.println(avtomat.kam("acdcdc"));
    }
}
