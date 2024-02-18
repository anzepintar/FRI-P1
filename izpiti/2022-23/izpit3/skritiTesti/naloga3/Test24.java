
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("tkgyt", 'M', 5, 2),
            new Tretja.Glagol("zalt", 3, 1),
            new Tretja.Glagol("qkwt", 1, 1),
            new Tretja.Samostalnik("eaiwr", 'Z', 2, 2),
            new Tretja.Pridevnik("nqzvc", 'M', 3, 2),
            new Tretja.Pridevnik("c", 'S', 6, 3),
            new Tretja.Samostalnik("lrprgol", 'M', 4, 1),
            new Tretja.Samostalnik("b", 'M', 1, 3),
            new Tretja.Glagol("gnss", 1, 3),
            new Tretja.Glagol("flmsm", 1, 1),
            new Tretja.Glagol("tgymbwj", 3, 2),
            new Tretja.Glagol("hxkx", 1, 2),
            new Tretja.Glagol("spkerxa", 1, 3),
            new Tretja.Glagol("diyo", 2, 2),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ebpd", 1, 3),
            new Tretja.Pridevnik("mi", 'Z', 4, 3),
            new Tretja.Glagol("ix", 2, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("j", 'S', 4, 3),
            new Tretja.Pridevnik("rn", 'Z', 6, 2),
            new Tretja.Glagol("wgszvh", 2, 1),
            new Tretja.Glagol("lo", 3, 1),
            new Tretja.Samostalnik("l", 'Z', 5, 2),
            new Tretja.Pridevnik("bcn", 'M', 3, 3),
            new Tretja.Pridevnik("qwwp", 'Z', 2, 2),
            new Tretja.Pridevnik("euwhaqm", 'Z', 1, 2),
            new Tretja.Pridevnik("oz", 'S', 2, 1),
            new Tretja.Samostalnik("dixarw", 'Z', 6, 1),
            new Tretja.Pridevnik("gwyunyk", 'Z', 4, 3),
            new Tretja.Samostalnik("qbi", 'Z', 5, 3),
            new Tretja.Glagol("fi", 2, 2),
            new Tretja.Glagol("q", 1, 2),
            new Tretja.Glagol("y", 3, 3),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("g", 'Z', 6, 3),
            new Tretja.Glagol("yhr", 1, 1),
            new Tretja.Pridevnik("eo", 'S', 4, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("lqgjj", 'Z', 3, 2),
            new Tretja.Glagol("zfrt", 2, 2),
            new Tretja.Glagol("wcksfv", 2, 2),
            new Tretja.Samostalnik("rw", 'S', 2, 1),
            new Tretja.Pridevnik("gocoxvd", 'Z', 4, 3),
            new Tretja.Samostalnik("vdbj", 'S', 1, 3),
            new Tretja.Samostalnik("guiafx", 'Z', 1, 1),
            new Tretja.Samostalnik("o", 'M', 4, 2),
            new Tretja.Samostalnik("chqy", 'M', 1, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("cxdcu", 'M', 2, 1),
            new Tretja.Glagol("sjgnn", 3, 2),
            new Tretja.Pridevnik("tm", 'M', 2, 3),
            new Tretja.Pridevnik("myomor", 'M', 6, 1),
            new Tretja.Pridevnik("xntuq", 'Z', 5, 3),
            new Tretja.Samostalnik("ytwnfqm", 'S', 5, 1),
            new Tretja.Glagol("mf", 2, 1),
            new Tretja.Pridevnik("gq", 'Z', 4, 1),
            new Tretja.Pridevnik("vk", 'Z', 5, 3),
            new Tretja.Samostalnik("sofhrsa", 'Z', 6, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("uzwfhe", 'Z', 5, 2),
            new Tretja.Pridevnik("fje", 'S', 3, 2),
            new Tretja.Glagol("sokdnm", 3, 3),
            new Tretja.Samostalnik("mbrjz", 'M', 5, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("gklckeo", 'Z', 1, 3),
            new Tretja.Glagol("xc", 1, 2),
            new Tretja.Glagol("sf", 2, 3),
            new Tretja.Pridevnik("kr", 'M', 3, 2),
            new Tretja.Samostalnik("n", 'S', 6, 1),
            new Tretja.Pridevnik("x", 'S', 1, 2),
            new Tretja.Pridevnik("bkdci", 'S', 3, 1),
            new Tretja.Pridevnik("gbifo", 'Z', 2, 3),
            new Tretja.Samostalnik("nh", 'M', 1, 1),
            new Tretja.Samostalnik("pmp", 'S', 5, 1),
            new Tretja.Glagol("giaget", 3, 1),
            new Tretja.Glagol("rfgp", 1, 1),
            new Tretja.Glagol("xlnq", 2, 3),
            new Tretja.Samostalnik("zqdjh", 'Z', 6, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ugfze", 1, 1),
            new Tretja.Glagol("jhiy", 1, 3),
            new Tretja.Glagol("m", 1, 2),
            new Tretja.Pridevnik("jxcatn", 'M', 4, 3),
            new Tretja.Pridevnik("ruo", 'Z', 1, 1),
            new Tretja.Glagol("wmenm", 3, 1),
            new Tretja.Glagol("uvzjse", 2, 1),
            new Tretja.Pridevnik("c", 'M', 6, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ygebot", 2, 1),
            new Tretja.Pridevnik("te", 'S', 1, 2),
            new Tretja.Samostalnik("uw", 'Z', 6, 3),
            new Tretja.Pridevnik("zcqjpw", 'S', 6, 1),
            new Tretja.Pridevnik("aus", 'M', 5, 1),
            new Tretja.Pridevnik("z", 'M', 2, 2),
            new Tretja.Pridevnik("uyuwkjx", 'Z', 1, 2),
            new Tretja.Glagol("r", 1, 3),
        });
        System.out.println(stavek10.preveriPS());

    }
}
