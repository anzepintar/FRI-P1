
import java.util.*;

public class Test33 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("wc", Set.of("wc"));
        sinonimi.put("njpr", Set.of("njpr", "zlb", "nz"));
        sinonimi.put("zlb", Set.of("njpr", "zlb", "nz"));
        sinonimi.put("nz", Set.of("njpr", "zlb", "nz"));
        sinonimi.put("jfaop", Set.of("jfaop", "amkq", "yb", "sxnvl"));
        sinonimi.put("amkq", Set.of("jfaop", "amkq", "yb", "sxnvl"));
        sinonimi.put("yb", Set.of("jfaop", "amkq", "yb", "sxnvl"));
        sinonimi.put("sxnvl", Set.of("jfaop", "amkq", "yb", "sxnvl"));
        sinonimi.put("zb", Set.of("zb", "ktvb", "hwmk"));
        sinonimi.put("ktvb", Set.of("zb", "ktvb", "hwmk"));
        sinonimi.put("hwmk", Set.of("zb", "ktvb", "hwmk"));
        sinonimi.put("anlm", Set.of("anlm", "ypytx", "dkqao", "glco", "ges"));
        sinonimi.put("ypytx", Set.of("anlm", "ypytx", "dkqao", "glco", "ges"));
        sinonimi.put("dkqao", Set.of("anlm", "ypytx", "dkqao", "glco", "ges"));
        sinonimi.put("glco", Set.of("anlm", "ypytx", "dkqao", "glco", "ges"));
        sinonimi.put("ges", Set.of("anlm", "ypytx", "dkqao", "glco", "ges"));
        sinonimi.put("rmgn", Set.of("rmgn"));
        sinonimi.put("qugnv", Set.of("qugnv", "psyq", "bmzpd", "pm", "yxz"));
        sinonimi.put("psyq", Set.of("qugnv", "psyq", "bmzpd", "pm", "yxz"));
        sinonimi.put("bmzpd", Set.of("qugnv", "psyq", "bmzpd", "pm", "yxz"));
        sinonimi.put("pm", Set.of("qugnv", "psyq", "bmzpd", "pm", "yxz"));
        sinonimi.put("yxz", Set.of("qugnv", "psyq", "bmzpd", "pm", "yxz"));
        sinonimi.put("wgva", Set.of("wgva", "znx", "xcnp"));
        sinonimi.put("znx", Set.of("wgva", "znx", "xcnp"));
        sinonimi.put("xcnp", Set.of("wgva", "znx", "xcnp"));
        sinonimi.put("psxz", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("mg", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("mqxpv", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("izve", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("pgcl", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("ipypd", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("sjvt", Set.of("psxz", "mg", "mqxpv", "izve", "pgcl", "ipypd", "sjvt"));
        sinonimi.put("swq", Set.of("swq", "jjayq"));
        sinonimi.put("jjayq", Set.of("swq", "jjayq"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("cnx nanjy dvp mhlzh hnx ho sq smnmp glco qp xcvw pkqx nnbxp pls pupt k lbt a ciudb docoe swu yurho gm alyk terik sb v sxrd ekno pzg mgko twggi tmur pd crhwr rghyd ey rnpfg ciic mmnu rmgn qedfr pm qedfr dzp shjw cval on zb w a shjw mxbxf dvp kjvh mg dkqao ffg rit mg l hdmxj ups vhxi dvp rg yurho hba zton rheil nac jbg cdr jcka iftnw efs sw docoe nzj bbewf iqcnd gv sxrd sf lvbxj jcka hkk be qmes nac ho ffg ws sbat xbqez mvlbp njehk lps ho zb mo jdp cuegl egr tyif qugnv uhsoi pzg bp xsk jj q efs qzgt rghyd lyyr crhwr aeta tcak yurho swq ruu rat uaeac kg b qp gxxi", sinonimi);
        List<String> seznam = new ArrayList<>();
        for (Set<String> mnozica: slovar.keySet()) {
            List<String> lstMnozica = new ArrayList<>(mnozica);
            lstMnozica.sort(null);
            seznam.add(String.format("%s -> %d", lstMnozica, slovar.get(mnozica)));
        }
        seznam.sort(null);
        for (String s: seznam) {
            System.out.println(s);
        }
    }
}
