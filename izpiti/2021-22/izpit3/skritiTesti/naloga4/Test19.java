
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        String zacetno = "q8";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q0");
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q5");
        sprejemna.add("q8");
        sprejemna.add("q9");
        sprejemna.add("q10");
        sprejemna.add("q12");

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
        prehodi.get("q0").put('a', "q12");
        prehodi.get("q0").put('b', "q3");
        prehodi.get("q0").put('c', "q6");
        prehodi.get("q2").put('a', "q12");
        prehodi.get("q2").put('b', "q4");
        prehodi.get("q2").put('c', "q5");
        prehodi.get("q3").put('a', "q9");
        prehodi.get("q3").put('b', "q8");
        prehodi.get("q3").put('d', "q6");
        prehodi.get("q4").put('d', "q5");
        prehodi.get("q5").put('a', "q11");
        prehodi.get("q5").put('c', "q2");
        prehodi.get("q6").put('a', "q0");
        prehodi.get("q6").put('c', "q1");
        prehodi.get("q7").put('c', "q2");
        prehodi.get("q7").put('d', "q12");
        prehodi.get("q8").put('a', "q2");
        prehodi.get("q8").put('c', "q10");
        prehodi.get("q8").put('d', "q13");
        prehodi.get("q9").put('a', "q7");
        prehodi.get("q9").put('b', "q13");
        prehodi.get("q9").put('c', "q2");
        prehodi.get("q10").put('d', "q1");
        prehodi.get("q11").put('a', "q6");
        prehodi.get("q11").put('b', "q7");
        prehodi.get("q11").put('c', "q11");
        prehodi.get("q11").put('d', "q4");
        prehodi.get("q12").put('c', "q3");
        prehodi.get("q12").put('d', "q2");
        prehodi.get("q13").put('b', "q10");
        prehodi.get("q13").put('c', "q9");
        prehodi.get("q13").put('d', "q13");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("aacaaddc"));
        System.out.println(avtomat.kam("dcbddcca"));
        System.out.println(avtomat.kam("dccacdc"));
        System.out.println(avtomat.kam("aacabddcc"));
        System.out.println(avtomat.kam("aadcacbcb"));
        System.out.println(avtomat.kam("abdabdcda"));
        System.out.println(avtomat.kam("accccacac"));
        System.out.println(avtomat.kam("ddcbdcca"));
        System.out.println(avtomat.kam("acaccc"));
        System.out.println(avtomat.kam("aacabdb"));
        System.out.println(avtomat.kam("aadcccad"));
        System.out.println(avtomat.kam("ddcacaca"));
        System.out.println(avtomat.kam("abdcadccb"));
        System.out.println(avtomat.kam("ddddddb"));
        System.out.println(avtomat.kam("abdcccacb"));
    }
}
