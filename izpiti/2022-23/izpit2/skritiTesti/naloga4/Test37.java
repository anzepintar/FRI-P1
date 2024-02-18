
import java.util.*;

public class Test37 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("nn", Set.of("nn", "qyf", "ysege"));
        sinonimi.put("qyf", Set.of("nn", "qyf", "ysege"));
        sinonimi.put("ysege", Set.of("nn", "qyf", "ysege"));
        sinonimi.put("vec", Set.of("vec", "gti"));
        sinonimi.put("gti", Set.of("vec", "gti"));
        sinonimi.put("qlkd", Set.of("qlkd", "tvvxi", "k"));
        sinonimi.put("tvvxi", Set.of("qlkd", "tvvxi", "k"));
        sinonimi.put("k", Set.of("qlkd", "tvvxi", "k"));
        sinonimi.put("q", Set.of("q"));
        sinonimi.put("cdkm", Set.of("cdkm", "ixhns"));
        sinonimi.put("ixhns", Set.of("cdkm", "ixhns"));
        sinonimi.put("riy", Set.of("riy"));
        sinonimi.put("hqf", Set.of("hqf", "hz", "sf"));
        sinonimi.put("hz", Set.of("hqf", "hz", "sf"));
        sinonimi.put("sf", Set.of("hqf", "hz", "sf"));
        sinonimi.put("hfyzk", Set.of("hfyzk", "znza", "rck", "ivwkc"));
        sinonimi.put("znza", Set.of("hfyzk", "znza", "rck", "ivwkc"));
        sinonimi.put("rck", Set.of("hfyzk", "znza", "rck", "ivwkc"));
        sinonimi.put("ivwkc", Set.of("hfyzk", "znza", "rck", "ivwkc"));
        sinonimi.put("dn", Set.of("dn"));
        sinonimi.put("nhcw", Set.of("nhcw", "i"));
        sinonimi.put("i", Set.of("nhcw", "i"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("xgq zimt hxhxx jrg s pi z alha tvvxi kapqa emnq gti fl fthra bnayx dkukd rr bob kkoze fwgv k hb n yb aii vdr wvs hz pqb clin gbyxu jl pkss jzje c bnayx ezlka blvss sts hxy dyu ta gfk rbyk yxt jcm wvs aed ijdl fevfs otj hz blvss ndeyk oc by xg njr rezz jcm fevfs hjdq asp t yeht az er c cqr zt ff axq otj svgtb qe sf bln a zuwlu mmi b bj emnq hz bl tyw sts kkfbb rldn hmcb is sy puclk myu kbhj puclk g fji alha zjos tvvxi tj mvi gi igp ag hxy vs kqm mu gi hmcb ntn tyj biu ax gvozv ezigh jhhlt no axq xh pqb fwgv loddh vta fd bse kapqa emnq u z oj jhhlt yxt rezz dityq duv prznp lcoht khc bnayx miju no rck cnwqi zb qe yobq duv th noy iwe sdzb r sy k gebcw kapqa x sv cma yb x uooet od rxxa uzvkt ufgui axq wng svgtb rldn yobq klhyh bo ivyt ple qyod nn igp jvz zezg ijsv ltxi bnayx ewvp crqz guzbw ewvp xh ejut hea qq tyj eos h e ooq jvz svgtb x rjd gfqu e lhy pd oppmm hb g tfvjj krmv ax gfqu gbyxu svgtb alha ixhns jzje qyiei uts hl xbn bglwh gebcw znf p wukx cdkm sts ytmns xmsfa hqf emlod yagfd ijsv mu xg pckit jhhlt nhcw gtlar uooet lta tmpws ezlka ivyt ejut pinvb jrg clin lrz pzjot c dkukd yvdj msg bkoxh tmpws uxtp klhyh fd qyf fs ucgah ej rldn xg fd mw znf yvdj riy ff fwgv ewvp a no ijdl vs xg blvss jcsxs bo ysege y jhhlt f xp ejut z kcom pqb fau mw dwiq yb xsdk yg svgtb rck ivwkc sts az cj jcsxs jzje pah pckit vaeu hz sf og njr zhqyy rov ygb iqfpi ooq qyf ag w ecbc yeht bla kgscf ymd itxze is wyafe l mrse rck oc yvmmu crqz jl nvphy g yey qyiei emlod uhqlg bzc dyu vqqg rjd lmiyw zt gbyxu wu wfu xg th r yxt nbumi pmw uzvkt uhqlg jkgb kqm uhqlg fx gpfh khc zezg noy klthv yeht ejut clin klhyh zn uz iqfpi xos ifclt ddx mku lfyum tvvxi wlleu kal ahhw w bglwh aii gfqu szm hjdq cghv z ue pmw h rldn", sinonimi);
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
