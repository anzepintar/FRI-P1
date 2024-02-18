
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("io", 3, 2),
            new Tretja.Pridevnik("ytjn", 'M', 6, 3),
            new Tretja.Pridevnik("thws", 'S', 4, 2),
            new Tretja.Pridevnik("q", 'S', 3, 3),
            new Tretja.Samostalnik("hkeghft", 'M', 6, 3),
            new Tretja.Samostalnik("y", 'M', 1, 2),
            new Tretja.Pridevnik("p", 'M', 3, 1),
            new Tretja.Samostalnik("lk", 'S', 2, 1),
            new Tretja.Pridevnik("jeluc", 'S', 1, 3),
            new Tretja.Glagol("ehh", 2, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("iltna", 'Z', 1, 1),
            new Tretja.Pridevnik("l", 'S', 4, 1),
            new Tretja.Samostalnik("uujejg", 'S', 5, 3),
            new Tretja.Pridevnik("c", 'Z', 2, 1),
            new Tretja.Samostalnik("qphuk", 'Z', 3, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("cjpeepx", 'M', 1, 1),
            new Tretja.Pridevnik("g", 'S', 6, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("yijlxex", 'M', 3, 1),
            new Tretja.Pridevnik("jwjam", 'Z', 1, 2),
            new Tretja.Glagol("sabdn", 1, 2),
            new Tretja.Pridevnik("m", 'S', 3, 3),
            new Tretja.Glagol("djme", 1, 1),
            new Tretja.Pridevnik("jyta", 'S', 3, 3),
            new Tretja.Samostalnik("gp", 'S', 2, 3),
            new Tretja.Glagol("atlhr", 2, 2),
            new Tretja.Samostalnik("alzfu", 'M', 1, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("fuhx", 'M', 6, 3),
            new Tretja.Glagol("ads", 1, 1),
            new Tretja.Pridevnik("dkw", 'M', 3, 3),
            new Tretja.Samostalnik("man", 'M', 2, 2),
            new Tretja.Samostalnik("zuoskz", 'S', 4, 3),
            new Tretja.Pridevnik("m", 'S', 4, 2),
            new Tretja.Samostalnik("fsiiu", 'Z', 2, 1),
            new Tretja.Pridevnik("dkhs", 'Z', 4, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("chnwpq", 1, 2),
            new Tretja.Glagol("ksgfnxo", 2, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hor", 'Z', 6, 3),
            new Tretja.Glagol("ydddxrx", 2, 3),
            new Tretja.Samostalnik("iggg", 'M', 4, 3),
            new Tretja.Glagol("xw", 1, 2),
            new Tretja.Samostalnik("q", 'M', 5, 1),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zztgg", 2, 2),
            new Tretja.Pridevnik("ffzhliv", 'S', 2, 3),
            new Tretja.Glagol("mkcn", 3, 2),
            new Tretja.Pridevnik("fbf", 'M', 4, 3),
            new Tretja.Samostalnik("rjp", 'Z', 4, 2),
            new Tretja.Glagol("kqk", 2, 2),
            new Tretja.Samostalnik("fzlnco", 'S', 2, 1),
            new Tretja.Pridevnik("yl", 'M', 5, 2),
            new Tretja.Pridevnik("p", 'S', 6, 2),
            new Tretja.Pridevnik("dyrs", 'M', 2, 2),
            new Tretja.Pridevnik("l", 'Z', 5, 3),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("qoiaeuj", 'S', 1, 2),
            new Tretja.Glagol("v", 3, 3),
            new Tretja.Glagol("s", 1, 1),
            new Tretja.Pridevnik("zyrhiy", 'M', 4, 2),
            new Tretja.Samostalnik("s", 'Z', 1, 2),
            new Tretja.Pridevnik("vkundvm", 'M', 1, 2),
            new Tretja.Samostalnik("aece", 'M', 1, 1),
            new Tretja.Samostalnik("ut", 'Z', 1, 3),
            new Tretja.Glagol("tn", 1, 1),
            new Tretja.Pridevnik("efhoh", 'S', 2, 2),
            new Tretja.Samostalnik("hqc", 'Z', 2, 3),
            new Tretja.Samostalnik("udvrmvn", 'Z', 4, 1),
            new Tretja.Pridevnik("udru", 'S', 6, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
