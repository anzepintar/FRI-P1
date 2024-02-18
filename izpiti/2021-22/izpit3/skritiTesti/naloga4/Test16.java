
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        String zacetno = "q5";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q8");

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
        prehodi.get("q0").put('a', "q3");
        prehodi.get("q0").put('c', "q4");
        prehodi.get("q0").put('d', "q10");
        prehodi.get("q1").put('a', "q5");
        prehodi.get("q1").put('b', "q7");
        prehodi.get("q1").put('c', "q1");
        prehodi.get("q1").put('d', "q6");
        prehodi.get("q2").put('a', "q5");
        prehodi.get("q2").put('b', "q6");
        prehodi.get("q2").put('c', "q2");
        prehodi.get("q2").put('d', "q0");
        prehodi.get("q3").put('a', "q8");
        prehodi.get("q3").put('b', "q5");
        prehodi.get("q3").put('d', "q3");
        prehodi.get("q4").put('a', "q10");
        prehodi.get("q4").put('b', "q4");
        prehodi.get("q4").put('d', "q1");
        prehodi.get("q5").put('a', "q9");
        prehodi.get("q5").put('b', "q7");
        prehodi.get("q5").put('d', "q2");
        prehodi.get("q6").put('a', "q0");
        prehodi.get("q6").put('b', "q5");
        prehodi.get("q6").put('c', "q9");
        prehodi.get("q6").put('d', "q3");
        prehodi.get("q7").put('a', "q0");
        prehodi.get("q7").put('b', "q2");
        prehodi.get("q7").put('c', "q9");
        prehodi.get("q7").put('d', "q4");
        prehodi.get("q8").put('a', "q6");
        prehodi.get("q8").put('b', "q10");
        prehodi.get("q8").put('c', "q3");
        prehodi.get("q9").put('b', "q6");
        prehodi.get("q9").put('d', "q9");
        prehodi.get("q10").put('a', "q0");
        prehodi.get("q10").put('b', "q3");
        prehodi.get("q10").put('c', "q10");
        prehodi.get("q10").put('d', "q1");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.jeSprejemno("q0"));
        System.out.println(avtomat.jeSprejemno("q1"));
        System.out.println(avtomat.jeSprejemno("q2"));
        System.out.println(avtomat.jeSprejemno("q3"));
        System.out.println(avtomat.jeSprejemno("q4"));
        System.out.println(avtomat.jeSprejemno("q5"));
        System.out.println(avtomat.jeSprejemno("q6"));
        System.out.println(avtomat.jeSprejemno("q7"));
        System.out.println(avtomat.jeSprejemno("q8"));
        System.out.println(avtomat.jeSprejemno("q9"));
        System.out.println(avtomat.jeSprejemno("q10"));
    }
}
