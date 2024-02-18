
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jf", 'S', 6, 2),
            new Tretja.Samostalnik("nmnaigi", 'M', 6, 1),
            new Tretja.Glagol("lrafneb", 2, 1),
            new Tretja.Pridevnik("vkssju", 'M', 5, 1),
            new Tretja.Pridevnik("iphjg", 'M', 4, 2),
            new Tretja.Pridevnik("q", 'M', 2, 1),
            new Tretja.Glagol("q", 1, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ik", 'S', 2, 2),
            new Tretja.Pridevnik("o", 'S', 5, 3),
            new Tretja.Samostalnik("uudhije", 'S', 6, 2),
            new Tretja.Glagol("xrildc", 3, 1),
            new Tretja.Samostalnik("hzrndq", 'S', 1, 3),
            new Tretja.Samostalnik("twvkvwf", 'M', 1, 2),
            new Tretja.Pridevnik("u", 'M', 2, 3),
            new Tretja.Pridevnik("eo", 'Z', 4, 1),
            new Tretja.Pridevnik("cvt", 'M', 4, 1),
            new Tretja.Samostalnik("icdmz", 'Z', 4, 1),
            new Tretja.Pridevnik("cu", 'M', 3, 3),
            new Tretja.Pridevnik("lhfxueb", 'S', 2, 3),
            new Tretja.Pridevnik("hd", 'M', 6, 1),
            new Tretja.Glagol("muiq", 3, 2),
            new Tretja.Pridevnik("tvnwp", 'M', 2, 1),
            new Tretja.Samostalnik("hx", 'Z', 4, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("bd", 'Z', 2, 2),
            new Tretja.Samostalnik("k", 'M', 1, 2),
            new Tretja.Samostalnik("l", 'Z', 6, 1),
            new Tretja.Samostalnik("hkcrv", 'S', 3, 2),
            new Tretja.Glagol("bgysez", 1, 2),
            new Tretja.Pridevnik("hthpki", 'S', 2, 1),
            new Tretja.Pridevnik("ad", 'S', 5, 2),
            new Tretja.Samostalnik("vuzbf", 'S', 3, 3),
            new Tretja.Samostalnik("d", 'Z', 4, 2),
            new Tretja.Samostalnik("j", 'S', 3, 1),
            new Tretja.Pridevnik("rr", 'Z', 6, 1),
            new Tretja.Glagol("qs", 3, 1),
            new Tretja.Pridevnik("xky", 'Z', 6, 2),
            new Tretja.Samostalnik("tjhphv", 'S', 2, 1),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tf", 1, 3),
            new Tretja.Samostalnik("piyf", 'M', 3, 1),
            new Tretja.Pridevnik("xu", 'M', 4, 3),
            new Tretja.Samostalnik("ukdxuft", 'Z', 5, 1),
            new Tretja.Samostalnik("gidkn", 'M', 1, 1),
            new Tretja.Samostalnik("m", 'S', 2, 3),
            new Tretja.Pridevnik("h", 'Z', 2, 1),
            new Tretja.Pridevnik("hlwolp", 'S', 4, 3),
            new Tretja.Pridevnik("qssftoh", 'M', 5, 1),
            new Tretja.Glagol("pj", 2, 2),
            new Tretja.Pridevnik("fh", 'S', 1, 1),
            new Tretja.Samostalnik("dswbz", 'Z', 5, 1),
            new Tretja.Glagol("a", 2, 2),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("xzatff", 'S', 4, 3),
            new Tretja.Pridevnik("tsy", 'S', 3, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("vv", 3, 1),
            new Tretja.Glagol("b", 1, 3),
            new Tretja.Pridevnik("dgx", 'S', 2, 3),
            new Tretja.Samostalnik("g", 'M', 5, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ccmyjzl", 'M', 4, 1),
            new Tretja.Glagol("vjqbb", 2, 2),
            new Tretja.Pridevnik("zwf", 'S', 1, 1),
            new Tretja.Samostalnik("t", 'M', 1, 3),
            new Tretja.Glagol("q", 1, 3),
            new Tretja.Glagol("sb", 1, 1),
            new Tretja.Pridevnik("flwhnn", 'M', 2, 1),
            new Tretja.Glagol("jzq", 2, 1),
            new Tretja.Glagol("pwdvex", 2, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kw", 'S', 1, 1),
            new Tretja.Samostalnik("ayps", 'M', 5, 3),
            new Tretja.Pridevnik("ufv", 'Z', 5, 2),
            new Tretja.Pridevnik("xwa", 'M', 1, 2),
            new Tretja.Pridevnik("blcfiq", 'S', 2, 3),
            new Tretja.Pridevnik("gnoj", 'S', 4, 1),
            new Tretja.Samostalnik("iwkrweh", 'Z', 4, 2),
            new Tretja.Glagol("k", 2, 3),
            new Tretja.Samostalnik("b", 'S', 3, 2),
            new Tretja.Glagol("t", 3, 1),
            new Tretja.Pridevnik("jfjmfw", 'S', 3, 2),
            new Tretja.Samostalnik("mgl", 'S', 6, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("rai", 'Z', 6, 2),
            new Tretja.Samostalnik("mxhmvmy", 'M', 4, 1),
            new Tretja.Pridevnik("cqtavjb", 'S', 3, 3),
            new Tretja.Pridevnik("twqksu", 'M', 5, 3),
            new Tretja.Glagol("rmh", 3, 1),
            new Tretja.Samostalnik("lbwjth", 'M', 2, 3),
            new Tretja.Pridevnik("jrmzdai", 'S', 6, 3),
            new Tretja.Glagol("iuttduf", 1, 2),
            new Tretja.Pridevnik("yz", 'Z', 5, 3),
            new Tretja.Glagol("u", 2, 1),
            new Tretja.Samostalnik("dljg", 'S', 2, 2),
            new Tretja.Samostalnik("tyfz", 'M', 1, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("w", 2, 1),
            new Tretja.Pridevnik("kge", 'Z', 2, 3),
            new Tretja.Pridevnik("w", 'S', 1, 1),
            new Tretja.Samostalnik("iyrofn", 'Z', 5, 3),
            new Tretja.Samostalnik("fakl", 'Z', 4, 3),
            new Tretja.Glagol("dcl", 3, 1),
            new Tretja.Pridevnik("tcfxac", 'S', 2, 3),
            new Tretja.Samostalnik("kd", 'S', 6, 3),
            new Tretja.Glagol("htm", 2, 3),
            new Tretja.Pridevnik("kxbr", 'S', 2, 3),
            new Tretja.Pridevnik("fmdydg", 'M', 1, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
