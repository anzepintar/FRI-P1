
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("zq", 'S', 4, 3),
            new Tretja.Samostalnik("nojcl", 'Z', 3, 3),
            new Tretja.Glagol("pca", 2, 1),
            new Tretja.Samostalnik("pycvh", 'Z', 1, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xw", 'M', 1, 2),
            new Tretja.Pridevnik("oiatpm", 'S', 5, 2),
            new Tretja.Samostalnik("btzl", 'S', 5, 3),
            new Tretja.Pridevnik("gshfzdy", 'Z', 3, 2),
            new Tretja.Samostalnik("hrcmgm", 'M', 4, 3),
            new Tretja.Glagol("z", 3, 1),
            new Tretja.Samostalnik("qr", 'S', 6, 1),
            new Tretja.Pridevnik("y", 'M', 2, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("yvhoa", 'S', 5, 1),
            new Tretja.Glagol("bqwd", 2, 2),
            new Tretja.Samostalnik("nrw", 'M', 2, 3),
            new Tretja.Pridevnik("ax", 'M', 5, 2),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ctfkgo", 'S', 2, 2),
            new Tretja.Glagol("vjfgog", 3, 3),
            new Tretja.Samostalnik("xezp", 'S', 1, 3),
            new Tretja.Samostalnik("hm", 'S', 5, 3),
            new Tretja.Pridevnik("srgt", 'S', 4, 3),
            new Tretja.Pridevnik("nfkm", 'M', 4, 1),
            new Tretja.Pridevnik("bl", 'M', 2, 3),
            new Tretja.Pridevnik("xzybrpq", 'Z', 5, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tyklxe", 2, 1),
            new Tretja.Pridevnik("hbbgeo", 'Z', 2, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wa", 'Z', 2, 1),
            new Tretja.Samostalnik("j", 'M', 6, 2),
            new Tretja.Pridevnik("bma", 'Z', 3, 3),
            new Tretja.Samostalnik("erpkxc", 'S', 1, 2),
            new Tretja.Pridevnik("kt", 'Z', 2, 1),
            new Tretja.Samostalnik("u", 'M', 4, 1),
            new Tretja.Glagol("yqfxybm", 2, 3),
            new Tretja.Samostalnik("avr", 'M', 1, 2),
            new Tretja.Samostalnik("ad", 'M', 2, 2),
            new Tretja.Samostalnik("rmvv", 'M', 5, 2),
            new Tretja.Samostalnik("tuzo", 'M', 5, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hk", 'S', 2, 1),
            new Tretja.Samostalnik("ya", 'Z', 6, 3),
            new Tretja.Pridevnik("dfc", 'M', 4, 2),
            new Tretja.Pridevnik("mv", 'S', 3, 2),
            new Tretja.Samostalnik("cqzcsv", 'M', 3, 1),
            new Tretja.Samostalnik("lktk", 'S', 6, 2),
            new Tretja.Pridevnik("ipn", 'Z', 2, 1),
            new Tretja.Samostalnik("oqpdxix", 'M', 5, 3),
            new Tretja.Glagol("hsyh", 2, 1),
            new Tretja.Samostalnik("i", 'Z', 3, 2),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("tysqtz", 'S', 6, 1),
            new Tretja.Glagol("wvf", 1, 3),
            new Tretja.Samostalnik("m", 'Z', 3, 1),
            new Tretja.Samostalnik("byifjcf", 'M', 5, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("dj", 'Z', 2, 2),
            new Tretja.Pridevnik("mfmu", 'Z', 2, 2),
            new Tretja.Samostalnik("nb", 'S', 1, 2),
            new Tretja.Pridevnik("bb", 'Z', 5, 2),
            new Tretja.Glagol("zygpv", 2, 3),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("wnfd", 3, 3),
            new Tretja.Pridevnik("pyryot", 'S', 2, 2),
            new Tretja.Pridevnik("fogfn", 'S', 5, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
