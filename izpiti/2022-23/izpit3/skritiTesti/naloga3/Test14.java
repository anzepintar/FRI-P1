
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Stavek stavek1 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("caqifv", 1, 1),
            new Tretja.Samostalnik("x", 'S', 6, 2),
            new Tretja.Glagol("turu", 1, 3),
            new Tretja.Glagol("l", 3, 2),
            new Tretja.Pridevnik("vjeqba", 'M', 4, 3),
        });
        System.out.println(stavek1.poisciGlagol());

        Tretja.Stavek stavek2 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("khngo", 3, 3),
            new Tretja.Pridevnik("ugzowx", 'Z', 6, 1),
            new Tretja.Glagol("rd", 2, 3),
            new Tretja.Glagol("xpd", 3, 1),
            new Tretja.Samostalnik("xcyfixg", 'Z', 6, 1),
            new Tretja.Pridevnik("flknbo", 'M', 1, 3),
            new Tretja.Glagol("zk", 1, 2),
            new Tretja.Pridevnik("lzsie", 'M', 1, 1),
            new Tretja.Pridevnik("alfmr", 'Z', 1, 3),
            new Tretja.Samostalnik("oa", 'Z', 6, 3),
            new Tretja.Samostalnik("vpofdg", 'M', 5, 1),
        });
        System.out.println(stavek2.poisciGlagol());

        Tretja.Stavek stavek3 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("he", 3, 1),
            new Tretja.Pridevnik("qvwzfnd", 'Z', 4, 1),
            new Tretja.Glagol("elojy", 1, 2),
            new Tretja.Samostalnik("izuyq", 'M', 6, 1),
            new Tretja.Samostalnik("no", 'Z', 5, 1),
            new Tretja.Glagol("hukdgy", 3, 1),
            new Tretja.Samostalnik("izw", 'M', 4, 2),
            new Tretja.Pridevnik("cfsn", 'S', 6, 1),
            new Tretja.Pridevnik("pmvrqo", 'Z', 1, 2),
            new Tretja.Glagol("v", 1, 1),
            new Tretja.Samostalnik("l", 'S', 6, 1),
            new Tretja.Pridevnik("rnv", 'S', 5, 3),
            new Tretja.Samostalnik("czvjt", 'S', 1, 2),
        });
        System.out.println(stavek3.poisciGlagol());

        Tretja.Stavek stavek4 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("vpdag", 1, 1),
            new Tretja.Glagol("xvx", 1, 2),
            new Tretja.Glagol("whyiezd", 3, 2),
            new Tretja.Glagol("ejuymw", 2, 3),
        });
        System.out.println(stavek4.poisciGlagol());

        Tretja.Stavek stavek5 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("fmu", 'M', 3, 1),
            new Tretja.Samostalnik("vog", 'Z', 6, 2),
            new Tretja.Glagol("wsbjqjx", 1, 3),
            new Tretja.Glagol("dfwrbzd", 2, 1),
            new Tretja.Pridevnik("z", 'Z', 6, 1),
            new Tretja.Pridevnik("olds", 'S', 6, 1),
            new Tretja.Pridevnik("hf", 'Z', 2, 3),
            new Tretja.Pridevnik("dn", 'Z', 1, 3),
            new Tretja.Samostalnik("foi", 'M', 1, 2),
            new Tretja.Glagol("o", 3, 2),
            new Tretja.Glagol("dkepdxk", 1, 1),
            new Tretja.Pridevnik("wh", 'Z', 6, 1),
        });
        System.out.println(stavek5.poisciGlagol());

        Tretja.Stavek stavek6 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Pridevnik("zxapkwv", 'Z', 6, 2),
            new Tretja.Glagol("dc", 2, 2),
            new Tretja.Pridevnik("kk", 'S', 6, 3),
            new Tretja.Samostalnik("jpumo", 'Z', 5, 1),
            new Tretja.Pridevnik("khikwk", 'M', 3, 3),
            new Tretja.Samostalnik("ysjzs", 'S', 5, 2),
            new Tretja.Glagol("zuhlvaz", 2, 1),
            new Tretja.Pridevnik("qbgj", 'Z', 6, 3),
            new Tretja.Glagol("jgssnwh", 2, 2),
        });
        System.out.println(stavek6.poisciGlagol());

        Tretja.Stavek stavek7 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("wgpceby", 'M', 5, 3),
            new Tretja.Glagol("wg", 2, 1),
            new Tretja.Samostalnik("kb", 'M', 6, 1),
            new Tretja.Glagol("esocpb", 1, 2),
            new Tretja.Pridevnik("adrkuyk", 'M', 1, 3),
            new Tretja.Samostalnik("mzimdns", 'Z', 6, 3),
            new Tretja.Samostalnik("hhuzjf", 'M', 3, 1),
            new Tretja.Pridevnik("bate", 'S', 6, 1),
            new Tretja.Pridevnik("aphrpm", 'M', 2, 1),
            new Tretja.Samostalnik("p", 'M', 1, 3),
        });
        System.out.println(stavek7.poisciGlagol());

        Tretja.Stavek stavek8 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("laolyr", 1, 3),
            new Tretja.Glagol("xfoaaug", 1, 2),
            new Tretja.Glagol("ssftccr", 2, 3),
            new Tretja.Samostalnik("vemo", 'S', 1, 3),
        });
        System.out.println(stavek8.poisciGlagol());

        Tretja.Stavek stavek9 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Glagol("noyao", 1, 1),
            new Tretja.Glagol("jz", 1, 1),
            new Tretja.Glagol("gl", 2, 2),
            new Tretja.Glagol("si", 1, 3),
            new Tretja.Glagol("h", 1, 1),
            new Tretja.Pridevnik("jvnrdjf", 'S', 3, 1),
        });
        System.out.println(stavek9.poisciGlagol());

        Tretja.Stavek stavek10 = new Tretja.Stavek(new Tretja.Beseda[]{
            new Tretja.Samostalnik("nnwguk", 'S', 2, 1),
            new Tretja.Samostalnik("jjh", 'Z', 6, 1),
            new Tretja.Glagol("bbga", 3, 1),
            new Tretja.Samostalnik("wzxj", 'M', 5, 3),
            new Tretja.Samostalnik("tukz", 'M', 2, 1),
            new Tretja.Samostalnik("tnktwnd", 'M', 4, 1),
            new Tretja.Glagol("brac", 1, 3),
            new Tretja.Samostalnik("tc", 'M', 4, 2),
            new Tretja.Glagol("frsqgl", 2, 3),
            new Tretja.Glagol("ovnywe", 1, 1),
            new Tretja.Samostalnik("fc", 'Z', 6, 2),
            new Tretja.Glagol("emnjhk", 3, 1),
            new Tretja.Samostalnik("roiqxi", 'S', 1, 3),
            new Tretja.Samostalnik("upby", 'M', 3, 2),
            new Tretja.Samostalnik("rtukgcn", 'Z', 1, 1),
        });
        System.out.println(stavek10.poisciGlagol());

    }
}
