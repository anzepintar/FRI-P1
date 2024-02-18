
import java.util.*;

public class Test09 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("zdee", Set.of("zdee"));
        sinonimi.put("gknc", Set.of("gknc", "sgo"));
        sinonimi.put("sgo", Set.of("gknc", "sgo"));
        sinonimi.put("rf", Set.of("rf"));
        sinonimi.put("fsw", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("np", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("ieo", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("oqvny", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("uvmv", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("j", Set.of("fsw", "np", "ieo", "oqvny", "uvmv", "j"));
        sinonimi.put("mtxeu", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("fezm", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("mfqkx", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("aazsl", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("rb", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("tgf", Set.of("mtxeu", "fezm", "mfqkx", "aazsl", "rb", "tgf"));
        sinonimi.put("ohxu", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("crshe", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("ida", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("ho", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("cqbu", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("e", Set.of("ohxu", "crshe", "ida", "ho", "cqbu", "e"));
        sinonimi.put("vkyn", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("bk", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("vzv", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("ucve", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("aocv", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("ugrca", Set.of("vkyn", "bk", "vzv", "ucve", "aocv", "ugrca"));
        sinonimi.put("jrtv", Set.of("jrtv"));
        sinonimi.put("his", Set.of("his", "md"));
        sinonimi.put("md", Set.of("his", "md"));
        sinonimi.put("ofe", Set.of("ofe", "if", "zj", "csyng", "zzdu"));
        sinonimi.put("if", Set.of("ofe", "if", "zj", "csyng", "zzdu"));
        sinonimi.put("zj", Set.of("ofe", "if", "zj", "csyng", "zzdu"));
        sinonimi.put("csyng", Set.of("ofe", "if", "zj", "csyng", "zzdu"));
        sinonimi.put("zzdu", Set.of("ofe", "if", "zj", "csyng", "zzdu"));
        sinonimi.put("hlusi", Set.of("hlusi", "co", "k"));
        sinonimi.put("co", Set.of("hlusi", "co", "k"));
        sinonimi.put("k", Set.of("hlusi", "co", "k"));
        sinonimi.put("smc", Set.of("smc", "vx"));
        sinonimi.put("vx", Set.of("smc", "vx"));
        sinonimi.put("guvt", Set.of("guvt", "uba", "zfrq"));
        sinonimi.put("uba", Set.of("guvt", "uba", "zfrq"));
        sinonimi.put("zfrq", Set.of("guvt", "uba", "zfrq"));
        sinonimi.put("osrnt", Set.of("osrnt", "jpiqu", "uhr", "je", "ajb"));
        sinonimi.put("jpiqu", Set.of("osrnt", "jpiqu", "uhr", "je", "ajb"));
        sinonimi.put("uhr", Set.of("osrnt", "jpiqu", "uhr", "je", "ajb"));
        sinonimi.put("je", Set.of("osrnt", "jpiqu", "uhr", "je", "ajb"));
        sinonimi.put("ajb", Set.of("osrnt", "jpiqu", "uhr", "je", "ajb"));
        sinonimi.put("rs", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("uxxe", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("jsd", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("mqnn", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("zwl", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("mhf", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("ka", Set.of("rs", "uxxe", "jsd", "mqnn", "zwl", "mhf", "ka"));
        sinonimi.put("nesf", Set.of("nesf", "phkk", "axzf", "du", "ath"));
        sinonimi.put("phkk", Set.of("nesf", "phkk", "axzf", "du", "ath"));
        sinonimi.put("axzf", Set.of("nesf", "phkk", "axzf", "du", "ath"));
        sinonimi.put("du", Set.of("nesf", "phkk", "axzf", "du", "ath"));
        sinonimi.put("ath", Set.of("nesf", "phkk", "axzf", "du", "ath"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("mqnn o qbtcp reh gik tx yxd q rcg qbwya czt mekrv kojfn oqvny dbsjn co zprb sgo uxsm syzy xct kvpmu iflw kxm lw ldmh j zegce bay hxsl ow nqml bhd ljr dqsqz bsszg ljr ot jzw dm aocv jlmyr mbdia dyox afdg mz mbdia zz hsgos vn a xyo hwlo cpvh ymlbf md km nvguk b qbtcp tsyxa eho axxgq mo jisqp mbdia qsn cxh dc vx ftj li abvee pj vhuvb om cpvh bk u mspks lyvbj gknc tx xcowl nm bk vh zl fat yvi ui gkh li dqsqz uici nqml uxxe vq so ndhwo reh npbp vkyn zbtxt vmh kkx iuze rk hmkl zcmky b nxn fsw nb vp nctnz kt axxgq ryvo lyvbj phkk pzcvg jrtv mp hmwnc txlzz pr ldmh nu eho xpzed dhify cnl wbzr jhwoi co cba vhwqo hmkl cxh pr qmv sj zfrq nesf zwl xjgu dbr atbk nfm nnris rk zfrq xv zb zva axxgq cxl t jvy pkg dbr vhbz ldmh zji ajb ocvyw xcmem xw s lab htjyi cfslc oz aocv honu ptu kzgar wqfk reh rwng gody mfqkx lu l qsk cdofh akf if ui jop nesf aoe rv irjol p zzdu zenvl mbvp muuj dhify yvi dbsjn zwl lni abvee ho npbp jsfsk grun vln oz mspks crjr vhwqo crjr dhify vh owks siz lni onvcg tamus xdw odh ebmxq yjxr zegce tgf yjxr wbzr gxsh wc lp dwgpy xcmem lubrt mbvp ieo n r vx ndhwo mr cxl qgrve kzgar awk kt dceru csm hlusi jwuho uxxe kojfn np dh qsk mfqkx uhs hfxqy htjyi gq jpiqu lp hsgos sj ryvo zwl csyng tamus cxl qem ldmh xcjq tsyxa tdki xjgu zr qh fxme nesf ijiw spi l hommm ajb r atbk hsgos cau so oyat jrtv xky erxnl dm f awk ay hxsl uvmv bi sy ns tw dbr cnl yk ya uklwc tdki pqea reh", sinonimi);
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
