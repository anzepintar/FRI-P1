
import java.util.*;

public class Test38 {

    public static void main(String[] args) {

        Map<String, Set<String>> sinonimi = new HashMap<>();
        sinonimi.put("pmw", Set.of("pmw", "cbeui", "avl", "m", "jhozf"));
        sinonimi.put("cbeui", Set.of("pmw", "cbeui", "avl", "m", "jhozf"));
        sinonimi.put("avl", Set.of("pmw", "cbeui", "avl", "m", "jhozf"));
        sinonimi.put("m", Set.of("pmw", "cbeui", "avl", "m", "jhozf"));
        sinonimi.put("jhozf", Set.of("pmw", "cbeui", "avl", "m", "jhozf"));
        sinonimi.put("jdefy", Set.of("jdefy", "dbalu", "mvrvw", "tm", "fuyr"));
        sinonimi.put("dbalu", Set.of("jdefy", "dbalu", "mvrvw", "tm", "fuyr"));
        sinonimi.put("mvrvw", Set.of("jdefy", "dbalu", "mvrvw", "tm", "fuyr"));
        sinonimi.put("tm", Set.of("jdefy", "dbalu", "mvrvw", "tm", "fuyr"));
        sinonimi.put("fuyr", Set.of("jdefy", "dbalu", "mvrvw", "tm", "fuyr"));
        sinonimi.put("zv", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("nudn", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("pi", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("e", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("eni", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("habwe", Set.of("zv", "nudn", "pi", "e", "eni", "habwe"));
        sinonimi.put("ne", Set.of("ne"));
        sinonimi.put("mi", Set.of("mi", "enkso", "ya", "lyx"));
        sinonimi.put("enkso", Set.of("mi", "enkso", "ya", "lyx"));
        sinonimi.put("ya", Set.of("mi", "enkso", "ya", "lyx"));
        sinonimi.put("lyx", Set.of("mi", "enkso", "ya", "lyx"));
        sinonimi.put("inqe", Set.of("inqe", "v", "beuik"));
        sinonimi.put("v", Set.of("inqe", "v", "beuik"));
        sinonimi.put("beuik", Set.of("inqe", "v", "beuik"));
        sinonimi.put("mj", Set.of("mj", "rc", "pcltp"));
        sinonimi.put("rc", Set.of("mj", "rc", "pcltp"));
        sinonimi.put("pcltp", Set.of("mj", "rc", "pcltp"));
        sinonimi.put("ayj", Set.of("ayj", "kjdo", "qmdlf", "ou"));
        sinonimi.put("kjdo", Set.of("ayj", "kjdo", "qmdlf", "ou"));
        sinonimi.put("qmdlf", Set.of("ayj", "kjdo", "qmdlf", "ou"));
        sinonimi.put("ou", Set.of("ayj", "kjdo", "qmdlf", "ou"));
        sinonimi.put("jdv", Set.of("jdv", "yr", "yfnxk"));
        sinonimi.put("yr", Set.of("jdv", "yr", "yfnxk"));
        sinonimi.put("yfnxk", Set.of("jdv", "yr", "yfnxk"));
        sinonimi.put("wjgva", Set.of("wjgva", "jbf"));
        sinonimi.put("jbf", Set.of("wjgva", "jbf"));
        sinonimi.put("dn", Set.of("dn", "qtwxt"));
        sinonimi.put("qtwxt", Set.of("dn", "qtwxt"));

        Map<Set<String>, Integer> slovar = Cetrta.pogostost("drqgl dyzjz jt owpfr avl dalvp s jdefy m uzd lj xfn hvac me wac pp zhlc zg dalvp qo e ytv nzhfr dnz hvad jt fjki h avl sq vux wkwk zv gpd pkefe ttbof xzpx kcz hvad ccvey il wac jm nwger me pkefe efe lhnz lcg nhw db kcz xpvfl il iwpv pu mwjz mgz vid jvf fhen uxn ol ej zgcqq i jhqx l nlqbu zgcqq aypeo uxgco zgcqq vg jhozf kcz pi wn mu mvrvw wn rml pmw eyir fawh alk vnb gqqnv dalvp tdu dbbcy xntqv akrol fo klt jbtqu ytv yzv laca mgz unnm lwww pp avl ou klt nhw bfdty cpy xzpx yniik ah jbtqu usk gqw c fcd ehb wac wpona yr nirma mhlbp hqdm wj ei", sinonimi);
        List<String> seznam = new ArrayList<>();
        for (Set<String> mnozica: slovar.keySet()) {
            List<String> lstMnozica = new ArrayList<>(mnozica);
            lstMnozica.sort(null);
            seznam.add(String.format("%s -> %d", lstMnozica, slovar.get(mnozica)));
        }
        seznam.sort(null);
        for (String s: seznam) {
            System.out.println(s);
        }
    }
}
