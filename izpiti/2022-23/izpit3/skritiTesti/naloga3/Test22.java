
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ico", 'S', 5, 2),
            new Tretja.Samostalnik("m", 'M', 2, 3),
            new Tretja.Samostalnik("ui", 'S', 6, 1),
            new Tretja.Glagol("dygpz", 1, 3),
            new Tretja.Samostalnik("uqsp", 'S', 4, 2),
            new Tretja.Glagol("yqgswet", 1, 2),
            new Tretja.Samostalnik("pjdczx", 'M', 2, 3),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("ifbc", 'Z', 3, 1),
            new Tretja.Pridevnik("h", 'S', 1, 2),
            new Tretja.Samostalnik("usfrl", 'M', 4, 2),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("j", 'Z', 3, 2),
            new Tretja.Glagol("ggqk", 3, 2),
            new Tretja.Pridevnik("zuiwd", 'M', 6, 2),
            new Tretja.Samostalnik("zgefy", 'M', 4, 2),
            new Tretja.Glagol("rdpd", 3, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("kjspzfh", 'Z', 6, 2),
            new Tretja.Glagol("jjbzvy", 3, 3),
            new Tretja.Pridevnik("nwryk", 'Z', 3, 1),
            new Tretja.Glagol("teai", 3, 2),
            new Tretja.Pridevnik("gzhwr", 'M', 3, 2),
            new Tretja.Samostalnik("wgvuf", 'Z', 6, 1),
            new Tretja.Pridevnik("rm", 'M', 1, 2),
            new Tretja.Pridevnik("bdy", 'S', 4, 1),
            new Tretja.Samostalnik("yomhcu", 'M', 2, 1),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hiyr", 'Z', 1, 1),
            new Tretja.Pridevnik("lqhu", 'M', 6, 1),
            new Tretja.Pridevnik("izilgf", 'Z', 5, 2),
            new Tretja.Glagol("iwvun", 3, 2),
            new Tretja.Samostalnik("nmf", 'M', 6, 3),
            new Tretja.Pridevnik("id", 'M', 1, 2),
            new Tretja.Pridevnik("cnoz", 'Z', 5, 3),
            new Tretja.Pridevnik("y", 'M', 6, 1),
            new Tretja.Pridevnik("klznrtl", 'S', 6, 3),
            new Tretja.Pridevnik("jopvoh", 'S', 5, 2),
            new Tretja.Samostalnik("swaco", 'S', 4, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("iqxsp", 'S', 3, 3),
            new Tretja.Glagol("mksuon", 1, 1),
            new Tretja.Glagol("to", 1, 1),
            new Tretja.Pridevnik("kdby", 'Z', 6, 1),
            new Tretja.Samostalnik("vefq", 'Z', 1, 1),
            new Tretja.Glagol("fruz", 2, 3),
            new Tretja.Pridevnik("oebdvuv", 'M', 3, 1),
            new Tretja.Samostalnik("lxqxbs", 'Z', 1, 3),
            new Tretja.Glagol("rs", 2, 1),
            new Tretja.Samostalnik("ry", 'S', 5, 3),
            new Tretja.Samostalnik("fjwyn", 'S', 5, 1),
            new Tretja.Glagol("auac", 1, 2),
            new Tretja.Glagol("dcoajt", 1, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("frvdz", 3, 3),
            new Tretja.Glagol("ctco", 3, 3),
            new Tretja.Samostalnik("z", 'M', 6, 3),
            new Tretja.Samostalnik("wo", 'S', 4, 1),
            new Tretja.Glagol("qtna", 2, 1),
            new Tretja.Samostalnik("nzab", 'Z', 1, 1),
            new Tretja.Samostalnik("ryil", 'Z', 1, 2),
            new Tretja.Glagol("r", 1, 3),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("bgukx", 'S', 2, 1),
            new Tretja.Samostalnik("zleu", 'S', 4, 1),
            new Tretja.Glagol("taomy", 1, 1),
            new Tretja.Glagol("ao", 3, 3),
            new Tretja.Pridevnik("ei", 'Z', 5, 2),
            new Tretja.Glagol("ineavj", 1, 2),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("kzgvaq", 'Z', 5, 3),
            new Tretja.Pridevnik("dglydpe", 'Z', 6, 2),
            new Tretja.Pridevnik("bj", 'S', 6, 3),
            new Tretja.Pridevnik("ohmjdz", 'M', 6, 1),
            new Tretja.Samostalnik("pw", 'Z', 5, 3),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ksbjmke", 'Z', 2, 3),
            new Tretja.Samostalnik("vhap", 'Z', 5, 3),
            new Tretja.Pridevnik("bcshts", 'M', 4, 2),
            new Tretja.Pridevnik("yl", 'S', 5, 3),
            new Tretja.Pridevnik("z", 'M', 5, 1),
            new Tretja.Samostalnik("xlfe", 'M', 5, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
