
import java.util.*;

public class Test04 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("wgws", Set.of("wgws", "c", "rekz"));
        sinonimi.put("c", Set.of("wgws", "c", "rekz"));
        sinonimi.put("rekz", Set.of("wgws", "c", "rekz"));
        sinonimi.put("ri", Set.of("ri", "lbj", "lcmz"));
        sinonimi.put("lbj", Set.of("ri", "lbj", "lcmz"));
        sinonimi.put("lcmz", Set.of("ri", "lbj", "lcmz"));
        sinonimi.put("gfsr", Set.of("gfsr", "xgiv", "kup"));
        sinonimi.put("xgiv", Set.of("gfsr", "xgiv", "kup"));
        sinonimi.put("kup", Set.of("gfsr", "xgiv", "kup"));
        sinonimi.put("uuyl", Set.of("uuyl", "j", "sfak"));
        sinonimi.put("j", Set.of("uuyl", "j", "sfak"));
        sinonimi.put("sfak", Set.of("uuyl", "j", "sfak"));
        sinonimi.put("zcin", Set.of("zcin"));
        sinonimi.put("fjasy", Set.of("fjasy", "xfa"));
        sinonimi.put("xfa", Set.of("fjasy", "xfa"));
        sinonimi.put("zc", Set.of("zc"));
        sinonimi.put("ecf", Set.of("ecf", "fkjrg", "fyyx", "dsr"));
        sinonimi.put("fkjrg", Set.of("ecf", "fkjrg", "fyyx", "dsr"));
        sinonimi.put("fyyx", Set.of("ecf", "fkjrg", "fyyx", "dsr"));
        sinonimi.put("dsr", Set.of("ecf", "fkjrg", "fyyx", "dsr"));
        sinonimi.put("cnp", Set.of("cnp", "jlltg", "ocbt", "hj", "bm"));
        sinonimi.put("jlltg", Set.of("cnp", "jlltg", "ocbt", "hj", "bm"));
        sinonimi.put("ocbt", Set.of("cnp", "jlltg", "ocbt", "hj", "bm"));
        sinonimi.put("hj", Set.of("cnp", "jlltg", "ocbt", "hj", "bm"));
        sinonimi.put("bm", Set.of("cnp", "jlltg", "ocbt", "hj", "bm"));
        sinonimi.put("gdfao", Set.of("gdfao"));
        sinonimi.put("or", Set.of("or"));
        sinonimi.put("sofn", Set.of("sofn", "p", "lmcbt"));
        sinonimi.put("p", Set.of("sofn", "p", "lmcbt"));
        sinonimi.put("lmcbt", Set.of("sofn", "p", "lmcbt"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
