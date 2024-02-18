
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("jdnh", 'M', 6, 3),
            new Tretja.Glagol("w", 2, 2),
            new Tretja.Glagol("wclydtu", 3, 3),
            new Tretja.Pridevnik("dsqrjgz", 'Z', 5, 2),
            new Tretja.Pridevnik("ppakgv", 'M', 5, 1),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("imt", 1, 2),
            new Tretja.Samostalnik("escb", 'S', 3, 1),
            new Tretja.Pridevnik("hzdygx", 'M', 4, 1),
            new Tretja.Glagol("o", 2, 2),
            new Tretja.Glagol("xcbni", 1, 3),
            new Tretja.Samostalnik("w", 'S', 2, 2),
            new Tretja.Pridevnik("cr", 'M', 5, 2),
            new Tretja.Pridevnik("rhjd", 'S', 5, 2),
            new Tretja.Pridevnik("ewmjreq", 'S', 1, 2),
            new Tretja.Pridevnik("aulp", 'Z', 6, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("o", 3, 3),
            new Tretja.Samostalnik("xwzluj", 'Z', 3, 1),
            new Tretja.Glagol("yyniti", 1, 2),
            new Tretja.Pridevnik("wqbx", 'S', 4, 1),
            new Tretja.Glagol("qdlhf", 2, 3),
            new Tretja.Samostalnik("gdtiu", 'M', 3, 3),
            new Tretja.Samostalnik("j", 'Z', 6, 3),
            new Tretja.Samostalnik("ee", 'M', 6, 3),
            new Tretja.Glagol("dgczs", 2, 1),
            new Tretja.Pridevnik("nm", 'M', 5, 1),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("e", 'S', 6, 1),
            new Tretja.Pridevnik("qnk", 'S', 4, 2),
            new Tretja.Pridevnik("tgqj", 'S', 1, 2),
            new Tretja.Glagol("ob", 3, 3),
            new Tretja.Glagol("pzvr", 2, 2),
            new Tretja.Samostalnik("qggcbv", 'M', 3, 1),
            new Tretja.Samostalnik("yznu", 'M', 1, 3),
            new Tretja.Pridevnik("xdendwv", 'M', 1, 3),
            new Tretja.Samostalnik("czezi", 'Z', 1, 2),
            new Tretja.Samostalnik("s", 'M', 3, 1),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("hhzvy", 2, 2),
            new Tretja.Glagol("j", 3, 2),
            new Tretja.Glagol("jultgrs", 1, 3),
            new Tretja.Glagol("izfhmee", 3, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("eumz", 'S', 3, 3),
            new Tretja.Samostalnik("uiulri", 'Z', 3, 1),
            new Tretja.Samostalnik("kaj", 'S', 1, 3),
            new Tretja.Glagol("wdb", 3, 2),
            new Tretja.Samostalnik("a", 'S', 1, 1),
            new Tretja.Samostalnik("plvdv", 'M', 1, 1),
            new Tretja.Pridevnik("eknmywi", 'M', 3, 1),
            new Tretja.Pridevnik("azs", 'Z', 1, 2),
            new Tretja.Glagol("nphv", 3, 1),
            new Tretja.Glagol("zwma", 2, 1),
            new Tretja.Pridevnik("dk", 'S', 5, 1),
            new Tretja.Pridevnik("tofdfs", 'Z', 1, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("aqfvrja", 'Z', 1, 2),
            new Tretja.Pridevnik("isu", 'S', 1, 2),
            new Tretja.Pridevnik("vobj", 'M', 2, 1),
            new Tretja.Glagol("rp", 3, 3),
            new Tretja.Samostalnik("bp", 'Z', 2, 2),
            new Tretja.Pridevnik("jhrr", 'M', 2, 2),
            new Tretja.Glagol("m", 2, 2),
            new Tretja.Samostalnik("ziwr", 'M', 1, 2),
            new Tretja.Samostalnik("nqcfu", 'Z', 5, 3),
            new Tretja.Glagol("dap", 1, 1),
            new Tretja.Pridevnik("ue", 'S', 1, 2),
            new Tretja.Glagol("s", 2, 2),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("cdaju", 2, 3),
            new Tretja.Glagol("sifmjth", 1, 2),
            new Tretja.Pridevnik("arfitfy", 'Z', 2, 1),
            new Tretja.Glagol("znmgv", 3, 1),
            new Tretja.Glagol("ajcshcf", 2, 2),
            new Tretja.Glagol("xp", 3, 2),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("guum", 3, 2),
            new Tretja.Pridevnik("jrtrv", 'Z', 5, 2),
            new Tretja.Samostalnik("ztocd", 'M', 1, 2),
            new Tretja.Glagol("ze", 3, 3),
            new Tretja.Glagol("ntn", 1, 2),
            new Tretja.Pridevnik("t", 'M', 1, 1),
            new Tretja.Glagol("dkkdr", 3, 3),
            new Tretja.Samostalnik("qgtsouj", 'S', 4, 1),
            new Tretja.Samostalnik("zhvdp", 'M', 4, 2),
            new Tretja.Samostalnik("tqcn", 'S', 6, 2),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("nhdnhs", 'Z', 5, 1),
            new Tretja.Samostalnik("q", 'Z', 2, 3),
            new Tretja.Glagol("rr", 3, 2),
            new Tretja.Samostalnik("wwfwsi", 'S', 3, 3),
            new Tretja.Samostalnik("hhh", 'Z', 3, 1),
            new Tretja.Samostalnik("r", 'M', 5, 2),
            new Tretja.Glagol("svr", 1, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
