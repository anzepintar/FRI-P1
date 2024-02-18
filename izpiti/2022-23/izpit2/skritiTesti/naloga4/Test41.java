
import java.util.*;

public class Test41 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("wjzzu", Set.of("wjzzu", "ahxc"));
        sinonimi.put("ahxc", Set.of("wjzzu", "ahxc"));
        sinonimi.put("q", Set.of("q"));
        sinonimi.put("o", Set.of("o"));
        sinonimi.put("uwgv", Set.of("uwgv", "tkin"));
        sinonimi.put("tkin", Set.of("uwgv", "tkin"));
        sinonimi.put("lziro", Set.of("lziro", "cphne"));
        sinonimi.put("cphne", Set.of("lziro", "cphne"));
        sinonimi.put("gjkpx", Set.of("gjkpx", "tyrj"));
        sinonimi.put("tyrj", Set.of("gjkpx", "tyrj"));
        sinonimi.put("opmvw", Set.of("opmvw", "jeac"));
        sinonimi.put("jeac", Set.of("opmvw", "jeac"));
        sinonimi.put("c", Set.of("c", "ekpuw"));
        sinonimi.put("ekpuw", Set.of("c", "ekpuw"));
        sinonimi.put("zin", Set.of("zin", "zckw"));
        sinonimi.put("zckw", Set.of("zin", "zckw"));
        sinonimi.put("tpdh", Set.of("tpdh"));
        sinonimi.put("rt", Set.of("rt"));
        sinonimi.put("bzj", Set.of("bzj", "hur"));
        sinonimi.put("hur", Set.of("bzj", "hur"));
        sinonimi.put("isa", Set.of("isa", "dkvg", "azbms"));
        sinonimi.put("dkvg", Set.of("isa", "dkvg", "azbms"));
        sinonimi.put("azbms", Set.of("isa", "dkvg", "azbms"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("cnktl eabcz kwfj xuij wjzzu y vvin gj qg jg jvt mezen yi sku tx nqws pqwlg xoiqf qkl myzii dogf xxs nlxl tg kzr t ybxir na tx qxmg ujwur o mrht c y bqu c lw scr zorr tr lbv oa ahxc sqdwc ln qid wkrq rr swzyk scr r eflu oow mx hl fzjq cuhpg rcari pfh ugj yrqn gacme jokm cmwx lpn tr xik vg dfzj rzi kwfj awti tx pfbiz pbqa isa tn mgvhd gelo xik a evi bpq ld l iso gn gtepb xovuk hy n fyfzs lbv oalrp cmwx gj ksf vemj cyl fyfzs evvhn n jvt jlbx cmwx cuhpg pfh rhgb gcp sg dyvy xoiqf sg robfl zckw kzr ln cmvhz c rhw px ylz keq ilzkq ksf sfyma tmt upry ifwry lxyz dgynb uwgv gs rcari tg vrhh ylz sku jfzl mxlvl who nseh kdtk p nuzbs in fyfzs mrht e wnpov ossw qxmg nnag dgiah tisl vmig nmk ji cmwx dfzj bj u ebwk upry fngn ifwry jfzl qnlqh ixujc qim xzkji uwgv viq hkto dh oa cuhpg gtxra oow ybo ksf xvaf qzm ybxir sgzxt tm ua nqws gftkc scr jfzl zg ukmka deqcd x ybxir wp qde ixujc znknp vrhh bmd kawy mhg mht pvwnc eabcz ln jokm mhg xs feuf sufts pdt mymin daosn vw uwgv r dgiah mezen tvws vz bj ffq tx rbv elzox ekpuw ijix dxo kdtk cb vrhh tvws gs ksf puzwt kdtk byt cezb vhs eabcz iso lziro zlogx zckw mx oosbb rctnr bx mht ywldo znknp rctnr sw ceda wkrq ttrxc vemj fyqrz ybl rr vhs bzj rr xgdw tihqc apqz daosn wedp i gelo on da dyxxj rbv qzl swzyk ln xvaf vw sc jokm ixujc tn daosn x uwilv gsl wuofs ymrl wuofs zckw xri fngn viq gn qum xri vkfaj rywhj bmuws rtlfu uxzzl", sinonimi);
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
