
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("lfs", 1, 2),
            new Tretja.Samostalnik("pemai", 'Z', 5, 3),
            new Tretja.Samostalnik("lum", 'M', 4, 1),
            new Tretja.Glagol("e", 1, 3),
            new Tretja.Samostalnik("rv", 'S', 4, 1),
            new Tretja.Samostalnik("zjvd", 'M', 6, 2),
            new Tretja.Pridevnik("qvngpxl", 'Z', 5, 2),
            new Tretja.Samostalnik("qryfvo", 'M', 4, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ecn", 'M', 5, 1),
            new Tretja.Samostalnik("eqgaw", 'S', 6, 1),
            new Tretja.Pridevnik("wpsv", 'Z', 6, 2),
            new Tretja.Samostalnik("bnzcl", 'M', 6, 1),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("rk", 'S', 4, 3),
            new Tretja.Samostalnik("khkis", 'M', 1, 1),
            new Tretja.Samostalnik("vzbilq", 'Z', 6, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("etldt", 'S', 6, 3),
            new Tretja.Glagol("rivn", 2, 1),
            new Tretja.Glagol("y", 3, 1),
            new Tretja.Samostalnik("chi", 'M', 5, 1),
            new Tretja.Pridevnik("wudfg", 'M', 1, 2),
            new Tretja.Pridevnik("wtz", 'S', 2, 1),
            new Tretja.Pridevnik("trrf", 'M', 3, 3),
            new Tretja.Samostalnik("jg", 'S', 5, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("da", 1, 2),
            new Tretja.Pridevnik("qsglxq", 'M', 3, 2),
            new Tretja.Pridevnik("bfiiq", 'S', 1, 3),
            new Tretja.Samostalnik("xaiij", 'Z', 2, 2),
            new Tretja.Pridevnik("uaus", 'M', 5, 1),
            new Tretja.Samostalnik("cf", 'Z', 4, 1),
            new Tretja.Pridevnik("wwbh", 'S', 2, 1),
            new Tretja.Pridevnik("efixfiv", 'Z', 3, 1),
            new Tretja.Pridevnik("nwpxibu", 'Z', 4, 2),
            new Tretja.Samostalnik("ve", 'M', 5, 3),
            new Tretja.Samostalnik("ck", 'M', 6, 2),
            new Tretja.Pridevnik("l", 'M', 2, 3),
            new Tretja.Samostalnik("mw", 'M', 1, 2),
            new Tretja.Pridevnik("pg", 'Z', 4, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wc", 'Z', 1, 1),
            new Tretja.Pridevnik("bmcdfd", 'Z', 2, 3),
            new Tretja.Samostalnik("yd", 'S', 4, 2),
            new Tretja.Pridevnik("zhkiff", 'M', 3, 1),
            new Tretja.Pridevnik("nx", 'S', 2, 3),
            new Tretja.Pridevnik("ymqdjho", 'M', 2, 3),
            new Tretja.Samostalnik("pmldt", 'Z', 6, 1),
            new Tretja.Glagol("bn", 2, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ibcz", 'S', 3, 2),
            new Tretja.Pridevnik("m", 'S', 2, 1),
            new Tretja.Samostalnik("xvnv", 'Z', 4, 2),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zxhk", 2, 1),
            new Tretja.Samostalnik("g", 'M', 5, 2),
            new Tretja.Pridevnik("eenowlt", 'M', 1, 1),
            new Tretja.Glagol("ei", 3, 1),
            new Tretja.Glagol("nnwsa", 3, 2),
            new Tretja.Samostalnik("rkcntp", 'S', 5, 2),
            new Tretja.Pridevnik("tvqciy", 'S', 2, 3),
            new Tretja.Samostalnik("egi", 'S', 1, 2),
            new Tretja.Glagol("njywgqp", 3, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("bpbod", 'S', 2, 3),
            new Tretja.Pridevnik("pcdvqqc", 'S', 5, 1),
            new Tretja.Samostalnik("bdahlqm", 'S', 2, 3),
            new Tretja.Glagol("qoafpka", 1, 2),
            new Tretja.Glagol("yiuq", 2, 2),
            new Tretja.Samostalnik("hkjo", 'S', 6, 2),
            new Tretja.Pridevnik("liqxrj", 'M', 2, 2),
            new Tretja.Samostalnik("wgkjv", 'Z', 2, 2),
            new Tretja.Glagol("xc", 1, 2),
            new Tretja.Pridevnik("mhalrz", 'S', 2, 1),
            new Tretja.Samostalnik("ssi", 'S', 1, 1),
            new Tretja.Samostalnik("x", 'M', 6, 1),
            new Tretja.Samostalnik("rsvw", 'S', 2, 3),
            new Tretja.Samostalnik("hciicpw", 'M', 4, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("m", 'Z', 5, 3),
            new Tretja.Samostalnik("epdtig", 'Z', 3, 3),
            new Tretja.Pridevnik("ry", 'Z', 3, 1),
            new Tretja.Samostalnik("crzdf", 'Z', 4, 2),
            new Tretja.Pridevnik("kwizy", 'S', 2, 2),
            new Tretja.Samostalnik("bh", 'S', 5, 2),
            new Tretja.Pridevnik("gg", 'M', 5, 3),
            new Tretja.Samostalnik("n", 'S', 3, 2),
            new Tretja.Pridevnik("bflwocv", 'Z', 4, 1),
            new Tretja.Pridevnik("g", 'M', 3, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
