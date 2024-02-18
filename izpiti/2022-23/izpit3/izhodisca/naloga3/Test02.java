
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zi", 1, 3),
            new Tretja.Samostalnik("itd", 'Z', 6, 1),
            new Tretja.Glagol("puggha", 1, 3),
            new Tretja.Glagol("d", 2, 2),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mq", 3, 3),
            new Tretja.Glagol("khnkjsm", 3, 1),
            new Tretja.Samostalnik("mctvz", 'Z', 3, 1),
            new Tretja.Glagol("kwlglxe", 2, 3),
            new Tretja.Pridevnik("xd", 'M', 4, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("aay", 'Z', 2, 3),
            new Tretja.Pridevnik("qxgurj", 'Z', 3, 1),
            new Tretja.Glagol("ib", 3, 1),
            new Tretja.Glagol("cs", 2, 3),
            new Tretja.Samostalnik("jio", 'Z', 6, 1),
            new Tretja.Samostalnik("bfwh", 'M', 1, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wgbglp", 'M', 5, 3),
            new Tretja.Glagol("jvex", 1, 1),
            new Tretja.Glagol("hjz", 1, 2),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("yzmqzd", 2, 3),
            new Tretja.Samostalnik("qai", 'M', 2, 2),
            new Tretja.Pridevnik("axwefy", 'M', 2, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("yektdv", 'Z', 1, 1),
            new Tretja.Pridevnik("p", 'S', 4, 2),
            new Tretja.Pridevnik("ndprbnf", 'Z', 5, 1),
            new Tretja.Glagol("tjoykmo", 3, 1),
            new Tretja.Samostalnik("pd", 'S', 4, 2),
            new Tretja.Samostalnik("aqgmdt", 'M', 1, 2),
            new Tretja.Glagol("cxdhd", 3, 2),
            new Tretja.Pridevnik("cfvy", 'Z', 5, 2),
            new Tretja.Pridevnik("z", 'M', 3, 1),
            new Tretja.Glagol("ixsv", 1, 3),
            new Tretja.Samostalnik("uqtovp", 'S', 1, 3),
            new Tretja.Pridevnik("zlv", 'M', 2, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wypfe", 'Z', 3, 1),
            new Tretja.Glagol("dfigr", 3, 1),
            new Tretja.Samostalnik("lssovyh", 'M', 5, 1),
            new Tretja.Pridevnik("y", 'M', 1, 3),
            new Tretja.Samostalnik("vjkdajo", 'S', 3, 3),
            new Tretja.Glagol("cve", 1, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("kbdzypx", 'S', 6, 2),
            new Tretja.Glagol("qmscsvt", 3, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("rv", 3, 1),
            new Tretja.Samostalnik("dlqnqng", 'Z', 2, 2),
            new Tretja.Glagol("jfc", 3, 1),
            new Tretja.Pridevnik("sjqfp", 'S', 5, 3),
            new Tretja.Samostalnik("t", 'Z', 3, 3),
            new Tretja.Glagol("qe", 3, 3),
            new Tretja.Pridevnik("d", 'Z', 2, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
