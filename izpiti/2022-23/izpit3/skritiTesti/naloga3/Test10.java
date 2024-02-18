
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("pjc", 2, 3),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ywdu", 'S', 3, 3),
            new Tretja.Samostalnik("itak", 'S', 4, 2),
            new Tretja.Pridevnik("aog", 'Z', 4, 3),
            new Tretja.Pridevnik("pkh", 'M', 2, 3),
            new Tretja.Pridevnik("vjby", 'M', 3, 2),
            new Tretja.Pridevnik("h", 'S', 5, 2),
            new Tretja.Glagol("jyz", 2, 2),
            new Tretja.Samostalnik("k", 'S', 1, 1),
            new Tretja.Samostalnik("rsm", 'M', 3, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("zbkrv", 'Z', 1, 2),
            new Tretja.Samostalnik("cckyck", 'Z', 4, 2),
            new Tretja.Glagol("bwagkbt", 3, 1),
            new Tretja.Samostalnik("q", 'Z', 3, 2),
            new Tretja.Samostalnik("jbp", 'S', 4, 1),
            new Tretja.Samostalnik("osn", 'M', 5, 1),
            new Tretja.Pridevnik("ne", 'S', 6, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("l", 'M', 4, 1),
            new Tretja.Pridevnik("hs", 'M', 5, 1),
            new Tretja.Samostalnik("nvscc", 'Z', 3, 1),
            new Tretja.Pridevnik("l", 'S', 6, 3),
            new Tretja.Pridevnik("nyel", 'Z', 4, 1),
            new Tretja.Glagol("guqxxr", 1, 3),
            new Tretja.Samostalnik("zlpqw", 'Z', 6, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("l", 'Z', 2, 2),
            new Tretja.Samostalnik("e", 'M', 6, 1),
            new Tretja.Glagol("lurlm", 1, 3),
            new Tretja.Samostalnik("v", 'S', 5, 3),
            new Tretja.Samostalnik("vzfkup", 'M', 3, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ikntsat", 2, 2),
            new Tretja.Samostalnik("qwysiv", 'S', 5, 3),
            new Tretja.Pridevnik("jt", 'S', 1, 1),
            new Tretja.Samostalnik("ct", 'Z', 3, 1),
            new Tretja.Pridevnik("visckf", 'Z', 1, 1),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hxdj", 'Z', 4, 1),
            new Tretja.Pridevnik("aif", 'S', 2, 1),
            new Tretja.Glagol("wddepzt", 1, 2),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("xihzt", 'Z', 2, 3),
            new Tretja.Pridevnik("mlak", 'M', 3, 2),
            new Tretja.Glagol("ztrf", 2, 2),
            new Tretja.Samostalnik("qmv", 'M', 6, 3),
            new Tretja.Pridevnik("clohwcx", 'Z', 2, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("vmhac", 'Z', 4, 1),
            new Tretja.Glagol("y", 2, 2),
            new Tretja.Samostalnik("v", 'M', 4, 1),
            new Tretja.Pridevnik("htpzon", 'S', 5, 3),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("tilz", 'Z', 6, 3),
            new Tretja.Samostalnik("cgtkw", 'S', 3, 1),
            new Tretja.Pridevnik("wvz", 'Z', 4, 1),
            new Tretja.Samostalnik("vijk", 'M', 4, 1),
            new Tretja.Samostalnik("nx", 'Z', 5, 1),
            new Tretja.Samostalnik("fxyu", 'S', 2, 3),
            new Tretja.Samostalnik("f", 'M', 4, 2),
            new Tretja.Glagol("fescevh", 3, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
