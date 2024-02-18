
import java.util.*;

public class Test03 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ukqmt", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("sq", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("hrj", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("xgr", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("mvl", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("du", Set.of("ukqmt", "sq", "hrj", "xgr", "mvl", "du"));
        sinonimi.put("wgmgq", Set.of("wgmgq"));
        sinonimi.put("uoi", Set.of("uoi", "yiev", "vdiom", "wxroy", "bm"));
        sinonimi.put("yiev", Set.of("uoi", "yiev", "vdiom", "wxroy", "bm"));
        sinonimi.put("vdiom", Set.of("uoi", "yiev", "vdiom", "wxroy", "bm"));
        sinonimi.put("wxroy", Set.of("uoi", "yiev", "vdiom", "wxroy", "bm"));
        sinonimi.put("bm", Set.of("uoi", "yiev", "vdiom", "wxroy", "bm"));
        sinonimi.put("now", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("hgi", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("xtmnj", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("fuvyz", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("lr", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("uvbw", Set.of("now", "hgi", "xtmnj", "fuvyz", "lr", "uvbw"));
        sinonimi.put("ewi", Set.of("ewi", "zt", "awlsa"));
        sinonimi.put("zt", Set.of("ewi", "zt", "awlsa"));
        sinonimi.put("awlsa", Set.of("ewi", "zt", "awlsa"));
        sinonimi.put("fjtx", Set.of("fjtx", "vgwkk", "xwlo", "wetda", "upm"));
        sinonimi.put("vgwkk", Set.of("fjtx", "vgwkk", "xwlo", "wetda", "upm"));
        sinonimi.put("xwlo", Set.of("fjtx", "vgwkk", "xwlo", "wetda", "upm"));
        sinonimi.put("wetda", Set.of("fjtx", "vgwkk", "xwlo", "wetda", "upm"));
        sinonimi.put("upm", Set.of("fjtx", "vgwkk", "xwlo", "wetda", "upm"));
        sinonimi.put("bu", Set.of("bu", "bens", "wo"));
        sinonimi.put("bens", Set.of("bu", "bens", "wo"));
        sinonimi.put("wo", Set.of("bu", "bens", "wo"));
        sinonimi.put("rju", Set.of("rju", "ikhg", "ewyz"));
        sinonimi.put("ikhg", Set.of("rju", "ikhg", "ewyz"));
        sinonimi.put("ewyz", Set.of("rju", "ikhg", "ewyz"));
        sinonimi.put("t", Set.of("t", "br", "wxodk", "jdzbl"));
        sinonimi.put("br", Set.of("t", "br", "wxodk", "jdzbl"));
        sinonimi.put("wxodk", Set.of("t", "br", "wxodk", "jdzbl"));
        sinonimi.put("jdzbl", Set.of("t", "br", "wxodk", "jdzbl"));
        sinonimi.put("a", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("zuxuc", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("clzm", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("mswmq", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("vka", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("gsdul", Set.of("a", "zuxuc", "clzm", "mswmq", "vka", "gsdul"));
        sinonimi.put("ka", Set.of("ka"));
        sinonimi.put("kgj", Set.of("kgj", "enhx"));
        sinonimi.put("enhx", Set.of("kgj", "enhx"));
        sinonimi.put("ymvx", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("yd", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("hjqwl", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("abkzk", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("otunm", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("kritm", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("pvdj", Set.of("ymvx", "yd", "hjqwl", "abkzk", "otunm", "kritm", "pvdj"));
        sinonimi.put("rhfhx", Set.of("rhfhx", "rvsha", "hcwd", "tnp", "uvmw"));
        sinonimi.put("rvsha", Set.of("rhfhx", "rvsha", "hcwd", "tnp", "uvmw"));
        sinonimi.put("hcwd", Set.of("rhfhx", "rvsha", "hcwd", "tnp", "uvmw"));
        sinonimi.put("tnp", Set.of("rhfhx", "rvsha", "hcwd", "tnp", "uvmw"));
        sinonimi.put("uvmw", Set.of("rhfhx", "rvsha", "hcwd", "tnp", "uvmw"));
        sinonimi.put("rwvg", Set.of("rwvg", "oyy"));
        sinonimi.put("oyy", Set.of("rwvg", "oyy"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
