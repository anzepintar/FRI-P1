
import java.util.*;

public class Glavni {

    public static void urediPoLetuInNaslovu(List<Clanek> clanki) {
        clanki.sort(primerjalnikPoLetuInNaslovu());
    }

    private static Comparator<Clanek> primerjalnikPoLetuInNaslovu() {
        return (Clanek prvi, Clanek drugi) -> {
            if (prvi.getLeto() != drugi.getLeto()) {
                return drugi.getLeto() - prvi.getLeto();
            }
            return prvi.getNaslov().compareTo(drugi.getNaslov());
        };
    }

    public static Set<Avtor> vsiAvtorji(Collection<Clanek> clanki) {
        Set<Avtor> avtorji = new HashSet<>();
        for (Clanek clanek : clanki) {
            avtorji.addAll(clanek.getAvtorji());
        }
        return avtorji;
    }

    public static Map<Avtor, List<Clanek>> clankiPoAvtorjih(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> slovar = new HashMap<>();
        Set<Avtor> avtorji = vsiAvtorji(clanki);
        for (Avtor avtor : avtorji) {
            List<Clanek> avtorjeviClanki = seznamClankov(avtor, clanki);
            avtorjeviClanki.sort(primerjalnikPoLetuInNaslovu());
            slovar.put(avtor, avtorjeviClanki);
        }
        return slovar;
    }

    private static List<Clanek> seznamClankov(Avtor avtor, Collection<Clanek> clanki) {
        Set<Clanek> avtorjeviClanki = new HashSet<>();
        for (Clanek clanek : clanki) {
            if (clanek.getAvtorji().contains(avtor)) {
                avtorjeviClanki.add(clanek);
            }
        }
        return new ArrayList<Clanek>(avtorjeviClanki);
    }

    public static Avtor najplodnejsiAvtor(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> avtor2clanki = clankiPoAvtorjih(clanki);
        return Collections.max(avtor2clanki.keySet(),
                (avtorA, avtorB) -> avtor2clanki.get(avtorA).size() - avtor2clanki.get(avtorB).size());
    }
}
