
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Random random = new Random(27011060);
        Set<Cetrta.Tocka> setTocke = new HashSet<>();
        for (int i = 0;  i < 446;  i++) {
            setTocke.add(genTocka(random, 24));
        }

        Cetrta.Tocka refTocka = genTocka(random, 24);
        Map<Boolean, List<Cetrta.Tocka>> slovar = refTocka.razdeli(setTocke);

        List<Cetrta.Tocka> tockeTrue = new ArrayList<>(slovar.get(true));
        List<Cetrta.Tocka> tockeFalse = new ArrayList<>(slovar.get(false));
        Comparator<Cetrta.Tocka> comp = (t1, t2) -> t1.toString().compareTo(t2.toString());
        tockeTrue.sort(comp);
        tockeFalse.sort(comp);

        System.out.println("true:");
        for (Cetrta.Tocka tocka: tockeTrue) {
            System.out.println(tocka);
        }

        System.out.println("false:");
        for (Cetrta.Tocka tocka: tockeFalse) {
            System.out.println(tocka);
        }
    }

    private static Cetrta.Tocka genTocka(Random random, int meja) {
        int px = (random.nextInt(2) == 0) ? (1) : (-1);
        int py = (random.nextInt(2) == 0) ? (1) : (-1);
        int x = px * (random.nextInt(meja) + 1);
        int y = py * (random.nextInt(meja) + 1);
        return new Cetrta.Tocka(x, y);
    }
}
