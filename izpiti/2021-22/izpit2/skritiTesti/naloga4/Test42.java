
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Random random = new Random(27011090);
        Set<Cetrta.Tocka> setTocke = new HashSet<>();
        for (int i = 0;  i < 193;  i++) {
            setTocke.add(genTocka(random, 13));
        }

        Comparator<Cetrta.Tocka> comp = Cetrta.Tocka.polarno();
        List<Cetrta.Tocka> lstTocke = new ArrayList<>(setTocke);
        lstTocke.sort(comp);
        for (Cetrta.Tocka tocka: lstTocke) {
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
