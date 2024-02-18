
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("v", 3, 1),
            new Tretja.Glagol("fjufs", 3, 3),
            new Tretja.Samostalnik("chpqpa", 'M', 3, 3),
            new Tretja.Pridevnik("urbn", 'S', 1, 2),
            new Tretja.Pridevnik("zsq", 'S', 3, 1),
            new Tretja.Pridevnik("aj", 'Z', 1, 2),
            new Tretja.Pridevnik("zelue", 'Z', 3, 1),
            new Tretja.Samostalnik("cmgssl", 'Z', 2, 1),
            new Tretja.Pridevnik("olvtvn", 'S', 6, 3),
            new Tretja.Samostalnik("lxt", 'Z', 4, 1),
            new Tretja.Samostalnik("g", 'S', 6, 2),
            new Tretja.Pridevnik("c", 'S', 6, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("njw", 'M', 1, 2),
            new Tretja.Samostalnik("gv", 'Z', 3, 1),
            new Tretja.Glagol("bxdc", 1, 2),
            new Tretja.Pridevnik("lbwull", 'M', 3, 1),
            new Tretja.Samostalnik("rua", 'S', 1, 3),
            new Tretja.Samostalnik("hnpuzl", 'M', 2, 3),
            new Tretja.Pridevnik("fifq", 'S', 4, 2),
            new Tretja.Samostalnik("sv", 'Z', 3, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("cjnuy", 3, 3),
            new Tretja.Samostalnik("rxah", 'M', 4, 1),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("fhet", 'S', 1, 2),
            new Tretja.Glagol("oojr", 1, 3),
            new Tretja.Glagol("fqewzi", 3, 2),
            new Tretja.Pridevnik("oqu", 'S', 4, 2),
            new Tretja.Pridevnik("tafiwo", 'M', 5, 2),
            new Tretja.Samostalnik("kgaqes", 'S', 5, 2),
            new Tretja.Pridevnik("wsqojz", 'Z', 1, 2),
            new Tretja.Samostalnik("jqmcw", 'S', 1, 3),
            new Tretja.Samostalnik("pw", 'S', 3, 3),
            new Tretja.Glagol("pqupttn", 2, 1),
            new Tretja.Samostalnik("tusza", 'S', 4, 1),
            new Tretja.Glagol("qdxw", 3, 3),
            new Tretja.Pridevnik("ltz", 'S', 2, 2),
            new Tretja.Samostalnik("nzm", 'S', 6, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("abvgoi", 2, 3),
            new Tretja.Samostalnik("djjqpl", 'S', 4, 1),
            new Tretja.Pridevnik("d", 'Z', 1, 1),
            new Tretja.Pridevnik("d", 'S', 6, 3),
            new Tretja.Pridevnik("g", 'S', 2, 3),
            new Tretja.Glagol("jcfuw", 1, 3),
            new Tretja.Samostalnik("dyl", 'Z', 6, 3),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zme", 1, 3),
            new Tretja.Pridevnik("ya", 'Z', 5, 2),
            new Tretja.Samostalnik("d", 'M', 6, 1),
            new Tretja.Glagol("pawdqky", 3, 2),
            new Tretja.Glagol("uslnefj", 2, 1),
            new Tretja.Glagol("x", 2, 3),
            new Tretja.Glagol("xb", 1, 2),
            new Tretja.Glagol("uxm", 1, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("sesbu", 2, 2),
            new Tretja.Pridevnik("rqzzftf", 'S', 6, 2),
            new Tretja.Glagol("osvzwn", 3, 3),
            new Tretja.Pridevnik("jwt", 'M', 5, 2),
            new Tretja.Glagol("od", 1, 3),
            new Tretja.Pridevnik("pi", 'M', 2, 1),
            new Tretja.Glagol("swkdmg", 2, 3),
            new Tretja.Glagol("tki", 2, 2),
            new Tretja.Glagol("lyi", 1, 1),
            new Tretja.Glagol("adfs", 1, 2),
            new Tretja.Samostalnik("bwjtis", 'M', 1, 3),
            new Tretja.Glagol("z", 1, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("fuket", 1, 2),
            new Tretja.Pridevnik("lyio", 'Z', 3, 1),
            new Tretja.Samostalnik("y", 'M', 1, 3),
            new Tretja.Samostalnik("chwli", 'M', 3, 3),
            new Tretja.Glagol("untq", 3, 2),
            new Tretja.Samostalnik("ece", 'M', 4, 1),
            new Tretja.Glagol("qw", 2, 2),
            new Tretja.Samostalnik("xk", 'S', 5, 2),
            new Tretja.Pridevnik("dx", 'Z', 1, 2),
            new Tretja.Glagol("fwwpdg", 2, 3),
            new Tretja.Pridevnik("ycnk", 'M', 5, 3),
            new Tretja.Samostalnik("aq", 'S', 4, 2),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ppappii", 'Z', 5, 2),
            new Tretja.Samostalnik("dye", 'Z', 3, 2),
            new Tretja.Pridevnik("pie", 'Z', 6, 2),
            new Tretja.Glagol("rhnmkn", 3, 3),
            new Tretja.Glagol("iuzxarc", 2, 1),
            new Tretja.Glagol("u", 1, 3),
            new Tretja.Glagol("fsnt", 1, 1),
            new Tretja.Glagol("xqpgld", 2, 2),
            new Tretja.Pridevnik("q", 'S', 3, 2),
            new Tretja.Samostalnik("dqma", 'S', 3, 1),
            new Tretja.Pridevnik("lq", 'M', 6, 3),
            new Tretja.Samostalnik("yvn", 'Z', 3, 1),
            new Tretja.Glagol("yii", 1, 2),
            new Tretja.Pridevnik("hesveii", 'Z', 5, 2),
            new Tretja.Samostalnik("kryo", 'S', 5, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("g", 1, 2),
            new Tretja.Samostalnik("zoz", 'S', 3, 1),
            new Tretja.Samostalnik("ncavs", 'M', 4, 3),
            new Tretja.Pridevnik("fkerad", 'Z', 1, 2),
            new Tretja.Pridevnik("naowg", 'S', 3, 3),
            new Tretja.Samostalnik("yyji", 'M', 6, 3),
            new Tretja.Pridevnik("objldyc", 'Z', 5, 2),
            new Tretja.Glagol("bbmusj", 1, 1),
            new Tretja.Glagol("iwjqha", 2, 1),
            new Tretja.Pridevnik("jiv", 'Z', 6, 3),
            new Tretja.Samostalnik("akifger", 'M', 5, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
