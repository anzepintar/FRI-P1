
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        String zacetno = "q3";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q2");
        sprejemna.add("q4");
        sprejemna.add("q6");
        sprejemna.add("q8");
        sprejemna.add("q9");
        sprejemna.add("q10");

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
        prehodi.get("q0").put('a', "q6");
        prehodi.get("q0").put('c', "q2");
        prehodi.get("q1").put('a', "q3");
        prehodi.get("q1").put('d', "q5");
        prehodi.get("q2").put('a', "q3");
        prehodi.get("q2").put('c', "q9");
        prehodi.get("q2").put('d', "q7");
        prehodi.get("q3").put('b', "q7");
        prehodi.get("q3").put('c', "q8");
        prehodi.get("q3").put('d', "q9");
        prehodi.get("q4").put('d', "q2");
        prehodi.get("q5").put('a', "q0");
        prehodi.get("q5").put('d', "q8");
        prehodi.get("q6").put('a', "q1");
        prehodi.get("q6").put('b', "q0");
        prehodi.get("q6").put('c', "q2");
        prehodi.get("q7").put('c', "q6");
        prehodi.get("q7").put('d', "q8");
        prehodi.get("q8").put('b', "q6");
        prehodi.get("q8").put('d', "q10");
        prehodi.get("q9").put('d', "q8");
        prehodi.get("q10").put('a', "q10");
        prehodi.get("q10").put('b', "q7");
        prehodi.get("q10").put('c', "q9");
        prehodi.get("q10").put('d', "q3");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("ddbbccd"));
        System.out.println(avtomat.kam("cddcbaab"));
        System.out.println(avtomat.kam("cbbabaaa"));
        System.out.println(avtomat.kam("ddbbaad"));
        System.out.println(avtomat.kam("ddddbcb"));
        System.out.println(avtomat.kam("bddbca"));
        System.out.println(avtomat.kam("cdadcdab"));
        System.out.println(avtomat.kam("dddadcbc"));
        System.out.println(avtomat.kam("cbcddda"));
        System.out.println(avtomat.kam("cddbcccd"));
        System.out.println(avtomat.kam("bcbcddbc"));
        System.out.println(avtomat.kam("bccaddbcc"));
        System.out.println(avtomat.kam("cdaaabca"));
        System.out.println(avtomat.kam("bddabcb"));
        System.out.println(avtomat.kam("bcbacacdc"));
        System.out.println(avtomat.kam("bdbaddb"));
    }
}
