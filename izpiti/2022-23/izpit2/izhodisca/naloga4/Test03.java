
import java.util.*;

public class Test03 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("pad", Set.of("pad", "os", "vupjx"));
        sinonimi.put("os", Set.of("pad", "os", "vupjx"));
        sinonimi.put("vupjx", Set.of("pad", "os", "vupjx"));
        sinonimi.put("zh", Set.of("zh"));
        sinonimi.put("tvqfb", Set.of("tvqfb", "aaqef", "hoqd", "pwi", "zk"));
        sinonimi.put("aaqef", Set.of("tvqfb", "aaqef", "hoqd", "pwi", "zk"));
        sinonimi.put("hoqd", Set.of("tvqfb", "aaqef", "hoqd", "pwi", "zk"));
        sinonimi.put("pwi", Set.of("tvqfb", "aaqef", "hoqd", "pwi", "zk"));
        sinonimi.put("zk", Set.of("tvqfb", "aaqef", "hoqd", "pwi", "zk"));
        sinonimi.put("tjof", Set.of("tjof", "qbnj", "zp"));
        sinonimi.put("qbnj", Set.of("tjof", "qbnj", "zp"));
        sinonimi.put("zp", Set.of("tjof", "qbnj", "zp"));
        sinonimi.put("kcn", Set.of("kcn"));
        sinonimi.put("bj", Set.of("bj", "t", "cwe"));
        sinonimi.put("t", Set.of("bj", "t", "cwe"));
        sinonimi.put("cwe", Set.of("bj", "t", "cwe"));
        sinonimi.put("wa", Set.of("wa", "dmkg", "gevhx", "mwzj"));
        sinonimi.put("dmkg", Set.of("wa", "dmkg", "gevhx", "mwzj"));
        sinonimi.put("gevhx", Set.of("wa", "dmkg", "gevhx", "mwzj"));
        sinonimi.put("mwzj", Set.of("wa", "dmkg", "gevhx", "mwzj"));
        sinonimi.put("ftht", Set.of("ftht", "kbgo"));
        sinonimi.put("kbgo", Set.of("ftht", "kbgo"));
        sinonimi.put("atlsl", Set.of("atlsl", "zbkrf", "hqi", "lys"));
        sinonimi.put("zbkrf", Set.of("atlsl", "zbkrf", "hqi", "lys"));
        sinonimi.put("hqi", Set.of("atlsl", "zbkrf", "hqi", "lys"));
        sinonimi.put("lys", Set.of("atlsl", "zbkrf", "hqi", "lys"));
        sinonimi.put("axhta", Set.of("axhta"));
        sinonimi.put("tx", Set.of("tx"));
        sinonimi.put("lit", Set.of("lit"));
        sinonimi.put("igec", Set.of("igec", "ghhps", "nq", "ken"));
        sinonimi.put("ghhps", Set.of("igec", "ghhps", "nq", "ken"));
        sinonimi.put("nq", Set.of("igec", "ghhps", "nq", "ken"));
        sinonimi.put("ken", Set.of("igec", "ghhps", "nq", "ken"));
        sinonimi.put("ei", Set.of("ei", "gd"));
        sinonimi.put("gd", Set.of("ei", "gd"));
        sinonimi.put("ggbg", Set.of("ggbg"));
        sinonimi.put("zn", Set.of("zn", "kj", "kc", "zvutb"));
        sinonimi.put("kj", Set.of("zn", "kj", "kc", "zvutb"));
        sinonimi.put("kc", Set.of("zn", "kj", "kc", "zvutb"));
        sinonimi.put("zvutb", Set.of("zn", "kj", "kc", "zvutb"));
        sinonimi.put("nxj", Set.of("nxj", "blbr", "psgl", "kedt"));
        sinonimi.put("blbr", Set.of("nxj", "blbr", "psgl", "kedt"));
        sinonimi.put("psgl", Set.of("nxj", "blbr", "psgl", "kedt"));
        sinonimi.put("kedt", Set.of("nxj", "blbr", "psgl", "kedt"));
        sinonimi.put("zhww", Set.of("zhww", "jdc", "clkgh"));
        sinonimi.put("jdc", Set.of("zhww", "jdc", "clkgh"));
        sinonimi.put("clkgh", Set.of("zhww", "jdc", "clkgh"));
        sinonimi.put("gdiw", Set.of("gdiw", "nkw", "vzrk", "tljqi"));
        sinonimi.put("nkw", Set.of("gdiw", "nkw", "vzrk", "tljqi"));
        sinonimi.put("vzrk", Set.of("gdiw", "nkw", "vzrk", "tljqi"));
        sinonimi.put("tljqi", Set.of("gdiw", "nkw", "vzrk", "tljqi"));

        List<String> besede = new ArrayList<>(Cetrta.najMnozica(sinonimi));
        besede.sort(null);
        System.out.println(besede);
    }
}
