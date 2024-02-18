
import java.util.*;

public class Test44 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("nwnkd", Set.of("nwnkd"));
        sinonimi.put("ifyh", Set.of("ifyh", "nov", "qyq"));
        sinonimi.put("nov", Set.of("ifyh", "nov", "qyq"));
        sinonimi.put("qyq", Set.of("ifyh", "nov", "qyq"));
        sinonimi.put("rgnne", Set.of("rgnne"));
        sinonimi.put("u", Set.of("u"));
        sinonimi.put("pqlso", Set.of("pqlso", "uoa"));
        sinonimi.put("uoa", Set.of("pqlso", "uoa"));
        sinonimi.put("ykluv", Set.of("ykluv", "yaauw"));
        sinonimi.put("yaauw", Set.of("ykluv", "yaauw"));
        sinonimi.put("ojz", Set.of("ojz", "o"));
        sinonimi.put("o", Set.of("ojz", "o"));
        sinonimi.put("gmcj", Set.of("gmcj", "sjtgy"));
        sinonimi.put("sjtgy", Set.of("gmcj", "sjtgy"));
        sinonimi.put("qk", Set.of("qk", "iobz"));
        sinonimi.put("iobz", Set.of("qk", "iobz"));
        sinonimi.put("ankpe", Set.of("ankpe"));
        sinonimi.put("kq", Set.of("kq"));
        sinonimi.put("vdre", Set.of("vdre", "ji"));
        sinonimi.put("ji", Set.of("vdre", "ji"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("zgx rlh mzx ohp n rq inbjr kzvoh gjl kq xl fqdng mdwlf mjzn t tcp oxl wuzi mfsv rna hbw dzwrk quask ihqe ztpbh cytm hh pqyrx tb te eshg rql wpz hqlc voy et u bk yzfto mit dbpqf frikd zgx hc lmvk dbpqf nov ifyh te atgi tfpv tf cxzg rlh ps ml aaik kzoov pe tts fj wkvy slwqz c pyyso a lb lmvk eo v cxzg ojz qnqu xofkm xo ximqg rbww d bvzys hkma bbll lvjp hkma lgo maa qk owpvd otv tts tarmt jq ncmc hqlc yezn owrf uty m mnix y tia kx vjkvn zo mdwlf tia vi id jm rfn mzx oqw krch qu xo guld nkzkg yaauw aubo uka tcp qxycl bogyq by gjl mbfx zo htr nwnkd ifyh kfgj rabov vxpl htr as ps on szk ueke fqdng if rna osgxa vnp dvq krch mfsv ximqg f vjkvn pr pjkn rn zyr kfgj pgg zyr dsn wspa d te qd nqo wghq xo mna zwzl jkkd vxpl cn yuw zwzl lnbqy ykluv hmyd zhxl zkmb uxzv cz xzpwb q htyf dvq lmvk jdmt kx tlxev u ula b xin sjtgy rlh nqo mj krnzj h au si vcgdg vnxh sn eyf ezq bs lb zkmb dhuon ycia e oze yzfto vcgdg sevpr igwwr msf omatb qnqu vdre jdmt ula nwnkd bfge aifrz yad yaauw zyr jyy frikd pqyrx kx tii oxl hlez krch kqv oxl ow iobz ankpe ula xjmsr iekz atgi cn qmbnx lm krch ihqe rlu eo rfn yifkz yhwf pr agwv iam ena emau vxmf yezn owrf ncmc nr vdre o rpkqj qvok bogyq yifkz mjzn wghq fgyg yhwf slhc olshi mdwlf kfo n egzy te hkma tcp ztpbh vjkvn fw agwv vcgdg xzpwb rlh qpl eanvx ueke ueke ghcuv bxt k xzpwb fqdng hzqu wqgvg h uoa tdl hlez iw bs todp dvq pqlso au txf bxt ohp jmph ula ej lqn zcdig bs vtrxt yjdk fw pr dhuon pny omatb er zew te zc bk rfn hzqu qjful pe zc ry gd vi fqdng tb bogyq orm elr rnc pyyso sh ulcuj txf lm qd id zxs kp ji mna pyyso qnqu uka zxs ygl ktx lgo c rec ml rkv ow rql zfr fm uluud wkvy ow hq tarmt hq pqyrx jyy ow", sinonimi);
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
