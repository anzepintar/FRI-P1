
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("pom", 1, 3),
            new Tretja.Pridevnik("oltylfs", 'M', 3, 2),
            new Tretja.Glagol("guzv", 1, 1),
            new Tretja.Pridevnik("trqqupe", 'S', 3, 3),
            new Tretja.Samostalnik("mxkt", 'M', 1, 2),
            new Tretja.Glagol("urvuyd", 1, 3),
            new Tretja.Pridevnik("rtboc", 'M', 3, 3),
            new Tretja.Glagol("m", 3, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("imyqz", 1, 3),
            new Tretja.Glagol("ztffrmu", 2, 1),
            new Tretja.Samostalnik("cvqs", 'Z', 2, 1),
            new Tretja.Glagol("n", 1, 1),
            new Tretja.Glagol("evqfge", 3, 2),
            new Tretja.Glagol("zllixwx", 2, 1),
            new Tretja.Samostalnik("rcmd", 'Z', 3, 1),
            new Tretja.Samostalnik("dedocw", 'Z', 4, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("q", 3, 2),
            new Tretja.Glagol("huxdzpa", 3, 3),
            new Tretja.Samostalnik("hbgprt", 'Z', 4, 1),
            new Tretja.Glagol("dfl", 2, 1),
            new Tretja.Pridevnik("lgfjza", 'S', 4, 1),
            new Tretja.Pridevnik("ffdt", 'M', 5, 2),
            new Tretja.Pridevnik("r", 'S', 1, 1),
            new Tretja.Glagol("zfeoszg", 1, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("rtrq", 1, 1),
            new Tretja.Samostalnik("w", 'S', 4, 3),
            new Tretja.Glagol("j", 3, 1),
            new Tretja.Glagol("esghp", 2, 3),
            new Tretja.Pridevnik("ar", 'Z', 2, 2),
            new Tretja.Samostalnik("popkbrz", 'M', 6, 3),
            new Tretja.Samostalnik("ggd", 'S', 5, 2),
            new Tretja.Glagol("d", 2, 1),
            new Tretja.Pridevnik("wca", 'M', 1, 3),
            new Tretja.Pridevnik("xgxl", 'S', 6, 2),
            new Tretja.Glagol("ysfeqhw", 1, 3),
            new Tretja.Pridevnik("ydwml", 'M', 6, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ooxzhzy", 1, 1),
            new Tretja.Samostalnik("e", 'Z', 4, 3),
            new Tretja.Glagol("noxjmsx", 1, 3),
            new Tretja.Glagol("tljuub", 1, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("lsn", 'M', 3, 1),
            new Tretja.Pridevnik("wdawbbz", 'Z', 4, 2),
            new Tretja.Glagol("ilcz", 3, 3),
            new Tretja.Samostalnik("tnf", 'Z', 5, 3),
            new Tretja.Pridevnik("gjeopge", 'Z', 4, 1),
            new Tretja.Pridevnik("zbqjgne", 'Z', 3, 1),
            new Tretja.Glagol("na", 1, 1),
            new Tretja.Pridevnik("jryav", 'M', 5, 3),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("imdx", 1, 2),
            new Tretja.Glagol("d", 1, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("yoolga", 'S', 2, 3),
            new Tretja.Pridevnik("brlxyqb", 'M', 2, 1),
            new Tretja.Pridevnik("k", 'M', 6, 3),
            new Tretja.Samostalnik("llnzua", 'S', 5, 2),
            new Tretja.Glagol("zrtm", 3, 3),
            new Tretja.Samostalnik("m", 'S', 3, 3),
            new Tretja.Samostalnik("uvvttd", 'S', 5, 3),
            new Tretja.Glagol("xugnqwx", 1, 3),
            new Tretja.Glagol("smbuzvz", 1, 1),
            new Tretja.Pridevnik("ke", 'M', 6, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ztyixds", 'M', 6, 2),
            new Tretja.Glagol("pzoghn", 2, 2),
            new Tretja.Glagol("oir", 1, 2),
            new Tretja.Glagol("rgd", 2, 1),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("bzwmiml", 3, 1),
            new Tretja.Pridevnik("hrcrc", 'S', 3, 2),
            new Tretja.Pridevnik("a", 'S', 6, 1),
            new Tretja.Glagol("o", 3, 1),
            new Tretja.Glagol("devagro", 3, 1),
            new Tretja.Glagol("ybeslh", 1, 2),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
