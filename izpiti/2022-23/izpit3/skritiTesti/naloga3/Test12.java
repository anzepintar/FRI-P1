
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ohdsv", 'M', 6, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("aiheas", 'M', 3, 2),
            new Tretja.Samostalnik("ftvp", 'M', 5, 1),
            new Tretja.Pridevnik("xatsrb", 'M', 1, 2),
            new Tretja.Pridevnik("p", 'M', 6, 1),
            new Tretja.Pridevnik("v", 'S', 6, 1),
            new Tretja.Pridevnik("ywqnczs", 'Z', 1, 3),
            new Tretja.Pridevnik("knzupnp", 'S', 1, 1),
            new Tretja.Pridevnik("tizwuz", 'Z', 6, 3),
            new Tretja.Pridevnik("nf", 'Z', 5, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ondrqi", 1, 1),
            new Tretja.Samostalnik("zse", 'M', 1, 2),
            new Tretja.Samostalnik("otmyh", 'Z', 1, 3),
            new Tretja.Glagol("mizyj", 3, 2),
            new Tretja.Pridevnik("wvchsr", 'Z', 4, 1),
            new Tretja.Pridevnik("yvhq", 'Z', 2, 2),
            new Tretja.Samostalnik("htshh", 'Z', 5, 2),
            new Tretja.Pridevnik("fpbof", 'S', 5, 2),
            new Tretja.Samostalnik("qblr", 'M', 4, 2),
            new Tretja.Pridevnik("inho", 'S', 6, 3),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ffl", 'S', 4, 1),
            new Tretja.Glagol("jbboj", 2, 3),
            new Tretja.Glagol("vmvuzv", 2, 2),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("xcznr", 1, 2),
            new Tretja.Glagol("vgst", 1, 1),
            new Tretja.Glagol("oqrashd", 1, 2),
            new Tretja.Pridevnik("e", 'S', 6, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ltrjikz", 'S', 5, 1),
            new Tretja.Samostalnik("jbvro", 'M', 1, 3),
            new Tretja.Samostalnik("lkaavo", 'Z', 6, 2),
            new Tretja.Samostalnik("d", 'S', 3, 1),
            new Tretja.Samostalnik("o", 'S', 1, 2),
            new Tretja.Pridevnik("ihr", 'Z', 1, 3),
            new Tretja.Samostalnik("odvcdr", 'S', 3, 2),
            new Tretja.Samostalnik("gv", 'S', 1, 3),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("kflam", 'Z', 5, 1),
            new Tretja.Samostalnik("vijn", 'M', 2, 3),
            new Tretja.Glagol("tpvmug", 3, 3),
            new Tretja.Pridevnik("m", 'Z', 3, 1),
            new Tretja.Samostalnik("segg", 'M', 4, 3),
            new Tretja.Samostalnik("ma", 'M', 2, 1),
            new Tretja.Pridevnik("rvblc", 'Z', 5, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ju", 'Z', 6, 3),
            new Tretja.Samostalnik("ciqo", 'S', 5, 3),
            new Tretja.Pridevnik("raaql", 'M', 4, 1),
            new Tretja.Glagol("cfn", 1, 2),
            new Tretja.Pridevnik("sm", 'M', 4, 2),
            new Tretja.Samostalnik("pn", 'M', 1, 1),
            new Tretja.Samostalnik("bzcg", 'M', 6, 1),
            new Tretja.Pridevnik("hf", 'S', 1, 2),
            new Tretja.Samostalnik("fyiprm", 'S', 3, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("og", 3, 1),
            new Tretja.Samostalnik("hgwg", 'Z', 3, 2),
            new Tretja.Samostalnik("ewmhph", 'S', 3, 2),
            new Tretja.Glagol("kphw", 3, 2),
            new Tretja.Samostalnik("ak", 'S', 3, 2),
            new Tretja.Pridevnik("rpbl", 'Z', 1, 2),
            new Tretja.Pridevnik("lfuy", 'Z', 1, 2),
            new Tretja.Pridevnik("gz", 'M', 6, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("elfje", 3, 2),
            new Tretja.Samostalnik("ylebm", 'M', 5, 3),
            new Tretja.Pridevnik("o", 'M', 5, 3),
            new Tretja.Pridevnik("peyscoa", 'M', 5, 3),
            new Tretja.Pridevnik("vao", 'S', 4, 1),
            new Tretja.Glagol("nekukse", 2, 1),
            new Tretja.Pridevnik("fwdkqf", 'S', 4, 1),
            new Tretja.Samostalnik("ff", 'M', 6, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
