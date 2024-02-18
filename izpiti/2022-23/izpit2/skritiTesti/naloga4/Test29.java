
import java.util.*;

public class Test29 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("dp", Set.of("dp", "tomm", "mj", "yxb"));
        sinonimi.put("tomm", Set.of("dp", "tomm", "mj", "yxb"));
        sinonimi.put("mj", Set.of("dp", "tomm", "mj", "yxb"));
        sinonimi.put("yxb", Set.of("dp", "tomm", "mj", "yxb"));
        sinonimi.put("pguu", Set.of("pguu", "pi", "ugwfq", "zskhk", "gmva"));
        sinonimi.put("pi", Set.of("pguu", "pi", "ugwfq", "zskhk", "gmva"));
        sinonimi.put("ugwfq", Set.of("pguu", "pi", "ugwfq", "zskhk", "gmva"));
        sinonimi.put("zskhk", Set.of("pguu", "pi", "ugwfq", "zskhk", "gmva"));
        sinonimi.put("gmva", Set.of("pguu", "pi", "ugwfq", "zskhk", "gmva"));
        sinonimi.put("gejh", Set.of("gejh", "xlf", "kui", "yr"));
        sinonimi.put("xlf", Set.of("gejh", "xlf", "kui", "yr"));
        sinonimi.put("kui", Set.of("gejh", "xlf", "kui", "yr"));
        sinonimi.put("yr", Set.of("gejh", "xlf", "kui", "yr"));
        sinonimi.put("rg", Set.of("rg", "balo", "svh"));
        sinonimi.put("balo", Set.of("rg", "balo", "svh"));
        sinonimi.put("svh", Set.of("rg", "balo", "svh"));
        sinonimi.put("zrnpk", Set.of("zrnpk", "outc", "yuw", "og"));
        sinonimi.put("outc", Set.of("zrnpk", "outc", "yuw", "og"));
        sinonimi.put("yuw", Set.of("zrnpk", "outc", "yuw", "og"));
        sinonimi.put("og", Set.of("zrnpk", "outc", "yuw", "og"));
        sinonimi.put("iseq", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("fhz", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("btpz", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("mwy", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("zqp", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("zyjwv", Set.of("iseq", "fhz", "btpz", "mwy", "zqp", "zyjwv"));
        sinonimi.put("fmpj", Set.of("fmpj"));
        sinonimi.put("krn", Set.of("krn", "qxsql", "ag", "ydcak"));
        sinonimi.put("qxsql", Set.of("krn", "qxsql", "ag", "ydcak"));
        sinonimi.put("ag", Set.of("krn", "qxsql", "ag", "ydcak"));
        sinonimi.put("ydcak", Set.of("krn", "qxsql", "ag", "ydcak"));
        sinonimi.put("aka", Set.of("aka"));
        sinonimi.put("dz", Set.of("dz", "rh", "zytfr", "nndhr", "beb"));
        sinonimi.put("rh", Set.of("dz", "rh", "zytfr", "nndhr", "beb"));
        sinonimi.put("zytfr", Set.of("dz", "rh", "zytfr", "nndhr", "beb"));
        sinonimi.put("nndhr", Set.of("dz", "rh", "zytfr", "nndhr", "beb"));
        sinonimi.put("beb", Set.of("dz", "rh", "zytfr", "nndhr", "beb"));
        sinonimi.put("kh", Set.of("kh", "jety", "rr", "ljz"));
        sinonimi.put("jety", Set.of("kh", "jety", "rr", "ljz"));
        sinonimi.put("rr", Set.of("kh", "jety", "rr", "ljz"));
        sinonimi.put("ljz", Set.of("kh", "jety", "rr", "ljz"));
        sinonimi.put("ilp", Set.of("ilp", "fwu", "iqr", "l", "vll"));
        sinonimi.put("fwu", Set.of("ilp", "fwu", "iqr", "l", "vll"));
        sinonimi.put("iqr", Set.of("ilp", "fwu", "iqr", "l", "vll"));
        sinonimi.put("l", Set.of("ilp", "fwu", "iqr", "l", "vll"));
        sinonimi.put("vll", Set.of("ilp", "fwu", "iqr", "l", "vll"));
        sinonimi.put("bn", Set.of("bn", "ru", "yi", "hu", "nayg"));
        sinonimi.put("ru", Set.of("bn", "ru", "yi", "hu", "nayg"));
        sinonimi.put("yi", Set.of("bn", "ru", "yi", "hu", "nayg"));
        sinonimi.put("hu", Set.of("bn", "ru", "yi", "hu", "nayg"));
        sinonimi.put("nayg", Set.of("bn", "ru", "yi", "hu", "nayg"));
        sinonimi.put("hxw", Set.of("hxw", "pcln"));
        sinonimi.put("pcln", Set.of("hxw", "pcln"));
        sinonimi.put("odepb", Set.of("odepb", "b"));
        sinonimi.put("b", Set.of("odepb", "b"));
        sinonimi.put("yyqhe", Set.of("yyqhe", "ukq", "ghka", "vwesz", "xwge"));
        sinonimi.put("ukq", Set.of("yyqhe", "ukq", "ghka", "vwesz", "xwge"));
        sinonimi.put("ghka", Set.of("yyqhe", "ukq", "ghka", "vwesz", "xwge"));
        sinonimi.put("vwesz", Set.of("yyqhe", "ukq", "ghka", "vwesz", "xwge"));
        sinonimi.put("xwge", Set.of("yyqhe", "ukq", "ghka", "vwesz", "xwge"));
        sinonimi.put("vlak", Set.of("vlak"));
        sinonimi.put("xrw", Set.of("xrw", "sp", "heghe"));
        sinonimi.put("sp", Set.of("xrw", "sp", "heghe"));
        sinonimi.put("heghe", Set.of("xrw", "sp", "heghe"));
        sinonimi.put("yii", Set.of("yii", "t", "rcwe"));
        sinonimi.put("t", Set.of("yii", "t", "rcwe"));
        sinonimi.put("rcwe", Set.of("yii", "t", "rcwe"));
        sinonimi.put("elz", Set.of("elz", "lfa", "rd", "dzmsm", "dxu"));
        sinonimi.put("lfa", Set.of("elz", "lfa", "rd", "dzmsm", "dxu"));
        sinonimi.put("rd", Set.of("elz", "lfa", "rd", "dzmsm", "dxu"));
        sinonimi.put("dzmsm", Set.of("elz", "lfa", "rd", "dzmsm", "dxu"));
        sinonimi.put("dxu", Set.of("elz", "lfa", "rd", "dzmsm", "dxu"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("g yd qt czgo je jioh scja yyz wvkmd zyjwv ijd tbv y npcu eluy odepb zymxi nen ift mq cj ydcak wjtbs ypobt rd tktf qexr qv tf ksjye xwge eqcd czgo balo dp tktf dkvjf qynfi jzcm pho vv hywrd zq wtu ee ukq ty io tlu myj ruwx is vlx tnlm tomm nlwjv fwu urqib zvekb gsraj vy ocrm bmgxk opqz a qq qvmo eghzu bihgy qx gsraj zrnpk gm ouirw cljtn wizsf td wvkmd eghzu pthao pnp ag eghzu ytf nml bnt ytf g kpd rki gsraj dsb cvnhi gsraj zq rg hr svh kihz mp im odepb eocgh qt zeusk dzmsm de ksjye id dtj sn xoxn dsb xmg zytfr xoi beb ufij outc wcihl goz zi cj gm hbopn ivrck nayg bn okqg rg fmpj noo je ez czgo qexr id sukl qrcf pnp brgxh hl is kpd sukl je hbsdf pguu u tfq zzpk lfa xza vlx bmgxk tbv qhqvz ijd oi zyyz ufk zqp yii gq eqcd vlx mvoea zvekb beb fwu z dupfl ockil gw oquqf cvnhi heghe qwiqq hcpta mwy xlf xlf gm dwzr peuya kb zksqu zvekb punl xl itqpq noo xza tj adl outc a iqr duql cvnhi lna ag igwmr tn iseq ergl yf tbv nnbzx eqcd s yyqhe vkzt jety amiuu yeqd wxiin cylp bihgy mwy hl logbx pcln big ae peuya ilp iqr czgo kvtio uaxg hywrd mvoea jioh lfa vx dz put hxw zbb bnt jg qexr gen qx nndhr hzb icnql ds puz zqp zytfr da qxsql dyywm ip ilp ouirw tlu okqg wszo upult u xza peuya gy tiygz ufk fwu nen tf rnyh yeqd mmy tktf sz xl ulxvq ryod tbv ufij hvcku bymac xoi ilp a yb vx dkvjf mvoea ufk yii djvlu gejh bmgxk odepb qmoog kps jmlb idll jz mvtna rd gexmx ag xoxn iof kpd wizsf s ary oceg gy c hl okqg mwy vkob qx hqosz nukqc ijd yr mso ufk xbmr jdar sz heyk pqj xq vwesz mj yuw dtj l jidsd vytyt dsb ee axbl khun iof rbj oceg im zzpk dp ozxmt yr l iqr mvtna ikm bymac ivrck wrujy sukl myj dupfl ryod dtj zksqu pqj bxqm eomf yxoc we peuya iseq otue yyqhe lna ydcak lfa f io jam ag ivrck hlsiy pguu lgbp cylp paf cwe xl ip jc gw kb rr opqz qrcf ruwx pajt hbsdf ergl nukqc dkg vkob tddgk dtj eluy yi g ty zbb vy zwwu s wvkmd dxu", sinonimi);
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
