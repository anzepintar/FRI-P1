
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("wa", 3, 2),
            new Tretja.Samostalnik("ljf", 'S', 2, 1),
            new Tretja.Pridevnik("gwoqclk", 'S', 3, 2),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("aj", 'S', 4, 2),
            new Tretja.Glagol("dygfh", 2, 2),
            new Tretja.Samostalnik("vaaory", 'S', 4, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("pet", 2, 3),
            new Tretja.Samostalnik("fbdph", 'M', 4, 1),
            new Tretja.Samostalnik("gkd", 'S', 4, 1),
            new Tretja.Glagol("ydevl", 1, 3),
            new Tretja.Pridevnik("f", 'Z', 1, 3),
            new Tretja.Samostalnik("ajnhav", 'M', 3, 2),
            new Tretja.Samostalnik("dsqju", 'Z', 5, 3),
            new Tretja.Samostalnik("jceaon", 'M', 1, 3),
            new Tretja.Pridevnik("okupgjy", 'Z', 4, 2),
            new Tretja.Samostalnik("evjtl", 'S', 4, 3),
            new Tretja.Glagol("xujekpe", 1, 1),
            new Tretja.Samostalnik("fqy", 'S', 2, 2),
            new Tretja.Samostalnik("e", 'Z', 2, 3),
            new Tretja.Samostalnik("vzcn", 'S', 1, 3),
            new Tretja.Pridevnik("eqs", 'Z', 4, 1),
            new Tretja.Samostalnik("rgoz", 'S', 2, 1),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("bo", 'Z', 2, 3),
            new Tretja.Samostalnik("qzkeps", 'Z', 6, 1),
            new Tretja.Glagol("mo", 1, 3),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("hcyi", 'M', 3, 2),
            new Tretja.Samostalnik("hctcdys", 'S', 5, 1),
            new Tretja.Glagol("gnfk", 1, 1),
            new Tretja.Pridevnik("vkq", 'Z', 3, 2),
            new Tretja.Pridevnik("sufrdvy", 'Z', 2, 2),
            new Tretja.Glagol("tcazrn", 3, 1),
            new Tretja.Pridevnik("avmeaz", 'S', 3, 1),
            new Tretja.Pridevnik("dnjzzb", 'Z', 4, 3),
            new Tretja.Samostalnik("gnsm", 'Z', 6, 3),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("hutircc", 3, 2),
            new Tretja.Samostalnik("jkguqv", 'M', 6, 3),
            new Tretja.Samostalnik("grti", 'M', 2, 2),
            new Tretja.Glagol("jvxv", 2, 1),
            new Tretja.Pridevnik("dmfjgt", 'Z', 2, 3),
            new Tretja.Samostalnik("sn", 'M', 5, 3),
            new Tretja.Glagol("wugvgg", 3, 1),
            new Tretja.Glagol("ool", 1, 3),
            new Tretja.Samostalnik("cuitmop", 'S', 2, 1),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kdcssn", 'M', 5, 1),
            new Tretja.Glagol("dow", 3, 1),
            new Tretja.Samostalnik("avzzahr", 'S', 2, 3),
            new Tretja.Pridevnik("mwbj", 'Z', 4, 2),
            new Tretja.Samostalnik("fjwyrji", 'Z', 4, 2),
            new Tretja.Glagol("jymsxon", 3, 2),
            new Tretja.Samostalnik("c", 'Z', 4, 2),
            new Tretja.Samostalnik("o", 'S', 2, 1),
            new Tretja.Pridevnik("hedp", 'Z', 4, 1),
            new Tretja.Pridevnik("p", 'S', 6, 1),
            new Tretja.Samostalnik("ozx", 'Z', 4, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("icbg", 3, 3),
            new Tretja.Samostalnik("ynxg", 'S', 2, 3),
            new Tretja.Samostalnik("ouhnnr", 'S', 3, 1),
            new Tretja.Glagol("btxm", 1, 2),
            new Tretja.Pridevnik("qdfhjt", 'M', 1, 1),
            new Tretja.Samostalnik("dr", 'M', 3, 3),
            new Tretja.Pridevnik("gipayfb", 'M', 3, 1),
            new Tretja.Pridevnik("t", 'Z', 3, 1),
            new Tretja.Pridevnik("hg", 'M', 4, 2),
            new Tretja.Pridevnik("ptwa", 'M', 2, 1),
            new Tretja.Samostalnik("jmufkoo", 'Z', 6, 1),
            new Tretja.Pridevnik("pazgh", 'M', 2, 2),
            new Tretja.Pridevnik("qpzgkyx", 'M', 2, 2),
            new Tretja.Samostalnik("f", 'Z', 2, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("q", 'M', 4, 1),
            new Tretja.Samostalnik("zxlns", 'Z', 3, 3),
            new Tretja.Glagol("xu", 1, 1),
            new Tretja.Glagol("lnpurhy", 3, 2),
            new Tretja.Pridevnik("fyjifw", 'S', 3, 1),
            new Tretja.Pridevnik("bzs", 'S', 5, 1),
            new Tretja.Pridevnik("um", 'Z', 4, 2),
            new Tretja.Samostalnik("c", 'Z', 6, 1),
            new Tretja.Samostalnik("pjvps", 'M', 2, 2),
            new Tretja.Pridevnik("soaypp", 'M', 1, 2),
            new Tretja.Samostalnik("ow", 'Z', 2, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ooib", 'Z', 5, 3),
            new Tretja.Glagol("obecp", 2, 1),
            new Tretja.Glagol("tq", 3, 2),
            new Tretja.Samostalnik("ragr", 'Z', 5, 3),
            new Tretja.Pridevnik("ni", 'S', 3, 3),
            new Tretja.Samostalnik("ndqcsjr", 'S', 2, 3),
            new Tretja.Pridevnik("hjgio", 'S', 1, 2),
            new Tretja.Glagol("uxivhp", 3, 1),
            new Tretja.Pridevnik("t", 'M', 6, 1),
            new Tretja.Glagol("yy", 1, 3),
        });
        System.out.println(stavek10.preveriPS());

    }
}
