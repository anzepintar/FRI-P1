
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("y", 'S', 3, 2),
            new Tretja.Samostalnik("pc", 'M', 5, 2),
            new Tretja.Pridevnik("c", 'M', 6, 1),
            new Tretja.Samostalnik("lzp", 'M', 1, 1),
            new Tretja.Samostalnik("zjo", 'Z', 1, 1),
            new Tretja.Glagol("rsa", 3, 3),
            new Tretja.Pridevnik("awqb", 'Z', 6, 2),
            new Tretja.Samostalnik("xsg", 'M', 5, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("hongdon", 'M', 5, 1),
            new Tretja.Samostalnik("vaoaxa", 'S', 6, 1),
            new Tretja.Pridevnik("ncnueen", 'Z', 5, 1),
            new Tretja.Pridevnik("mamwy", 'Z', 2, 1),
            new Tretja.Pridevnik("topk", 'S', 3, 2),
            new Tretja.Samostalnik("bmn", 'S', 1, 1),
            new Tretja.Samostalnik("njlldia", 'Z', 4, 1),
            new Tretja.Glagol("gnd", 2, 3),
            new Tretja.Pridevnik("yxzudad", 'Z', 4, 3),
            new Tretja.Samostalnik("kinv", 'S', 6, 3),
            new Tretja.Glagol("fbxbn", 3, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xsdhf", 'M', 3, 1),
            new Tretja.Glagol("zc", 3, 3),
            new Tretja.Pridevnik("pdza", 'Z', 5, 1),
            new Tretja.Pridevnik("kaklbf", 'Z', 1, 3),
            new Tretja.Pridevnik("ife", 'Z', 1, 2),
            new Tretja.Samostalnik("dlhdtcu", 'M', 4, 2),
            new Tretja.Glagol("bydp", 1, 1),
            new Tretja.Glagol("taymih", 1, 3),
            new Tretja.Pridevnik("zj", 'Z', 2, 3),
            new Tretja.Samostalnik("l", 'M', 1, 1),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("nvqgln", 'S', 4, 2),
            new Tretja.Samostalnik("uoehfi", 'Z', 6, 1),
            new Tretja.Glagol("wue", 3, 3),
            new Tretja.Glagol("yixxzse", 3, 3),
            new Tretja.Pridevnik("rwfuu", 'Z', 6, 3),
            new Tretja.Pridevnik("vejfo", 'M', 4, 2),
            new Tretja.Pridevnik("r", 'S', 6, 1),
            new Tretja.Samostalnik("a", 'S', 2, 1),
            new Tretja.Glagol("aubvp", 2, 2),
            new Tretja.Pridevnik("lorpo", 'M', 1, 2),
            new Tretja.Samostalnik("mlxw", 'M', 5, 2),
            new Tretja.Pridevnik("uy", 'Z', 3, 2),
            new Tretja.Samostalnik("akzohe", 'S', 1, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("sszc", 2, 3),
            new Tretja.Samostalnik("bvvu", 'M', 4, 3),
            new Tretja.Glagol("aq", 3, 2),
            new Tretja.Glagol("h", 2, 2),
            new Tretja.Glagol("rerjez", 2, 2),
            new Tretja.Samostalnik("cptrxn", 'S', 2, 3),
            new Tretja.Glagol("qlwxgsz", 1, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("h", 'Z', 2, 2),
            new Tretja.Samostalnik("rbdispg", 'M', 2, 2),
            new Tretja.Glagol("rkkqffo", 1, 1),
            new Tretja.Samostalnik("sigmyeo", 'Z', 6, 3),
            new Tretja.Glagol("sjj", 2, 1),
            new Tretja.Pridevnik("vakdx", 'S', 6, 2),
            new Tretja.Pridevnik("o", 'M', 6, 1),
            new Tretja.Pridevnik("td", 'M', 2, 2),
            new Tretja.Samostalnik("dtviv", 'S', 2, 3),
            new Tretja.Glagol("jxpow", 1, 2),
            new Tretja.Pridevnik("muqn", 'M', 1, 3),
            new Tretja.Samostalnik("t", 'S', 4, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ltkrp", 'Z', 6, 2),
            new Tretja.Pridevnik("qyjkhq", 'Z', 2, 3),
            new Tretja.Glagol("csapzud", 1, 1),
            new Tretja.Samostalnik("hdr", 'Z', 6, 2),
            new Tretja.Samostalnik("hwaks", 'Z', 2, 1),
            new Tretja.Glagol("pwc", 2, 1),
            new Tretja.Samostalnik("oucrlqy", 'S', 4, 2),
            new Tretja.Pridevnik("p", 'M', 4, 3),
            new Tretja.Samostalnik("nlbn", 'S', 3, 1),
            new Tretja.Glagol("ffwn", 2, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("xbl", 'M', 2, 3),
            new Tretja.Glagol("mlwoth", 3, 2),
            new Tretja.Glagol("nwmjrt", 2, 1),
            new Tretja.Glagol("tk", 3, 1),
            new Tretja.Pridevnik("zc", 'S', 3, 2),
            new Tretja.Glagol("miovj", 3, 3),
            new Tretja.Pridevnik("gkkwu", 'S', 2, 2),
            new Tretja.Pridevnik("lhxs", 'M', 5, 1),
            new Tretja.Samostalnik("mzlrb", 'Z', 3, 3),
            new Tretja.Glagol("leiv", 3, 2),
            new Tretja.Samostalnik("ln", 'Z', 3, 3),
            new Tretja.Pridevnik("ztol", 'S', 5, 1),
            new Tretja.Samostalnik("ugwr", 'Z', 1, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("sp", 'S', 6, 1),
            new Tretja.Glagol("okypqyx", 2, 1),
            new Tretja.Samostalnik("hirr", 'M', 1, 3),
            new Tretja.Glagol("gj", 1, 1),
            new Tretja.Samostalnik("lgqz", 'M', 6, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mjdrp", 2, 3),
            new Tretja.Glagol("ypfnqzl", 3, 3),
            new Tretja.Samostalnik("pjqnu", 'M', 3, 1),
            new Tretja.Pridevnik("boip", 'M', 1, 2),
            new Tretja.Glagol("gseku", 3, 2),
            new Tretja.Samostalnik("noaqs", 'M', 4, 1),
            new Tretja.Glagol("el", 1, 1),
            new Tretja.Samostalnik("cvz", 'Z', 3, 1),
            new Tretja.Pridevnik("aibng", 'S', 4, 2),
            new Tretja.Pridevnik("hklmyn", 'S', 1, 1),
            new Tretja.Glagol("mx", 1, 3),
            new Tretja.Glagol("qae", 2, 1),
            new Tretja.Samostalnik("rvna", 'S', 4, 1),
            new Tretja.Samostalnik("buhoa", 'S', 5, 3),
            new Tretja.Glagol("cpz", 2, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
