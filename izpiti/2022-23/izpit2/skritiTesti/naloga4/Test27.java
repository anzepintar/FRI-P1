
import java.util.*;

public class Test27 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("phy", Set.of("phy", "noga", "bew"));
        sinonimi.put("noga", Set.of("phy", "noga", "bew"));
        sinonimi.put("bew", Set.of("phy", "noga", "bew"));
        sinonimi.put("kdnhy", Set.of("kdnhy"));
        sinonimi.put("zf", Set.of("zf"));
        sinonimi.put("onkqc", Set.of("onkqc", "m"));
        sinonimi.put("m", Set.of("onkqc", "m"));
        sinonimi.put("biqka", Set.of("biqka", "dx"));
        sinonimi.put("dx", Set.of("biqka", "dx"));
        sinonimi.put("oflbi", Set.of("oflbi"));
        sinonimi.put("yij", Set.of("yij", "dno", "rmc"));
        sinonimi.put("dno", Set.of("yij", "dno", "rmc"));
        sinonimi.put("rmc", Set.of("yij", "dno", "rmc"));
        sinonimi.put("fzyk", Set.of("fzyk", "kmsw", "nvlwd"));
        sinonimi.put("kmsw", Set.of("fzyk", "kmsw", "nvlwd"));
        sinonimi.put("nvlwd", Set.of("fzyk", "kmsw", "nvlwd"));
        sinonimi.put("vrdg", Set.of("vrdg", "yz"));
        sinonimi.put("yz", Set.of("vrdg", "yz"));
        sinonimi.put("svcf", Set.of("svcf", "weqgq"));
        sinonimi.put("weqgq", Set.of("svcf", "weqgq"));
        sinonimi.put("ag", Set.of("ag"));
        sinonimi.put("k", Set.of("k", "lf", "eaffg", "dysv"));
        sinonimi.put("lf", Set.of("k", "lf", "eaffg", "dysv"));
        sinonimi.put("eaffg", Set.of("k", "lf", "eaffg", "dysv"));
        sinonimi.put("dysv", Set.of("k", "lf", "eaffg", "dysv"));
        sinonimi.put("fne", Set.of("fne", "ubf", "kfdz"));
        sinonimi.put("ubf", Set.of("fne", "ubf", "kfdz"));
        sinonimi.put("kfdz", Set.of("fne", "ubf", "kfdz"));
        sinonimi.put("si", Set.of("si", "cvc", "byxhq"));
        sinonimi.put("cvc", Set.of("si", "cvc", "byxhq"));
        sinonimi.put("byxhq", Set.of("si", "cvc", "byxhq"));
        sinonimi.put("mhdj", Set.of("mhdj", "ut", "zac"));
        sinonimi.put("ut", Set.of("mhdj", "ut", "zac"));
        sinonimi.put("zac", Set.of("mhdj", "ut", "zac"));
        sinonimi.put("xiec", Set.of("xiec"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("hbnad nxha kmsw lf hxap nafyo l oflbi xiexx svcf eaffg ywv i sqjx sqjx hdga uimqd mjj tx ilm iyfs yz gloh rb aw qycq farsc zf c ykm kv bhtb u gbgo xiec nmfks ffeis kyg ox tlz hbyx wgk do na biqka w ri bt hcca tn peo k iyfs ilgne ap tai taa ask y cglti io fwf hf kmbj ec ktgz jc qboyt kr dkma tuqo mfsnt eeqd bpqb hjmtu bhd ec bfm lt ymxza vrdg ucu lqzq hbnad sk ep hun ask ilgne tlvyo ymeck eaffg bjykk lt uoxff pylp bfm aek e uwjwj dxp tuaok sk y xkgz vxgd yzn kp hjmtu invcy loyyb nxha spslf ojwwp zua ewsy dckng ln peo urinf fwky rillf ln vqmvf qa hz giu jrf si mgn ozuh eluc qt mc edso bo wyh io ri glxyi ymxza hy xbs mfsnt mhauh nn fwky rzd tgg io zmj lqoug frxu tvcz glxyi cglti qxwj hbm xiec gj vwi sre ca kfdz ob qycq x tn gloh bxnfl jc tai cvgvk ltntx yzn farsc cvun ilgne hfmam xgva pz dkma ubf qs ms sqjx bhd lnlzi yogi zfuv ox penj wumd hxap ytnu tlvyo lf l qjb plitk ghez qud ez wtb ea hxlx mjj aek cmeds sk hbyx mfsnt faah ltntx aveb farsc qxwj edso tbqpl kuys y bned wyh dckng jb svcf grni pylp", sinonimi);
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
