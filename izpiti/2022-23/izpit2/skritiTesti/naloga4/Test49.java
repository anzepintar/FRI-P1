
import java.util.*;

public class Test49 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("jpi", Set.of("jpi", "hmea", "deg"));
        sinonimi.put("hmea", Set.of("jpi", "hmea", "deg"));
        sinonimi.put("deg", Set.of("jpi", "hmea", "deg"));
        sinonimi.put("bnsd", Set.of("bnsd", "cil"));
        sinonimi.put("cil", Set.of("bnsd", "cil"));
        sinonimi.put("lwnty", Set.of("lwnty", "jd"));
        sinonimi.put("jd", Set.of("lwnty", "jd"));
        sinonimi.put("izfrz", Set.of("izfrz", "fttn"));
        sinonimi.put("fttn", Set.of("izfrz", "fttn"));
        sinonimi.put("gcvd", Set.of("gcvd", "gt"));
        sinonimi.put("gt", Set.of("gcvd", "gt"));
        sinonimi.put("vgkr", Set.of("vgkr"));
        sinonimi.put("dpmtd", Set.of("dpmtd"));
        sinonimi.put("fzr", Set.of("fzr"));
        sinonimi.put("ejx", Set.of("ejx"));
        sinonimi.put("qwxta", Set.of("qwxta", "udqh"));
        sinonimi.put("udqh", Set.of("qwxta", "udqh"));
        sinonimi.put("cw", Set.of("cw"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("oya dvk hkgpl fn a vzh ciku no kddmv llgl gt oh irlqf fic dn hp gzr eocju zhvmk o ak orn cx vzh moga oh lsh yat ftg sffz zq fro vtbog jm eugg sdntt l eeyui pz jm id mno ewd jqlp wnaj xprx tib dn ml fttn npqq rr sdntt yc tti bnsd xp ufh hmea ch fkfb tnzup iglvh pslb bey jzxz co hxc kddmv qdrc hyydv zb zktxv vmqp hxc ewd te zsy du mj nnjfd srh nped vcgb na bjw eiuw ch btdtg fttn zytle mi v jfse jjkge tghpu grd gr mxuz xzr lyqk s hkgpl yrf orjp iglvh rb cx wg pz akaib irlqf vq tghpu lwnty konc c ejhtc gtfyu zkpxo gtfyu yat boz mdd jm wg oya snccx sbe ggjb bd upc dpmtd pbwi vae moga ea q olok mrgyu cxkou zbxp exg fct fbe ywi ak ggfi ywi hyydv mj qhgex ftg rb eeyui iwrbk vob jpi zx gq co xktmn xzr pxy fn cxkou ma zjy ted qzaph itc xlwme izuaf csy qwxta zi skbj qzaph cqc vzh bprvl yrf", sinonimi);
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
