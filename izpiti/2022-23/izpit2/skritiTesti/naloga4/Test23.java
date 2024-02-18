
import java.util.*;

public class Test23 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("dqy", Set.of("dqy", "mtn", "qq", "qna"));
        sinonimi.put("mtn", Set.of("dqy", "mtn", "qq", "qna"));
        sinonimi.put("qq", Set.of("dqy", "mtn", "qq", "qna"));
        sinonimi.put("qna", Set.of("dqy", "mtn", "qq", "qna"));
        sinonimi.put("wlw", Set.of("wlw", "ruyh", "nkhiq", "m", "im"));
        sinonimi.put("ruyh", Set.of("wlw", "ruyh", "nkhiq", "m", "im"));
        sinonimi.put("nkhiq", Set.of("wlw", "ruyh", "nkhiq", "m", "im"));
        sinonimi.put("m", Set.of("wlw", "ruyh", "nkhiq", "m", "im"));
        sinonimi.put("im", Set.of("wlw", "ruyh", "nkhiq", "m", "im"));
        sinonimi.put("fqk", Set.of("fqk", "qqfsj"));
        sinonimi.put("qqfsj", Set.of("fqk", "qqfsj"));
        sinonimi.put("hwn", Set.of("hwn"));
        sinonimi.put("go", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("tpc", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("zrza", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("ovxe", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("novcf", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("tev", Set.of("go", "tpc", "zrza", "ovxe", "novcf", "tev"));
        sinonimi.put("jazl", Set.of("jazl", "r", "pic"));
        sinonimi.put("r", Set.of("jazl", "r", "pic"));
        sinonimi.put("pic", Set.of("jazl", "r", "pic"));
        sinonimi.put("fcct", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("whnoy", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("yyheb", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("wl", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("fmk", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("iuq", Set.of("fcct", "whnoy", "yyheb", "wl", "fmk", "iuq"));
        sinonimi.put("alb", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("uxgzf", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("bcctb", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("odles", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("edkcw", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("tc", Set.of("alb", "uxgzf", "bcctb", "odles", "edkcw", "tc"));
        sinonimi.put("cicd", Set.of("cicd"));
        sinonimi.put("uf", Set.of("uf"));
        sinonimi.put("kjx", Set.of("kjx", "vopp", "uo", "ob", "wy"));
        sinonimi.put("vopp", Set.of("kjx", "vopp", "uo", "ob", "wy"));
        sinonimi.put("uo", Set.of("kjx", "vopp", "uo", "ob", "wy"));
        sinonimi.put("ob", Set.of("kjx", "vopp", "uo", "ob", "wy"));
        sinonimi.put("wy", Set.of("kjx", "vopp", "uo", "ob", "wy"));
        sinonimi.put("kmvbj", Set.of("kmvbj"));
        sinonimi.put("mqzk", Set.of("mqzk", "tre", "ecghd", "usxv", "mwjrx"));
        sinonimi.put("tre", Set.of("mqzk", "tre", "ecghd", "usxv", "mwjrx"));
        sinonimi.put("ecghd", Set.of("mqzk", "tre", "ecghd", "usxv", "mwjrx"));
        sinonimi.put("usxv", Set.of("mqzk", "tre", "ecghd", "usxv", "mwjrx"));
        sinonimi.put("mwjrx", Set.of("mqzk", "tre", "ecghd", "usxv", "mwjrx"));
        sinonimi.put("zyl", Set.of("zyl", "wfur"));
        sinonimi.put("wfur", Set.of("zyl", "wfur"));
        sinonimi.put("rxt", Set.of("rxt", "gvo", "ciqwz", "qn"));
        sinonimi.put("gvo", Set.of("rxt", "gvo", "ciqwz", "qn"));
        sinonimi.put("ciqwz", Set.of("rxt", "gvo", "ciqwz", "qn"));
        sinonimi.put("qn", Set.of("rxt", "gvo", "ciqwz", "qn"));
        sinonimi.put("ymim", Set.of("ymim"));
        sinonimi.put("hveq", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("gragb", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("h", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("hbu", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("vpl", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("qagcp", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("dy", Set.of("hveq", "gragb", "h", "hbu", "vpl", "qagcp", "dy"));
        sinonimi.put("kmqd", Set.of("kmqd", "s"));
        sinonimi.put("s", Set.of("kmqd", "s"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
