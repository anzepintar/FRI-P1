
import java.util.*;

public class Test36 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ke", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("rzptz", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("buc", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("iy", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("mxk", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("pcmja", Set.of("ke", "rzptz", "buc", "iy", "mxk", "pcmja"));
        sinonimi.put("nivi", Set.of("nivi", "bbxpf", "g", "khf", "vjit"));
        sinonimi.put("bbxpf", Set.of("nivi", "bbxpf", "g", "khf", "vjit"));
        sinonimi.put("g", Set.of("nivi", "bbxpf", "g", "khf", "vjit"));
        sinonimi.put("khf", Set.of("nivi", "bbxpf", "g", "khf", "vjit"));
        sinonimi.put("vjit", Set.of("nivi", "bbxpf", "g", "khf", "vjit"));
        sinonimi.put("yc", Set.of("yc", "eyhu"));
        sinonimi.put("eyhu", Set.of("yc", "eyhu"));
        sinonimi.put("wafac", Set.of("wafac", "ls", "fo", "qmmig"));
        sinonimi.put("ls", Set.of("wafac", "ls", "fo", "qmmig"));
        sinonimi.put("fo", Set.of("wafac", "ls", "fo", "qmmig"));
        sinonimi.put("qmmig", Set.of("wafac", "ls", "fo", "qmmig"));
        sinonimi.put("spxs", Set.of("spxs", "cqc", "cstmo", "u", "hcmjv"));
        sinonimi.put("cqc", Set.of("spxs", "cqc", "cstmo", "u", "hcmjv"));
        sinonimi.put("cstmo", Set.of("spxs", "cqc", "cstmo", "u", "hcmjv"));
        sinonimi.put("u", Set.of("spxs", "cqc", "cstmo", "u", "hcmjv"));
        sinonimi.put("hcmjv", Set.of("spxs", "cqc", "cstmo", "u", "hcmjv"));
        sinonimi.put("xs", Set.of("xs", "nczp", "brc"));
        sinonimi.put("nczp", Set.of("xs", "nczp", "brc"));
        sinonimi.put("brc", Set.of("xs", "nczp", "brc"));
        sinonimi.put("vcul", Set.of("vcul", "hfog", "wt"));
        sinonimi.put("hfog", Set.of("vcul", "hfog", "wt"));
        sinonimi.put("wt", Set.of("vcul", "hfog", "wt"));
        sinonimi.put("gwos", Set.of("gwos", "iocmb"));
        sinonimi.put("iocmb", Set.of("gwos", "iocmb"));
        sinonimi.put("dzl", Set.of("dzl", "jl"));
        sinonimi.put("jl", Set.of("dzl", "jl"));
        sinonimi.put("hlerz", Set.of("hlerz", "i", "fch"));
        sinonimi.put("i", Set.of("hlerz", "i", "fch"));
        sinonimi.put("fch", Set.of("hlerz", "i", "fch"));
        sinonimi.put("kfm", Set.of("kfm", "ocbi"));
        sinonimi.put("ocbi", Set.of("kfm", "ocbi"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("yg gbzt qh yfjt seb wokif o ndcw bi zc dqk zyhi dz ndcw tp bbt iocmb j l atptv br rzptz vsm btalx fch xr sawq xayx eh udrbg rn qgenn npo zczfb aqgv btie pzp ndcw qgasy szt av u ujb mcw pym muxw whs swaz dzl zpvuv jvvzm ldcv xkuoj x bcmw nbvel bbt hcmjv rrks dtz bn zdtu klsx gb szt sawq hcmjv op usuej btie cqs aqgv yywaa pcmja fo eh iekb fqe ugdwn kfm d cqc eobed izxa ast gmlz brc cqs fnj cstmo lvn rzptz uz bd kvsxk wafac rzsp v hky a hbr esy r gs buka dkl yxn rl nlhyj xlpw ylunu szt brc nxp hcmjv ymlvz h pd h hbcmk cqc ijs x vjit jngbm bqojd v rth pw srxo iocmb gffzm crd zyhi qhan wji hb bb qhan av ym ygufb vsm oozqz twv pd obrt es pil umq eobed hzwgt vm uz rxwz vwgr lbaa fch kfm xb yz tb muxw cdl izxa rk nczp xxim dkmzg efyx izxa usl zqyb vjit es zyhi oobgb a kvsxk btie hpqd gou ybkh hxe prw yv zxls hxe t nmuiu gkso kfm apb azks ce iekb ms qdodf yfjt jlptk rl lsst nbvel q bqojd qplj hxe cstmo eh ylunu fqe btalx jq gs jlptk owrd wrr nmuiu yr gfdic flbfe fnj thoft rkvl wepm sg bbxpf elr eaid iyyjy eh rdse elr kesgv dki iy i o vcul aso klsx atptv px yha eobed tfhqj g ukxlb udrbg gffzm vjit ipkq qysa vp uz xkuoj ijs b srxo xi kc efj aq yztj znt es fenn jaze cv dypon bcmw gjlks xxawx gdbzu vcul izxa b amaip f iho jxobk nllj zjdkf rlvb zpvuv xxim esy px kfm xb nx bf bb pil dki pzp cp cstu hqwgr rzsp zaup kedhl naqui fqe br spt lizl awjf y lvn vwjp kd vwgr nllj vwjp tfhqj ipkq pzp zc wji ggeo euvwo ms rxwz vm g buka uz mij pzmov qplj kfm cu rk x fsan yxn bb wxm wegcc eadg bb vcul rkvl sz vz klsx pzp rdse nbvel wji cv brc lqt gfdic qjty uygs n m mte azks phuw g igjq qgasy qmmig szt sawq rk xb uygs iekb knep tln lvn utdmn mcw c cu rzptz vcul gi x szt icf brc fu gfdic tc obho nchvb hq ce dtz qplj btie atptv zhmt eyhu euvwo i atptv kedhl nllj kupxi qmmig rl usuej zxls hmrdk dz cp fnj gycg qjfvh klsx spt yjqmz hbcmk euvwo bi rkvl aptp o dzl dgaz quxq qgasy hjdy qwfm dcna quxq gb igjq vz sawq ytjen nllj i gi", sinonimi);
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
