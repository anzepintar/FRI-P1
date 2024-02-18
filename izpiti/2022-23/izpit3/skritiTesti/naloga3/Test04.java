
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("fhusmry", 1, 3),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("pognmk", 3, 2),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("nddlbrc", 'M', 4, 1),
            new Tretja.Samostalnik("rewiaq", 'M', 1, 2),
            new Tretja.Samostalnik("sosmfcl", 'S', 2, 2),
            new Tretja.Glagol("g", 3, 3),
            new Tretja.Samostalnik("mvr", 'M', 1, 1),
            new Tretja.Pridevnik("d", 'M', 5, 2),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("qtqqfh", 'S', 6, 3),
            new Tretja.Glagol("iq", 1, 2),
            new Tretja.Samostalnik("lfeaus", 'Z', 3, 2),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("lz", 'Z', 4, 1),
            new Tretja.Samostalnik("gy", 'S', 3, 1),
            new Tretja.Glagol("wwua", 3, 1),
            new Tretja.Samostalnik("srw", 'Z', 1, 2),
            new Tretja.Samostalnik("nhliga", 'M', 4, 3),
            new Tretja.Pridevnik("gdjxoz", 'S', 5, 3),
            new Tretja.Samostalnik("vqmior", 'M', 3, 3),
            new Tretja.Samostalnik("d", 'Z', 5, 3),
            new Tretja.Samostalnik("xzhey", 'S', 4, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("aaomj", 1, 2),
            new Tretja.Pridevnik("wig", 'Z', 4, 3),
            new Tretja.Pridevnik("dj", 'Z', 5, 1),
            new Tretja.Samostalnik("wo", 'M', 6, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jeg", 'S', 5, 1),
            new Tretja.Samostalnik("rdn", 'M', 6, 2),
            new Tretja.Pridevnik("xqhyim", 'M', 5, 3),
            new Tretja.Samostalnik("cskkl", 'M', 2, 2),
            new Tretja.Samostalnik("dwxcxpz", 'M', 4, 2),
            new Tretja.Samostalnik("aplse", 'Z', 4, 3),
            new Tretja.Glagol("epdfh", 2, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("opszspp", 'S', 4, 1),
            new Tretja.Glagol("dowhdup", 3, 1),
            new Tretja.Samostalnik("glukj", 'S', 5, 1),
            new Tretja.Pridevnik("frtjkv", 'Z', 2, 1),
            new Tretja.Pridevnik("seyma", 'Z', 5, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("vrfkb", 'S', 1, 3),
            new Tretja.Glagol("rffq", 1, 1),
            new Tretja.Samostalnik("eajub", 'Z', 2, 3),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("uemyjkh", 2, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
