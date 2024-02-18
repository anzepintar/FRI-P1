
import java.util.*;

public class Test39 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("ia", Set.of("ia", "zyt", "fvhn"));
        sinonimi.put("zyt", Set.of("ia", "zyt", "fvhn"));
        sinonimi.put("fvhn", Set.of("ia", "zyt", "fvhn"));
        sinonimi.put("vq", Set.of("vq", "za", "axv"));
        sinonimi.put("za", Set.of("vq", "za", "axv"));
        sinonimi.put("axv", Set.of("vq", "za", "axv"));
        sinonimi.put("jrpu", Set.of("jrpu", "ydbxi", "iy"));
        sinonimi.put("ydbxi", Set.of("jrpu", "ydbxi", "iy"));
        sinonimi.put("iy", Set.of("jrpu", "ydbxi", "iy"));
        sinonimi.put("lf", Set.of("lf", "vn", "qtjsd"));
        sinonimi.put("vn", Set.of("lf", "vn", "qtjsd"));
        sinonimi.put("qtjsd", Set.of("lf", "vn", "qtjsd"));
        sinonimi.put("fmicj", Set.of("fmicj", "assyp"));
        sinonimi.put("assyp", Set.of("fmicj", "assyp"));
        sinonimi.put("nph", Set.of("nph", "ip", "jq", "rpwov"));
        sinonimi.put("ip", Set.of("nph", "ip", "jq", "rpwov"));
        sinonimi.put("jq", Set.of("nph", "ip", "jq", "rpwov"));
        sinonimi.put("rpwov", Set.of("nph", "ip", "jq", "rpwov"));
        sinonimi.put("abqw", Set.of("abqw", "ehhmz", "qw"));
        sinonimi.put("ehhmz", Set.of("abqw", "ehhmz", "qw"));
        sinonimi.put("qw", Set.of("abqw", "ehhmz", "qw"));
        sinonimi.put("pioei", Set.of("pioei", "qbt"));
        sinonimi.put("qbt", Set.of("pioei", "qbt"));
        sinonimi.put("xf", Set.of("xf", "sjk", "seze", "oe"));
        sinonimi.put("sjk", Set.of("xf", "sjk", "seze", "oe"));
        sinonimi.put("seze", Set.of("xf", "sjk", "seze", "oe"));
        sinonimi.put("oe", Set.of("xf", "sjk", "seze", "oe"));
        sinonimi.put("sojr", Set.of("sojr", "vh", "phg"));
        sinonimi.put("vh", Set.of("sojr", "vh", "phg"));
        sinonimi.put("phg", Set.of("sojr", "vh", "phg"));
        sinonimi.put("rlc", Set.of("rlc", "mvrvu", "fll", "ff"));
        sinonimi.put("mvrvu", Set.of("rlc", "mvrvu", "fll", "ff"));
        sinonimi.put("fll", Set.of("rlc", "mvrvu", "fll", "ff"));
        sinonimi.put("ff", Set.of("rlc", "mvrvu", "fll", "ff"));
        sinonimi.put("blty", Set.of("blty", "werk", "ul", "gnp", "mm"));
        sinonimi.put("werk", Set.of("blty", "werk", "ul", "gnp", "mm"));
        sinonimi.put("ul", Set.of("blty", "werk", "ul", "gnp", "mm"));
        sinonimi.put("gnp", Set.of("blty", "werk", "ul", "gnp", "mm"));
        sinonimi.put("mm", Set.of("blty", "werk", "ul", "gnp", "mm"));
        sinonimi.put("yvuo", Set.of("yvuo", "sgby", "wi"));
        sinonimi.put("sgby", Set.of("yvuo", "sgby", "wi"));
        sinonimi.put("wi", Set.of("yvuo", "sgby", "wi"));
        sinonimi.put("acstf", Set.of("acstf", "vzdpc", "vwpfy"));
        sinonimi.put("vzdpc", Set.of("acstf", "vzdpc", "vwpfy"));
        sinonimi.put("vwpfy", Set.of("acstf", "vzdpc", "vwpfy"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("jkv ul gwshw pxvqx sjk enne k wo eiyfo emaqk t gnp jje dfvqz ng eg rtpq yvuo tq kei zf cf fmicj e cax seze ui ysco cf prxs sxtxv zpu oultb cp ppxvo ia ec dfvqz innz hlod p nph pncwm pxvqx kzdge wpqm rb pac ppo zx l ng gjwqy qe gy seze wjh jat yn navn asgsq nlo ziz wc yuzwz gz hclvi qz omzh twhh cgstk f ol ztfj hclvi gzruo sgr qih kmf fno pac qtjsd whzv sbev zyt hoq rc jat ppo hoq byso vq y vh rlc kz pwrbr imm ipc fadcf todtw iehdw rgt wzu e jh fw uck dpkw avne yvuo ju navn wwhwn izkhg kmz p cf fno rlc lcoe kmz shgxp qltlm oa fll qltlm qseju iu l chz izksp dwp jqrp gk cp pr gjjg w gep tabw wua sjk nfnto iu yqa fll joys navn sojr wc k tx u joys ngsfq ijho bwmit wdid qd joys phg kmz shgxp dgmut yqa gnp uyzc yhywj zkxd kzdge ia av cci mou joys pw spxt qi ysgct kz abqvz aih sgby tcodv ec smml tf g qnvgz xf qoovz uck jppha vw up ngsfq yqit pgeux xmvz zx jrpu yhywj axv kgfm oomj ui zsgp drpk ol ns ydbxi lybpj pncwm jat zyt zsgp zkxd ohg zlnmj ffm tmk innz dgmut abam sbev qh dqli lf wdid a gz mvrvu zkxd gscqa fmicj zyt xez qseju fll rc gwm ttjx gz axv axv pvce xp cyq iwnfd rgt jje c oa hkxh qtjsd iehdw gdpo pvce sxq kzdge pgeux wam oa xmvz jh ffm axv sdpq eg xpcy jje dmiai sbev a hkxh axa qxj sojr emtjx zlnmj iy omzh kmz jkv zsgp ec tf dun gk enne qr ozzqo", sinonimi);
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
