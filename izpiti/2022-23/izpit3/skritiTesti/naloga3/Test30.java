
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("nrrtxnp", 2, 1),
            new Tretja.Samostalnik("p", 'Z', 6, 1),
            new Tretja.Glagol("wtnoyfh", 3, 3),
            new Tretja.Glagol("nkkyt", 3, 3),
            new Tretja.Samostalnik("lnxjcur", 'M', 3, 2),
            new Tretja.Pridevnik("tikhm", 'M', 5, 3),
            new Tretja.Pridevnik("bchooge", 'M', 6, 3),
            new Tretja.Pridevnik("jeixkoj", 'M', 1, 2),
            new Tretja.Samostalnik("csecez", 'Z', 1, 2),
            new Tretja.Pridevnik("bzvo", 'S', 1, 1),
            new Tretja.Samostalnik("ojjtyv", 'Z', 1, 1),
            new Tretja.Samostalnik("fed", 'Z', 3, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("c", 2, 3),
            new Tretja.Glagol("wshnif", 1, 1),
            new Tretja.Glagol("jvixupl", 1, 2),
            new Tretja.Pridevnik("hhpyalk", 'M', 5, 3),
            new Tretja.Glagol("dl", 3, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ccin", 2, 2),
            new Tretja.Pridevnik("zl", 'M', 5, 2),
            new Tretja.Pridevnik("coqdfj", 'Z', 3, 1),
            new Tretja.Pridevnik("bxmfr", 'Z', 2, 3),
            new Tretja.Pridevnik("hywrhc", 'S', 5, 2),
            new Tretja.Samostalnik("er", 'Z', 2, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("gsn", 'S', 4, 2),
            new Tretja.Samostalnik("npgdx", 'Z', 4, 2),
            new Tretja.Samostalnik("icqmr", 'M', 1, 2),
            new Tretja.Glagol("uot", 1, 2),
            new Tretja.Glagol("h", 2, 3),
            new Tretja.Glagol("ztvoiz", 1, 3),
            new Tretja.Glagol("d", 1, 1),
            new Tretja.Pridevnik("kdiusdf", 'S', 2, 3),
            new Tretja.Glagol("u", 3, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("qjhsqz", 'Z', 1, 3),
            new Tretja.Pridevnik("kw", 'Z', 2, 3),
            new Tretja.Glagol("ddcl", 1, 3),
            new Tretja.Pridevnik("vh", 'Z', 2, 2),
            new Tretja.Samostalnik("cuhml", 'S', 3, 1),
            new Tretja.Samostalnik("fivc", 'S', 4, 1),
            new Tretja.Pridevnik("yuvypb", 'S', 4, 1),
            new Tretja.Samostalnik("zjlnkuu", 'S', 5, 3),
            new Tretja.Glagol("jriptxm", 1, 3),
            new Tretja.Samostalnik("exxy", 'M', 3, 1),
            new Tretja.Samostalnik("upzczwj", 'Z', 4, 1),
            new Tretja.Glagol("fy", 3, 1),
            new Tretja.Glagol("lf", 2, 2),
            new Tretja.Glagol("mwwrvd", 3, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("cwslur", 3, 3),
            new Tretja.Samostalnik("id", 'S', 5, 3),
            new Tretja.Glagol("fxilia", 2, 1),
            new Tretja.Samostalnik("cq", 'S', 5, 1),
            new Tretja.Pridevnik("fyqsxhd", 'M', 3, 1),
            new Tretja.Pridevnik("knakj", 'M', 1, 2),
            new Tretja.Glagol("ar", 3, 2),
            new Tretja.Pridevnik("ocem", 'Z', 4, 3),
            new Tretja.Pridevnik("psz", 'S', 6, 2),
            new Tretja.Pridevnik("zfq", 'S', 6, 3),
            new Tretja.Pridevnik("rdxild", 'S', 4, 3),
            new Tretja.Samostalnik("crxexcq", 'Z', 6, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xe", 'Z', 3, 1),
            new Tretja.Samostalnik("kyzlora", 'Z', 2, 1),
            new Tretja.Glagol("rw", 3, 1),
            new Tretja.Pridevnik("duc", 'S', 1, 3),
            new Tretja.Samostalnik("ivxorj", 'M', 3, 3),
            new Tretja.Pridevnik("fcx", 'Z', 4, 3),
            new Tretja.Glagol("rctkpk", 3, 3),
            new Tretja.Glagol("o", 3, 2),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ek", 2, 1),
            new Tretja.Glagol("xgdpbnl", 2, 2),
            new Tretja.Glagol("phiing", 2, 2),
            new Tretja.Pridevnik("p", 'S', 3, 3),
            new Tretja.Pridevnik("lhs", 'Z', 1, 3),
            new Tretja.Samostalnik("is", 'Z', 4, 3),
            new Tretja.Pridevnik("i", 'S', 1, 1),
            new Tretja.Glagol("cbfedir", 3, 3),
            new Tretja.Pridevnik("w", 'S', 1, 2),
            new Tretja.Samostalnik("fc", 'S', 6, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hpbu", 'S', 2, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("wfrgt", 'S', 5, 1),
            new Tretja.Pridevnik("nluab", 'S', 2, 3),
            new Tretja.Pridevnik("bwrbp", 'S', 5, 2),
            new Tretja.Samostalnik("grqff", 'M', 6, 3),
        });
        System.out.println(stavek10.preveriPS());

    }
}
