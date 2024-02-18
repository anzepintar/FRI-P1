
import java.util.*;

public class Test28 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("dp", Set.of("dp", "vmn"));
        sinonimi.put("vmn", Set.of("dp", "vmn"));
        sinonimi.put("giq", Set.of("giq", "zy", "loxci"));
        sinonimi.put("zy", Set.of("giq", "zy", "loxci"));
        sinonimi.put("loxci", Set.of("giq", "zy", "loxci"));
        sinonimi.put("hpe", Set.of("hpe", "xf", "yaou"));
        sinonimi.put("xf", Set.of("hpe", "xf", "yaou"));
        sinonimi.put("yaou", Set.of("hpe", "xf", "yaou"));
        sinonimi.put("mdpk", Set.of("mdpk", "qffnr", "gpzs", "rhab"));
        sinonimi.put("qffnr", Set.of("mdpk", "qffnr", "gpzs", "rhab"));
        sinonimi.put("gpzs", Set.of("mdpk", "qffnr", "gpzs", "rhab"));
        sinonimi.put("rhab", Set.of("mdpk", "qffnr", "gpzs", "rhab"));
        sinonimi.put("cmxr", Set.of("cmxr", "nhp", "zpigk"));
        sinonimi.put("nhp", Set.of("cmxr", "nhp", "zpigk"));
        sinonimi.put("zpigk", Set.of("cmxr", "nhp", "zpigk"));
        sinonimi.put("zho", Set.of("zho"));
        sinonimi.put("ej", Set.of("ej", "gvqg"));
        sinonimi.put("gvqg", Set.of("ej", "gvqg"));
        sinonimi.put("iivb", Set.of("iivb", "uv"));
        sinonimi.put("uv", Set.of("iivb", "uv"));
        sinonimi.put("x", Set.of("x", "cek"));
        sinonimi.put("cek", Set.of("x", "cek"));
        sinonimi.put("dt", Set.of("dt", "wv"));
        sinonimi.put("wv", Set.of("dt", "wv"));
        sinonimi.put("sgp", Set.of("sgp", "amr"));
        sinonimi.put("amr", Set.of("sgp", "amr"));
        sinonimi.put("abzpg", Set.of("abzpg", "kvs", "dtgpp", "rf"));
        sinonimi.put("kvs", Set.of("abzpg", "kvs", "dtgpp", "rf"));
        sinonimi.put("dtgpp", Set.of("abzpg", "kvs", "dtgpp", "rf"));
        sinonimi.put("rf", Set.of("abzpg", "kvs", "dtgpp", "rf"));
        sinonimi.put("onmg", Set.of("onmg"));
        sinonimi.put("mol", Set.of("mol", "vnlq", "sdxvq", "eobc"));
        sinonimi.put("vnlq", Set.of("mol", "vnlq", "sdxvq", "eobc"));
        sinonimi.put("sdxvq", Set.of("mol", "vnlq", "sdxvq", "eobc"));
        sinonimi.put("eobc", Set.of("mol", "vnlq", "sdxvq", "eobc"));
        sinonimi.put("cxfns", Set.of("cxfns", "fn", "xy", "eskdl"));
        sinonimi.put("fn", Set.of("cxfns", "fn", "xy", "eskdl"));
        sinonimi.put("xy", Set.of("cxfns", "fn", "xy", "eskdl"));
        sinonimi.put("eskdl", Set.of("cxfns", "fn", "xy", "eskdl"));
        sinonimi.put("menk", Set.of("menk", "ij", "tmvj", "add", "vxhg"));
        sinonimi.put("ij", Set.of("menk", "ij", "tmvj", "add", "vxhg"));
        sinonimi.put("tmvj", Set.of("menk", "ij", "tmvj", "add", "vxhg"));
        sinonimi.put("add", Set.of("menk", "ij", "tmvj", "add", "vxhg"));
        sinonimi.put("vxhg", Set.of("menk", "ij", "tmvj", "add", "vxhg"));
        sinonimi.put("n", Set.of("n"));
        sinonimi.put("qlmva", Set.of("qlmva", "ceu", "cwdyo"));
        sinonimi.put("ceu", Set.of("qlmva", "ceu", "cwdyo"));
        sinonimi.put("cwdyo", Set.of("qlmva", "ceu", "cwdyo"));
        sinonimi.put("gkh", Set.of("gkh", "kw"));
        sinonimi.put("kw", Set.of("gkh", "kw"));
        sinonimi.put("qpq", Set.of("qpq", "lu"));
        sinonimi.put("lu", Set.of("qpq", "lu"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("dpzg botju mlmc jk sdsup gfzy zf fto rtxhs vlyyd dtgpp hdlly ygpm zm zuis qza que utqiv hnc lxhl v menk ianw tedr zy cmtmu w cxdv kjymu ianw kxgi od ken ubz yvp vsd uohg iw mvlsh vup kjymu add k abn xy nmwn ytcyi qza giq fmt zuis gd flm t nmoa hpkzp sz ixn wv losnl l vd ttzjz kzxr lhcre nz qis qr zmlez hdlly ihsem tda ryawv fayz uq mlmc qiwu b qzyik mzg fafn etyn zrx cwhu ixn fto dafng qis jh plf yegzh etvtv mol izdth vup kc rgv zrx orb lhcre cpls bz utqiv nw eskdl gx fk fip jh mlmc grioz ruyxp bb txmq vxhg qrrwn xzi mvlsh mdpk fx lwht zf qza yzulb updi vgbns dwye rzcd ie r t bt yaou viuk mvlsh l mvaxz jpv cz sdsup ucbm cwdyo qpq l ncbb vmn yvp xc de fmt tuni eadch fn zumb cwdyo qb flkj zf bpds cmtmu oq g vsd kukf xy yzulb xuacu za w as kjymu yel ov wh lhcre qy fxp tedr wzx w byu cwmhn vlyyd cpls ids updi yj flm hnc mol oo iivb q teclq izdth hunve hdlly baldu fx fmd yaou cxfns psy uqfwq qb ectw kt ntgbr rtxhs dvg lhcre cmxr kjymu xf giubr losnl tuhq qpq cr ytcyi losnl teclq dafng loxci jhek xdec gh fb n wv pg ufdt uqfwq neipt domd rnq jk rkcli yaou zcta mnxx kt jk ep zw htbe flm qffnr bpn fn ofl kz bt tmvj warg reuw hdlly mnhgo qktjr uxkir rna orb qy flkj okd wg vdsn xuacu ntgbr la bt lqnue mij od rmk tmvj cz rna uohg cek xuacu q lgvt vmn km ditk za km rp vgbns dwye rhaub bera ihsem wxbf rna rype wzop tmvj qlmva add dtgpp nhp vh cwdyo mvaxz zumb zumb qktjr lvog ep jzk kaqq qza fwxm osq ncbb etvtv warg qpl ddubb l ruyxp yegzh lazs baldu yaou losnl yegzh gh bera uwwi icfmc nz idm flm amr xy que ze brxqm dpzg dafng v cwmhn ft pjr khsxp dfqkd r axiq zll tmvj bpn arzmo tmvj n mij rp rnq nw wa vxaf xj alre hpkzp uq fip d cnae plxl vsd vudvc zll vqtp bz d ken vsd lqnue ntgbr hpkzp ta xf gu zzgz qa idm rolss aubg m qza ej lmq qa orb ids fmt hwdq sdsup rna dtgpp j updi menk vqtp vhmse azo mzg lmq qktjr jk cpls jph dde txmq cwmhn botju vxaf twtaw mnxx pp pjr cmtmu kj azo ruyxp sz ryawv zrx ygpm cmxr vhmse cek vmn jjp wzx bzggj ziru wxbf orb uv oo vuv wxbf ov hwdq r okd nu", sinonimi);
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
