
import java.util.*;

public class Test42 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("tbo", Set.of("tbo"));
        sinonimi.put("plt", Set.of("plt", "rzvc", "mqk"));
        sinonimi.put("rzvc", Set.of("plt", "rzvc", "mqk"));
        sinonimi.put("mqk", Set.of("plt", "rzvc", "mqk"));
        sinonimi.put("irkxh", Set.of("irkxh", "sawx", "skz"));
        sinonimi.put("sawx", Set.of("irkxh", "sawx", "skz"));
        sinonimi.put("skz", Set.of("irkxh", "sawx", "skz"));
        sinonimi.put("uiq", Set.of("uiq"));
        sinonimi.put("as", Set.of("as"));
        sinonimi.put("es", Set.of("es", "kfsm", "eo"));
        sinonimi.put("kfsm", Set.of("es", "kfsm", "eo"));
        sinonimi.put("eo", Set.of("es", "kfsm", "eo"));
        sinonimi.put("gw", Set.of("gw", "bku"));
        sinonimi.put("bku", Set.of("gw", "bku"));
        sinonimi.put("gwcme", Set.of("gwcme", "kq", "ld", "hw"));
        sinonimi.put("kq", Set.of("gwcme", "kq", "ld", "hw"));
        sinonimi.put("ld", Set.of("gwcme", "kq", "ld", "hw"));
        sinonimi.put("hw", Set.of("gwcme", "kq", "ld", "hw"));
        sinonimi.put("j", Set.of("j", "wuxcd"));
        sinonimi.put("wuxcd", Set.of("j", "wuxcd"));
        sinonimi.put("jth", Set.of("jth", "kn"));
        sinonimi.put("kn", Set.of("jth", "kn"));
        sinonimi.put("tme", Set.of("tme", "rhskz"));
        sinonimi.put("rhskz", Set.of("tme", "rhskz"));
        sinonimi.put("inf", Set.of("inf", "ihjg", "bs"));
        sinonimi.put("ihjg", Set.of("inf", "ihjg", "bs"));
        sinonimi.put("bs", Set.of("inf", "ihjg", "bs"));
        sinonimi.put("dfwqa", Set.of("dfwqa"));
        sinonimi.put("ky", Set.of("ky", "dl"));
        sinonimi.put("dl", Set.of("ky", "dl"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("nld duhn kvwp frmrh jqo vdfhs dgxww lis oqd vldra xd jsuo gz upc mui jngno guj cahtb lfyea fmrn bjfq uvlo mn bivxp kr alg lel nh dfuky mbebv dlf irkxh uhxg mbebv ck tnh acdu eee al alg gktm ns plt oqd rb ns acdu mo ph ng duhn xzjlf yf vvqxl rhf ryk ex gzqs uhxg as t hm xiid ehc bo wm vvqxl yltfn dx vvck nemw efl ex a b tubd dfuky exrq maot vf zxlnx sidz fmrn as vljc tubd rb mn jbl bzw twngg xzjlf mhssj lj mhvb eg kfsm qscvi dev tnh cnqx mmcef whwgc tubd vdfhs pk apgqm m rc bdvn ctix zek qzmd kq rsmt qd lucjf ni yorq zvs kfun r xw cnur cx zg dfuky nld efl ph rc kn nh ihjg rry k mgkz jngno bwbj sawx opf oshq xzzu al ijspm oms qscvi wmxcw agpal mt z mui bgarq zdljd sd uvkac dr d zqe biat uep nnp mmcef qujv whwgc tk rqz kfun sidz xoldp opf wuxcd dvbi", sinonimi);
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
