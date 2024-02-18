
import java.util.*;

public class Test31 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("pc", Set.of("pc", "di"));
        sinonimi.put("di", Set.of("pc", "di"));
        sinonimi.put("e", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("xpjlp", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("cg", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("cki", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("pumxp", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("tn", Set.of("e", "xpjlp", "cg", "cki", "pumxp", "tn"));
        sinonimi.put("npf", Set.of("npf"));
        sinonimi.put("c", Set.of("c", "qdeb", "jsy"));
        sinonimi.put("qdeb", Set.of("c", "qdeb", "jsy"));
        sinonimi.put("jsy", Set.of("c", "qdeb", "jsy"));
        sinonimi.put("vsky", Set.of("vsky", "etfl"));
        sinonimi.put("etfl", Set.of("vsky", "etfl"));
        sinonimi.put("omlg", Set.of("omlg"));
        sinonimi.put("vgxdr", Set.of("vgxdr"));
        sinonimi.put("jv", Set.of("jv", "kwji"));
        sinonimi.put("kwji", Set.of("jv", "kwji"));
        sinonimi.put("pypxs", Set.of("pypxs", "npc", "suz"));
        sinonimi.put("npc", Set.of("pypxs", "npc", "suz"));
        sinonimi.put("suz", Set.of("pypxs", "npc", "suz"));
        sinonimi.put("pqjw", Set.of("pqjw", "sil", "agai", "osi"));
        sinonimi.put("sil", Set.of("pqjw", "sil", "agai", "osi"));
        sinonimi.put("agai", Set.of("pqjw", "sil", "agai", "osi"));
        sinonimi.put("osi", Set.of("pqjw", "sil", "agai", "osi"));
        sinonimi.put("bbs", Set.of("bbs", "bfwps", "ia", "kylx"));
        sinonimi.put("bfwps", Set.of("bbs", "bfwps", "ia", "kylx"));
        sinonimi.put("ia", Set.of("bbs", "bfwps", "ia", "kylx"));
        sinonimi.put("kylx", Set.of("bbs", "bfwps", "ia", "kylx"));
        sinonimi.put("ywdag", Set.of("ywdag", "fxj", "s", "llsv"));
        sinonimi.put("fxj", Set.of("ywdag", "fxj", "s", "llsv"));
        sinonimi.put("s", Set.of("ywdag", "fxj", "s", "llsv"));
        sinonimi.put("llsv", Set.of("ywdag", "fxj", "s", "llsv"));
        sinonimi.put("mdn", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("xjy", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("cswo", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("wzd", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("xxbhj", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("lkd", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("zslzo", Set.of("mdn", "xjy", "cswo", "wzd", "xxbhj", "lkd", "zslzo"));
        sinonimi.put("qnrmu", Set.of("qnrmu"));
        sinonimi.put("rz", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("dmklu", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("kgos", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("ahj", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("yfa", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("dnsk", Set.of("rz", "dmklu", "kgos", "ahj", "yfa", "dnsk"));
        sinonimi.put("ttjnr", Set.of("ttjnr"));
        sinonimi.put("jdyq", Set.of("jdyq", "gwa"));
        sinonimi.put("gwa", Set.of("jdyq", "gwa"));
        sinonimi.put("atzw", Set.of("atzw", "ebnrp", "do", "jc", "dz"));
        sinonimi.put("ebnrp", Set.of("atzw", "ebnrp", "do", "jc", "dz"));
        sinonimi.put("do", Set.of("atzw", "ebnrp", "do", "jc", "dz"));
        sinonimi.put("jc", Set.of("atzw", "ebnrp", "do", "jc", "dz"));
        sinonimi.put("dz", Set.of("atzw", "ebnrp", "do", "jc", "dz"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("axulo vjkye di y zaai k astd linwe txg kzw jymri qdeb qef ebqa gmxs ia aa zslzo je erox njoe qef mdn jdyq co qcja m ipnar dl qfyw neja osi yara lnaz cvx ly k hmszp b zswah moz sa gwa cvxk wodp qshw sil o gz isqnu ttjnr ek skxtz ai dvn jj lkozh bbs ro tytj keu hs ma nk zyat mrts hmszp mcozv ex dfbst n pvo btjql ijrgi ijrgi di keu uj jq agx qfyw npc eoenn vsky uqh kgos pgbyt gwa hex lkd bwv pitgy cuy mkm gmxs gdh ydz irss nnt a hgz uw kibw lchws qzrq dmm ma swkq tytj hlpee riz whwxt agai ebnrp enpd gqo jkjpf bbs cen o tvgt mij lse n zhxq bwv otz neja bmi nbx rz isyfa uj mrts edr pgbyt l nk tf t di hvr mrif cen lcny kmt kbqqx cvq ik", sinonimi);
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
