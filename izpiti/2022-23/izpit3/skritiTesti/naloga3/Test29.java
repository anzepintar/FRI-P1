
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("hhkrnop", 2, 1),
            new Tretja.Glagol("zmdoren", 2, 2),
            new Tretja.Glagol("gho", 2, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ulhrcdc", 2, 1),
            new Tretja.Pridevnik("xozpzp", 'Z', 2, 2),
            new Tretja.Samostalnik("dcfkbg", 'S', 5, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ywst", 1, 1),
            new Tretja.Glagol("ygflm", 2, 3),
            new Tretja.Samostalnik("s", 'S', 3, 3),
            new Tretja.Pridevnik("if", 'M', 3, 3),
            new Tretja.Samostalnik("a", 'S', 5, 1),
            new Tretja.Pridevnik("ly", 'S', 3, 2),
            new Tretja.Glagol("t", 3, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("y", 3, 1),
            new Tretja.Glagol("xaknlpy", 1, 1),
            new Tretja.Glagol("vmnri", 1, 2),
            new Tretja.Glagol("wxfjiho", 2, 2),
            new Tretja.Pridevnik("wooa", 'Z', 5, 3),
            new Tretja.Samostalnik("czzg", 'Z', 4, 2),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("q", 'M', 5, 1),
            new Tretja.Glagol("uie", 2, 1),
            new Tretja.Pridevnik("txhg", 'M', 6, 1),
            new Tretja.Samostalnik("avzxgp", 'S', 2, 1),
            new Tretja.Samostalnik("qsyq", 'M', 5, 3),
            new Tretja.Pridevnik("wgllo", 'M', 4, 2),
            new Tretja.Pridevnik("h", 'M', 6, 2),
            new Tretja.Samostalnik("rh", 'S', 4, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ogflvtu", 'M', 6, 2),
            new Tretja.Pridevnik("g", 'S', 2, 3),
            new Tretja.Pridevnik("qecrluk", 'M', 6, 1),
            new Tretja.Glagol("wlpab", 2, 2),
            new Tretja.Pridevnik("mm", 'S', 4, 3),
            new Tretja.Pridevnik("frc", 'S', 6, 1),
            new Tretja.Glagol("pksiha", 3, 2),
            new Tretja.Samostalnik("tadzfhq", 'S', 6, 2),
            new Tretja.Samostalnik("w", 'S', 6, 1),
            new Tretja.Samostalnik("exppe", 'Z', 6, 2),
            new Tretja.Pridevnik("gsjwr", 'S', 1, 1),
            new Tretja.Glagol("uvnq", 2, 1),
            new Tretja.Pridevnik("fvv", 'M', 2, 2),
            new Tretja.Glagol("qejq", 2, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("xrmhsi", 'S', 1, 3),
            new Tretja.Samostalnik("cx", 'Z', 1, 3),
            new Tretja.Glagol("xtul", 3, 1),
            new Tretja.Pridevnik("yai", 'Z', 6, 2),
            new Tretja.Samostalnik("bl", 'S', 4, 1),
            new Tretja.Pridevnik("fzbtjf", 'S', 1, 2),
            new Tretja.Samostalnik("wonb", 'Z', 2, 3),
            new Tretja.Samostalnik("ust", 'S', 5, 2),
            new Tretja.Samostalnik("cj", 'Z', 4, 3),
            new Tretja.Glagol("y", 3, 3),
            new Tretja.Pridevnik("rwqr", 'S', 4, 1),
            new Tretja.Pridevnik("frffmlh", 'Z', 6, 1),
            new Tretja.Pridevnik("e", 'M', 3, 3),
            new Tretja.Pridevnik("wvtsij", 'M', 6, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("btypx", 'Z', 4, 2),
            new Tretja.Samostalnik("nvv", 'M', 5, 3),
            new Tretja.Pridevnik("gecbv", 'M', 6, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("n", 1, 3),
            new Tretja.Glagol("upqg", 2, 3),
            new Tretja.Glagol("v", 1, 3),
            new Tretja.Glagol("nmaxjd", 2, 3),
            new Tretja.Samostalnik("keqkuoc", 'M', 2, 2),
            new Tretja.Glagol("uyhhn", 3, 2),
            new Tretja.Pridevnik("zls", 'Z', 5, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("jlnrqom", 'S', 4, 1),
            new Tretja.Pridevnik("kt", 'S', 4, 3),
            new Tretja.Pridevnik("svhy", 'S', 1, 1),
            new Tretja.Samostalnik("xjw", 'M', 5, 2),
            new Tretja.Glagol("giqzcll", 1, 1),
            new Tretja.Samostalnik("trik", 'S', 1, 1),
            new Tretja.Pridevnik("gyp", 'S', 3, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
