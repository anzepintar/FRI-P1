
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("fp", 'Z', 1, 3),
            new Tretja.Pridevnik("ameibwo", 'M', 3, 1),
            new Tretja.Pridevnik("ryqzwwj", 'M', 4, 1),
            new Tretja.Samostalnik("thzfvhp", 'M', 6, 2),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("pmelifq", 'Z', 3, 2),
            new Tretja.Samostalnik("hvahw", 'Z', 2, 3),
            new Tretja.Glagol("te", 3, 1),
            new Tretja.Glagol("mc", 2, 1),
            new Tretja.Samostalnik("ptretef", 'S', 6, 2),
            new Tretja.Pridevnik("ojkx", 'S', 2, 2),
            new Tretja.Glagol("z", 2, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("xxhub", 3, 3),
            new Tretja.Pridevnik("fkdj", 'S', 4, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("zmpag", 'S', 1, 2),
            new Tretja.Pridevnik("pcgwge", 'Z', 6, 2),
            new Tretja.Samostalnik("ft", 'S', 1, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("lqb", 'Z', 5, 1),
            new Tretja.Glagol("ik", 3, 3),
            new Tretja.Samostalnik("wljykfv", 'S', 3, 2),
            new Tretja.Samostalnik("jpgny", 'S', 3, 3),
            new Tretja.Samostalnik("gtutd", 'S', 5, 2),
            new Tretja.Glagol("fwebabl", 2, 1),
            new Tretja.Pridevnik("fgdwvs", 'S', 4, 1),
            new Tretja.Pridevnik("ut", 'S', 2, 3),
            new Tretja.Glagol("tymk", 2, 2),
            new Tretja.Glagol("rqylsiu", 1, 2),
            new Tretja.Pridevnik("vq", 'S', 6, 3),
            new Tretja.Pridevnik("b", 'M', 5, 2),
            new Tretja.Samostalnik("zdb", 'M', 2, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("koktjko", 2, 2),
            new Tretja.Pridevnik("btrpt", 'S', 3, 1),
            new Tretja.Samostalnik("ght", 'Z', 1, 1),
            new Tretja.Glagol("rzwv", 2, 3),
            new Tretja.Pridevnik("gahe", 'M', 4, 1),
            new Tretja.Glagol("vtl", 2, 3),
            new Tretja.Pridevnik("you", 'Z', 5, 2),
            new Tretja.Glagol("d", 1, 3),
            new Tretja.Pridevnik("xdpwp", 'Z', 2, 2),
            new Tretja.Pridevnik("roog", 'M', 4, 3),
            new Tretja.Pridevnik("xwmhhxa", 'S', 5, 1),
            new Tretja.Samostalnik("u", 'S', 4, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("t", 1, 1),
            new Tretja.Glagol("becdqto", 1, 3),
            new Tretja.Samostalnik("r", 'Z', 6, 2),
            new Tretja.Pridevnik("grwlq", 'Z', 1, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("vxhaiy", 'M', 5, 2),
            new Tretja.Samostalnik("wjeo", 'S', 6, 3),
            new Tretja.Samostalnik("d", 'S', 4, 3),
            new Tretja.Glagol("zygcxwq", 1, 2),
            new Tretja.Samostalnik("qqpl", 'Z', 6, 3),
            new Tretja.Glagol("onrfziy", 1, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("rsa", 'Z', 4, 1),
            new Tretja.Samostalnik("byu", 'M', 6, 3),
            new Tretja.Pridevnik("w", 'S', 3, 2),
            new Tretja.Samostalnik("l", 'M', 5, 2),
            new Tretja.Glagol("asi", 2, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("vd", 2, 1),
            new Tretja.Pridevnik("tis", 'M', 4, 1),
            new Tretja.Pridevnik("oexiq", 'S', 2, 3),
            new Tretja.Samostalnik("njhu", 'M', 5, 3),
            new Tretja.Samostalnik("yuf", 'M', 1, 1),
            new Tretja.Pridevnik("d", 'M', 5, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
