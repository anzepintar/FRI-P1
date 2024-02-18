
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hisa", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("bajta", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("koca", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("dom", Set.of("hisa", "bajta", "koca", "dom"));
        sinonimi.put("veselje", Set.of("veselje", "radost"));
        sinonimi.put("radost", Set.of("veselje", "radost"));
        sinonimi.put("spet", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("zopet", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("ponovno", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("znova", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));
        sinonimi.put("vnovic", Set.of("spet", "zopet", "ponovno", "znova", "vnovic"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
