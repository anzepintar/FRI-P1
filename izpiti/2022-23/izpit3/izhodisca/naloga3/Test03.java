
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("l", 'S', 3, 3),
            new Tretja.Pridevnik("abltfz", 'S', 2, 2),
            new Tretja.Pridevnik("t", 'M', 1, 2),
            new Tretja.Samostalnik("mhh", 'M', 5, 2),
            new Tretja.Pridevnik("gddr", 'M', 2, 1),
            new Tretja.Pridevnik("bnytt", 'M', 6, 3),
            new Tretja.Pridevnik("z", 'S', 3, 1),
            new Tretja.Glagol("jpvz", 3, 2),
            new Tretja.Samostalnik("bikfhwl", 'M', 4, 3),
            new Tretja.Samostalnik("vm", 'S', 2, 2),
            new Tretja.Glagol("jpo", 3, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("fwt", 'Z', 5, 1),
            new Tretja.Glagol("wcelyb", 1, 3),
            new Tretja.Glagol("wzo", 2, 2),
            new Tretja.Pridevnik("goozy", 'Z', 4, 1),
            new Tretja.Glagol("mugacw", 3, 3),
            new Tretja.Samostalnik("rdjcu", 'S', 5, 3),
            new Tretja.Glagol("ju", 2, 1),
            new Tretja.Pridevnik("qsbutt", 'Z', 3, 2),
            new Tretja.Glagol("phcsmtw", 1, 2),
            new Tretja.Samostalnik("dxg", 'M', 6, 1),
            new Tretja.Pridevnik("isbjxn", 'Z', 3, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xkz", 'Z', 4, 2),
            new Tretja.Samostalnik("hjiqia", 'M', 4, 1),
            new Tretja.Pridevnik("xtto", 'M', 5, 1),
            new Tretja.Glagol("siytsp", 3, 3),
            new Tretja.Pridevnik("exaf", 'M', 6, 1),
            new Tretja.Samostalnik("i", 'M', 3, 3),
            new Tretja.Samostalnik("yjqbxns", 'Z', 2, 2),
            new Tretja.Glagol("ejm", 2, 1),
            new Tretja.Glagol("uwn", 3, 3),
            new Tretja.Pridevnik("bppkswo", 'M', 5, 3),
            new Tretja.Pridevnik("ww", 'Z', 3, 1),
            new Tretja.Pridevnik("feldsb", 'Z', 2, 2),
            new Tretja.Glagol("btez", 1, 1),
            new Tretja.Samostalnik("bpjim", 'Z', 4, 3),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("asd", 'M', 1, 2),
            new Tretja.Samostalnik("cq", 'M', 4, 3),
            new Tretja.Pridevnik("huuhfq", 'M', 3, 1),
            new Tretja.Pridevnik("hux", 'Z', 2, 3),
            new Tretja.Glagol("dlyfc", 3, 1),
            new Tretja.Glagol("z", 3, 3),
            new Tretja.Pridevnik("kebtcx", 'S', 6, 1),
            new Tretja.Samostalnik("jniq", 'M', 3, 2),
            new Tretja.Pridevnik("mbmmbpc", 'S', 1, 1),
            new Tretja.Samostalnik("bav", 'M', 6, 2),
            new Tretja.Pridevnik("pmqzjkk", 'S', 3, 1),
            new Tretja.Pridevnik("wzmp", 'S', 5, 2),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("meyhtr", 'S', 6, 2),
            new Tretja.Samostalnik("c", 'S', 3, 2),
            new Tretja.Pridevnik("ikfmegn", 'S', 6, 2),
            new Tretja.Glagol("ejcrvjr", 2, 3),
            new Tretja.Glagol("zdloajd", 2, 2),
            new Tretja.Samostalnik("o", 'S', 3, 3),
            new Tretja.Pridevnik("dzziq", 'Z', 1, 2),
            new Tretja.Samostalnik("cx", 'S', 4, 1),
            new Tretja.Samostalnik("n", 'S', 3, 1),
            new Tretja.Pridevnik("izyuocn", 'S', 2, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("tlvbcee", 'M', 6, 2),
            new Tretja.Samostalnik("yfcf", 'Z', 4, 3),
            new Tretja.Glagol("bhlrd", 3, 2),
            new Tretja.Samostalnik("xgtiylo", 'M', 3, 1),
            new Tretja.Samostalnik("ydorwe", 'M', 2, 2),
            new Tretja.Samostalnik("qrpximz", 'S', 5, 2),
            new Tretja.Samostalnik("srafo", 'M', 1, 2),
            new Tretja.Samostalnik("p", 'M', 4, 3),
            new Tretja.Glagol("f", 1, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("uvhjzy", 1, 3),
            new Tretja.Glagol("eccdc", 3, 1),
            new Tretja.Pridevnik("j", 'Z', 3, 2),
            new Tretja.Samostalnik("mdr", 'Z', 2, 1),
            new Tretja.Samostalnik("oluiyjl", 'S', 1, 1),
            new Tretja.Pridevnik("xtobe", 'S', 2, 1),
            new Tretja.Glagol("rfh", 2, 1),
            new Tretja.Samostalnik("vo", 'M', 6, 3),
            new Tretja.Glagol("bhjis", 1, 1),
            new Tretja.Pridevnik("qfdxbd", 'M', 3, 3),
            new Tretja.Pridevnik("ksee", 'S', 2, 3),
            new Tretja.Glagol("ttmq", 2, 3),
            new Tretja.Samostalnik("yn", 'Z', 3, 3),
            new Tretja.Pridevnik("b", 'S', 2, 2),
            new Tretja.Pridevnik("vjalt", 'M', 1, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("masnj", 1, 2),
            new Tretja.Samostalnik("odzg", 'Z', 6, 1),
            new Tretja.Pridevnik("zwfqdk", 'M', 5, 2),
            new Tretja.Glagol("b", 2, 2),
            new Tretja.Samostalnik("vw", 'Z', 2, 1),
            new Tretja.Pridevnik("crsdpu", 'Z', 4, 3),
            new Tretja.Samostalnik("bmmne", 'M', 3, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tsmv", 1, 2),
            new Tretja.Pridevnik("hscnyfp", 'S', 2, 1),
            new Tretja.Samostalnik("tf", 'S', 3, 2),
            new Tretja.Glagol("yugoe", 3, 1),
            new Tretja.Samostalnik("fzkvqgb", 'S', 5, 3),
            new Tretja.Samostalnik("uqfcf", 'M', 1, 1),
            new Tretja.Pridevnik("o", 'Z', 2, 3),
            new Tretja.Pridevnik("ryvbwdg", 'S', 4, 2),
            new Tretja.Samostalnik("g", 'S', 6, 3),
            new Tretja.Glagol("qpoe", 3, 1),
            new Tretja.Samostalnik("v", 'Z', 2, 1),
            new Tretja.Glagol("etheu", 1, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("gte", 3, 3),
            new Tretja.Pridevnik("qnwtic", 'S', 1, 3),
            new Tretja.Pridevnik("q", 'M', 4, 3),
            new Tretja.Samostalnik("vrm", 'Z', 4, 2),
            new Tretja.Glagol("mvyehyy", 2, 3),
            new Tretja.Pridevnik("z", 'Z', 5, 1),
            new Tretja.Glagol("oxph", 2, 1),
            new Tretja.Pridevnik("hcnxnb", 'M', 2, 3),
            new Tretja.Samostalnik("awehsk", 'Z', 4, 1),
            new Tretja.Glagol("vputrsv", 2, 3),
            new Tretja.Pridevnik("sbqcb", 'S', 3, 2),
            new Tretja.Pridevnik("nj", 'S', 5, 1),
            new Tretja.Samostalnik("dhkrc", 'M', 3, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
