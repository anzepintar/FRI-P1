
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("byws", 'S', 5, 3),
            new Tretja.Samostalnik("lx", 'S', 1, 1),
            new Tretja.Glagol("jpavpfd", 2, 2),
            new Tretja.Samostalnik("d", 'M', 3, 3),
            new Tretja.Pridevnik("phmy", 'S', 6, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tqug", 3, 3),
            new Tretja.Glagol("amem", 2, 1),
            new Tretja.Samostalnik("tg", 'S', 3, 3),
            new Tretja.Glagol("say", 1, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("oqfr", 'M', 6, 3),
            new Tretja.Samostalnik("tsfbkau", 'M', 2, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("syvuavu", 'M', 6, 3),
            new Tretja.Pridevnik("z", 'S', 5, 3),
            new Tretja.Pridevnik("lk", 'M', 2, 3),
            new Tretja.Glagol("hvkq", 1, 1),
            new Tretja.Samostalnik("jpi", 'Z', 3, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zlwky", 1, 3),
            new Tretja.Samostalnik("ry", 'M', 4, 1),
            new Tretja.Samostalnik("jyeh", 'Z', 2, 3),
            new Tretja.Glagol("uow", 2, 3),
            new Tretja.Pridevnik("ejlfg", 'S', 4, 2),
            new Tretja.Samostalnik("izyx", 'S', 1, 1),
            new Tretja.Pridevnik("smdte", 'Z', 5, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("eu", 3, 1),
            new Tretja.Pridevnik("kprz", 'S', 4, 1),
            new Tretja.Glagol("xf", 2, 2),
            new Tretja.Glagol("e", 2, 1),
            new Tretja.Samostalnik("oqej", 'S', 4, 2),
            new Tretja.Samostalnik("y", 'M', 3, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("dto", 3, 1),
            new Tretja.Glagol("hvzi", 3, 3),
            new Tretja.Samostalnik("t", 'Z', 1, 2),
            new Tretja.Pridevnik("jabd", 'M', 3, 3),
            new Tretja.Samostalnik("vysbzwp", 'M', 3, 2),
            new Tretja.Glagol("nwbzba", 1, 3),
            new Tretja.Pridevnik("z", 'Z', 3, 3),
            new Tretja.Samostalnik("qcmptl", 'M', 2, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("swjm", 'Z', 4, 2),
            new Tretja.Pridevnik("fy", 'Z', 1, 1),
            new Tretja.Samostalnik("l", 'M', 4, 2),
            new Tretja.Samostalnik("h", 'S', 2, 3),
            new Tretja.Pridevnik("fwl", 'Z', 3, 1),
            new Tretja.Samostalnik("nueskes", 'M', 6, 2),
            new Tretja.Samostalnik("ytnys", 'Z', 6, 1),
            new Tretja.Samostalnik("afwszbu", 'S', 4, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ltflllf", 'S', 4, 2),
            new Tretja.Pridevnik("tt", 'Z', 5, 2),
            new Tretja.Glagol("f", 3, 3),
            new Tretja.Pridevnik("ckqkbnx", 'S', 1, 1),
            new Tretja.Pridevnik("wcoa", 'Z', 1, 1),
            new Tretja.Glagol("iat", 3, 1),
            new Tretja.Pridevnik("zdulrcd", 'Z', 5, 3),
            new Tretja.Samostalnik("ln", 'S', 5, 3),
            new Tretja.Samostalnik("urxfhj", 'S', 1, 1),
            new Tretja.Samostalnik("tugo", 'S', 6, 3),
            new Tretja.Samostalnik("qawa", 'S', 2, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("xlkykfi", 'S', 2, 3),
            new Tretja.Samostalnik("mbxjohb", 'S', 2, 3),
            new Tretja.Pridevnik("w", 'Z', 1, 1),
            new Tretja.Samostalnik("xfpbo", 'M', 3, 2),
            new Tretja.Glagol("brhufau", 1, 1),
            new Tretja.Pridevnik("nllvhim", 'Z', 4, 1),
            new Tretja.Pridevnik("ysgteqg", 'Z', 2, 3),
            new Tretja.Samostalnik("o", 'M', 5, 3),
            new Tretja.Samostalnik("d", 'Z', 2, 3),
            new Tretja.Pridevnik("cg", 'M', 2, 1),
            new Tretja.Pridevnik("lw", 'M', 5, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
