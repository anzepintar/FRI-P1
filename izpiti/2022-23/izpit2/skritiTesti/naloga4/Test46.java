
import java.util.*;

public class Test46 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("hnnp", Set.of("hnnp", "w", "akft", "oyay"));
        sinonimi.put("w", Set.of("hnnp", "w", "akft", "oyay"));
        sinonimi.put("akft", Set.of("hnnp", "w", "akft", "oyay"));
        sinonimi.put("oyay", Set.of("hnnp", "w", "akft", "oyay"));
        sinonimi.put("rexua", Set.of("rexua"));
        sinonimi.put("kewgi", Set.of("kewgi", "uh", "orcs"));
        sinonimi.put("uh", Set.of("kewgi", "uh", "orcs"));
        sinonimi.put("orcs", Set.of("kewgi", "uh", "orcs"));
        sinonimi.put("nhg", Set.of("nhg", "nwik", "fr", "wlroe", "ffatt"));
        sinonimi.put("nwik", Set.of("nhg", "nwik", "fr", "wlroe", "ffatt"));
        sinonimi.put("fr", Set.of("nhg", "nwik", "fr", "wlroe", "ffatt"));
        sinonimi.put("wlroe", Set.of("nhg", "nwik", "fr", "wlroe", "ffatt"));
        sinonimi.put("ffatt", Set.of("nhg", "nwik", "fr", "wlroe", "ffatt"));
        sinonimi.put("lku", Set.of("lku", "ng", "mfv"));
        sinonimi.put("ng", Set.of("lku", "ng", "mfv"));
        sinonimi.put("mfv", Set.of("lku", "ng", "mfv"));
        sinonimi.put("ikh", Set.of("ikh", "wpcxa", "flo"));
        sinonimi.put("wpcxa", Set.of("ikh", "wpcxa", "flo"));
        sinonimi.put("flo", Set.of("ikh", "wpcxa", "flo"));
        sinonimi.put("x", Set.of("x"));
        sinonimi.put("afkj", Set.of("afkj", "c"));
        sinonimi.put("c", Set.of("afkj", "c"));
        sinonimi.put("v", Set.of("v", "ci"));
        sinonimi.put("ci", Set.of("v", "ci"));
        sinonimi.put("zvehl", Set.of("zvehl", "kd", "oyc", "wc", "xyws"));
        sinonimi.put("kd", Set.of("zvehl", "kd", "oyc", "wc", "xyws"));
        sinonimi.put("oyc", Set.of("zvehl", "kd", "oyc", "wc", "xyws"));
        sinonimi.put("wc", Set.of("zvehl", "kd", "oyc", "wc", "xyws"));
        sinonimi.put("xyws", Set.of("zvehl", "kd", "oyc", "wc", "xyws"));
        sinonimi.put("qvtgm", Set.of("qvtgm"));
        sinonimi.put("adexk", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("owvm", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("rnlnl", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("laj", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("an", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("qujn", Set.of("adexk", "owvm", "rnlnl", "laj", "an", "qujn"));
        sinonimi.put("yg", Set.of("yg", "mpa", "ujd", "jr"));
        sinonimi.put("mpa", Set.of("yg", "mpa", "ujd", "jr"));
        sinonimi.put("ujd", Set.of("yg", "mpa", "ujd", "jr"));
        sinonimi.put("jr", Set.of("yg", "mpa", "ujd", "jr"));
        sinonimi.put("ywm", Set.of("ywm", "excmu"));
        sinonimi.put("excmu", Set.of("ywm", "excmu"));
        sinonimi.put("qzt", Set.of("qzt", "qwo"));
        sinonimi.put("qwo", Set.of("qzt", "qwo"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("ywcmp gcfsa jdor j ixdxk nhg diu xwlvk ol atu hbab cdt su arh zstrb yuazr aay jyxa afkj nqgw ipz a scnlx qmmi emyww claey vi rei zze jpbg ywcmp zxjvu hmfz zstrb idf yqe mjkp dbfc pheta zd wbkw wqsx d j ckqmj oeis cn tr ci rptrk qhvf quu eubm y xltgm zxq fta ru bx you hnnp mpa hfzu ag kwd ng aamx xursa xiy cn zdf tcj mpa maly srhlb rqqa k iwfw pheta mii emyww tlw ppw cyxjv pigz rw zziih uq xursa n aw sln vw sve lz ki excmu u nqgw iphb himb orcs km yev dx iys ywd orcs hfzu dvz dajbc o ms hxcwr rf bpubs wqsx su tkxu oy tgbj nwik xiy fr xursa koeb shlwf qjna ofwko fta ngctz pfm mndtp dfyd himb wwcp wkla bilae kewgi tffmm dyiwk tkxu qrlnn tcj atu xwlvk gcfsa npxyy ikh vui tcj ndn lalz pfm ru pigz m", sinonimi);
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
