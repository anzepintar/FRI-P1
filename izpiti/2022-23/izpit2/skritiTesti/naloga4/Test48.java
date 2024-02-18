
import java.util.*;

public class Test48 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("tm", Set.of("tm", "wt"));
        sinonimi.put("wt", Set.of("tm", "wt"));
        sinonimi.put("oxeos", Set.of("oxeos", "znvc", "pz", "nyzq", "ofr"));
        sinonimi.put("znvc", Set.of("oxeos", "znvc", "pz", "nyzq", "ofr"));
        sinonimi.put("pz", Set.of("oxeos", "znvc", "pz", "nyzq", "ofr"));
        sinonimi.put("nyzq", Set.of("oxeos", "znvc", "pz", "nyzq", "ofr"));
        sinonimi.put("ofr", Set.of("oxeos", "znvc", "pz", "nyzq", "ofr"));
        sinonimi.put("usbl", Set.of("usbl"));
        sinonimi.put("qw", Set.of("qw", "nnvo", "sg"));
        sinonimi.put("nnvo", Set.of("qw", "nnvo", "sg"));
        sinonimi.put("sg", Set.of("qw", "nnvo", "sg"));
        sinonimi.put("axa", Set.of("axa", "z", "cnv"));
        sinonimi.put("z", Set.of("axa", "z", "cnv"));
        sinonimi.put("cnv", Set.of("axa", "z", "cnv"));
        sinonimi.put("quqzk", Set.of("quqzk"));
        sinonimi.put("li", Set.of("li", "fcow", "x", "zf"));
        sinonimi.put("fcow", Set.of("li", "fcow", "x", "zf"));
        sinonimi.put("x", Set.of("li", "fcow", "x", "zf"));
        sinonimi.put("zf", Set.of("li", "fcow", "x", "zf"));
        sinonimi.put("hiy", Set.of("hiy", "yw", "qbuz"));
        sinonimi.put("yw", Set.of("hiy", "yw", "qbuz"));
        sinonimi.put("qbuz", Set.of("hiy", "yw", "qbuz"));
        sinonimi.put("zoqz", Set.of("zoqz", "ia", "bqv", "xrz"));
        sinonimi.put("ia", Set.of("zoqz", "ia", "bqv", "xrz"));
        sinonimi.put("bqv", Set.of("zoqz", "ia", "bqv", "xrz"));
        sinonimi.put("xrz", Set.of("zoqz", "ia", "bqv", "xrz"));
        sinonimi.put("ff", Set.of("ff", "ko"));
        sinonimi.put("ko", Set.of("ff", "ko"));
        sinonimi.put("kkzs", Set.of("kkzs"));
        sinonimi.put("lkbz", Set.of("lkbz", "jpnr"));
        sinonimi.put("jpnr", Set.of("lkbz", "jpnr"));
        sinonimi.put("lig", Set.of("lig", "ifxxt", "tks", "hbs"));
        sinonimi.put("ifxxt", Set.of("lig", "ifxxt", "tks", "hbs"));
        sinonimi.put("tks", Set.of("lig", "ifxxt", "tks", "hbs"));
        sinonimi.put("hbs", Set.of("lig", "ifxxt", "tks", "hbs"));
        sinonimi.put("hc", Set.of("hc", "weuw", "vejzy"));
        sinonimi.put("weuw", Set.of("hc", "weuw", "vejzy"));
        sinonimi.put("vejzy", Set.of("hc", "weuw", "vejzy"));
        sinonimi.put("fb", Set.of("fb", "hpa", "taww"));
        sinonimi.put("hpa", Set.of("fb", "hpa", "taww"));
        sinonimi.put("taww", Set.of("fb", "hpa", "taww"));
        sinonimi.put("p", Set.of("p"));
        sinonimi.put("gv", Set.of("gv"));
        sinonimi.put("xwumj", Set.of("xwumj", "jazkr", "yl", "azp"));
        sinonimi.put("jazkr", Set.of("xwumj", "jazkr", "yl", "azp"));
        sinonimi.put("yl", Set.of("xwumj", "jazkr", "yl", "azp"));
        sinonimi.put("azp", Set.of("xwumj", "jazkr", "yl", "azp"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("qdy l zcp m djh dp bduh valc lui mcl yej rcbys r lbjoj hgsyw lui hwa fcow fsxpi nyzq swb n k shqc ael kdzuo qplud ia hc xi ez fejzz ejsyn ifxxt na hbs e kr qi kv vh yej fzbde a hvx yq ia ckep xwohm yjy nnvo na f auity bzffm hgsyw wk xwct dxpcp tm gbb ka pwyzo bqzr fqltt gavu uc cj uhekd kv pwyzo xi azp jdaxv om g aaym hkeyq d koqs hkeyq jew yjy qqv yua mno yua ddwcj itmln fb pemp fryhb ofr gwb hvx yd idms vic ia uxr s v ilpf fxu kxcf na co mv inza mnt jr kkzs ehoxx mno yq sd tezmc pz wdg hd wnhp qll zoqz ufag oun t pkkz uoctt gvey bduh lvow wb esiou ucz p wytxy kxcf czqye qw ehoxx ofr shqc lgef pxdl jf ywnpb hei bup cbrj ddwcj wytxy bduh bucr whl syf gssk inza wam z vroz cwx zoqz jsj ro fcow idrgh jpnr dqytu qnexm zl lulu pz xrz esiou kxcf brd qrfzt ufag hewmk hiy bqzr dteoi holh qfn og hbs lqwzh xwohm ifxxt s lvow idrgh zylgv whl vq f l lu bnuxj quqzk ni z bpbl idms tks owphz kxcf qiqwg siob bk jf ckxi v ya lkbz hvx dj ckep wj cheoi yd hbs cbrj dkc xwumj hwa czqye jr jxgm xs jf vic u jha rp weg vazu l ybxh dz vzuu gudj w jxgm dz fryhb g jfu ro vazu nyzq lnh rwuvr quqzk pzvdj q dqytu rn pwsli vgsyh mvugh gb db rnl yqkvj vih myptw pkkz wnhp fvemg vkk lshc og viihi zylgv j mv lgef luzw cj aceli lk esiou aibzs zdmz wbo tirxb rpa zcu uc mkz kk ouce zf rt luzw wytxy hgsyw li axa na lndb gudj vw vq rnl us ia j ygkt holh qnexm bzhp mv gi vecj czqye twr yqkvj axa zylgv jxoaz pkkz d ael baq nhul lulu meibj bucr whl ijgox imofq yypw gudj akoh frkw ouce ywnpb hc weuw ve tjxlh koqs fxu fjs jmhv xqh qplud kxcf jxoaz k jongs a vqq vzuu fjs dyuf imofq o mcl lgef nbt yua vih vic hhoi gfan zl vp c ka tho oobsa uc ff vfn jdaxv bqzr lql li vp keml bduh rgdee gm w fryhb lrnu jsl x uf ucz mhj oglqz gb hbs ir gghqo lnoop d xdz xbce axa qnnd dhsno whl djh rnl xwct zoqz rtgrr djl fk na txwnk fpe jnnr cwx bqzr gfu dxpcp p n x gl ff vsq imofq bk co ukzk odfz ko jc qnexm ot xwct h yqkvj p qfn bnuxj jsl dxpcp vq csfb rp uhekd taww bup jsj rt dyuf vih qh vzuu itmln gghqo ka ejsyn bqzr dj jmu qcoq vq hnhar hyg yypw rt yqkvj", sinonimi);
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
