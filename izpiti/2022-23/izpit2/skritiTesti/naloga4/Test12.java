
import java.util.*;

public class Test12 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("exz", Set.of("exz", "mb"));
        sinonimi.put("mb", Set.of("exz", "mb"));
        sinonimi.put("nzf", Set.of("nzf"));
        sinonimi.put("wx", Set.of("wx", "xymdj"));
        sinonimi.put("xymdj", Set.of("wx", "xymdj"));
        sinonimi.put("py", Set.of("py"));
        sinonimi.put("n", Set.of("n", "iawh"));
        sinonimi.put("iawh", Set.of("n", "iawh"));
        sinonimi.put("az", Set.of("az", "ye", "wzer"));
        sinonimi.put("ye", Set.of("az", "ye", "wzer"));
        sinonimi.put("wzer", Set.of("az", "ye", "wzer"));
        sinonimi.put("okupe", Set.of("okupe"));
        sinonimi.put("vwg", Set.of("vwg", "tcexk"));
        sinonimi.put("tcexk", Set.of("vwg", "tcexk"));
        sinonimi.put("dmn", Set.of("dmn", "ubou", "lu"));
        sinonimi.put("ubou", Set.of("dmn", "ubou", "lu"));
        sinonimi.put("lu", Set.of("dmn", "ubou", "lu"));
        sinonimi.put("uv", Set.of("uv", "eh", "q", "ktxjb"));
        sinonimi.put("eh", Set.of("uv", "eh", "q", "ktxjb"));
        sinonimi.put("q", Set.of("uv", "eh", "q", "ktxjb"));
        sinonimi.put("ktxjb", Set.of("uv", "eh", "q", "ktxjb"));
        sinonimi.put("mzvdr", Set.of("mzvdr"));
        sinonimi.put("dfq", Set.of("dfq"));
        sinonimi.put("kwrmn", Set.of("kwrmn", "lrkou", "bo"));
        sinonimi.put("lrkou", Set.of("kwrmn", "lrkou", "bo"));
        sinonimi.put("bo", Set.of("kwrmn", "lrkou", "bo"));
        sinonimi.put("nhgvg", Set.of("nhgvg"));
        sinonimi.put("yzb", Set.of("yzb", "tt"));
        sinonimi.put("tt", Set.of("yzb", "tt"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
