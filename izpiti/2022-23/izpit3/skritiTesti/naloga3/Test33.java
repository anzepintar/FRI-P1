
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("nu", 'Z', 6, 3),
            new Tretja.Samostalnik("fusvxm", 'Z', 3, 2),
            new Tretja.Glagol("espysjk", 2, 2),
            new Tretja.Pridevnik("smzbyo", 'M', 6, 1),
            new Tretja.Glagol("hm", 2, 2),
            new Tretja.Glagol("lzgwj", 1, 1),
            new Tretja.Glagol("ns", 3, 1),
            new Tretja.Pridevnik("jgpcxx", 'M', 1, 2),
            new Tretja.Pridevnik("gdau", 'Z', 4, 2),
            new Tretja.Samostalnik("vkdb", 'Z', 1, 1),
            new Tretja.Glagol("tlqwk", 1, 3),
            new Tretja.Glagol("c", 3, 3),
            new Tretja.Glagol("cbmtkkw", 1, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ww", 2, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("uz", 2, 2),
            new Tretja.Pridevnik("wil", 'M', 4, 1),
            new Tretja.Glagol("bjofka", 1, 2),
            new Tretja.Samostalnik("nusm", 'S', 5, 3),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("nrbdzhg", 2, 3),
            new Tretja.Glagol("jn", 3, 2),
            new Tretja.Samostalnik("wtgpil", 'Z', 1, 1),
            new Tretja.Glagol("ombndf", 3, 2),
            new Tretja.Glagol("ptadm", 2, 1),
            new Tretja.Glagol("tkvbsap", 3, 2),
            new Tretja.Samostalnik("iwefwmq", 'Z', 1, 2),
            new Tretja.Samostalnik("bkz", 'S', 4, 3),
            new Tretja.Glagol("btedkh", 2, 2),
            new Tretja.Pridevnik("ryorroi", 'M', 2, 2),
            new Tretja.Samostalnik("qvl", 'M', 6, 2),
            new Tretja.Glagol("j", 3, 3),
            new Tretja.Samostalnik("hgwx", 'Z', 6, 3),
            new Tretja.Pridevnik("x", 'S', 1, 3),
            new Tretja.Pridevnik("sfhcp", 'Z', 4, 2),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("el", 'S', 3, 2),
            new Tretja.Samostalnik("ffskbj", 'M', 6, 1),
            new Tretja.Samostalnik("wxhal", 'S', 3, 1),
            new Tretja.Samostalnik("k", 'S', 5, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("c", 'Z', 6, 3),
            new Tretja.Pridevnik("imqcdj", 'S', 5, 3),
            new Tretja.Glagol("wj", 1, 2),
            new Tretja.Glagol("rroq", 3, 1),
            new Tretja.Samostalnik("rvk", 'M', 1, 2),
            new Tretja.Samostalnik("vg", 'S', 3, 1),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("u", 'S', 3, 2),
            new Tretja.Samostalnik("cauxkg", 'S', 5, 2),
            new Tretja.Glagol("toh", 2, 3),
            new Tretja.Samostalnik("an", 'Z', 5, 3),
            new Tretja.Pridevnik("cogtneh", 'S', 5, 1),
            new Tretja.Glagol("lyewlgj", 3, 3),
            new Tretja.Samostalnik("cvi", 'S', 1, 2),
            new Tretja.Glagol("kh", 3, 1),
            new Tretja.Glagol("ffb", 2, 1),
            new Tretja.Glagol("lgahida", 2, 2),
            new Tretja.Samostalnik("jawhlfr", 'M', 1, 1),
            new Tretja.Pridevnik("zzh", 'Z', 6, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("q", 'S', 5, 3),
            new Tretja.Glagol("xowrt", 2, 1),
            new Tretja.Glagol("hd", 1, 2),
            new Tretja.Pridevnik("mgyhn", 'Z', 3, 2),
            new Tretja.Samostalnik("vf", 'M', 2, 2),
            new Tretja.Glagol("rlr", 2, 1),
            new Tretja.Glagol("aacuff", 3, 2),
            new Tretja.Samostalnik("c", 'M', 4, 1),
            new Tretja.Glagol("jhywewp", 3, 2),
            new Tretja.Samostalnik("dcps", 'S', 4, 2),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("aphrw", 'S', 1, 1),
            new Tretja.Glagol("sykxp", 3, 3),
            new Tretja.Glagol("cqwf", 3, 3),
            new Tretja.Samostalnik("qz", 'S', 1, 1),
            new Tretja.Pridevnik("sddw", 'M', 6, 3),
            new Tretja.Samostalnik("e", 'Z', 2, 1),
            new Tretja.Samostalnik("wdlu", 'M', 2, 2),
            new Tretja.Glagol("jbxb", 1, 2),
            new Tretja.Pridevnik("nmf", 'Z', 3, 2),
            new Tretja.Pridevnik("t", 'M', 6, 1),
            new Tretja.Glagol("paienez", 2, 3),
            new Tretja.Samostalnik("fzp", 'M', 2, 3),
            new Tretja.Pridevnik("jnul", 'Z', 3, 1),
            new Tretja.Samostalnik("isnzxr", 'Z', 5, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("z", 'Z', 4, 2),
            new Tretja.Pridevnik("wnk", 'M', 5, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
