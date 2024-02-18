
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("epkxs", 'Z', 3, 3),
            new Tretja.Pridevnik("d", 'M', 3, 1),
            new Tretja.Glagol("wte", 2, 3),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wollnqf", 'Z', 6, 3),
            new Tretja.Glagol("ngdi", 2, 3),
            new Tretja.Pridevnik("vjev", 'S', 5, 3),
            new Tretja.Samostalnik("szreogj", 'Z', 6, 1),
            new Tretja.Glagol("opy", 3, 1),
            new Tretja.Pridevnik("f", 'M', 2, 1),
            new Tretja.Pridevnik("xumkrx", 'S', 3, 2),
            new Tretja.Glagol("wkmh", 1, 2),
            new Tretja.Pridevnik("lbjq", 'M', 1, 2),
            new Tretja.Samostalnik("vooukm", 'S', 1, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zh", 1, 2),
            new Tretja.Glagol("elvljy", 1, 2),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("kyulp", 3, 1),
            new Tretja.Glagol("kievx", 1, 3),
            new Tretja.Pridevnik("qkym", 'S', 1, 3),
            new Tretja.Glagol("n", 3, 1),
            new Tretja.Pridevnik("tbqtm", 'S', 6, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("rehkc", 'S', 1, 3),
            new Tretja.Pridevnik("jo", 'Z', 5, 2),
            new Tretja.Pridevnik("toueipr", 'S', 5, 1),
            new Tretja.Pridevnik("sa", 'M', 5, 3),
            new Tretja.Glagol("w", 1, 2),
            new Tretja.Glagol("nhgovl", 2, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("jkdulz", 'Z', 2, 1),
            new Tretja.Pridevnik("jyp", 'M', 6, 2),
            new Tretja.Pridevnik("gn", 'S', 3, 3),
            new Tretja.Pridevnik("qhjbq", 'Z', 4, 3),
            new Tretja.Glagol("dtiwtnr", 3, 2),
            new Tretja.Samostalnik("k", 'S', 1, 2),
            new Tretja.Glagol("scvkxc", 2, 3),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ml", 'S', 2, 3),
            new Tretja.Samostalnik("obl", 'Z', 3, 3),
            new Tretja.Samostalnik("bbohd", 'S', 5, 2),
            new Tretja.Samostalnik("q", 'Z', 2, 3),
            new Tretja.Samostalnik("llgo", 'S', 2, 3),
            new Tretja.Glagol("mxkbis", 2, 3),
            new Tretja.Glagol("f", 2, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("noiyt", 'S', 2, 3),
            new Tretja.Pridevnik("nltzti", 'M', 1, 1),
            new Tretja.Samostalnik("dmwyo", 'M', 1, 3),
            new Tretja.Samostalnik("ipyejme", 'M', 4, 2),
            new Tretja.Samostalnik("kpdz", 'Z', 2, 1),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("filcr", 1, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
