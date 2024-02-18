
import java.util.*;

public class Test45 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("cybbc", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("cv", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("pzbz", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("hq", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("lh", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("fpt", Set.of("cybbc", "cv", "pzbz", "hq", "lh", "fpt"));
        sinonimi.put("wk", Set.of("wk", "xluan", "nkj", "wakq", "mge"));
        sinonimi.put("xluan", Set.of("wk", "xluan", "nkj", "wakq", "mge"));
        sinonimi.put("nkj", Set.of("wk", "xluan", "nkj", "wakq", "mge"));
        sinonimi.put("wakq", Set.of("wk", "xluan", "nkj", "wakq", "mge"));
        sinonimi.put("mge", Set.of("wk", "xluan", "nkj", "wakq", "mge"));
        sinonimi.put("dfjgu", Set.of("dfjgu", "rvzo", "lg", "qb"));
        sinonimi.put("rvzo", Set.of("dfjgu", "rvzo", "lg", "qb"));
        sinonimi.put("lg", Set.of("dfjgu", "rvzo", "lg", "qb"));
        sinonimi.put("qb", Set.of("dfjgu", "rvzo", "lg", "qb"));
        sinonimi.put("np", Set.of("np", "wx"));
        sinonimi.put("wx", Set.of("np", "wx"));
        sinonimi.put("bg", Set.of("bg", "yx", "shw"));
        sinonimi.put("yx", Set.of("bg", "yx", "shw"));
        sinonimi.put("shw", Set.of("bg", "yx", "shw"));
        sinonimi.put("xri", Set.of("xri", "qpcp"));
        sinonimi.put("qpcp", Set.of("xri", "qpcp"));
        sinonimi.put("vmbye", Set.of("vmbye", "is", "vu"));
        sinonimi.put("is", Set.of("vmbye", "is", "vu"));
        sinonimi.put("vu", Set.of("vmbye", "is", "vu"));
        sinonimi.put("msg", Set.of("msg", "lnhei", "szlim", "kfhbg"));
        sinonimi.put("lnhei", Set.of("msg", "lnhei", "szlim", "kfhbg"));
        sinonimi.put("szlim", Set.of("msg", "lnhei", "szlim", "kfhbg"));
        sinonimi.put("kfhbg", Set.of("msg", "lnhei", "szlim", "kfhbg"));
        sinonimi.put("xd", Set.of("xd", "vxws", "srhv"));
        sinonimi.put("vxws", Set.of("xd", "vxws", "srhv"));
        sinonimi.put("srhv", Set.of("xd", "vxws", "srhv"));
        sinonimi.put("lhawx", Set.of("lhawx", "lu", "fdcib"));
        sinonimi.put("lu", Set.of("lhawx", "lu", "fdcib"));
        sinonimi.put("fdcib", Set.of("lhawx", "lu", "fdcib"));
        sinonimi.put("tp", Set.of("tp", "bpamp", "ksqju", "tb", "twqci"));
        sinonimi.put("bpamp", Set.of("tp", "bpamp", "ksqju", "tb", "twqci"));
        sinonimi.put("ksqju", Set.of("tp", "bpamp", "ksqju", "tb", "twqci"));
        sinonimi.put("tb", Set.of("tp", "bpamp", "ksqju", "tb", "twqci"));
        sinonimi.put("twqci", Set.of("tp", "bpamp", "ksqju", "tb", "twqci"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("hvlej rlu jysj wod ncvu bg np bds hrd pkb ykosa qm plw tf ktcdw zhult bds imga uwf o woq fi ph nbur gvbtl owq kgqe rzpw astc woq hvlej payk kqv d atbgk kuns nk rozkg hmjm iwpd oznh wkasi tp ka rdhas v rd n lpzzm jebpe oib xt dv hsh vw t eq jfr gctj nspgz fzq uo orh qfq zlky oib pomhz ty wsal sfsl payk hhmtw lpzzm onzua iwpd qdis pe ntsuj ubq ytxne ift zioag xjpez xluan kp xjpez qane fi ausm xegw dnus bf fi srhv kdif i tnzzu wyjdk qo fjd hehw d qqeph gecll rsvd lnhei uou nmo rozkg zrp pf tdny fhb rmv bf ya vz ms oib nsz flq kp qctg oaks febbv wygph tdny zeazj nnx uo cfw ubzxu s ntsuj lvd a ngap nqb bbun glcy kqizd onzua dnus pkb hx hsh imga fbix ka j woq aowc td p dbdq is ggjpl ol mwsl rgqlx zrp yx uyt ofnf yf xhrux payk mge rdhas immc wk ms xo nnsn fbix kuns xh wg qfq hmjm udffb fm g gqw jysj pk pff iaqco hxj ai usajv uod xvjbt nia x zioag ipv ixkdh ggor dv arcuy scynm pawo r lzl ntsuj febbv hwnb cgnoy qmrf yx efd bds f ocbrf nqb atbgk w uou sdf lu ow uawr lqav fgijh ymei tq osuf lu n bf tct lgvy hwnb nsz mufxg fm zvkq zybej anmdf rhuan apcv zhult xt ggor ln ebwc bm jj pnmq", sinonimi);
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
