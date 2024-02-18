
import java.util.*;

public class Test15 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("oryp", Set.of("oryp", "pza", "f", "zxgff"));
        sinonimi.put("pza", Set.of("oryp", "pza", "f", "zxgff"));
        sinonimi.put("f", Set.of("oryp", "pza", "f", "zxgff"));
        sinonimi.put("zxgff", Set.of("oryp", "pza", "f", "zxgff"));
        sinonimi.put("ysfxu", Set.of("ysfxu"));
        sinonimi.put("b", Set.of("b", "cjy", "mpq"));
        sinonimi.put("cjy", Set.of("b", "cjy", "mpq"));
        sinonimi.put("mpq", Set.of("b", "cjy", "mpq"));
        sinonimi.put("hptcg", Set.of("hptcg"));
        sinonimi.put("vpq", Set.of("vpq", "wts"));
        sinonimi.put("wts", Set.of("vpq", "wts"));
        sinonimi.put("mu", Set.of("mu", "utonw", "bxho", "kayq"));
        sinonimi.put("utonw", Set.of("mu", "utonw", "bxho", "kayq"));
        sinonimi.put("bxho", Set.of("mu", "utonw", "bxho", "kayq"));
        sinonimi.put("kayq", Set.of("mu", "utonw", "bxho", "kayq"));
        sinonimi.put("wezzv", Set.of("wezzv", "glw", "sxvlv", "gz"));
        sinonimi.put("glw", Set.of("wezzv", "glw", "sxvlv", "gz"));
        sinonimi.put("sxvlv", Set.of("wezzv", "glw", "sxvlv", "gz"));
        sinonimi.put("gz", Set.of("wezzv", "glw", "sxvlv", "gz"));
        sinonimi.put("njs", Set.of("njs", "asmq", "oybl", "uq", "npols"));
        sinonimi.put("asmq", Set.of("njs", "asmq", "oybl", "uq", "npols"));
        sinonimi.put("oybl", Set.of("njs", "asmq", "oybl", "uq", "npols"));
        sinonimi.put("uq", Set.of("njs", "asmq", "oybl", "uq", "npols"));
        sinonimi.put("npols", Set.of("njs", "asmq", "oybl", "uq", "npols"));
        sinonimi.put("khuqw", Set.of("khuqw", "kiaj"));
        sinonimi.put("kiaj", Set.of("khuqw", "kiaj"));
        sinonimi.put("zpv", Set.of("zpv", "ha", "fty", "pvfll"));
        sinonimi.put("ha", Set.of("zpv", "ha", "fty", "pvfll"));
        sinonimi.put("fty", Set.of("zpv", "ha", "fty", "pvfll"));
        sinonimi.put("pvfll", Set.of("zpv", "ha", "fty", "pvfll"));
        sinonimi.put("pz", Set.of("pz"));
        sinonimi.put("jd", Set.of("jd", "gonr", "yhf", "vc"));
        sinonimi.put("gonr", Set.of("jd", "gonr", "yhf", "vc"));
        sinonimi.put("yhf", Set.of("jd", "gonr", "yhf", "vc"));
        sinonimi.put("vc", Set.of("jd", "gonr", "yhf", "vc"));
        sinonimi.put("weg", Set.of("weg", "sb"));
        sinonimi.put("sb", Set.of("weg", "sb"));
        sinonimi.put("tvre", Set.of("tvre", "lglgt", "rnox", "abod", "gt"));
        sinonimi.put("lglgt", Set.of("tvre", "lglgt", "rnox", "abod", "gt"));
        sinonimi.put("rnox", Set.of("tvre", "lglgt", "rnox", "abod", "gt"));
        sinonimi.put("abod", Set.of("tvre", "lglgt", "rnox", "abod", "gt"));
        sinonimi.put("gt", Set.of("tvre", "lglgt", "rnox", "abod", "gt"));
        sinonimi.put("imsta", Set.of("imsta", "izyj"));
        sinonimi.put("izyj", Set.of("imsta", "izyj"));
        sinonimi.put("i", Set.of("i", "fckp", "nd"));
        sinonimi.put("fckp", Set.of("i", "fckp", "nd"));
        sinonimi.put("nd", Set.of("i", "fckp", "nd"));
        sinonimi.put("kzk", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("bag", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("sovfh", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("l", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("ureqx", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("g", Set.of("kzk", "bag", "sovfh", "l", "ureqx", "g"));
        sinonimi.put("pwm", Set.of("pwm", "vxwyr", "cjjx", "etxmf"));
        sinonimi.put("vxwyr", Set.of("pwm", "vxwyr", "cjjx", "etxmf"));
        sinonimi.put("cjjx", Set.of("pwm", "vxwyr", "cjjx", "etxmf"));
        sinonimi.put("etxmf", Set.of("pwm", "vxwyr", "cjjx", "etxmf"));
        sinonimi.put("llhg", Set.of("llhg"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
