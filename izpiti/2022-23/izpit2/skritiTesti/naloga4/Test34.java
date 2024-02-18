
import java.util.*;

public class Test34 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("vlbvx", Set.of("vlbvx", "fgu", "cjair"));
        sinonimi.put("fgu", Set.of("vlbvx", "fgu", "cjair"));
        sinonimi.put("cjair", Set.of("vlbvx", "fgu", "cjair"));
        sinonimi.put("hpyos", Set.of("hpyos"));
        sinonimi.put("jdsn", Set.of("jdsn", "aiuhw", "el"));
        sinonimi.put("aiuhw", Set.of("jdsn", "aiuhw", "el"));
        sinonimi.put("el", Set.of("jdsn", "aiuhw", "el"));
        sinonimi.put("xymbu", Set.of("xymbu", "mjxhk"));
        sinonimi.put("mjxhk", Set.of("xymbu", "mjxhk"));
        sinonimi.put("ftab", Set.of("ftab", "da"));
        sinonimi.put("da", Set.of("ftab", "da"));
        sinonimi.put("kvl", Set.of("kvl", "vxfk", "gny", "ufv"));
        sinonimi.put("vxfk", Set.of("kvl", "vxfk", "gny", "ufv"));
        sinonimi.put("gny", Set.of("kvl", "vxfk", "gny", "ufv"));
        sinonimi.put("ufv", Set.of("kvl", "vxfk", "gny", "ufv"));
        sinonimi.put("dj", Set.of("dj", "xp", "xoq"));
        sinonimi.put("xp", Set.of("dj", "xp", "xoq"));
        sinonimi.put("xoq", Set.of("dj", "xp", "xoq"));
        sinonimi.put("euvs", Set.of("euvs"));
        sinonimi.put("kn", Set.of("kn", "xwt", "iyoye", "tuiu"));
        sinonimi.put("xwt", Set.of("kn", "xwt", "iyoye", "tuiu"));
        sinonimi.put("iyoye", Set.of("kn", "xwt", "iyoye", "tuiu"));
        sinonimi.put("tuiu", Set.of("kn", "xwt", "iyoye", "tuiu"));
        sinonimi.put("pu", Set.of("pu", "tqtn", "jivy", "lgyfc"));
        sinonimi.put("tqtn", Set.of("pu", "tqtn", "jivy", "lgyfc"));
        sinonimi.put("jivy", Set.of("pu", "tqtn", "jivy", "lgyfc"));
        sinonimi.put("lgyfc", Set.of("pu", "tqtn", "jivy", "lgyfc"));
        sinonimi.put("jes", Set.of("jes", "ovg", "dhou", "exwn", "ygmn"));
        sinonimi.put("ovg", Set.of("jes", "ovg", "dhou", "exwn", "ygmn"));
        sinonimi.put("dhou", Set.of("jes", "ovg", "dhou", "exwn", "ygmn"));
        sinonimi.put("exwn", Set.of("jes", "ovg", "dhou", "exwn", "ygmn"));
        sinonimi.put("ygmn", Set.of("jes", "ovg", "dhou", "exwn", "ygmn"));
        sinonimi.put("bnume", Set.of("bnume"));
        sinonimi.put("deq", Set.of("deq", "lt"));
        sinonimi.put("lt", Set.of("deq", "lt"));
        sinonimi.put("kxakb", Set.of("kxakb", "boxf"));
        sinonimi.put("boxf", Set.of("kxakb", "boxf"));
        sinonimi.put("cst", Set.of("cst", "rflk", "hge", "kp"));
        sinonimi.put("rflk", Set.of("cst", "rflk", "hge", "kp"));
        sinonimi.put("hge", Set.of("cst", "rflk", "hge", "kp"));
        sinonimi.put("kp", Set.of("cst", "rflk", "hge", "kp"));
        sinonimi.put("aieo", Set.of("aieo", "tgy"));
        sinonimi.put("tgy", Set.of("aieo", "tgy"));
        sinonimi.put("zdi", Set.of("zdi", "xmsxs", "yxj", "d"));
        sinonimi.put("xmsxs", Set.of("zdi", "xmsxs", "yxj", "d"));
        sinonimi.put("yxj", Set.of("zdi", "xmsxs", "yxj", "d"));
        sinonimi.put("d", Set.of("zdi", "xmsxs", "yxj", "d"));
        sinonimi.put("shd", Set.of("shd", "ail", "mgvl"));
        sinonimi.put("ail", Set.of("shd", "ail", "mgvl"));
        sinonimi.put("mgvl", Set.of("shd", "ail", "mgvl"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("gek yk ynvk frg jz jr qtrqv aybgz hpyos mbdfc pbuxq iocsc lv cdo tu tqtf ohqow gmb jbyyz rv quc svj en qby cu rjkxr gmb bxrp dz fxefl rhd kn szhc utjw yf otkl dhn t uz nii ral dfen tvsg ello ufv mphr cj zswoj ciz rqax grxgi zqsag ufv kohpn gek qdexg lxhvr psypd pqm vlbvx sngkz ufwma zdi i xoq wn exwn lxqww tuiu inb dx jr cu qhe jrha bjk cj ex an lbqai icrf grxgi hpyos ftab vlbvx tjvhz xhcso llkr iiin ftab kn ysnjr bganf adx fnosn ftab en dbk qprj an rflk lqid dj sq l pumr fnosn fgu ld djsq wn ywo hge nus g hge boxf ancj jr lqid eno ld jivy lfes cjair xb sjf bvmag ufv nii sga fhk cnfw d vtw qprj lpvb je etpu ss hlq rqax hpp rz e kcly fyybc fansb ngpf ajpl wn nrcx hctzh vb qhe r tmes lloj ck lloj bvb el ush xp fwo gi tmes grxgi fxefl wtu bganf tgy geoyu ggvz zhjb ioygr orrgx li bmvms qtrqv noep rflk eyc mqsat jdsn hlq woq f fl zqsag jlsz yk rqax rl s dl ck jbyyz emwg oo jewx edzzx hlq jfjim qecta aqad iyoye lgyfc nzzmt tyjc eaig gek hpyos zqsag jewx pktb mgvl lloj zqwm my ello dr uny iyoye rqax pqm el yjppn cst djfgd ggvz xoq lt lqid nzrrp dt d tgy sbqlj g tjvhz nct hctzh ofo x ynzj ovg ja ky zbkp bxrp hlq dp hpyos ofo eojs viw yz wqeo ciz rjk ello jkr oj tw gfl f qdexg jr oisz jrha ypdas nii gmb rqax uz qkqt to yhdsj ege krbm y uvi eno eaig xj lhmkq qho fb krbm nus lltd yjppn oj uup dr iegsk cjair nc jewx dj dhn djsq qcyi fpdno dhn e zkj xb lbqai jkr xmsxs svcn tbovn fl exwn xymbu txuzy woq yxj krbm lt xkfh cn xl kq iiin da dyjb wn xmsxs pu vxfk dbk ello icrf qecta ege gq gmy mbgib tqtf twk rsm dapwp jes rzgt gmy bjk wzh rjkb x vif eojs m sq m qkqt pofrp my pqm rflk qdexg jewx th", sinonimi);
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
