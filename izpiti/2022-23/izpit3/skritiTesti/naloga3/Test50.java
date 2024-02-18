
import java.lang.reflect.*;
import java.util.*;
import java.util.function.IntFunction;

public class Test50 {

    public static void main(String[] args) {
        konstruktorji(Tretja.SamPrid.class);
        konstruktorji(Tretja.Samostalnik.class);
        konstruktorji(Tretja.Pridevnik.class);
    }

    private static void konstruktorji(Class cl) {
        List<Constructor> konstruktorji = new ArrayList<>(
                Arrays.asList(cl.getDeclaredConstructors()));
        konstruktorji.sort((k1, k2) -> k1.getParameterCount() - k2.getParameterCount());

        final String[] KONCNICA = {"rov", "er", "ra", "ri", "ri", "rov"};
        IntFunction<String> koncnica = stevilo -> KONCNICA[Math.min(5, stevilo % 100)];

        List<String> stParam = new ArrayList<>();
        konstruktorji.forEach(k -> { 
            int np = k.getParameterCount();
            stParam.add(String.format("%d paramet%s", np, koncnica.apply(np)));
        });
        System.out.printf("Konstruktorji razreda %s: %s%n", cl.getCanonicalName(), stParam);
    }
}
