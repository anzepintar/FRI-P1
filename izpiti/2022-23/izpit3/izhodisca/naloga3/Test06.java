
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("x", 3, 3),
            new Tretja.Samostalnik("qnvxku", 'S', 3, 3),
            new Tretja.Glagol("tsdhwzh", 2, 1),
            new Tretja.Samostalnik("amrk", 'Z', 1, 2),
            new Tretja.Samostalnik("t", 'S', 3, 1),
            new Tretja.Samostalnik("mgsqk", 'M', 2, 3),
            new Tretja.Glagol("ne", 1, 1),
            new Tretja.Glagol("z", 3, 1),
            new Tretja.Samostalnik("sxg", 'M', 4, 2),
            new Tretja.Samostalnik("mbupaem", 'Z', 2, 2),
            new Tretja.Pridevnik("tzjcae", 'S', 5, 2),
            new Tretja.Glagol("o", 1, 1),
            new Tretja.Glagol("wrjjrpf", 1, 2),
            new Tretja.Glagol("yj", 3, 1),
            new Tretja.Pridevnik("ir", 'Z', 2, 2),
            new Tretja.Samostalnik("tp", 'S', 2, 1),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("qxppyhl", 'S', 2, 1),
            new Tretja.Glagol("yrv", 1, 1),
            new Tretja.Glagol("u", 1, 3),
            new Tretja.Samostalnik("omqkdlv", 'M', 5, 3),
            new Tretja.Pridevnik("ycvmbsv", 'S', 3, 3),
            new Tretja.Pridevnik("srxj", 'Z', 5, 2),
            new Tretja.Pridevnik("e", 'Z', 2, 3),
            new Tretja.Glagol("e", 1, 2),
            new Tretja.Glagol("egnpt", 1, 1),
            new Tretja.Glagol("pyh", 1, 3),
            new Tretja.Samostalnik("c", 'M', 4, 2),
            new Tretja.Pridevnik("buyvcg", 'M', 2, 3),
            new Tretja.Glagol("p", 2, 3),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("amqq", 2, 2),
            new Tretja.Pridevnik("nighnla", 'S', 6, 2),
            new Tretja.Samostalnik("knayhl", 'M', 6, 3),
            new Tretja.Samostalnik("c", 'Z', 3, 1),
            new Tretja.Samostalnik("h", 'M', 1, 3),
            new Tretja.Samostalnik("o", 'Z', 6, 1),
            new Tretja.Glagol("zsbh", 3, 1),
            new Tretja.Glagol("pahhmt", 1, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("apskvnv", 'M', 4, 3),
            new Tretja.Samostalnik("ia", 'M', 6, 1),
            new Tretja.Pridevnik("ueuqapf", 'Z', 3, 1),
            new Tretja.Samostalnik("bfwenp", 'S', 3, 2),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("ihgmvv", 'S', 6, 1),
            new Tretja.Glagol("xai", 3, 2),
            new Tretja.Samostalnik("hz", 'S', 1, 3),
            new Tretja.Pridevnik("zzpwvg", 'M', 1, 3),
            new Tretja.Glagol("kk", 3, 1),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("caced", 'M', 3, 3),
            new Tretja.Samostalnik("i", 'S', 3, 3),
            new Tretja.Samostalnik("rk", 'Z', 6, 3),
            new Tretja.Glagol("fofclz", 2, 3),
            new Tretja.Glagol("mtdfvau", 2, 3),
            new Tretja.Samostalnik("ii", 'M', 3, 1),
            new Tretja.Glagol("zzuyss", 3, 2),
            new Tretja.Pridevnik("sxoe", 'M', 3, 2),
            new Tretja.Pridevnik("neyrlc", 'Z', 6, 2),
            new Tretja.Pridevnik("mccl", 'M', 4, 1),
            new Tretja.Pridevnik("y", 'M', 2, 2),
            new Tretja.Pridevnik("oyizw", 'Z', 1, 1),
            new Tretja.Pridevnik("rkiy", 'M', 4, 2),
            new Tretja.Samostalnik("evwzlpe", 'M', 1, 3),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ajxt", 1, 2),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("bfmnfvw", 'Z', 6, 2),
            new Tretja.Pridevnik("cusevpu", 'Z', 5, 1),
            new Tretja.Samostalnik("r", 'S', 3, 1),
            new Tretja.Pridevnik("ulrkns", 'Z', 1, 3),
            new Tretja.Pridevnik("fz", 'M', 6, 3),
            new Tretja.Glagol("or", 2, 3),
            new Tretja.Glagol("n", 1, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("pd", 'Z', 5, 2),
            new Tretja.Glagol("n", 1, 1),
            new Tretja.Pridevnik("cnrp", 'S', 2, 2),
            new Tretja.Samostalnik("atflo", 'M', 4, 2),
            new Tretja.Pridevnik("ykkomwg", 'Z', 3, 1),
            new Tretja.Pridevnik("rpkms", 'S', 2, 2),
            new Tretja.Samostalnik("bx", 'Z', 4, 1),
            new Tretja.Glagol("rxjwkpo", 3, 2),
            new Tretja.Pridevnik("ply", 'Z', 4, 1),
            new Tretja.Samostalnik("iwktbqc", 'M', 3, 1),
            new Tretja.Samostalnik("s", 'S', 5, 1),
            new Tretja.Glagol("hwlysi", 1, 2),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("jwuhb", 'M', 5, 1),
            new Tretja.Glagol("qyur", 1, 1),
            new Tretja.Pridevnik("ime", 'M', 1, 2),
            new Tretja.Samostalnik("wwys", 'Z', 3, 1),
        });
        System.out.println(stavek10.preveriPS());

    }
}
