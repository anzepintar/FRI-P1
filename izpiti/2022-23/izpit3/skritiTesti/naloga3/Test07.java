
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wdzekbx", 'M', 3, 3),
            new Tretja.Samostalnik("urtq", 'S', 6, 3),
            new Tretja.Pridevnik("jgdxjxi", 'S', 4, 1),
            new Tretja.Glagol("n", 1, 3),
            new Tretja.Pridevnik("dvnm", 'S', 2, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ikkqnr", 'S', 5, 2),
            new Tretja.Pridevnik("jrb", 'S', 2, 2),
            new Tretja.Samostalnik("nfp", 'S', 3, 1),
            new Tretja.Samostalnik("deylgqp", 'M', 4, 2),
            new Tretja.Samostalnik("fozojq", 'S', 1, 2),
            new Tretja.Pridevnik("m", 'S', 2, 1),
            new Tretja.Samostalnik("roerqs", 'M', 5, 3),
            new Tretja.Glagol("usbuuvi", 1, 2),
            new Tretja.Pridevnik("qgca", 'M', 5, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kj", 'Z', 2, 2),
            new Tretja.Glagol("qmfwjzi", 3, 2),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("k", 3, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("qiilzx", 'Z', 2, 1),
            new Tretja.Glagol("nlw", 3, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("qgmypy", 3, 3),
            new Tretja.Pridevnik("auwjp", 'M', 5, 3),
            new Tretja.Samostalnik("wwrjsf", 'Z', 3, 3),
            new Tretja.Pridevnik("yfvohdx", 'M', 5, 3),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kvjpudo", 'S', 5, 2),
            new Tretja.Glagol("v", 1, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("z", 'M', 2, 2),
            new Tretja.Glagol("y", 1, 2),
            new Tretja.Pridevnik("bnq", 'S', 1, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("mjf", 'Z', 2, 1),
            new Tretja.Glagol("vjmt", 2, 1),
            new Tretja.Samostalnik("h", 'Z', 6, 1),
            new Tretja.Samostalnik("iddtkpg", 'S', 2, 1),
            new Tretja.Pridevnik("orwgfct", 'M', 6, 2),
            new Tretja.Samostalnik("bc", 'S', 4, 2),
            new Tretja.Pridevnik("lyampky", 'Z', 2, 2),
            new Tretja.Samostalnik("spg", 'M', 4, 1),
            new Tretja.Samostalnik("fgffcpf", 'M', 6, 3),
            new Tretja.Pridevnik("mawyzm", 'Z', 2, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("qbmd", 3, 3),
            new Tretja.Pridevnik("a", 'M', 6, 3),
            new Tretja.Pridevnik("dyrsq", 'S', 2, 1),
            new Tretja.Pridevnik("uzmjbh", 'M', 1, 3),
            new Tretja.Samostalnik("fvvnp", 'S', 6, 1),
            new Tretja.Samostalnik("lrfosps", 'S', 6, 3),
            new Tretja.Pridevnik("djsab", 'Z', 2, 2),
            new Tretja.Samostalnik("i", 'M', 3, 2),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
