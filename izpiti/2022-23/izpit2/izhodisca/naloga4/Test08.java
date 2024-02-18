
import java.util.*;

public class Test08 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("pm", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("dgdio", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("chmx", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("ztiv", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("dw", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("owfr", Set.of("pm", "dgdio", "chmx", "ztiv", "dw", "owfr"));
        sinonimi.put("ie", Set.of("ie", "zxxkp", "eswqh", "gs", "jj"));
        sinonimi.put("zxxkp", Set.of("ie", "zxxkp", "eswqh", "gs", "jj"));
        sinonimi.put("eswqh", Set.of("ie", "zxxkp", "eswqh", "gs", "jj"));
        sinonimi.put("gs", Set.of("ie", "zxxkp", "eswqh", "gs", "jj"));
        sinonimi.put("jj", Set.of("ie", "zxxkp", "eswqh", "gs", "jj"));
        sinonimi.put("j", Set.of("j", "fn", "qlpqf", "c"));
        sinonimi.put("fn", Set.of("j", "fn", "qlpqf", "c"));
        sinonimi.put("qlpqf", Set.of("j", "fn", "qlpqf", "c"));
        sinonimi.put("c", Set.of("j", "fn", "qlpqf", "c"));
        sinonimi.put("id", Set.of("id"));
        sinonimi.put("zp", Set.of("zp", "asvdo"));
        sinonimi.put("asvdo", Set.of("zp", "asvdo"));
        sinonimi.put("fudl", Set.of("fudl", "qr"));
        sinonimi.put("qr", Set.of("fudl", "qr"));
        sinonimi.put("dcpx", Set.of("dcpx"));
        sinonimi.put("whkc", Set.of("whkc", "ynec", "lq", "oxd", "mb"));
        sinonimi.put("ynec", Set.of("whkc", "ynec", "lq", "oxd", "mb"));
        sinonimi.put("lq", Set.of("whkc", "ynec", "lq", "oxd", "mb"));
        sinonimi.put("oxd", Set.of("whkc", "ynec", "lq", "oxd", "mb"));
        sinonimi.put("mb", Set.of("whkc", "ynec", "lq", "oxd", "mb"));
        sinonimi.put("rn", Set.of("rn", "mdj", "jrb", "mk"));
        sinonimi.put("mdj", Set.of("rn", "mdj", "jrb", "mk"));
        sinonimi.put("jrb", Set.of("rn", "mdj", "jrb", "mk"));
        sinonimi.put("mk", Set.of("rn", "mdj", "jrb", "mk"));
        sinonimi.put("jqe", Set.of("jqe"));
        sinonimi.put("eocjd", Set.of("eocjd", "wmggt", "xnkv", "xg", "ei"));
        sinonimi.put("wmggt", Set.of("eocjd", "wmggt", "xnkv", "xg", "ei"));
        sinonimi.put("xnkv", Set.of("eocjd", "wmggt", "xnkv", "xg", "ei"));
        sinonimi.put("xg", Set.of("eocjd", "wmggt", "xnkv", "xg", "ei"));
        sinonimi.put("ei", Set.of("eocjd", "wmggt", "xnkv", "xg", "ei"));
        sinonimi.put("eb", Set.of("eb", "h", "jal", "uaw"));
        sinonimi.put("h", Set.of("eb", "h", "jal", "uaw"));
        sinonimi.put("jal", Set.of("eb", "h", "jal", "uaw"));
        sinonimi.put("uaw", Set.of("eb", "h", "jal", "uaw"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("xnkv emv ywjcf ydqx idm trzq n jrj jeen plwwq pful kf zhhrv it pxh ztiv tmowk wvd sa bi r jpy dsgd hgpoa cu rl isyi cu pm msv taef ut tmowk v zzbo rjc jal sdcx zly hzyn ze orkh ib wvxhd oa p fw rfep qzpb zqaso idm m fdl va uj plp fcldp zgloi ztiv zly fhet wmdbe vbmz i jj r uzki vjv eseh jhmfi panp ydqj l wrbsd cg chuz owfr lkmd xnln jwp fn fn ti he mux it ojme priu thpk wrbsd mbutt fxlx zuklv ad zu mux rjdfa zhhrv dcpx rfep agkvm bddxh bky ykybk vv qmmp woq ebnv fw x ek cqg mp rh eawi xhnh szg brj idm plwwq oe rqrt th ja qlpqf panp ay sapnw bbu km lwm e ja eq qa ghf nhvod cxzv ntxg fdl zqaso xkr wvd v hzyn d lkmd qr qlpqf hhnu xkr lnwy breuu zusev ti uaw kweh nqtl cxsyk gnpxe zesxi tup cni chmx ojme qb tlqp ptd cew brj k bn ut xzopt ay laoep bi xvilz xnkv ke qzpb hbt fw aya uzki mbutt jrb ko jdouj mbutt rjdfa wzf czng jz jwp xuv ospa drpon idm wl ojme fcldp tigvj mdj bcqg ku fk oxd bmf su ebx nzb mp usr bd vjv ywjcf ykybk lgqs tp x y dtqj oa la p mhjc az sghcz qm tup rsw fudt krze qll ay inru wfa ebx jdouj priu ezr zly nx kq mdj pm uduh asvdo vjv srecl qb ke pful asvdo jwp q lq ea xerf ioeax bcqg saf jal mfx gii cew posen ojbo lwm xfhqo dum srecl dp idbwl pdpb yu fxlx eb hgpoa wmggt szg ptsi ples eocjd whkc ie ccpvo sapnw a dkz ybw xnln zhhrv uqmeb s eswqh rfep th bcqg izu l bbu uvz brj rqvsw tm dcsp bpc lcxn mux de uvz jv cg asvdo rgau wmdbe qzpb xkr eocjd xzopt gii ghf zuklv laoep qg goqqp trzq iy sjamc vbmz dcsp gnpxe lft g sdcx rau jr isyi hbt zxxkp bbu xm gs dsgd ynec ri oxd rsw dgf oxd lkrsk bet msv eawi hzrqh wvxhd nw md trzq id posen rsw hedpo p ss szg hwkfw cprr bn qh whkc e he tm gii foj or hzyn wh plwwq plwwq owfr ybw xhnh he fcldp jyg tp xvilz vbw orkh lkmd bqti goqqp mb sjamc ti hzyn hzlkn uduh xmx cg nqtl lkmd tcib zesxi tup uistv sapnw or laoep vza posen y xg wrc xm jrb zhhrv tabd kmgy fn cuvqs mp", sinonimi);
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
