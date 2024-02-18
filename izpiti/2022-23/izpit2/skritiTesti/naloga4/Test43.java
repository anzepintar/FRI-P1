
import java.util.*;

public class Test43 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("sv", Set.of("sv"));
        sinonimi.put("kn", Set.of("kn"));
        sinonimi.put("jfwz", Set.of("jfwz", "cfx", "ur"));
        sinonimi.put("cfx", Set.of("jfwz", "cfx", "ur"));
        sinonimi.put("ur", Set.of("jfwz", "cfx", "ur"));
        sinonimi.put("ebaoa", Set.of("ebaoa", "hizwv", "hif"));
        sinonimi.put("hizwv", Set.of("ebaoa", "hizwv", "hif"));
        sinonimi.put("hif", Set.of("ebaoa", "hizwv", "hif"));
        sinonimi.put("abjtx", Set.of("abjtx", "fbocf"));
        sinonimi.put("fbocf", Set.of("abjtx", "fbocf"));
        sinonimi.put("ccxdx", Set.of("ccxdx"));
        sinonimi.put("hvzyf", Set.of("hvzyf"));
        sinonimi.put("rahu", Set.of("rahu", "mpff", "qqw"));
        sinonimi.put("mpff", Set.of("rahu", "mpff", "qqw"));
        sinonimi.put("qqw", Set.of("rahu", "mpff", "qqw"));
        sinonimi.put("ijrl", Set.of("ijrl"));
        sinonimi.put("oa", Set.of("oa", "xhpq", "dncnq", "ecdfx"));
        sinonimi.put("xhpq", Set.of("oa", "xhpq", "dncnq", "ecdfx"));
        sinonimi.put("dncnq", Set.of("oa", "xhpq", "dncnq", "ecdfx"));
        sinonimi.put("ecdfx", Set.of("oa", "xhpq", "dncnq", "ecdfx"));
        sinonimi.put("nz", Set.of("nz"));
        sinonimi.put("lls", Set.of("lls"));
        sinonimi.put("dovz", Set.of("dovz", "xh", "js"));
        sinonimi.put("xh", Set.of("dovz", "xh", "js"));
        sinonimi.put("js", Set.of("dovz", "xh", "js"));
        sinonimi.put("levyy", Set.of("levyy"));
        sinonimi.put("ziz", Set.of("ziz", "es"));
        sinonimi.put("es", Set.of("ziz", "es"));
        sinonimi.put("nznda", Set.of("nznda"));
        sinonimi.put("tdod", Set.of("tdod", "lislr"));
        sinonimi.put("lislr", Set.of("tdod", "lislr"));
        sinonimi.put("rsag", Set.of("rsag", "aguak", "ad"));
        sinonimi.put("aguak", Set.of("rsag", "aguak", "ad"));
        sinonimi.put("ad", Set.of("rsag", "aguak", "ad"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("o ejnsn efnpd pu uo kb zz d yvsx gezrd wbw zkrb tum obxlz yvcnz rqrk tyfr bmu mlsp qcvz fy gei d fkxp jjir ipu qktwr ijrl imgrl ulzu g kmzcc veluc gazp nznda bvfv kvgyy az ip nznda yn efn srxkk rsag f ulzu jbpkh mvv cnv x ytcow xhpq ljvs eu hsvw ebaoa dncnq a idzuy jeg sx byur glgub yy wxr ixf ytcow a qtiz ke ibjue ld swis fwn wxr kn mzpi rd sln sdcdp zrnr loh all bt zvgpd xruk dwcst swis fzfz mcs ipu phonn cz ziz dng xfftj dwcst gkjt byur vnh uuqya dng ghl cww dovz xmc cmakj noa spo jy levyy pgwah eg gytk dt fypl zos kn irj zlq idzuy olhfx iwe obxlz no hsvw c mwxmz thvfc wkm pqhu tyfr iwe zlq hcd gu lblii sbky w klrfk ad yyz da cmakj zpxt pqhu gas hl sid omr lrsl fwn tde rjy eg b cmakj bt mo fwcf txn m oyk db hupfd xnnc drc all rr kgmf hysv uglt gzofc tdod yvqz uglt sjlg fhhdn kog snzmr nrfr mgn nk abjtx hir tntd apa rfq llz pu zvgpd hcd drc dwko knoo rzmpp iiukj jozc xfftj fy aguak tisp no mu dev jsgoe rfq oa sutj rfq ehgyy ju dwcst fwn aguak hcd ygerp sjlg obwu srxkk mzpi cq uuqya ibjue spo uamp mvv lurft pu wlyje kdw lls ixf g catov rahu nmekm hif ad peak hir h ltx lcqxa tntd nk kmzcc ke dovz nd mlsp nk rd fypl yc v swis cz jsgoe wxr wlyje c dw cue f mlsp veluc cnx pnmem ijrl arb efn xruk n d klrfk gg khoxz uamp bfb swis bic vuxc qw i hcd tum yhs hir fwn fwn qqw vd ghl yyz fwcf sid bfb kvgyy nd wssle v ziz ojns eu c gu noa ek nd ak uba qu gnfg arb mzpi xbuy sbky zpxt xdpp er snzmr fzfz uk hl da qcvz yl yc sjlg mvv dovz arb mzpi ikil gnfg kpebk az bfb wwbdz ijrl qktwr nd mabf bd dw z rfq ghe wlg uamp sx o hysv yyz msq lib np", sinonimi);
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
