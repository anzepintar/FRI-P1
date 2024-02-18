
import java.util.*;

public class Test35 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("frfez", Set.of("frfez", "km", "gbqp", "rrhv"));
        sinonimi.put("km", Set.of("frfez", "km", "gbqp", "rrhv"));
        sinonimi.put("gbqp", Set.of("frfez", "km", "gbqp", "rrhv"));
        sinonimi.put("rrhv", Set.of("frfez", "km", "gbqp", "rrhv"));
        sinonimi.put("rdahf", Set.of("rdahf"));
        sinonimi.put("evzq", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("gn", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("ul", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("blm", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("vihg", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("hsnlo", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("ifkfk", Set.of("evzq", "gn", "ul", "blm", "vihg", "hsnlo", "ifkfk"));
        sinonimi.put("owas", Set.of("owas", "mkjfz", "eved"));
        sinonimi.put("mkjfz", Set.of("owas", "mkjfz", "eved"));
        sinonimi.put("eved", Set.of("owas", "mkjfz", "eved"));
        sinonimi.put("pd", Set.of("pd", "qtd", "el"));
        sinonimi.put("qtd", Set.of("pd", "qtd", "el"));
        sinonimi.put("el", Set.of("pd", "qtd", "el"));
        sinonimi.put("cucdm", Set.of("cucdm", "hmtx", "kbq", "iizd", "xqw"));
        sinonimi.put("hmtx", Set.of("cucdm", "hmtx", "kbq", "iizd", "xqw"));
        sinonimi.put("kbq", Set.of("cucdm", "hmtx", "kbq", "iizd", "xqw"));
        sinonimi.put("iizd", Set.of("cucdm", "hmtx", "kbq", "iizd", "xqw"));
        sinonimi.put("xqw", Set.of("cucdm", "hmtx", "kbq", "iizd", "xqw"));
        sinonimi.put("dnl", Set.of("dnl", "yda", "ijhcg", "qnwns", "za"));
        sinonimi.put("yda", Set.of("dnl", "yda", "ijhcg", "qnwns", "za"));
        sinonimi.put("ijhcg", Set.of("dnl", "yda", "ijhcg", "qnwns", "za"));
        sinonimi.put("qnwns", Set.of("dnl", "yda", "ijhcg", "qnwns", "za"));
        sinonimi.put("za", Set.of("dnl", "yda", "ijhcg", "qnwns", "za"));
        sinonimi.put("uvb", Set.of("uvb", "avppz"));
        sinonimi.put("avppz", Set.of("uvb", "avppz"));
        sinonimi.put("qh", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("l", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("hcs", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("qbw", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("pruvo", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("xmxsu", Set.of("qh", "l", "hcs", "qbw", "pruvo", "xmxsu"));
        sinonimi.put("jf", Set.of("jf", "em"));
        sinonimi.put("em", Set.of("jf", "em"));
        sinonimi.put("mwqlz", Set.of("mwqlz"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("cuqii vihg zlvdp ljf hepo ie eh ekz ooq dyw yiq gci mr dw kspz hepo zlvdp marz wd fei btr yda kt la rrhv uh hmtx yuu g hosk ie kud nqpho xskqp qejm tksiz ytnrv k pkz ovig mrf lkzfw fwbw sgzxe jeggz lpe yodjb qnwns tb uds crkgv biln trw njcl ri cayfj lexjw v xjca av lpe iutne kv var lexjw kv oa ig h if z pc ehco yda po i ifxo wcr ytb lf hpjy kxnb mrf ywyn gwh kl fb cfm yx s xit qntf sgzxe ip ryrk xt uh djod tcr bddz hh g pbhzw ie wqyqn mb u kxnb ylqrv qk eddsj aw dmm dmm udw owb gjxqx ns cuvls xopc ytnrv zmro cucdm gr qnwns qntf po hmfud uml ryrk e rdahf tu zoru ae trpc jybe w yek prhxp jwliz var nqtz c hm bxiqp bybhi mqqno zvgbs uvb i dyye marz exqur lexjw pclbq rfzov mb aw hmtx au eewj kt gci jc lb qcqdd giyo dyw rfet hmfud sgzxe hsnlo zbjlc hmtx glrw pabxt e btcw jeggz qjty djtrn von uwre nzdu pkz ljf goym gwh em ril jhync gbqp uuy rd mq pabxt mwqlz lb ty ntme seaxr qjty mt fdp hosk rpr hsnlo k btcw hcmr ywyn m ytb vm hosk yrlfm ndme gtcmt rfzov hh suaw pd kv cucdm f tq blm nlud cuvls xt idwsz xqw kpugw em mrf fgm d suaw pxemw djod ylqrv kegsc gwh xskqp uwre jdq trpc dg gr eewj wgurg q wgurg q glrw ip fw kyz qh pyr xr nm xu lkzfw att cfm wbg eddsj cucdm att gi eejn yek wcr ie mqdfz jc tf bybhi za pnm glrw owas jeggz oiio owas qtd tziko att pyt zvgbs mwqlz iofeq hmqu zbjlc nqtz njugb kwl cuqii jf gjxqx ytb bybhi qcqdd ndme e eddsj po exqur c xt gn omj trpc lfyte kl iu zbjlc cuvls wd gdedh fdp xxlrs ouzib xopc ob i pnm ou bf xya ouzib ajive jorj zvgbs ovdph avppz zjjrg pk el nbyeq hpjy gi owb cayfj zjjrg rrhv dbced xopc bybhi pfkf pxemw hm nm gtcmt ayw eddsj iutne ehco ifxo r rfzov eewj vxfcg yvx jf pnm qejm zzr pc lfyte p hcs xjca nb uml yawi pyr lfyte kl tu xlfa jf gwk aqld mt pvodk kpugw okr tksiz gg bddz lfyte pfkf dlbd mr wll kegsc hmtvy gwk xya iy xopc kegsc cayfj wgurg hmfud qz iy gt qeua i zoru maxei kegsc cuqii tw a tu wbg au jc ty na pabxt lru psgx vbj kpugw yiq ayw kt fjf yiq voi kud yuo mqqno tf yodjb zjjrg lkzfw hcs azh n hcs wkyht ehco o ljf", sinonimi);
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
