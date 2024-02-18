
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("qmnfd", 3, 3),
            new Tretja.Glagol("jxr", 1, 3),
            new Tretja.Samostalnik("dsytfw", 'M', 3, 1),
            new Tretja.Pridevnik("l", 'Z', 5, 3),
            new Tretja.Pridevnik("gyqw", 'M', 3, 1),
            new Tretja.Glagol("wag", 2, 2),
            new Tretja.Pridevnik("jwm", 'S', 2, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("aunan", 'S', 3, 3),
            new Tretja.Pridevnik("wwiqssj", 'Z', 4, 1),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jpmswrz", 'M', 1, 2),
            new Tretja.Glagol("jmyjjso", 2, 2),
            new Tretja.Samostalnik("qxs", 'Z', 6, 1),
            new Tretja.Pridevnik("khuw", 'S', 5, 1),
            new Tretja.Glagol("sawn", 1, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("n", 2, 2),
            new Tretja.Samostalnik("ozyf", 'M', 1, 1),
            new Tretja.Samostalnik("d", 'S', 4, 2),
            new Tretja.Pridevnik("tydnzof", 'Z', 2, 3),
            new Tretja.Glagol("gxxtm", 2, 3),
            new Tretja.Pridevnik("tzuip", 'M', 4, 1),
            new Tretja.Samostalnik("f", 'Z', 2, 2),
            new Tretja.Glagol("ebwmvcg", 3, 3),
            new Tretja.Samostalnik("v", 'M', 1, 1),
            new Tretja.Glagol("yxenorw", 2, 2),
            new Tretja.Samostalnik("bfo", 'Z', 4, 3),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("pzqkb", 'S', 3, 3),
            new Tretja.Pridevnik("el", 'Z', 4, 1),
            new Tretja.Glagol("ozg", 3, 1),
            new Tretja.Pridevnik("bhamn", 'M', 5, 2),
            new Tretja.Pridevnik("chqgiw", 'M', 5, 1),
            new Tretja.Samostalnik("nnh", 'Z', 1, 2),
            new Tretja.Glagol("sp", 1, 1),
            new Tretja.Glagol("s", 1, 3),
            new Tretja.Glagol("xl", 1, 3),
            new Tretja.Pridevnik("wg", 'M', 5, 3),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ijtcztp", 'Z', 1, 1),
            new Tretja.Pridevnik("ciq", 'M', 1, 3),
            new Tretja.Glagol("fzw", 1, 3),
            new Tretja.Pridevnik("l", 'S', 5, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("cmu", 'S', 5, 2),
            new Tretja.Samostalnik("hvcs", 'M', 2, 1),
            new Tretja.Glagol("prdd", 2, 3),
            new Tretja.Glagol("nnzol", 2, 3),
            new Tretja.Samostalnik("rx", 'Z', 4, 2),
            new Tretja.Pridevnik("wbesa", 'Z', 5, 3),
            new Tretja.Pridevnik("p", 'S', 3, 1),
            new Tretja.Samostalnik("k", 'Z', 1, 2),
            new Tretja.Pridevnik("wuzyw", 'Z', 4, 3),
            new Tretja.Samostalnik("j", 'Z', 2, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hdcz", 'S', 6, 3),
            new Tretja.Pridevnik("wl", 'Z', 1, 2),
            new Tretja.Pridevnik("svuly", 'Z', 2, 1),
            new Tretja.Samostalnik("tlo", 'S', 3, 2),
            new Tretja.Glagol("xfw", 3, 1),
            new Tretja.Pridevnik("nomiytw", 'M', 1, 2),
            new Tretja.Pridevnik("uxya", 'S', 1, 3),
            new Tretja.Pridevnik("ejjzd", 'S', 6, 3),
            new Tretja.Pridevnik("n", 'M', 6, 2),
            new Tretja.Samostalnik("cnfnf", 'S', 4, 1),
            new Tretja.Pridevnik("uhz", 'S', 6, 3),
            new Tretja.Pridevnik("sbusjnp", 'Z', 5, 2),
            new Tretja.Pridevnik("v", 'M', 2, 3),
            new Tretja.Samostalnik("v", 'Z', 3, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("v", 2, 3),
            new Tretja.Samostalnik("ujvqq", 'M', 5, 1),
            new Tretja.Glagol("prsjtc", 1, 3),
            new Tretja.Samostalnik("rkxmtii", 'S', 5, 2),
            new Tretja.Pridevnik("amuxr", 'S', 6, 1),
            new Tretja.Pridevnik("b", 'S', 4, 3),
            new Tretja.Samostalnik("nblq", 'S', 1, 1),
            new Tretja.Glagol("uye", 2, 1),
            new Tretja.Samostalnik("ozgees", 'Z', 5, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("cvwtkut", 'M', 4, 3),
            new Tretja.Samostalnik("dzbm", 'M', 5, 2),
            new Tretja.Pridevnik("cp", 'S', 6, 3),
            new Tretja.Glagol("fafvd", 3, 2),
            new Tretja.Glagol("pvit", 2, 2),
            new Tretja.Glagol("jafdegu", 3, 2),
            new Tretja.Glagol("ojp", 3, 2),
            new Tretja.Glagol("hn", 3, 2),
            new Tretja.Pridevnik("s", 'S', 6, 2),
            new Tretja.Samostalnik("gaffrol", 'Z', 6, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
