
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("pcyvvf", 'Z', 3, 2),
            new Tretja.Pridevnik("tsekuap", 'M', 5, 3),
            new Tretja.Samostalnik("mh", 'S', 3, 3),
            new Tretja.Pridevnik("defnnoz", 'M', 3, 3),
            new Tretja.Pridevnik("sl", 'S', 3, 2),
            new Tretja.Glagol("ky", 3, 3),
            new Tretja.Pridevnik("dq", 'S', 3, 2),
            new Tretja.Pridevnik("xj", 'S', 1, 1),
            new Tretja.Glagol("ui", 3, 1),
            new Tretja.Samostalnik("rtxkbkh", 'Z', 4, 2),
            new Tretja.Glagol("klxxt", 2, 1),
            new Tretja.Pridevnik("uy", 'S', 3, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("wigpo", 1, 1),
            new Tretja.Pridevnik("nngh", 'Z', 5, 3),
            new Tretja.Samostalnik("n", 'Z', 5, 1),
            new Tretja.Samostalnik("bek", 'Z', 6, 1),
            new Tretja.Samostalnik("xnnkig", 'S', 4, 2),
            new Tretja.Samostalnik("b", 'Z', 4, 2),
            new Tretja.Pridevnik("u", 'Z', 3, 1),
            new Tretja.Pridevnik("tzrhzm", 'Z', 3, 1),
            new Tretja.Pridevnik("qsfdpn", 'Z', 5, 1),
            new Tretja.Pridevnik("jomoj", 'M', 2, 2),
            new Tretja.Samostalnik("oa", 'S', 4, 1),
            new Tretja.Pridevnik("ilb", 'M', 6, 3),
            new Tretja.Glagol("efnlphk", 2, 3),
            new Tretja.Glagol("ordel", 2, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("bzj", 'M', 1, 2),
            new Tretja.Glagol("l", 2, 1),
            new Tretja.Glagol("rgmecs", 2, 2),
            new Tretja.Samostalnik("zyricu", 'M', 1, 1),
            new Tretja.Pridevnik("v", 'Z', 2, 1),
            new Tretja.Glagol("k", 1, 3),
            new Tretja.Pridevnik("peao", 'M', 6, 3),
            new Tretja.Glagol("x", 1, 1),
            new Tretja.Glagol("n", 3, 2),
            new Tretja.Samostalnik("sadpieu", 'Z', 6, 3),
            new Tretja.Samostalnik("kl", 'S', 5, 3),
            new Tretja.Samostalnik("ibnxm", 'S', 6, 2),
            new Tretja.Glagol("ky", 3, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("mpnels", 'Z', 5, 1),
            new Tretja.Samostalnik("byay", 'M', 4, 2),
            new Tretja.Glagol("cino", 3, 3),
            new Tretja.Pridevnik("prcz", 'Z', 1, 3),
            new Tretja.Samostalnik("qx", 'S', 4, 2),
            new Tretja.Pridevnik("k", 'S', 2, 1),
            new Tretja.Glagol("kc", 1, 3),
            new Tretja.Glagol("ymuohs", 1, 2),
            new Tretja.Pridevnik("v", 'Z', 1, 2),
            new Tretja.Pridevnik("dbety", 'Z', 1, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wpxw", 'Z', 6, 1),
            new Tretja.Pridevnik("lpabi", 'M', 5, 1),
            new Tretja.Samostalnik("qncr", 'M', 1, 1),
            new Tretja.Samostalnik("jdpr", 'M', 4, 3),
            new Tretja.Glagol("qwklv", 2, 1),
            new Tretja.Glagol("wlab", 1, 2),
            new Tretja.Pridevnik("bjkl", 'Z', 2, 3),
            new Tretja.Glagol("ivsaeu", 1, 2),
            new Tretja.Samostalnik("wfmg", 'Z', 3, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("gkot", 'Z', 6, 2),
            new Tretja.Glagol("eaalclp", 3, 2),
            new Tretja.Glagol("zwryoro", 3, 3),
            new Tretja.Samostalnik("bulsztz", 'M', 4, 1),
            new Tretja.Samostalnik("cxzm", 'M', 1, 3),
            new Tretja.Samostalnik("cj", 'Z', 5, 3),
            new Tretja.Pridevnik("s", 'S', 2, 2),
            new Tretja.Glagol("vvdwoh", 1, 1),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("tyatbrj", 'S', 3, 1),
            new Tretja.Pridevnik("wnxl", 'M', 2, 2),
            new Tretja.Samostalnik("oj", 'S', 5, 1),
            new Tretja.Samostalnik("oe", 'M', 2, 2),
            new Tretja.Pridevnik("gkcbdhh", 'M', 6, 1),
            new Tretja.Glagol("lzq", 1, 1),
            new Tretja.Glagol("k", 3, 1),
            new Tretja.Pridevnik("bx", 'S', 3, 1),
            new Tretja.Samostalnik("tix", 'S', 2, 2),
            new Tretja.Samostalnik("e", 'M', 5, 2),
            new Tretja.Pridevnik("rvzcf", 'Z', 5, 1),
            new Tretja.Samostalnik("hhnt", 'M', 4, 2),
            new Tretja.Glagol("cxmotk", 1, 2),
            new Tretja.Glagol("s", 3, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("w", 3, 2),
            new Tretja.Samostalnik("ntnkuc", 'Z', 1, 1),
            new Tretja.Samostalnik("z", 'M', 1, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("swytjbj", 2, 1),
            new Tretja.Glagol("laduou", 1, 3),
            new Tretja.Glagol("ay", 3, 3),
            new Tretja.Samostalnik("jy", 'Z', 6, 2),
            new Tretja.Pridevnik("gn", 'S', 6, 2),
            new Tretja.Glagol("kymrn", 3, 1),
            new Tretja.Samostalnik("aqd", 'Z', 5, 2),
            new Tretja.Samostalnik("eekwlp", 'S', 3, 3),
            new Tretja.Pridevnik("zkgxf", 'S', 6, 2),
            new Tretja.Samostalnik("ilm", 'M', 1, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("i", 'M', 2, 3),
            new Tretja.Pridevnik("xesrk", 'S', 6, 1),
            new Tretja.Samostalnik("zu", 'Z', 6, 2),
            new Tretja.Samostalnik("hfqpau", 'S', 4, 2),
            new Tretja.Pridevnik("zjzqz", 'Z', 2, 3),
            new Tretja.Samostalnik("wspfmhd", 'M', 5, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
