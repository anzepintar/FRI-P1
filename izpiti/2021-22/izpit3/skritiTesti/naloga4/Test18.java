
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        String zacetno = "q0";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q0");
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q8");
        sprejemna.add("q9");

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
        prehodi.get("q0").put('b', "q3");
        prehodi.get("q1").put('b', "q1");
        prehodi.get("q1").put('c', "q5");
        prehodi.get("q2").put('a', "q1");
        prehodi.get("q2").put('b', "q3");
        prehodi.get("q3").put('c', "q2");
        prehodi.get("q3").put('d', "q7");
        prehodi.get("q4").put('b', "q6");
        prehodi.get("q5").put('a', "q5");
        prehodi.get("q5").put('b', "q3");
        prehodi.get("q5").put('c', "q6");
        prehodi.get("q5").put('d', "q9");
        prehodi.get("q6").put('a', "q3");
        prehodi.get("q6").put('c', "q1");
        prehodi.get("q6").put('d', "q4");
        prehodi.get("q7").put('a', "q2");
        prehodi.get("q7").put('c', "q5");
        prehodi.get("q7").put('d', "q8");
        prehodi.get("q8").put('c', "q1");
        prehodi.get("q8").put('d', "q5");
        prehodi.get("q9").put('a', "q4");
        prehodi.get("q9").put('c', "q7");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("bdcaacdbd"));
        System.out.println(avtomat.kam("bddcbbcad"));
        System.out.println(avtomat.kam("bcacccbbb"));
        System.out.println(avtomat.kam("bdaabbccd"));
        System.out.println(avtomat.kam("bdccacbda"));
        System.out.println(avtomat.kam("bdaaccccc"));
        System.out.println(avtomat.kam("bdabcbdc"));
        System.out.println(avtomat.kam("bdcbddd"));
        System.out.println(avtomat.kam("bcabcaaa"));
        System.out.println(avtomat.kam("bdcdabcb"));
        System.out.println(avtomat.kam("bcacdcdd"));
        System.out.println(avtomat.kam("bdabdddc"));
        System.out.println(avtomat.kam("bdddbdab"));
        System.out.println(avtomat.kam("bdcbcacca"));
    }
}
