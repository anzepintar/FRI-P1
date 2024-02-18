
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("hjlzfl", 'S', 1, 3),
            new Tretja.Samostalnik("m", 'M', 6, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wrw", 'Z', 1, 2),
            new Tretja.Pridevnik("otn", 'S', 5, 1),
            new Tretja.Glagol("k", 3, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("qon", 'S', 5, 1),
            new Tretja.Pridevnik("jxvmss", 'M', 1, 3),
            new Tretja.Pridevnik("deauk", 'S', 1, 2),
            new Tretja.Pridevnik("pu", 'S', 2, 3),
            new Tretja.Pridevnik("jwqe", 'M', 2, 2),
            new Tretja.Pridevnik("iletjb", 'S', 5, 1),
            new Tretja.Pridevnik("clzi", 'S', 2, 1),
            new Tretja.Pridevnik("ufb", 'Z', 5, 2),
            new Tretja.Pridevnik("aggzgog", 'Z', 1, 3),
            new Tretja.Samostalnik("oko", 'S', 3, 3),
            new Tretja.Pridevnik("bftpzfa", 'Z', 5, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("cow", 'Z', 2, 1),
            new Tretja.Samostalnik("b", 'S', 3, 2),
            new Tretja.Glagol("xaamj", 1, 3),
            new Tretja.Pridevnik("vy", 'Z', 3, 3),
            new Tretja.Samostalnik("wkowauo", 'M', 1, 3),
            new Tretja.Glagol("kgowmm", 2, 2),
            new Tretja.Pridevnik("xir", 'Z', 2, 2),
            new Tretja.Samostalnik("usciok", 'Z', 5, 2),
            new Tretja.Pridevnik("slxlm", 'Z', 2, 2),
            new Tretja.Samostalnik("tzmv", 'Z', 4, 3),
            new Tretja.Pridevnik("cm", 'S', 4, 3),
            new Tretja.Pridevnik("swwvb", 'M', 3, 3),
            new Tretja.Samostalnik("nq", 'Z', 1, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("sy", 'M', 6, 1),
            new Tretja.Samostalnik("gaihxk", 'M', 3, 3),
            new Tretja.Glagol("dzgulj", 3, 2),
            new Tretja.Pridevnik("re", 'S', 1, 3),
            new Tretja.Samostalnik("legwxtg", 'S', 3, 1),
            new Tretja.Glagol("rcas", 1, 1),
            new Tretja.Pridevnik("fizcgh", 'Z', 3, 2),
            new Tretja.Pridevnik("ituyvvq", 'S', 2, 2),
            new Tretja.Glagol("tuf", 1, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wqm", 'M', 6, 3),
            new Tretja.Samostalnik("bsj", 'S', 1, 2),
            new Tretja.Glagol("c", 1, 1),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("wghfrba", 3, 2),
            new Tretja.Samostalnik("pm", 'M', 5, 1),
            new Tretja.Samostalnik("rai", 'M', 1, 3),
            new Tretja.Pridevnik("g", 'M', 4, 1),
            new Tretja.Pridevnik("vzbzyq", 'M', 5, 3),
            new Tretja.Pridevnik("fiqqm", 'M', 5, 1),
            new Tretja.Samostalnik("qio", 'S', 6, 2),
            new Tretja.Glagol("khekqz", 3, 2),
            new Tretja.Samostalnik("dbrwbuw", 'M', 6, 3),
            new Tretja.Glagol("u", 1, 1),
            new Tretja.Samostalnik("dtj", 'Z', 2, 2),
            new Tretja.Pridevnik("uhl", 'S', 3, 1),
            new Tretja.Samostalnik("qaxhsj", 'M', 5, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("tycrve", 'M', 2, 1),
            new Tretja.Glagol("shnvuj", 3, 3),
            new Tretja.Pridevnik("qixj", 'M', 2, 1),
            new Tretja.Samostalnik("c", 'S', 6, 3),
            new Tretja.Glagol("zgffme", 2, 2),
            new Tretja.Pridevnik("ugervlb", 'S', 5, 2),
            new Tretja.Samostalnik("hy", 'Z', 4, 3),
            new Tretja.Glagol("vxzb", 2, 2),
            new Tretja.Pridevnik("bsrun", 'M', 4, 1),
            new Tretja.Samostalnik("na", 'Z', 1, 1),
            new Tretja.Samostalnik("benbdn", 'Z', 2, 3),
            new Tretja.Samostalnik("wm", 'M', 6, 2),
            new Tretja.Samostalnik("vgwgno", 'Z', 6, 2),
            new Tretja.Samostalnik("kj", 'M', 4, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("dwsh", 'M', 5, 3),
            new Tretja.Pridevnik("bqqavw", 'M', 6, 3),
            new Tretja.Samostalnik("s", 'M', 1, 2),
            new Tretja.Glagol("hlmvu", 3, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("oaqz", 'M', 5, 2),
            new Tretja.Samostalnik("qpyaxlr", 'M', 3, 1),
            new Tretja.Glagol("txuxt", 1, 1),
            new Tretja.Samostalnik("y", 'Z', 5, 1),
            new Tretja.Pridevnik("wl", 'M', 4, 1),
            new Tretja.Samostalnik("ovk", 'Z', 3, 2),
            new Tretja.Glagol("zwqbh", 3, 1),
            new Tretja.Glagol("cp", 1, 1),
            new Tretja.Glagol("vitzq", 1, 2),
            new Tretja.Pridevnik("yitp", 'Z', 4, 2),
            new Tretja.Pridevnik("exepahg", 'S', 1, 2),
            new Tretja.Samostalnik("razb", 'S', 5, 1),
            new Tretja.Samostalnik("jfeqrp", 'Z', 2, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
