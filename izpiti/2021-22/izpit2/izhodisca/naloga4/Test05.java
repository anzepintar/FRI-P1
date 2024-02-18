
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Set<Cetrta.Tocka> setTocke = new HashSet<>();
        setTocke.add(new Cetrta.Tocka(3, 2));
        setTocke.add(new Cetrta.Tocka(-3, -2));
        setTocke.add(new Cetrta.Tocka(2, 3));
        setTocke.add(new Cetrta.Tocka(-2, -3));
        setTocke.add(new Cetrta.Tocka(-2, 3));
        setTocke.add(new Cetrta.Tocka(-3, 2));
        setTocke.add(new Cetrta.Tocka(2, -3));
        setTocke.add(new Cetrta.Tocka(3, -2));
        setTocke.add(new Cetrta.Tocka(1, 1));
        setTocke.add(new Cetrta.Tocka(4, 4));

        Comparator<Cetrta.Tocka> comp = Cetrta.Tocka.polarno();
        List<Cetrta.Tocka> lstTocke = new ArrayList<>(setTocke);
        lstTocke.sort(comp);
        for (Cetrta.Tocka tocka: lstTocke) {
            System.out.println(tocka);
        }
    }
}
