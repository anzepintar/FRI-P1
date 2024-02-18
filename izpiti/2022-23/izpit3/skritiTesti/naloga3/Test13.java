
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wob", 'Z', 5, 3),
            new Tretja.Pridevnik("n", 'S', 2, 1),
            new Tretja.Pridevnik("egxy", 'S', 4, 3),
            new Tretja.Pridevnik("jlfoy", 'S', 6, 3),
            new Tretja.Samostalnik("cozcwax", 'S', 5, 1),
            new Tretja.Glagol("jcy", 1, 3),
            new Tretja.Samostalnik("sqv", 'Z', 3, 3),
            new Tretja.Pridevnik("jkaqs", 'M', 5, 3),
            new Tretja.Samostalnik("po", 'Z', 2, 1),
            new Tretja.Pridevnik("binrdf", 'S', 6, 1),
            new Tretja.Pridevnik("jn", 'S', 1, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("fmmkpt", 'Z', 1, 1),
            new Tretja.Samostalnik("vguta", 'Z', 6, 1),
            new Tretja.Pridevnik("apy", 'Z', 1, 1),
            new Tretja.Pridevnik("xueq", 'M', 2, 2),
            new Tretja.Samostalnik("qi", 'Z', 3, 3),
            new Tretja.Pridevnik("vln", 'M', 6, 2),
            new Tretja.Pridevnik("laslmwy", 'Z', 4, 1),
            new Tretja.Samostalnik("bszd", 'S', 6, 3),
            new Tretja.Pridevnik("kzv", 'M', 3, 2),
            new Tretja.Samostalnik("v", 'M', 6, 3),
            new Tretja.Glagol("jnkcyk", 3, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("qdx", 1, 2),
            new Tretja.Pridevnik("tqvbhv", 'S', 6, 3),
            new Tretja.Pridevnik("akchz", 'S', 6, 3),
            new Tretja.Pridevnik("mhx", 'M', 4, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xoss", 'S', 1, 2),
            new Tretja.Pridevnik("hggea", 'S', 5, 3),
            new Tretja.Pridevnik("hkz", 'M', 6, 2),
            new Tretja.Pridevnik("hgukmlh", 'M', 1, 3),
            new Tretja.Glagol("wfxuxd", 3, 3),
            new Tretja.Pridevnik("vag", 'M', 2, 2),
            new Tretja.Samostalnik("nuy", 'Z', 2, 2),
            new Tretja.Samostalnik("zps", 'Z', 3, 1),
            new Tretja.Pridevnik("zco", 'M', 3, 3),
            new Tretja.Samostalnik("vcrvf", 'M', 2, 1),
            new Tretja.Pridevnik("zkz", 'M', 4, 2),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ieswb", 'M', 1, 2),
            new Tretja.Pridevnik("ovg", 'M', 2, 2),
            new Tretja.Samostalnik("ii", 'M', 5, 1),
            new Tretja.Samostalnik("jrhkeqj", 'S', 5, 1),
            new Tretja.Samostalnik("hr", 'Z', 2, 1),
            new Tretja.Pridevnik("yb", 'Z', 5, 1),
            new Tretja.Glagol("sbnd", 2, 1),
            new Tretja.Pridevnik("o", 'M', 6, 2),
            new Tretja.Samostalnik("mrqnqq", 'S', 4, 2),
            new Tretja.Pridevnik("p", 'Z', 6, 1),
            new Tretja.Pridevnik("tskrhy", 'M', 3, 1),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("x", 'M', 3, 1),
            new Tretja.Samostalnik("k", 'M', 3, 3),
            new Tretja.Samostalnik("ivwo", 'M', 1, 2),
            new Tretja.Glagol("oqfw", 1, 1),
            new Tretja.Samostalnik("ytttmgx", 'S', 2, 1),
            new Tretja.Pridevnik("mbfbr", 'Z', 6, 2),
            new Tretja.Pridevnik("egobn", 'M', 2, 2),
            new Tretja.Samostalnik("uwjtlkb", 'S', 4, 2),
            new Tretja.Pridevnik("yuzrud", 'Z', 2, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("jlmqi", 'M', 3, 3),
            new Tretja.Samostalnik("uksr", 'Z', 4, 1),
            new Tretja.Glagol("p", 3, 1),
            new Tretja.Pridevnik("wfkquk", 'Z', 3, 3),
            new Tretja.Pridevnik("giltbne", 'Z', 1, 2),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("mlusiwt", 'Z', 6, 3),
            new Tretja.Samostalnik("ouutgul", 'M', 1, 3),
            new Tretja.Samostalnik("we", 'S', 3, 1),
            new Tretja.Pridevnik("qlsw", 'Z', 2, 3),
            new Tretja.Samostalnik("fccc", 'S', 5, 3),
            new Tretja.Glagol("dmhkko", 2, 2),
            new Tretja.Pridevnik("xdv", 'S', 5, 2),
            new Tretja.Samostalnik("rjb", 'Z', 2, 3),
            new Tretja.Pridevnik("abaxag", 'S', 4, 1),
            new Tretja.Pridevnik("rcdbpx", 'M', 2, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("xw", 3, 2),
            new Tretja.Samostalnik("qzxq", 'Z', 1, 3),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("zaoz", 'Z', 3, 2),
            new Tretja.Samostalnik("g", 'S', 6, 1),
            new Tretja.Pridevnik("r", 'Z', 4, 2),
            new Tretja.Pridevnik("k", 'M', 1, 3),
            new Tretja.Pridevnik("e", 'Z', 5, 3),
            new Tretja.Samostalnik("fv", 'M', 3, 2),
            new Tretja.Glagol("rt", 1, 1),
            new Tretja.Samostalnik("fqonab", 'Z', 1, 2),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
