
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("f", 'Z', 5, 2),
            new Tretja.Samostalnik("vrj", 'M', 3, 2),
        });
        System.out.println(stavek1.preveriPS());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("yoog", 'S', 5, 2),
            new Tretja.Pridevnik("x", 'Z', 3, 2),
            new Tretja.Samostalnik("et", 'Z', 6, 1),
            new Tretja.Glagol("y", 1, 2),
            new Tretja.Samostalnik("nwn", 'Z', 1, 1),
            new Tretja.Samostalnik("fn", 'M', 4, 1),
            new Tretja.Samostalnik("tj", 'M', 3, 1),
            new Tretja.Samostalnik("iv", 'Z', 4, 1),
            new Tretja.Pridevnik("tuuf", 'S', 3, 1),
            new Tretja.Samostalnik("emow", 'M', 3, 1),
            new Tretja.Samostalnik("hwn", 'M', 4, 3),
            new Tretja.Pridevnik("u", 'S', 1, 2),
            new Tretja.Glagol("gfaqb", 1, 1),
        });
        System.out.println(stavek2.preveriPS());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("ntycg", 3, 3),
            new Tretja.Glagol("sgmw", 1, 1),
            new Tretja.Pridevnik("ckqqmno", 'M', 5, 1),
            new Tretja.Samostalnik("ddd", 'M', 4, 2),
        });
        System.out.println(stavek3.preveriPS());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("srqd", 'S', 3, 3),
            new Tretja.Samostalnik("fcvb", 'S', 2, 3),
            new Tretja.Pridevnik("yifkmyn", 'Z', 6, 1),
            new Tretja.Pridevnik("kvo", 'S', 1, 1),
            new Tretja.Samostalnik("xey", 'M', 2, 1),
            new Tretja.Glagol("z", 2, 2),
            new Tretja.Glagol("akid", 2, 3),
            new Tretja.Pridevnik("sanlge", 'M', 4, 1),
            new Tretja.Samostalnik("u", 'Z', 3, 3),
        });
        System.out.println(stavek4.preveriPS());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("hrisbq", 'S', 5, 1),
            new Tretja.Glagol("bast", 2, 3),
            new Tretja.Samostalnik("mzno", 'Z', 3, 2),
        });
        System.out.println(stavek5.preveriPS());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("vdqu", 'M', 3, 2),
            new Tretja.Samostalnik("uvfi", 'S', 2, 1),
            new Tretja.Samostalnik("btepc", 'Z', 2, 2),
            new Tretja.Samostalnik("gnm", 'S', 6, 1),
            new Tretja.Glagol("cek", 1, 3),
            new Tretja.Pridevnik("j", 'M', 5, 3),
            new Tretja.Samostalnik("xd", 'S', 4, 1),
            new Tretja.Samostalnik("qmfzk", 'S', 1, 1),
            new Tretja.Pridevnik("oyxx", 'S', 2, 3),
            new Tretja.Samostalnik("jqc", 'S', 3, 2),
        });
        System.out.println(stavek6.preveriPS());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("fj", 'Z', 4, 1),
        });
        System.out.println(stavek7.preveriPS());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("yjgadj", 'S', 4, 2),
            new Tretja.Pridevnik("bdlnd", 'Z', 4, 2),
            new Tretja.Glagol("my", 2, 2),
            new Tretja.Pridevnik("to", 'M', 1, 1),
            new Tretja.Pridevnik("mvwqj", 'Z', 5, 2),
            new Tretja.Pridevnik("jhj", 'M', 4, 1),
            new Tretja.Samostalnik("jsp", 'M', 6, 2),
            new Tretja.Glagol("gadbpn", 3, 1),
            new Tretja.Samostalnik("nnnqtoh", 'S', 3, 2),
            new Tretja.Glagol("xx", 2, 1),
            new Tretja.Pridevnik("xgp", 'Z', 3, 3),
            new Tretja.Pridevnik("a", 'Z', 5, 3),
            new Tretja.Samostalnik("ej", 'M', 1, 2),
            new Tretja.Samostalnik("aeitbd", 'Z', 6, 2),
            new Tretja.Samostalnik("vrhidxo", 'S', 1, 3),
        });
        System.out.println(stavek8.preveriPS());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("a", 2, 1),
            new Tretja.Glagol("jga", 2, 1),
            new Tretja.Samostalnik("buio", 'M', 1, 3),
            new Tretja.Glagol("kbjayr", 2, 2),
            new Tretja.Samostalnik("ravkisq", 'S', 3, 2),
            new Tretja.Samostalnik("b", 'M', 1, 3),
            new Tretja.Glagol("itq", 3, 2),
            new Tretja.Samostalnik("v", 'S', 4, 3),
            new Tretja.Samostalnik("txfko", 'M', 3, 2),
            new Tretja.Glagol("wshsd", 3, 2),
            new Tretja.Pridevnik("ufiubsa", 'M', 3, 3),
            new Tretja.Glagol("eq", 2, 1),
        });
        System.out.println(stavek9.preveriPS());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("l", 'S', 1, 1),
            new Tretja.Glagol("nktwmr", 1, 3),
            new Tretja.Samostalnik("ew", 'S', 2, 1),
            new Tretja.Samostalnik("hctcjsb", 'Z', 6, 1),
            new Tretja.Pridevnik("tduyz", 'S', 2, 3),
            new Tretja.Samostalnik("dpgdob", 'Z', 2, 2),
        });
        System.out.println(stavek10.preveriPS());

    }
}
