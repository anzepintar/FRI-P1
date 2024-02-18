
import java.util.*;

public class Test30 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("nks", Set.of("nks"));
        sinonimi.put("af", Set.of("af", "crzj", "wnuyq"));
        sinonimi.put("crzj", Set.of("af", "crzj", "wnuyq"));
        sinonimi.put("wnuyq", Set.of("af", "crzj", "wnuyq"));
        sinonimi.put("v", Set.of("v", "wa", "xg", "fvejz", "hx"));
        sinonimi.put("wa", Set.of("v", "wa", "xg", "fvejz", "hx"));
        sinonimi.put("xg", Set.of("v", "wa", "xg", "fvejz", "hx"));
        sinonimi.put("fvejz", Set.of("v", "wa", "xg", "fvejz", "hx"));
        sinonimi.put("hx", Set.of("v", "wa", "xg", "fvejz", "hx"));
        sinonimi.put("jflru", Set.of("jflru"));
        sinonimi.put("iw", Set.of("iw", "bfkmf", "hc"));
        sinonimi.put("bfkmf", Set.of("iw", "bfkmf", "hc"));
        sinonimi.put("hc", Set.of("iw", "bfkmf", "hc"));
        sinonimi.put("gvp", Set.of("gvp", "dqcb", "lafo"));
        sinonimi.put("dqcb", Set.of("gvp", "dqcb", "lafo"));
        sinonimi.put("lafo", Set.of("gvp", "dqcb", "lafo"));
        sinonimi.put("hlb", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("rpxd", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("nrivi", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("t", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("lnmk", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("bz", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("dgypz", Set.of("hlb", "rpxd", "nrivi", "t", "lnmk", "bz", "dgypz"));
        sinonimi.put("pxvy", Set.of("pxvy", "qp", "lr", "ywv"));
        sinonimi.put("qp", Set.of("pxvy", "qp", "lr", "ywv"));
        sinonimi.put("lr", Set.of("pxvy", "qp", "lr", "ywv"));
        sinonimi.put("ywv", Set.of("pxvy", "qp", "lr", "ywv"));
        sinonimi.put("szrm", Set.of("szrm", "ekya"));
        sinonimi.put("ekya", Set.of("szrm", "ekya"));
        sinonimi.put("dfdju", Set.of("dfdju", "cd"));
        sinonimi.put("cd", Set.of("dfdju", "cd"));
        sinonimi.put("qutl", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("oxv", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("zx", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("d", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("p", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("wk", Set.of("qutl", "oxv", "zx", "d", "p", "wk"));
        sinonimi.put("qfllc", Set.of("qfllc", "hd", "vx", "ikxnv", "rf"));
        sinonimi.put("hd", Set.of("qfllc", "hd", "vx", "ikxnv", "rf"));
        sinonimi.put("vx", Set.of("qfllc", "hd", "vx", "ikxnv", "rf"));
        sinonimi.put("ikxnv", Set.of("qfllc", "hd", "vx", "ikxnv", "rf"));
        sinonimi.put("rf", Set.of("qfllc", "hd", "vx", "ikxnv", "rf"));
        sinonimi.put("bczte", Set.of("bczte"));
        sinonimi.put("usj", Set.of("usj", "tn"));
        sinonimi.put("tn", Set.of("usj", "tn"));
        sinonimi.put("xb", Set.of("xb", "znw", "va"));
        sinonimi.put("znw", Set.of("xb", "znw", "va"));
        sinonimi.put("va", Set.of("xb", "znw", "va"));
        sinonimi.put("ubg", Set.of("ubg", "xph", "wt"));
        sinonimi.put("xph", Set.of("ubg", "xph", "wt"));
        sinonimi.put("wt", Set.of("ubg", "xph", "wt"));
        sinonimi.put("or", Set.of("or", "od", "mx", "xna", "oebte"));
        sinonimi.put("od", Set.of("or", "od", "mx", "xna", "oebte"));
        sinonimi.put("mx", Set.of("or", "od", "mx", "xna", "oebte"));
        sinonimi.put("xna", Set.of("or", "od", "mx", "xna", "oebte"));
        sinonimi.put("oebte", Set.of("or", "od", "mx", "xna", "oebte"));
        sinonimi.put("fsv", Set.of("fsv", "ulpm", "ycv"));
        sinonimi.put("ulpm", Set.of("fsv", "ulpm", "ycv"));
        sinonimi.put("ycv", Set.of("fsv", "ulpm", "ycv"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("ymhsn lmrrh qzx qakt qi ek fx zuv tcnxd fu te tzocf qzocp csgu fvejz dgypz gcye gcuq jloa qw hevem szrm sij gzq pi ksaup hrzzb xb dzt zv qi xbdk rvnzi qwv ykvo ee jb qr lycuh fib znv xf fq hrzzb nvfbf befdv nv fb oxv fkzr w lpnps h ddu gzq prav vgble h wou upbk vy spu ohc hcm byppg hd zd vwx ho zzm bbvb fnbkn fx af wblj om aifz wt fb pl gwa byppg hm znw zopuq avgcm rlq fx hc nnev hsz rtq mv ibo c jytig eaeij ndtir mx etpp pn wbx kruju qo qur fu jui szrm n csgy n hx dixjj znw znv cd umpuj kc dxamm hn ivq xe rel dvr ps ycv wd ykvo pdc wt csgu kc zn kd wou oxv spu vopw wk f xoljy rb aihje zmye llgni viwv yy cxkd uhbf tn befdv fu hks szrm fx xg jytig fvejz hd aifz qztmd ton wh fx mrxlm ifil ykvo qodb wvek qwv hzf t viwv srip forz znw fq qj a pdc ljavx lnmk gf bbvb qi rf ejk cpnj qodb prav ebytj wx xb e whms szyo hpiu ts zqywk gaoim qjc nks od xjw mas cb v nskgy lw fq qi wvek xe usj bbvb xn nskgy jv ysz pvc csgu rdl cebpq ee jb pl gxf nhxt krw dib f pmi cpnj qztmd jv gzq zopuq lkagf w yq fd jv vwx isxfu law wa ljavx exjw ykvo mfaz hd xxxy fsv uragc dm wbx csgu mrxlm ly ovg law ps xe lcdj do lsaow ifil m h cd znv jppo wgvs c dvr prav bbvb rlq zn dib hrzzb fke oxv law vozy w rfkul sd ssd xlonp srip fu pdc lw qzx dfdju lbsv af p kius gaoim jloa crzj ndtir xbdk gx wbx qzocp wewqy zzm xbdk aexeh d rvnzi ndtir bz jo c kf sxwiw aifz qvesh tsjt jytig kf hd sie tsjt szyo pbmi u nv prav aexeh wgvs rpxd pbmi rfkul py ts rdl qr ovg jgfy ebytj rewnd uf aihje guzay qw qjc fke t rvvqp f al lycuh ycv vozy do tn om nnev wfvet qzocp nks crzj ts kc bb xna al yla hm hx kc dqcb tvpeh ji jo dzt e ebytj d", sinonimi);
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
