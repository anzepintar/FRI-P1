
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tp", 2, 1),
            new Tretja.Samostalnik("raqc", 'M', 6, 3),
            new Tretja.Pridevnik("ojt", 'M', 2, 2),
            new Tretja.Samostalnik("fkabjqy", 'S', 5, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("rkew", 2, 1),
            new Tretja.Samostalnik("ebjzs", 'S', 2, 1),
            new Tretja.Pridevnik("vsj", 'Z', 1, 2),
            new Tretja.Samostalnik("bhbba", 'Z', 1, 3),
            new Tretja.Pridevnik("ki", 'M', 4, 2),
            new Tretja.Samostalnik("wfxd", 'S', 3, 2),
            new Tretja.Samostalnik("wd", 'S', 6, 3),
            new Tretja.Samostalnik("bti", 'M', 2, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jepk", 'S', 1, 3),
            new Tretja.Pridevnik("f", 'S', 1, 1),
            new Tretja.Pridevnik("cefu", 'S', 5, 1),
            new Tretja.Samostalnik("pnjefi", 'Z', 2, 2),
            new Tretja.Pridevnik("dlysyyf", 'Z', 5, 1),
            new Tretja.Glagol("hvqnokd", 2, 2),
            new Tretja.Samostalnik("tfotz", 'S', 2, 3),
            new Tretja.Samostalnik("rptdpuz", 'S', 2, 3),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("sercmb", 1, 1),
            new Tretja.Samostalnik("ttn", 'M', 5, 3),
            new Tretja.Samostalnik("mlautb", 'M', 2, 1),
            new Tretja.Pridevnik("cqzkjbm", 'Z', 6, 1),
            new Tretja.Samostalnik("wunz", 'Z', 6, 2),
            new Tretja.Samostalnik("fbgs", 'M', 5, 3),
            new Tretja.Pridevnik("midaw", 'S', 4, 3),
            new Tretja.Pridevnik("v", 'S', 1, 1),
            new Tretja.Pridevnik("fitkvsv", 'S', 5, 3),
            new Tretja.Samostalnik("ylzzry", 'S', 3, 1),
            new Tretja.Pridevnik("jxeqx", 'S', 3, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("dfeqi", 'Z', 2, 1),
            new Tretja.Pridevnik("a", 'S', 5, 1),
            new Tretja.Samostalnik("xkpj", 'M', 4, 1),
            new Tretja.Samostalnik("ujmtplb", 'Z', 2, 3),
            new Tretja.Pridevnik("ravlsi", 'Z', 3, 1),
            new Tretja.Samostalnik("mxezvk", 'Z', 2, 1),
            new Tretja.Pridevnik("qt", 'Z', 1, 2),
            new Tretja.Glagol("hw", 3, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("lttyof", 3, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mhfvtj", 3, 1),
            new Tretja.Samostalnik("gzxyl", 'Z', 6, 3),
            new Tretja.Samostalnik("zpgi", 'S', 6, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mb", 3, 1),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("log", 'M', 5, 2),
            new Tretja.Glagol("jenlgm", 2, 2),
            new Tretja.Samostalnik("cq", 'M', 1, 3),
            new Tretja.Pridevnik("emf", 'S', 4, 1),
            new Tretja.Pridevnik("lmimp", 'S', 2, 2),
            new Tretja.Samostalnik("xh", 'S', 4, 1),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("rw", 3, 3),
            new Tretja.Samostalnik("xqyqgv", 'S', 2, 2),
            new Tretja.Pridevnik("l", 'M', 6, 2),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
