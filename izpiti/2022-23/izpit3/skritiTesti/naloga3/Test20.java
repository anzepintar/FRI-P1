
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("qyhn", 2, 3),
            new Tretja.Samostalnik("bhgo", 'M', 6, 1),
            new Tretja.Samostalnik("e", 'S', 4, 3),
            new Tretja.Samostalnik("rewxkhd", 'M', 3, 1),
            new Tretja.Glagol("xw", 1, 1),
            new Tretja.Glagol("r", 1, 1),
            new Tretja.Samostalnik("abrnx", 'M', 2, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("xc", 1, 1),
            new Tretja.Samostalnik("bzcjx", 'Z', 4, 1),
            new Tretja.Samostalnik("vgidwmq", 'Z', 2, 2),
            new Tretja.Samostalnik("bf", 'M', 6, 2),
            new Tretja.Glagol("jinzaub", 2, 2),
            new Tretja.Glagol("ouyyvu", 3, 3),
            new Tretja.Samostalnik("wajgf", 'Z', 3, 1),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("akjhl", 'S', 2, 1),
            new Tretja.Samostalnik("bow", 'S', 6, 3),
            new Tretja.Glagol("pgyfuk", 1, 1),
            new Tretja.Pridevnik("uurdhq", 'S', 4, 2),
            new Tretja.Samostalnik("w", 'Z', 4, 3),
            new Tretja.Pridevnik("znkdxb", 'M', 4, 1),
            new Tretja.Pridevnik("ggc", 'M', 4, 2),
            new Tretja.Samostalnik("wuja", 'Z', 1, 1),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("pnslb", 'S', 1, 1),
            new Tretja.Glagol("o", 1, 2),
            new Tretja.Glagol("nim", 1, 2),
            new Tretja.Glagol("aminrvg", 2, 1),
            new Tretja.Pridevnik("rvd", 'Z', 3, 3),
            new Tretja.Pridevnik("eiap", 'Z', 6, 1),
            new Tretja.Samostalnik("tmeg", 'S', 2, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hu", 'M', 6, 1),
            new Tretja.Pridevnik("traekym", 'Z', 1, 1),
            new Tretja.Samostalnik("abjxfvj", 'M', 5, 2),
            new Tretja.Samostalnik("akwppoh", 'S', 3, 2),
            new Tretja.Pridevnik("okm", 'Z', 1, 2),
            new Tretja.Samostalnik("klimzvb", 'S', 6, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ipxapqe", 3, 3),
            new Tretja.Pridevnik("dxvujyc", 'S', 3, 2),
            new Tretja.Pridevnik("yreo", 'S', 1, 2),
            new Tretja.Samostalnik("g", 'Z', 3, 1),
            new Tretja.Samostalnik("wwgu", 'Z', 4, 3),
            new Tretja.Pridevnik("buqzz", 'M', 4, 1),
            new Tretja.Pridevnik("a", 'S', 3, 2),
            new Tretja.Pridevnik("odeifpu", 'M', 3, 1),
            new Tretja.Samostalnik("nn", 'S', 4, 3),
            new Tretja.Samostalnik("rrbtgwx", 'M', 1, 2),
            new Tretja.Glagol("fxqte", 3, 3),
            new Tretja.Glagol("izit", 2, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("znaxph", 'Z', 6, 3),
            new Tretja.Pridevnik("vufi", 'Z', 5, 3),
            new Tretja.Pridevnik("zj", 'S', 6, 3),
            new Tretja.Pridevnik("kc", 'M', 6, 3),
            new Tretja.Samostalnik("lxynawh", 'M', 5, 2),
            new Tretja.Glagol("wpdmt", 2, 2),
            new Tretja.Samostalnik("jgzxo", 'M', 6, 2),
            new Tretja.Glagol("at", 3, 2),
            new Tretja.Samostalnik("jd", 'S', 6, 1),
            new Tretja.Pridevnik("qm", 'M', 1, 2),
            new Tretja.Pridevnik("ncmr", 'M', 5, 3),
            new Tretja.Pridevnik("vk", 'S', 4, 2),
            new Tretja.Samostalnik("bnaefj", 'S', 6, 2),
            new Tretja.Samostalnik("g", 'S', 3, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("rpioldd", 'M', 3, 3),
            new Tretja.Glagol("posxxy", 2, 1),
            new Tretja.Samostalnik("epiced", 'Z', 1, 1),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("qm", 'S', 2, 2),
            new Tretja.Pridevnik("eklim", 'Z', 3, 2),
            new Tretja.Glagol("mi", 2, 1),
            new Tretja.Glagol("yrb", 2, 3),
            new Tretja.Samostalnik("dwwuxyu", 'M', 1, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("dvd", 'S', 4, 3),
            new Tretja.Glagol("f", 3, 1),
            new Tretja.Pridevnik("srp", 'M', 4, 3),
            new Tretja.Pridevnik("vgltej", 'S', 5, 3),
            new Tretja.Samostalnik("uhb", 'M', 5, 2),
            new Tretja.Glagol("nvmly", 2, 3),
            new Tretja.Pridevnik("jit", 'Z', 4, 1),
            new Tretja.Pridevnik("vznygoz", 'Z', 5, 2),
            new Tretja.Samostalnik("gyqnqf", 'Z', 2, 1),
            new Tretja.Glagol("vfnox", 2, 3),
            new Tretja.Samostalnik("afdqm", 'M', 3, 1),
            new Tretja.Glagol("wiagme", 3, 3),
            new Tretja.Pridevnik("vxwm", 'Z', 2, 1),
            new Tretja.Pridevnik("scay", 'Z', 4, 3),
            new Tretja.Pridevnik("bkvcynb", 'S', 5, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
