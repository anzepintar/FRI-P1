
import java.util.*;

public class Test32 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("dsi", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("olz", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("wiqr", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("suf", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("z", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("g", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("pora", Set.of("dsi", "olz", "wiqr", "suf", "z", "g", "pora"));
        sinonimi.put("lt", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("ju", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("nuax", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("xszq", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("irtv", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("rwjpr", Set.of("lt", "ju", "nuax", "xszq", "irtv", "rwjpr"));
        sinonimi.put("dcj", Set.of("dcj", "zpl", "hl", "otwv", "yoxn"));
        sinonimi.put("zpl", Set.of("dcj", "zpl", "hl", "otwv", "yoxn"));
        sinonimi.put("hl", Set.of("dcj", "zpl", "hl", "otwv", "yoxn"));
        sinonimi.put("otwv", Set.of("dcj", "zpl", "hl", "otwv", "yoxn"));
        sinonimi.put("yoxn", Set.of("dcj", "zpl", "hl", "otwv", "yoxn"));
        sinonimi.put("aflng", Set.of("aflng", "urojy", "qjbze", "eih"));
        sinonimi.put("urojy", Set.of("aflng", "urojy", "qjbze", "eih"));
        sinonimi.put("qjbze", Set.of("aflng", "urojy", "qjbze", "eih"));
        sinonimi.put("eih", Set.of("aflng", "urojy", "qjbze", "eih"));
        sinonimi.put("oxgg", Set.of("oxgg", "tqvw", "vs"));
        sinonimi.put("tqvw", Set.of("oxgg", "tqvw", "vs"));
        sinonimi.put("vs", Set.of("oxgg", "tqvw", "vs"));
        sinonimi.put("taxk", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("cncl", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("lnjpv", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("vjp", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("uwu", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("tz", Set.of("taxk", "cncl", "lnjpv", "vjp", "uwu", "tz"));
        sinonimi.put("xioo", Set.of("xioo", "vboj"));
        sinonimi.put("vboj", Set.of("xioo", "vboj"));
        sinonimi.put("rtscr", Set.of("rtscr", "aagk", "f"));
        sinonimi.put("aagk", Set.of("rtscr", "aagk", "f"));
        sinonimi.put("f", Set.of("rtscr", "aagk", "f"));
        sinonimi.put("kt", Set.of("kt", "mm", "bphd", "xogc"));
        sinonimi.put("mm", Set.of("kt", "mm", "bphd", "xogc"));
        sinonimi.put("bphd", Set.of("kt", "mm", "bphd", "xogc"));
        sinonimi.put("xogc", Set.of("kt", "mm", "bphd", "xogc"));
        sinonimi.put("fztr", Set.of("fztr", "dy", "vyjn", "fmg", "ndlf"));
        sinonimi.put("dy", Set.of("fztr", "dy", "vyjn", "fmg", "ndlf"));
        sinonimi.put("vyjn", Set.of("fztr", "dy", "vyjn", "fmg", "ndlf"));
        sinonimi.put("fmg", Set.of("fztr", "dy", "vyjn", "fmg", "ndlf"));
        sinonimi.put("ndlf", Set.of("fztr", "dy", "vyjn", "fmg", "ndlf"));
        sinonimi.put("pyb", Set.of("pyb"));
        sinonimi.put("rs", Set.of("rs", "sz", "xjwu"));
        sinonimi.put("sz", Set.of("rs", "sz", "xjwu"));
        sinonimi.put("xjwu", Set.of("rs", "sz", "xjwu"));
        sinonimi.put("hf", Set.of("hf"));
        sinonimi.put("bc", Set.of("bc"));
        sinonimi.put("aiqtm", Set.of("aiqtm", "ksabh", "qmxk"));
        sinonimi.put("ksabh", Set.of("aiqtm", "ksabh", "qmxk"));
        sinonimi.put("qmxk", Set.of("aiqtm", "ksabh", "qmxk"));
        sinonimi.put("dack", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("me", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("tkw", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("huxb", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("qglp", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("nh", Set.of("dack", "me", "tkw", "huxb", "qglp", "nh"));
        sinonimi.put("iiky", Set.of("iiky", "qbxxi", "prvyo"));
        sinonimi.put("qbxxi", Set.of("iiky", "qbxxi", "prvyo"));
        sinonimi.put("prvyo", Set.of("iiky", "qbxxi", "prvyo"));
        sinonimi.put("vih", Set.of("vih", "vc", "npn", "cig", "yuxsz"));
        sinonimi.put("vc", Set.of("vih", "vc", "npn", "cig", "yuxsz"));
        sinonimi.put("npn", Set.of("vih", "vc", "npn", "cig", "yuxsz"));
        sinonimi.put("cig", Set.of("vih", "vc", "npn", "cig", "yuxsz"));
        sinonimi.put("yuxsz", Set.of("vih", "vc", "npn", "cig", "yuxsz"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("scwq jjny hot yg jhzgy et lxm kvv iaujn f dcj xkzax qjbze hl o dswm dcj hl uirt taxk cn yg rwj nm usm yoxn xl fztr pvkrz dm zpl ky ykb wzm iayob qsmo yxk xzk edct ezoy lzyg dsi ixkbj ezoy agidt vyjn xszq xnrw kzd ybdfb gvd pi oxm lnjpv rv v oaqrw xzk rtsy yde mo dswm hvxwh qglp iaujn yg pyb n oifpz uivih mvzjt yeut klj tizoq uy utm hs ux uk vca bh elx melsk zxs rtsy fed qyxq gbb sipv brl mo aorh y pkc hf ocq ritr vio olz ldy urojy hot tdlif uk oybzu vca jrm nghzu pyz jmrsp qsmo hxl pgf zjvny bz lzyg ca fztr gbb xnrw gflei cig dswm oj ax mbfge gwgm ev xkzax iaujn oc rnc lnjpv yuxsz aiqtm yde ggpyj irtv egc pyz xmvc j frdwv rto zs eflq ht cmdpf hnr rwj irom xzk us zwuu fe lt bz qes vc kyox kt or rugh nm hot dwqzs ev prvyo ny agidt fcg bvrqb azz xogc sls tdlif vk nuax uivih jsu pora eo rnc jsu je qyxq hot a dm vboj nq b wrmde zs hot ayds rtsy ejb azz wikxl qbxxi m ezoy irtv nghzu xkvzn pyb rf lwq pt lwq fztr rqmfq cn ld zt me q dswm pp kvv us pigl vca cl qglp uk ads dswm tqvw oid kwiu azz fxidp hyey zpl vsdfd ajktg fufd whdyd g il cagla smy ejc giwwf il edct vk eo o rnolx a gixc rtscr dnes oaqrw wiqr", sinonimi);
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
