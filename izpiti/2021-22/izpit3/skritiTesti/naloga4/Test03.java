
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        String zacetno = "q3";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q3");
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
        prehodi.put("q10", new HashMap<>());
        prehodi.put("q11", new HashMap<>());
        prehodi.get("q0").put('a', "q6");
        prehodi.get("q0").put('b', "q3");
        prehodi.get("q0").put('c', "q1");
        prehodi.get("q0").put('d', "q10");
        prehodi.get("q1").put('a', "q11");
        prehodi.get("q1").put('b', "q1");
        prehodi.get("q1").put('c', "q7");
        prehodi.get("q1").put('d', "q8");
        prehodi.get("q2").put('b', "q0");
        prehodi.get("q2").put('c', "q6");
        prehodi.get("q2").put('d', "q9");
        prehodi.get("q3").put('a', "q1");
        prehodi.get("q3").put('b', "q6");
        prehodi.get("q3").put('d', "q4");
        prehodi.get("q4").put('a', "q11");
        prehodi.get("q4").put('c', "q3");
        prehodi.get("q4").put('d', "q8");
        prehodi.get("q5").put('b', "q6");
        prehodi.get("q5").put('c', "q8");
        prehodi.get("q5").put('d', "q2");
        prehodi.get("q6").put('a', "q1");
        prehodi.get("q6").put('b', "q9");
        prehodi.get("q6").put('c', "q5");
        prehodi.get("q6").put('d', "q7");
        prehodi.get("q7").put('a', "q4");
        prehodi.get("q7").put('b', "q8");
        prehodi.get("q7").put('c', "q11");
        prehodi.get("q7").put('d', "q0");
        prehodi.get("q8").put('a', "q3");
        prehodi.get("q8").put('b', "q9");
        prehodi.get("q8").put('c', "q7");
        prehodi.get("q8").put('d', "q5");
        prehodi.get("q9").put('a', "q1");
        prehodi.get("q9").put('b', "q0");
        prehodi.get("q9").put('c', "q6");
        prehodi.get("q10").put('a', "q4");
        prehodi.get("q10").put('b', "q10");
        prehodi.get("q10").put('c', "q8");
        prehodi.get("q10").put('d', "q0");
        prehodi.get("q11").put('a', "q10");
        prehodi.get("q11").put('b', "q9");
        prehodi.get("q11").put('c', "q4");
        prehodi.get("q11").put('d', "q7");

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
        System.out.println(avtomat.jeSprejemno("q11"));
    }
}
