
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(
            "q0",
            Set.of("q2", "q4"),
            Map.of("q0", Map.of('a', "q1", 'c', "q2"),
                   "q1", Map.of('b', "q3", 'c', "q1"),
                   "q2", Map.of('c', "q4"),
                   "q3", Map.of('b', "q4"),
                   "q4", Map.of())
        );

        System.out.println(avtomat.jeSprejemno("q0"));
        System.out.println(avtomat.jeSprejemno("q1"));
        System.out.println(avtomat.jeSprejemno("q2"));
        System.out.println(avtomat.jeSprejemno("q3"));
        System.out.println(avtomat.jeSprejemno("q4"));
        System.out.println("----------");

        System.out.println(avtomat.kam(""));
        System.out.println(avtomat.kam("a"));
        System.out.println(avtomat.kam("c"));
        System.out.println(avtomat.kam("cc"));
        System.out.println(avtomat.kam("ab"));
        System.out.println(avtomat.kam("abb"));
        System.out.println(avtomat.kam("accb"));
        System.out.println(avtomat.kam("acccbb"));
        System.out.println(avtomat.kam("accccccccccc"));
        System.out.println(avtomat.kam("b"));
        System.out.println(avtomat.kam("acbbbbbb"));
        System.out.println("----------");

        Cetrta.Avtomat javanec = Cetrta.Avtomat.zaBesedo("java");
        for (String beseda: List.of("java", "jav", "ja", "j", "", "javaa", "ava", "va", "a")) {
            String stanje = null;
            try {
                stanje = javanec.kam(beseda);
            } catch (RuntimeException ex) {}
            System.out.println(stanje != null && javanec.jeSprejemno(stanje));
        }
    }
}
