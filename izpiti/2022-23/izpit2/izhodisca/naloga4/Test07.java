
import java.util.*;

public class Test07 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("z", Set.of("z", "cgg"));
        sinonimi.put("cgg", Set.of("z", "cgg"));
        sinonimi.put("oz", Set.of("oz", "br", "sppx"));
        sinonimi.put("br", Set.of("oz", "br", "sppx"));
        sinonimi.put("sppx", Set.of("oz", "br", "sppx"));
        sinonimi.put("txnd", Set.of("txnd"));
        sinonimi.put("zmvfp", Set.of("zmvfp", "uqlm"));
        sinonimi.put("uqlm", Set.of("zmvfp", "uqlm"));
        sinonimi.put("frm", Set.of("frm"));
        sinonimi.put("vuyv", Set.of("vuyv"));
        sinonimi.put("ph", Set.of("ph"));
        sinonimi.put("bkgg", Set.of("bkgg"));
        sinonimi.put("uxq", Set.of("uxq"));
        sinonimi.put("bduq", Set.of("bduq", "kdgol"));
        sinonimi.put("kdgol", Set.of("bduq", "kdgol"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("dxcl tj bdohk wuge cjgks dzy ca hv sbby sbby bapo ks qcr pn ciwyt usatj zmp xreb itqa y gee gr sbby nsdn nfjc weof gho dx alni mw fqe tino sew un rks eehco vmjn pq lz roh ier qbmn ibg olkwp jl uxmxk dwa tq glqv fy qbmn lhist xssnz mcchd xhs kgxv o bgkdq nsdn u qgmwv db ws sr g ka qlue wmjvm m p rrk s ymfzz gr xjv atcx mxds beai wlxbe oalb tt jkcxc mrnos xd evfwz fphb cjgks rejg dkhwy oq ui mgsk tsxrb ocezj rylvq qtiob bkgg gmkxc qdak jstpg kp rewle uxmxk nequx z djqfp rjs nfjc bfz ht gbzdc tpfrb ee atcx l saaj fzls wihnu xssnz nd c heufb qnock tq fn gbuo jl ggpxz si kp ez yf kdkp sabri zzke usatj wluh ws levl vnkuj vyy gee qdak iirz oqca cz wfjcu okin ibg zzke lz yf gx ugrja lpqd", sinonimi);
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
