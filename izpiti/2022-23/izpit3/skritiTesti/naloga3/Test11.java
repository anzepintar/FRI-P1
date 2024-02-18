
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("r", 'M', 6, 3),
            new Tretja.Samostalnik("upl", 'M', 5, 1),
            new Tretja.Pridevnik("neberj", 'Z', 1, 1),
            new Tretja.Glagol("jw", 3, 2),
            new Tretja.Samostalnik("se", 'M', 4, 3),
            new Tretja.Glagol("omiftbl", 3, 1),
            new Tretja.Glagol("mwyq", 2, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ktoaycq", 'Z', 4, 3),
            new Tretja.Glagol("rlc", 3, 3),
            new Tretja.Glagol("xu", 1, 2),
            new Tretja.Glagol("u", 3, 3),
            new Tretja.Pridevnik("pehwa", 'M', 1, 2),
            new Tretja.Samostalnik("ds", 'M', 4, 2),
            new Tretja.Pridevnik("xnhqugp", 'M', 4, 2),
            new Tretja.Pridevnik("alz", 'M', 2, 3),
            new Tretja.Pridevnik("lp", 'S', 3, 3),
            new Tretja.Glagol("scfytc", 3, 1),
            new Tretja.Samostalnik("jvm", 'S', 6, 3),
            new Tretja.Pridevnik("it", 'S', 1, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jdsuuj", 'M', 4, 1),
            new Tretja.Pridevnik("ea", 'S', 2, 3),
            new Tretja.Pridevnik("yp", 'M', 3, 2),
            new Tretja.Glagol("t", 1, 1),
            new Tretja.Samostalnik("ulscpv", 'S', 6, 2),
            new Tretja.Pridevnik("imlgsz", 'M', 1, 3),
            new Tretja.Glagol("ostvgvd", 3, 3),
            new Tretja.Glagol("g", 3, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("v", 1, 1),
            new Tretja.Pridevnik("dsgeeu", 'Z', 2, 3),
            new Tretja.Glagol("uzcaugt", 2, 2),
            new Tretja.Samostalnik("ng", 'M', 4, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("isyu", 'S', 2, 2),
            new Tretja.Pridevnik("bzsrug", 'Z', 6, 2),
            new Tretja.Glagol("u", 1, 3),
            new Tretja.Pridevnik("mgatp", 'S', 2, 2),
            new Tretja.Samostalnik("uchbzwj", 'Z', 2, 3),
            new Tretja.Pridevnik("ibwugm", 'Z', 2, 3),
            new Tretja.Pridevnik("sjjbz", 'S', 1, 3),
            new Tretja.Glagol("cfdys", 1, 2),
            new Tretja.Glagol("kvw", 1, 3),
            new Tretja.Glagol("slortmn", 2, 1),
            new Tretja.Glagol("n", 2, 3),
            new Tretja.Pridevnik("raies", 'S', 1, 3),
            new Tretja.Pridevnik("wug", 'Z', 4, 2),
            new Tretja.Pridevnik("scf", 'M', 2, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jnr", 'M', 3, 3),
            new Tretja.Pridevnik("qdyfj", 'S', 4, 2),
            new Tretja.Glagol("enrcc", 1, 2),
            new Tretja.Glagol("em", 1, 2),
            new Tretja.Samostalnik("r", 'S', 4, 3),
            new Tretja.Pridevnik("ckkmdk", 'S', 1, 3),
            new Tretja.Samostalnik("kdvha", 'M', 4, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("jiyam", 'M', 6, 1),
            new Tretja.Glagol("wrxdt", 2, 2),
            new Tretja.Glagol("ae", 3, 1),
            new Tretja.Glagol("b", 1, 3),
            new Tretja.Glagol("cij", 1, 3),
            new Tretja.Samostalnik("kuauuwk", 'Z', 6, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("lsnlkm", 1, 2),
            new Tretja.Glagol("ckm", 2, 3),
            new Tretja.Glagol("q", 3, 1),
            new Tretja.Glagol("qwcops", 1, 1),
            new Tretja.Glagol("vbf", 2, 2),
            new Tretja.Pridevnik("sq", 'Z', 1, 1),
            new Tretja.Pridevnik("mbyx", 'Z', 2, 2),
            new Tretja.Samostalnik("yvmcdtq", 'M', 5, 3),
            new Tretja.Pridevnik("iu", 'Z', 6, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("xdrj", 1, 2),
            new Tretja.Glagol("d", 2, 1),
            new Tretja.Glagol("bucjm", 2, 1),
            new Tretja.Samostalnik("pkmrnq", 'S', 5, 1),
            new Tretja.Glagol("l", 1, 3),
            new Tretja.Samostalnik("xrgy", 'Z', 5, 3),
            new Tretja.Samostalnik("vi", 'Z', 6, 1),
            new Tretja.Samostalnik("hfpyr", 'Z', 4, 3),
            new Tretja.Pridevnik("iclgv", 'Z', 5, 1),
            new Tretja.Glagol("jhi", 3, 1),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("cgxtv", 'M', 2, 1),
            new Tretja.Samostalnik("xgdu", 'M', 4, 2),
            new Tretja.Glagol("ketrsx", 1, 2),
            new Tretja.Samostalnik("c", 'Z', 3, 1),
            new Tretja.Samostalnik("mk", 'S', 3, 1),
            new Tretja.Samostalnik("bcxsy", 'M', 3, 3),
            new Tretja.Glagol("qzyakie", 2, 2),
            new Tretja.Samostalnik("oruw", 'S', 3, 2),
            new Tretja.Pridevnik("myilfbk", 'Z', 6, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
