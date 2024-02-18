
import java.util.*;

public class Test50 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("uq", Set.of("uq", "gtp"));
        sinonimi.put("gtp", Set.of("uq", "gtp"));
        sinonimi.put("ptl", Set.of("ptl", "dyvs", "zzaat", "ijupg", "su"));
        sinonimi.put("dyvs", Set.of("ptl", "dyvs", "zzaat", "ijupg", "su"));
        sinonimi.put("zzaat", Set.of("ptl", "dyvs", "zzaat", "ijupg", "su"));
        sinonimi.put("ijupg", Set.of("ptl", "dyvs", "zzaat", "ijupg", "su"));
        sinonimi.put("su", Set.of("ptl", "dyvs", "zzaat", "ijupg", "su"));
        sinonimi.put("npe", Set.of("npe", "khz", "hzpdm"));
        sinonimi.put("khz", Set.of("npe", "khz", "hzpdm"));
        sinonimi.put("hzpdm", Set.of("npe", "khz", "hzpdm"));
        sinonimi.put("exgr", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("qk", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("tfu", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("pv", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("cvkwx", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("xrcl", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("vp", Set.of("exgr", "qk", "tfu", "pv", "cvkwx", "xrcl", "vp"));
        sinonimi.put("cox", Set.of("cox", "esr", "kncf", "fh", "tppx"));
        sinonimi.put("esr", Set.of("cox", "esr", "kncf", "fh", "tppx"));
        sinonimi.put("kncf", Set.of("cox", "esr", "kncf", "fh", "tppx"));
        sinonimi.put("fh", Set.of("cox", "esr", "kncf", "fh", "tppx"));
        sinonimi.put("tppx", Set.of("cox", "esr", "kncf", "fh", "tppx"));
        sinonimi.put("uaf", Set.of("uaf", "cvi", "xkylv", "qs"));
        sinonimi.put("cvi", Set.of("uaf", "cvi", "xkylv", "qs"));
        sinonimi.put("xkylv", Set.of("uaf", "cvi", "xkylv", "qs"));
        sinonimi.put("qs", Set.of("uaf", "cvi", "xkylv", "qs"));
        sinonimi.put("mdrmh", Set.of("mdrmh"));
        sinonimi.put("guhz", Set.of("guhz", "eokdf", "undjg", "re"));
        sinonimi.put("eokdf", Set.of("guhz", "eokdf", "undjg", "re"));
        sinonimi.put("undjg", Set.of("guhz", "eokdf", "undjg", "re"));
        sinonimi.put("re", Set.of("guhz", "eokdf", "undjg", "re"));
        sinonimi.put("ojuv", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("yunzl", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("iqe", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("l", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("nll", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("mqrpq", Set.of("ojuv", "yunzl", "iqe", "l", "nll", "mqrpq"));
        sinonimi.put("tq", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));
        sinonimi.put("a", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));
        sinonimi.put("udfbb", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));
        sinonimi.put("zrtko", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));
        sinonimi.put("ecmp", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));
        sinonimi.put("hrv", Set.of("tq", "a", "udfbb", "zrtko", "ecmp", "hrv"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("dhxk fdk wqej ao z npeeb hee zrtko nal at hqq re iprls wqej lohb okl upo i hrv ckxwm uaf gchpr gyr sitz ny qzji rpkfn re nl stra ogpq iprls vth cu dk uaf p hc xuutm uaf llvuz wzn qurvq gyr kjgqt im le yunzl fyia nhri yg qmatl h lutfd coigx yw aqhw nsygp ht qr ny nsnd bkb ce cfc eyz gchpr dc blb iz qfwvs rpso refkr mliqb pcoj of ic slsjn j s nlvvl c qr zqoc ailh tftna zevvj z ykb lutfd yjmie hor pizcp tssdl rwgn tuxhc wlqb tsgk nj llvuz gtp ir fdk rivn ar yg wysu drxda kafzm udfbb cdqx wvrzb kiw eokdf mdrmh p zw jw zrtko g qn edu a hyof kp ixph pzu fyia npe yero ykmi tkayo ckvig gl fdzjw wvr noaji kk jsoqs nlvvl zwek blb zukfb tsgk oiul dujt mmi tn hzpdm ua hyof zh iuwof yk rgi n jkil tjbga kncf jsoqs uaf vh boxby thtmq jmu lbv wpg qfwvs ppirk zrwb tci dkjyr coigx nl wh vp cvi pz vh s dkjyr lpr nll oiul ql f uryv szgpj bzy vm k ld csxz rpso aqhw esr mkr yero fdk pv ppw jjion gzkfz cdqx aymrt f dk axm lbv tsgk stra qfwvs she zvf ivfd dxxh fq udfbb le zzaat lcae lohb g kiw s cu fh ai vg mruu tsgk ekitl pkota nnfkl ni knnnh qbmag yxq nexif hvwj fh fpnw udfbb xkylv undjg zvf rgi efadz pqi s tkayo yy al vz zrwb tgpax gk id oumw iwknr tsgk gqgvs hgo vz u dbl ynqjx rnt gmwa wce ynqjx pv rwgn hinr eynl bvm eyz r flwg gyuy sjkmw yfv qs hcrv vxrv iuwof m t jw ui bpcm flwg bulru vg wpg nhri hinr rh lhlra dk mliqb bkb thf iwknr pizcp qqazb dhxk bne gh lussx dkjyr kafzm corp sobj hgo mdrmh zevvj g kiw cvkwx a h dyco dc hzpdm yneue z csxz kcbi bedun pkng zs uryv ir wvrzb", sinonimi);
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
