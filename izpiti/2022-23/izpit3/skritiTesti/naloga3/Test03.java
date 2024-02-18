
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wzgfbi", 'S', 6, 3),
            new Tretja.Pridevnik("m", 'M', 2, 2),
            new Tretja.Pridevnik("dlhv", 'S', 6, 3),
            new Tretja.Pridevnik("ewz", 'S', 5, 3),
            new Tretja.Pridevnik("r", 'S', 5, 3),
            new Tretja.Glagol("vxs", 3, 2),
            new Tretja.Pridevnik("azi", 'M', 3, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("hospoc", 'M', 1, 2),
            new Tretja.Glagol("taufxsf", 2, 2),
            new Tretja.Glagol("bpkhrr", 3, 2),
            new Tretja.Samostalnik("fmwtr", 'M', 5, 1),
            new Tretja.Samostalnik("delrr", 'Z', 3, 1),
            new Tretja.Glagol("asoue", 1, 3),
            new Tretja.Pridevnik("pio", 'M', 5, 1),
            new Tretja.Pridevnik("fr", 'Z', 3, 3),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("fxuqhjf", 'Z', 1, 2),
            new Tretja.Glagol("ebzd", 1, 2),
            new Tretja.Samostalnik("emhgl", 'M', 2, 2),
            new Tretja.Samostalnik("ash", 'Z', 2, 1),
            new Tretja.Samostalnik("vaf", 'M', 1, 2),
            new Tretja.Samostalnik("dfy", 'S', 5, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tiwnr", 2, 1),
            new Tretja.Samostalnik("gbu", 'S', 1, 3),
            new Tretja.Pridevnik("zbrm", 'Z', 5, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("yipb", 3, 1),
            new Tretja.Glagol("gngcsci", 2, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("lbrsw", 'M', 2, 2),
            new Tretja.Samostalnik("mifuvh", 'M', 2, 3),
            new Tretja.Glagol("c", 1, 2),
            new Tretja.Samostalnik("ns", 'Z', 1, 2),
            new Tretja.Pridevnik("sr", 'Z', 6, 3),
            new Tretja.Pridevnik("hf", 'S', 6, 3),
            new Tretja.Pridevnik("hx", 'M', 1, 3),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("obrzgie", 3, 2),
            new Tretja.Samostalnik("yrtp", 'S', 1, 1),
            new Tretja.Pridevnik("rswv", 'Z', 5, 2),
            new Tretja.Pridevnik("py", 'M', 2, 3),
            new Tretja.Glagol("kl", 3, 3),
            new Tretja.Pridevnik("px", 'S', 5, 2),
            new Tretja.Samostalnik("ujjqw", 'Z', 2, 2),
            new Tretja.Pridevnik("sziqghh", 'Z', 2, 3),
            new Tretja.Samostalnik("vfmm", 'M', 1, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("tbkai", 1, 1),
            new Tretja.Samostalnik("ttahm", 'M', 6, 2),
            new Tretja.Samostalnik("adn", 'S', 1, 2),
            new Tretja.Pridevnik("pvygng", 'S', 4, 1),
            new Tretja.Pridevnik("ep", 'S', 3, 2),
            new Tretja.Pridevnik("chzmwr", 'S', 3, 2),
            new Tretja.Pridevnik("jxqk", 'M', 6, 2),
            new Tretja.Pridevnik("nwljs", 'M', 1, 1),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ch", 'Z', 6, 2),
            new Tretja.Pridevnik("tfpt", 'M', 2, 3),
            new Tretja.Samostalnik("lb", 'M', 1, 3),
            new Tretja.Pridevnik("l", 'M', 6, 3),
            new Tretja.Samostalnik("rdvwt", 'M', 4, 3),
            new Tretja.Glagol("kwp", 3, 1),
            new Tretja.Glagol("j", 3, 2),
            new Tretja.Pridevnik("z", 'Z', 6, 3),
            new Tretja.Pridevnik("arrqxx", 'M', 1, 2),
            new Tretja.Pridevnik("slfzgho", 'Z', 3, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("zscap", 'Z', 2, 2),
            new Tretja.Samostalnik("huqexvn", 'Z', 2, 2),
            new Tretja.Pridevnik("ocx", 'M', 5, 1),
            new Tretja.Samostalnik("rxhg", 'Z', 2, 3),
            new Tretja.Pridevnik("t", 'S', 4, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
