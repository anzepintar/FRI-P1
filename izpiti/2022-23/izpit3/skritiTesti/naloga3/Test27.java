
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("tcu", 'M', 6, 2),
            new Tretja.Pridevnik("nynkfsl", 'M', 3, 2),
            new Tretja.Samostalnik("dkqryk", 'M', 4, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("yrxjz", 1, 3),
            new Tretja.Pridevnik("dyeuewn", 'S', 5, 2),
            new Tretja.Pridevnik("lzyqkfk", 'S', 4, 1),
            new Tretja.Samostalnik("fbjtys", 'S', 2, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("a", 'S', 6, 3),
            new Tretja.Glagol("rjaxvcx", 2, 3),
            new Tretja.Pridevnik("c", 'S', 5, 3),
            new Tretja.Samostalnik("hneqp", 'Z', 4, 2),
            new Tretja.Glagol("cfye", 2, 3),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("nxwhka", 2, 2),
            new Tretja.Samostalnik("apdzsn", 'Z', 1, 3),
            new Tretja.Pridevnik("yq", 'Z', 4, 1),
            new Tretja.Samostalnik("t", 'S', 3, 1),
            new Tretja.Glagol("uswrpgn", 1, 3),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mvyfkhc", 2, 3),
            new Tretja.Pridevnik("tkdw", 'Z', 3, 3),
            new Tretja.Samostalnik("rpyan", 'S', 1, 2),
            new Tretja.Pridevnik("rulzgo", 'M', 3, 3),
            new Tretja.Pridevnik("lzseoq", 'Z', 6, 1),
            new Tretja.Glagol("zj", 1, 2),
            new Tretja.Samostalnik("mmnt", 'Z', 2, 1),
            new Tretja.Pridevnik("hh", 'Z', 3, 2),
            new Tretja.Samostalnik("mvojmzm", 'Z', 4, 2),
            new Tretja.Samostalnik("jgcjju", 'S', 6, 3),
            new Tretja.Glagol("hyxa", 1, 3),
            new Tretja.Glagol("uts", 2, 3),
            new Tretja.Samostalnik("yrae", 'M', 6, 3),
            new Tretja.Samostalnik("jkuuaee", 'M', 6, 1),
            new Tretja.Glagol("qw", 2, 3),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("qidadc", 'Z', 4, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ryn", 'S', 5, 1),
            new Tretja.Glagol("xxndx", 2, 2),
            new Tretja.Samostalnik("zc", 'M', 5, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("xfh", 'M', 2, 1),
            new Tretja.Pridevnik("qycip", 'S', 4, 2),
            new Tretja.Pridevnik("yf", 'Z', 1, 3),
            new Tretja.Samostalnik("fzi", 'Z', 1, 3),
            new Tretja.Glagol("o", 2, 2),
            new Tretja.Samostalnik("olcgeyp", 'S', 4, 2),
            new Tretja.Pridevnik("qbbr", 'S', 5, 1),
            new Tretja.Pridevnik("lkrshx", 'M', 6, 1),
            new Tretja.Samostalnik("b", 'S', 4, 2),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kelw", 'Z', 3, 1),
            new Tretja.Samostalnik("ez", 'Z', 3, 2),
            new Tretja.Glagol("znojc", 2, 1),
            new Tretja.Glagol("ou", 1, 2),
            new Tretja.Pridevnik("flxbmw", 'S', 1, 2),
            new Tretja.Samostalnik("nb", 'S', 1, 2),
            new Tretja.Pridevnik("y", 'Z', 1, 2),
            new Tretja.Pridevnik("ly", 'Z', 3, 1),
            new Tretja.Pridevnik("gvxp", 'S', 4, 1),
            new Tretja.Samostalnik("hbnva", 'S', 4, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("nulh", 'Z', 5, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
