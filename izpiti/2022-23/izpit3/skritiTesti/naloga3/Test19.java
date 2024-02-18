
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("vrpr", 1, 2),
            new Tretja.Glagol("epocf", 2, 1),
            new Tretja.Pridevnik("f", 'S', 2, 3),
            new Tretja.Samostalnik("v", 'M', 3, 3),
            new Tretja.Glagol("k", 3, 3),
            new Tretja.Glagol("hvg", 3, 2),
            new Tretja.Samostalnik("bn", 'M', 5, 3),
            new Tretja.Pridevnik("bnujml", 'M', 3, 3),
            new Tretja.Glagol("pxqej", 1, 3),
            new Tretja.Samostalnik("ynmud", 'M', 5, 2),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("pdqi", 1, 1),
            new Tretja.Pridevnik("s", 'M', 5, 2),
            new Tretja.Samostalnik("cyqecv", 'S', 4, 2),
            new Tretja.Samostalnik("glaqtq", 'S', 6, 3),
            new Tretja.Pridevnik("gk", 'S', 4, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("fbhiios", 3, 1),
            new Tretja.Pridevnik("foem", 'M', 4, 2),
            new Tretja.Glagol("bq", 1, 3),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("khgzcd", 'M', 5, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("oa", 1, 1),
            new Tretja.Pridevnik("c", 'M', 5, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("opg", 'M', 2, 3),
            new Tretja.Samostalnik("nzmeoo", 'M', 4, 1),
            new Tretja.Glagol("byyrsh", 1, 3),
            new Tretja.Pridevnik("irnweba", 'M', 1, 1),
            new Tretja.Pridevnik("mzthavp", 'Z', 2, 1),
            new Tretja.Samostalnik("zbb", 'Z', 6, 1),
            new Tretja.Glagol("o", 1, 3),
            new Tretja.Glagol("vh", 3, 2),
            new Tretja.Glagol("vf", 1, 2),
            new Tretja.Pridevnik("iis", 'M', 6, 1),
            new Tretja.Pridevnik("odbbdpw", 'S', 5, 2),
            new Tretja.Samostalnik("a", 'S', 4, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("cxmpsdz", 'Z', 6, 2),
            new Tretja.Glagol("qgkkzc", 1, 3),
            new Tretja.Pridevnik("owxc", 'Z', 6, 3),
            new Tretja.Pridevnik("jtlw", 'Z', 1, 1),
            new Tretja.Samostalnik("hjot", 'Z', 6, 3),
            new Tretja.Pridevnik("eulzczu", 'S', 2, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("o", 'Z', 3, 2),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("vmy", 'M', 5, 2),
            new Tretja.Pridevnik("stpkm", 'M', 2, 1),
            new Tretja.Glagol("mpss", 2, 2),
            new Tretja.Glagol("l", 3, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("uuhk", 'S', 1, 3),
            new Tretja.Samostalnik("s", 'Z', 1, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
