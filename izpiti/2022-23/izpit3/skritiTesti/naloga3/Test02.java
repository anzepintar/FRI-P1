
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("waau", 'M', 6, 3),
            new Tretja.Samostalnik("wcr", 'S', 4, 1),
            new Tretja.Glagol("ojvjfd", 1, 2),
            new Tretja.Samostalnik("d", 'Z', 2, 3),
            new Tretja.Glagol("duqb", 3, 1),
            new Tretja.Samostalnik("sy", 'S', 2, 1),
            new Tretja.Glagol("xwpgu", 2, 1),
            new Tretja.Pridevnik("htp", 'Z', 2, 2),
            new Tretja.Pridevnik("xfb", 'Z', 6, 1),
            new Tretja.Pridevnik("oizzw", 'M', 5, 2),
            new Tretja.Glagol("r", 3, 1),
            new Tretja.Samostalnik("begpo", 'S', 2, 2),
            new Tretja.Pridevnik("klxd", 'M', 6, 3),
            new Tretja.Glagol("dmd", 1, 3),
            new Tretja.Samostalnik("dhcwx", 'M', 2, 3),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("evprcij", 1, 2),
            new Tretja.Glagol("ns", 1, 2),
            new Tretja.Samostalnik("xxui", 'S', 1, 2),
            new Tretja.Glagol("ma", 2, 1),
            new Tretja.Pridevnik("yfmzenj", 'S', 5, 3),
            new Tretja.Pridevnik("xhh", 'M', 5, 1),
            new Tretja.Samostalnik("rc", 'S', 5, 3),
            new Tretja.Pridevnik("wwriuo", 'M', 2, 3),
            new Tretja.Pridevnik("hqete", 'M', 2, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zwaanqx", 3, 1),
            new Tretja.Samostalnik("h", 'M', 2, 3),
            new Tretja.Pridevnik("jaep", 'M', 3, 2),
            new Tretja.Pridevnik("a", 'Z', 5, 2),
            new Tretja.Samostalnik("g", 'M', 5, 2),
            new Tretja.Samostalnik("qg", 'Z', 1, 3),
            new Tretja.Pridevnik("nxddd", 'S', 5, 1),
            new Tretja.Glagol("x", 1, 1),
            new Tretja.Glagol("ybirgbj", 1, 2),
            new Tretja.Samostalnik("qnpb", 'S', 3, 1),
            new Tretja.Samostalnik("ofg", 'M', 4, 3),
            new Tretja.Samostalnik("lfz", 'S', 4, 3),
            new Tretja.Glagol("qcth", 2, 3),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("h", 'Z', 4, 3),
            new Tretja.Glagol("wen", 3, 2),
            new Tretja.Samostalnik("cvxsn", 'S', 3, 3),
            new Tretja.Glagol("qupwvr", 2, 3),
            new Tretja.Pridevnik("g", 'M', 2, 3),
            new Tretja.Samostalnik("k", 'M', 6, 3),
            new Tretja.Pridevnik("pbtddz", 'M', 3, 2),
            new Tretja.Glagol("bjnzt", 2, 2),
            new Tretja.Pridevnik("hradpmv", 'Z', 1, 1),
            new Tretja.Samostalnik("hqepl", 'M', 5, 1),
            new Tretja.Glagol("xipyst", 3, 2),
            new Tretja.Glagol("fsvtduz", 2, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("zo", 2, 1),
            new Tretja.Glagol("xjrsd", 3, 1),
            new Tretja.Pridevnik("d", 'S', 1, 1),
            new Tretja.Pridevnik("fim", 'M', 2, 1),
            new Tretja.Glagol("lrhtoda", 2, 2),
            new Tretja.Glagol("nu", 1, 3),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("gxh", 1, 3),
            new Tretja.Glagol("poqex", 3, 1),
            new Tretja.Glagol("josr", 3, 3),
            new Tretja.Glagol("dylcsil", 3, 1),
            new Tretja.Pridevnik("fo", 'M', 6, 2),
            new Tretja.Pridevnik("rlfaum", 'Z', 3, 1),
            new Tretja.Pridevnik("xvilim", 'Z', 6, 3),
            new Tretja.Pridevnik("i", 'Z', 6, 3),
            new Tretja.Pridevnik("lr", 'S', 6, 1),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("q", 'M', 3, 2),
            new Tretja.Glagol("frev", 3, 2),
            new Tretja.Samostalnik("dls", 'Z', 5, 2),
            new Tretja.Pridevnik("yxdx", 'Z', 3, 1),
            new Tretja.Pridevnik("kxctj", 'Z', 6, 3),
            new Tretja.Glagol("kpaufz", 2, 1),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("avpusjm", 'Z', 3, 1),
            new Tretja.Glagol("ywrsfey", 3, 2),
            new Tretja.Glagol("sb", 3, 3),
            new Tretja.Samostalnik("gdip", 'Z', 3, 3),
            new Tretja.Glagol("tt", 1, 1),
            new Tretja.Samostalnik("ii", 'Z', 3, 1),
            new Tretja.Glagol("bufykx", 1, 3),
            new Tretja.Pridevnik("p", 'M', 5, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("mvnhvyg", 3, 2),
            new Tretja.Glagol("kmegf", 2, 2),
            new Tretja.Glagol("zjn", 2, 1),
            new Tretja.Glagol("uyoent", 2, 1),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("n", 3, 3),
            new Tretja.Samostalnik("uptyjg", 'Z', 5, 2),
            new Tretja.Pridevnik("dlfoyhx", 'M', 4, 1),
            new Tretja.Pridevnik("qdfm", 'M', 1, 1),
            new Tretja.Glagol("pwaigbe", 1, 3),
            new Tretja.Glagol("mjt", 2, 3),
            new Tretja.Pridevnik("neq", 'S', 5, 2),
            new Tretja.Glagol("qmqyg", 3, 3),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
