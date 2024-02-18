
import java.util.*;

public class Test40 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("slto", Set.of("slto", "xlm", "snlw", "dmbv"));
        sinonimi.put("xlm", Set.of("slto", "xlm", "snlw", "dmbv"));
        sinonimi.put("snlw", Set.of("slto", "xlm", "snlw", "dmbv"));
        sinonimi.put("dmbv", Set.of("slto", "xlm", "snlw", "dmbv"));
        sinonimi.put("mbzbl", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("iui", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("erym", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("wuk", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("em", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("tuhvh", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("gsno", Set.of("mbzbl", "iui", "erym", "wuk", "em", "tuhvh", "gsno"));
        sinonimi.put("bpscf", Set.of("bpscf", "kll", "pix"));
        sinonimi.put("kll", Set.of("bpscf", "kll", "pix"));
        sinonimi.put("pix", Set.of("bpscf", "kll", "pix"));
        sinonimi.put("dpt", Set.of("dpt", "opsz", "xgjgy", "ay", "iggc"));
        sinonimi.put("opsz", Set.of("dpt", "opsz", "xgjgy", "ay", "iggc"));
        sinonimi.put("xgjgy", Set.of("dpt", "opsz", "xgjgy", "ay", "iggc"));
        sinonimi.put("ay", Set.of("dpt", "opsz", "xgjgy", "ay", "iggc"));
        sinonimi.put("iggc", Set.of("dpt", "opsz", "xgjgy", "ay", "iggc"));
        sinonimi.put("dqq", Set.of("dqq", "qdc"));
        sinonimi.put("qdc", Set.of("dqq", "qdc"));
        sinonimi.put("mjht", Set.of("mjht"));
        sinonimi.put("y", Set.of("y", "abqq", "bisec"));
        sinonimi.put("abqq", Set.of("y", "abqq", "bisec"));
        sinonimi.put("bisec", Set.of("y", "abqq", "bisec"));
        sinonimi.put("tppki", Set.of("tppki", "qajyd", "xlhiw", "cmkbb", "ysmk"));
        sinonimi.put("qajyd", Set.of("tppki", "qajyd", "xlhiw", "cmkbb", "ysmk"));
        sinonimi.put("xlhiw", Set.of("tppki", "qajyd", "xlhiw", "cmkbb", "ysmk"));
        sinonimi.put("cmkbb", Set.of("tppki", "qajyd", "xlhiw", "cmkbb", "ysmk"));
        sinonimi.put("ysmk", Set.of("tppki", "qajyd", "xlhiw", "cmkbb", "ysmk"));
        sinonimi.put("xsela", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("ed", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("kfkcz", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("dy", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("uqyph", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("semj", Set.of("xsela", "ed", "kfkcz", "dy", "uqyph", "semj"));
        sinonimi.put("vcxd", Set.of("vcxd", "wq", "gqeo", "hvuaj"));
        sinonimi.put("wq", Set.of("vcxd", "wq", "gqeo", "hvuaj"));
        sinonimi.put("gqeo", Set.of("vcxd", "wq", "gqeo", "hvuaj"));
        sinonimi.put("hvuaj", Set.of("vcxd", "wq", "gqeo", "hvuaj"));
        sinonimi.put("cyyky", Set.of("cyyky", "jfg"));
        sinonimi.put("jfg", Set.of("cyyky", "jfg"));
        sinonimi.put("cwex", Set.of("cwex"));
        sinonimi.put("mzkw", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("hhjg", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("fwl", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("twi", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("jvu", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("ilgd", Set.of("mzkw", "hhjg", "fwl", "twi", "jvu", "ilgd"));
        sinonimi.put("rk", Set.of("rk"));
        sinonimi.put("yah", Set.of("yah", "t", "sn"));
        sinonimi.put("t", Set.of("yah", "t", "sn"));
        sinonimi.put("sn", Set.of("yah", "t", "sn"));
        sinonimi.put("g", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("xqn", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("gm", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("zf", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("ffucp", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("re", Set.of("g", "xqn", "gm", "zf", "ffucp", "re"));
        sinonimi.put("mluu", Set.of("mluu", "f", "rrpa", "guy", "yt"));
        sinonimi.put("f", Set.of("mluu", "f", "rrpa", "guy", "yt"));
        sinonimi.put("rrpa", Set.of("mluu", "f", "rrpa", "guy", "yt"));
        sinonimi.put("guy", Set.of("mluu", "f", "rrpa", "guy", "yt"));
        sinonimi.put("yt", Set.of("mluu", "f", "rrpa", "guy", "yt"));
        sinonimi.put("thnm", Set.of("thnm"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("uwsi ojiw q bmd jwad sip skbn sin cyyky iui ehc r cws obe bvj mzl fvrh ed vh qtmy semj xlbp xlm aiaq npza gsno tvts jxg nky mpp pix rocqh jgvwd smx btmry uarae mbzbl oqyf ozprd myz em sc dq ea qajyd mvr qdc umtb azann dihpl mbzbl lozuv qail ckuox ykefl opdou vzaaj jfq tuhvh ecunr kdp iof okbht mvr sbh imbfz upvh zxbku cuqc jiosx fi fmr kj gsno hhjg zn wglx if ats gm jq bmfrk wglx mpp jptny uwsi ego osm scol gnoln azann tvts jl mjpbr oyco kcqn rk mjht xlo sxxlk dgkju xqu nlw fhvzh ienho gsno kf myz zvfv acvm re uvb pwf ewec sb apc jgvwd ef narqf qdc rhcds sh cz xpx tgvqk uwsi uwsi urahd qail ric xlrym iof slto ooith jptny fe tlmou tfwj a kcqn fburx mvr mjpbr gl mw beca sexxp hhjg aft woxow jxcn cyyky aeb jptny iggc fq kep zi rl qtmy o ew tuhvh djcak em gdorb xlbp bqr abqq hx fburx oegm isnv kmnl rrpa fd odhla nt jgq qajyd zyrtz xpx mbzbl mnvi aiaq dl ohbc apc gz dy lj xzj mwtc mpp qpb vzaaj jgvwd cgfsl apc oegm dszq q re fe uarae ueb qail qgf xg tuhvh kdp qafw xlhiw acvm s t cyyky gvdm vnmk a zvfv ogysn qgf en ws vzaaj wq xlbp po gm fwl dihpl dy aft dnw qg cmkbb mnwk dq aiich of okf dke ltqc ehti cws bke gqeo mkbh aft xv xzj gnoln mjpbr dl xgjgy ykefl fmlsx pix ozprd uqyph k vtopb vzaaj dpt xsela oqlpi qtmy bke jo ecf uarae bmfrk bgqlt jc ckuox gsno prqe ugqj bke ykefl gdorb qpb cjd o tofpx pp isnv djcak zlpt lozuv ooith snlw gdorb xll mbzbl nxy dvtwc mnwk zf cq gm smj dnw acub cjd bvj sn agg ysmk j myz cyga wglx dl n sc jh gm cuqc k umtb n ya zlsyh swzxr zi okbht zsk cbwly zpcq bz tb urahd e x sxxlk oljc sn im oyz cgfsl fe qdc yfe ondu ugqj qajyd fmr skbn hvuaj gv yt wuk yt ievsw aiaq v oncir qpb evgar osm sx v apc j d urahd odhla nt ggrzn jwad isnv kdp narqf ujuuu hvuaj bk zt po mpp jq aiich qgj fnkis kj xtg zt ggrzn bpscf bmmei bk nky julxn cbwly bmd uarae yspq brlr vh ywe ojiw watnc cuqc yah c ego oidk rl uu q eqn xqu zsk xsr jlcm bmd mxcol obe k beca skbn ooith acub jwad tp uwsi bqr evgar djcak sd gl rk ehti nt zyrtz d ugqj bn vnmk xpx dszq zlsyh eht cyga cwex goi aiich ya wglx bgyip hhx xxfno qbn bvj am iof xjmr dsepi fvrh xll p lxrnc qajyd bke foooa julxn jo tppki fvrh", sinonimi);
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
