
import java.util.*;

public class Test47 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hd", Set.of("hd"));
        sinonimi.put("nuidz", Set.of("nuidz", "vyd"));
        sinonimi.put("vyd", Set.of("nuidz", "vyd"));
        sinonimi.put("uph", Set.of("uph", "xmsdd", "houot"));
        sinonimi.put("xmsdd", Set.of("uph", "xmsdd", "houot"));
        sinonimi.put("houot", Set.of("uph", "xmsdd", "houot"));
        sinonimi.put("wkx", Set.of("wkx"));
        sinonimi.put("qsrp", Set.of("qsrp", "arx"));
        sinonimi.put("arx", Set.of("qsrp", "arx"));
        sinonimi.put("dada", Set.of("dada", "rciw"));
        sinonimi.put("rciw", Set.of("dada", "rciw"));
        sinonimi.put("ewrgo", Set.of("ewrgo"));
        sinonimi.put("qig", Set.of("qig"));
        sinonimi.put("kjw", Set.of("kjw", "vwhe"));
        sinonimi.put("vwhe", Set.of("kjw", "vwhe"));
        sinonimi.put("ltcnk", Set.of("ltcnk"));
        sinonimi.put("knn", Set.of("knn"));
        sinonimi.put("kr", Set.of("kr", "tyk"));
        sinonimi.put("tyk", Set.of("kr", "tyk"));
        sinonimi.put("fvaai", Set.of("fvaai", "dje"));
        sinonimi.put("dje", Set.of("fvaai", "dje"));
        sinonimi.put("lgrsa", Set.of("lgrsa", "xfis"));
        sinonimi.put("xfis", Set.of("lgrsa", "xfis"));
        sinonimi.put("tgj", Set.of("tgj"));
        sinonimi.put("ctnpt", Set.of("ctnpt"));
        sinonimi.put("wj", Set.of("wj"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("ee nuidz djmgb rciw occuz ub qr xrmiz nwouk d ypj xjtjs xvp kjc yuwi dskku fkrtw xv atho avvpg iy msjx zgjc dgxse ndazc sdkv b xj qmzer ndpn dhjff fd unk ovpmx ec so vobei z ad lfub xmsdd tjqhl opo gfrd ehy yx jho npeow unk pe lcy uacn gsy kuw qiz phuy bnyu lox i sxja kej yykl smk akruv tfont jjwm iazx bvs il jho fa kjc fvo xrmiz mjrv nmfd wlkjy euc npeow iazx qniq ovlq xeb uacn etjo qqlrz vbah u cien occuz ee vobei a jho ndh guzdq oltu tdqv qxzvi xmbml wzlit ide t vuap zs aqq k c bljs vu pkeuu yvvb bmvkp qxzvi h pkeuu hp iphmd oii mjrv sqhsh tj gjmo ujbi gif euc xl dskku fpa jxnwb eaxa fzsvt ovlq jyd nmfd ndh ndh wehjl knn lu ugolj xa doo lnjfm jymds ltcnk ypj ocg jdw oltu qzje dpe gv ean xrmiz tfont rpgon pfuh ispq kbdnb xpqzu jymds lfub dpe kr td mnva atho gktq qe hpm jyd tgj rs tbd sbr mzbjj snhyn mmll rnnu kjw rnnu lhsn azyjj evfg qig tj rxwws vyd ltcnk q vjqp qniq dgxse lnjfm rxwws iphmd gau mhreu qig yykl zs nmat xso vwhe lnl e wqgtt xzfl x hkcil n x ide ean f gqts fktc qh eibx abd rkk yhkq vnjl xl evfg xkdvp cdrrc xip gf xl hp du fvaai adn nwouk ean tpae tbd euc gaac xmbml fw oq qh knn jhyj otpru xfis pquya wj", sinonimi);
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
