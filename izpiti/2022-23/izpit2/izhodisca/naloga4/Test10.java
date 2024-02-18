
import java.util.*;

public class Test10 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("kuaf", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("znqe", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("qme", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("tucky", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("vwzh", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("vmbjw", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("lkk", Set.of("kuaf", "znqe", "qme", "tucky", "vwzh", "vmbjw", "lkk"));
        sinonimi.put("gkb", Set.of("gkb", "wy", "pgos", "ye", "f"));
        sinonimi.put("wy", Set.of("gkb", "wy", "pgos", "ye", "f"));
        sinonimi.put("pgos", Set.of("gkb", "wy", "pgos", "ye", "f"));
        sinonimi.put("ye", Set.of("gkb", "wy", "pgos", "ye", "f"));
        sinonimi.put("f", Set.of("gkb", "wy", "pgos", "ye", "f"));
        sinonimi.put("kf", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("yjx", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("cwuk", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("odqh", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("oprcm", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("gkhv", Set.of("kf", "yjx", "cwuk", "odqh", "oprcm", "gkhv"));
        sinonimi.put("jk", Set.of("jk", "iemp"));
        sinonimi.put("iemp", Set.of("jk", "iemp"));
        sinonimi.put("ct", Set.of("ct"));
        sinonimi.put("topj", Set.of("topj", "ft", "dlgu"));
        sinonimi.put("ft", Set.of("topj", "ft", "dlgu"));
        sinonimi.put("dlgu", Set.of("topj", "ft", "dlgu"));
        sinonimi.put("aljx", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("pdma", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("fgftg", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("qiqf", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("unp", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("kuafw", Set.of("aljx", "pdma", "fgftg", "qiqf", "unp", "kuafw"));
        sinonimi.put("arlcr", Set.of("arlcr"));
        sinonimi.put("gsxm", Set.of("gsxm", "fhm", "edctb"));
        sinonimi.put("fhm", Set.of("gsxm", "fhm", "edctb"));
        sinonimi.put("edctb", Set.of("gsxm", "fhm", "edctb"));
        sinonimi.put("ggp", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("onmv", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("zuvae", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("ybl", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("aip", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("cdn", Set.of("ggp", "onmv", "zuvae", "ybl", "aip", "cdn"));
        sinonimi.put("df", Set.of("df", "vv"));
        sinonimi.put("vv", Set.of("df", "vv"));
        sinonimi.put("zhmkl", Set.of("zhmkl", "typ", "zp", "plf"));
        sinonimi.put("typ", Set.of("zhmkl", "typ", "zp", "plf"));
        sinonimi.put("zp", Set.of("zhmkl", "typ", "zp", "plf"));
        sinonimi.put("plf", Set.of("zhmkl", "typ", "zp", "plf"));
        sinonimi.put("ncln", Set.of("ncln", "vfvd", "zg"));
        sinonimi.put("vfvd", Set.of("ncln", "vfvd", "zg"));
        sinonimi.put("zg", Set.of("ncln", "vfvd", "zg"));
        sinonimi.put("gig", Set.of("gig"));
        sinonimi.put("xvib", Set.of("xvib"));
        sinonimi.put("bsxmn", Set.of("bsxmn"));
        sinonimi.put("tjzq", Set.of("tjzq", "gvj", "zjc", "fblc"));
        sinonimi.put("gvj", Set.of("tjzq", "gvj", "zjc", "fblc"));
        sinonimi.put("zjc", Set.of("tjzq", "gvj", "zjc", "fblc"));
        sinonimi.put("fblc", Set.of("tjzq", "gvj", "zjc", "fblc"));
        sinonimi.put("bozrc", Set.of("bozrc"));
        sinonimi.put("bbfe", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("kjo", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("geovm", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("pbmdz", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("vcy", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("ixz", Set.of("bbfe", "kjo", "geovm", "pbmdz", "vcy", "ixz"));
        sinonimi.put("za", Set.of("za"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("gnfg vfvd a mxxgl uhi irl ncln impk gkhv vmbjw rvg uud ecfd iemp lmh rj aip yph irl nyl vcy evagv aofhx j ojlq bozrc gnfg vnpfr rsqf gu xbna rx oxafn ecfd hfx jxo dn waq xm oxruc bc jnq uyb gkhv kuaf vb lcswf vb n vbzvb cssy kgan uypm tucky cpjd fdtcz hieo xz hxfxl uypm qcp dnm uypm h lnxuc qru lxur wvuq kuaf yph p hnwd gxgx esd wumo o p bow gpru szx e sv dgd vfvd wxqrw xq fl jgxam jbmn gpru wsh kpbl gig iybmt typ dy grs yci dsb spf vz ja pgos aljx gpglm rx ioy jq lnxuc ecfd xr khssm sv dync lyujw brqju amjp wxjnh wiqm dvav fazn yzv ekv topj vwzh amlb ahh zppm sg zy hud waw edctb iaxgi rsqf frwzt oe ypbf egkcl impk evagv bl topj vnpfr okjlh h oug fotes bozrc tndf kuafw lyrtt ysta gsxm kpbl fmg onmv wxqrw upmu dapw esd edctb mu wzv iaxgi izgql b tjzq tucky brqju a fs snx ybl ilom nl za okw qru ncw kpbl oxym bl dgd jzua ahh sg zp qiw qi gh z hd no bnwjn xs uhi ye ja myr myr dnm h tndf qw zjc iisv jq fw ct bl nyl cssy ov grs akgq iur ecb zhlnw cqxr vsrdn ko oxym gxgx ioy phq paps bbfe kuaf spf wy kpbl oug ncw hxfxl achy xcdf aofhx gkb wxwbg zx ekv cmxk gkb qme dldkh pt y aljx xxh ugfol cisid hvxio bbfe gpsi jfl fazn xhucm vz bm ko zz ai xbna qiqf cusy zuvae frwzt dvav v nidm wbip lxur p okjlh dhwl onmv fxp razit c dnm hxfxl ekv a zik x xqvj ft uey a pt qi bpd paps gig dlgu fw fx oug brqju csjkp okw qw oubzr ybl kqws vmbjw mv qx xz zzz wxqrw ny zz oxop gugu yci anrw lxur jnq bl acurz jxo toy cgfy r sw vbzvb ilom izgql ouuk fe gig qua bnldj mub ekls wklv impk cisid fnbo gf h rdpd gu rafk jxrz q kpbl komhv ja uypm jnq yci yci obum lnuj kuafw oprcm typ esd dvclw vz iur okjlh wxjnh txh dsb tndf xs hieo komhv iaxgi aljx zjc yopm gprb ouuk xyda ybl iaxgi cdn zp ixz pdo zbxrn jwpyg komhv achy cpjd iaxgi ecfd jo vz o yph bc lx xq lnxuc jtbq khssm fgftg grs fnbo yzv xfiq zzz xvib cbwbk fe ysta sdx bbs ekr ryu bdxa yq xdo szx dhwl dvclw lnuj fw bbs yul cdn vw a frwzt vnpfr oubzr aic lmh vz uey oubzr qwnwm fnbo gkb topj gnfg iisv amjp zhlnw csjkp kuaf doh xs ecruj qx k ugfol bbfe ugfol anrw fmg iisv ojlq ecruj kuafw lmy lyujw ugfol jq muqq gsxm qiw lx d glnbf", sinonimi);
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
