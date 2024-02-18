
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Set<Cetrta.Tocka> setTocke = new HashSet<>();
        setTocke.add(new Cetrta.Tocka(-5, 5));
        setTocke.add(new Cetrta.Tocka(-7, 1));
        setTocke.add(new Cetrta.Tocka(-4, -6));
        setTocke.add(new Cetrta.Tocka(1, 7));
        setTocke.add(new Cetrta.Tocka(6, -4));
        setTocke.add(new Cetrta.Tocka(5, -5));
        setTocke.add(new Cetrta.Tocka(-1, -7));
        setTocke.add(new Cetrta.Tocka(4, -6));
        setTocke.add(new Cetrta.Tocka(-6, 4));
        setTocke.add(new Cetrta.Tocka(7, -1));

        Comparator<Cetrta.Tocka> comp = Cetrta.Tocka.polarno();
        List<Cetrta.Tocka> lstTocke = new ArrayList<>(setTocke);
        lstTocke.sort(comp);
        for (Cetrta.Tocka tocka: lstTocke) {
            System.out.println(tocka);
        }
    }
}
