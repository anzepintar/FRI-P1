
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("w", 'S', 1, 3),
            new Tretja.Samostalnik("sjdwo", 'Z', 4, 1),
            new Tretja.Glagol("rhpqxt", 1, 1),
            new Tretja.Pridevnik("xpgnj", 'M', 5, 2),
            new Tretja.Pridevnik("sx", 'Z', 5, 3),
            new Tretja.Pridevnik("ynjpi", 'Z', 1, 1),
            new Tretja.Glagol("ojvry", 2, 3),
            new Tretja.Pridevnik("jyrhwu", 'M', 4, 1),
            new Tretja.Samostalnik("mk", 'S', 1, 3),
            new Tretja.Glagol("wgzy", 2, 3),
            new Tretja.Glagol("vojvg", 2, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("l", 'S', 4, 1),
            new Tretja.Glagol("erc", 2, 2),
            new Tretja.Samostalnik("q", 'S', 5, 1),
            new Tretja.Pridevnik("ncq", 'S', 5, 1),
            new Tretja.Samostalnik("wpxfsy", 'Z', 3, 3),
            new Tretja.Glagol("yuh", 1, 3),
            new Tretja.Glagol("o", 1, 1),
            new Tretja.Samostalnik("np", 'S', 4, 3),
            new Tretja.Pridevnik("hcishpc", 'Z', 1, 3),
            new Tretja.Pridevnik("vh", 'M', 4, 2),
            new Tretja.Glagol("mniux", 2, 2),
            new Tretja.Pridevnik("bgxj", 'S', 3, 3),
            new Tretja.Glagol("n", 3, 2),
            new Tretja.Samostalnik("c", 'M', 3, 1),
            new Tretja.Glagol("bnvkjr", 3, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kh", 'S', 5, 2),
            new Tretja.Samostalnik("flxm", 'Z', 4, 3),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("n", 'M', 1, 2),
            new Tretja.Samostalnik("qumwb", 'S', 3, 3),
            new Tretja.Samostalnik("huxi", 'S', 2, 1),
            new Tretja.Samostalnik("mzwiyxr", 'M', 6, 2),
            new Tretja.Samostalnik("tocs", 'M', 6, 3),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ru", 'Z', 1, 1),
            new Tretja.Pridevnik("pnx", 'M', 2, 2),
            new Tretja.Pridevnik("iw", 'M', 5, 3),
            new Tretja.Pridevnik("srvuoqq", 'Z', 2, 1),
            new Tretja.Samostalnik("uwlvdrr", 'Z', 4, 2),
            new Tretja.Pridevnik("jsa", 'S', 4, 2),
            new Tretja.Pridevnik("cqxdgsx", 'S', 5, 3),
            new Tretja.Glagol("qnlksoq", 2, 1),
            new Tretja.Samostalnik("vu", 'Z', 5, 3),
            new Tretja.Samostalnik("rfetfqi", 'Z', 4, 1),
            new Tretja.Pridevnik("q", 'Z', 3, 2),
            new Tretja.Samostalnik("av", 'M', 1, 3),
            new Tretja.Glagol("cdn", 3, 3),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("jwrub", 1, 3),
            new Tretja.Glagol("mt", 2, 1),
            new Tretja.Glagol("a", 2, 1),
            new Tretja.Pridevnik("f", 'Z', 1, 3),
            new Tretja.Samostalnik("geuntx", 'S', 6, 3),
            new Tretja.Samostalnik("lzbtv", 'M', 4, 2),
            new Tretja.Glagol("uelo", 2, 2),
            new Tretja.Glagol("phtn", 1, 2),
            new Tretja.Glagol("exprvbi", 2, 2),
            new Tretja.Glagol("gryi", 2, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("rnye", 'M', 3, 2),
            new Tretja.Pridevnik("xuxvhk", 'M', 3, 3),
            new Tretja.Samostalnik("vhh", 'Z', 4, 3),
            new Tretja.Pridevnik("vdtu", 'S', 2, 1),
            new Tretja.Pridevnik("da", 'Z', 5, 3),
            new Tretja.Glagol("ryf", 3, 3),
            new Tretja.Samostalnik("s", 'S', 2, 3),
            new Tretja.Pridevnik("q", 'M', 2, 2),
            new Tretja.Pridevnik("dpykzaz", 'Z', 2, 1),
            new Tretja.Pridevnik("dtfexjg", 'S', 3, 2),
            new Tretja.Samostalnik("umcwfj", 'M', 4, 2),
            new Tretja.Glagol("cl", 2, 2),
            new Tretja.Samostalnik("hvy", 'M', 1, 1),
            new Tretja.Samostalnik("ez", 'Z', 4, 2),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("gh", 'S', 5, 3),
            new Tretja.Pridevnik("mitvk", 'M', 1, 1),
            new Tretja.Pridevnik("xxys", 'Z', 3, 3),
            new Tretja.Samostalnik("ikbf", 'M', 1, 3),
            new Tretja.Pridevnik("fu", 'S', 4, 3),
            new Tretja.Samostalnik("bmbhuze", 'M', 4, 3),
            new Tretja.Samostalnik("qfjyxz", 'S', 3, 3),
            new Tretja.Pridevnik("caximzl", 'Z', 2, 2),
            new Tretja.Samostalnik("j", 'Z', 3, 1),
            new Tretja.Pridevnik("mho", 'Z', 5, 3),
            new Tretja.Pridevnik("whddz", 'M', 4, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("mev", 'Z', 1, 3),
            new Tretja.Glagol("czip", 3, 2),
            new Tretja.Pridevnik("oim", 'M', 3, 3),
            new Tretja.Pridevnik("tm", 'M', 3, 1),
            new Tretja.Pridevnik("nakzkzj", 'S', 6, 1),
            new Tretja.Pridevnik("kwdy", 'Z', 3, 2),
            new Tretja.Pridevnik("mprrw", 'M', 4, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("skq", 2, 3),
            new Tretja.Pridevnik("khmsan", 'Z', 6, 2),
            new Tretja.Glagol("aptbo", 1, 1),
            new Tretja.Pridevnik("pzv", 'Z', 6, 3),
            new Tretja.Pridevnik("jiaktlj", 'Z', 5, 3),
            new Tretja.Pridevnik("pysqssm", 'S', 3, 1),
            new Tretja.Glagol("frsd", 2, 2),
            new Tretja.Samostalnik("rehgoth", 'S', 3, 3),
            new Tretja.Pridevnik("ykw", 'S', 1, 2),
            new Tretja.Samostalnik("iy", 'S', 3, 3),
            new Tretja.Pridevnik("j", 'Z', 4, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
