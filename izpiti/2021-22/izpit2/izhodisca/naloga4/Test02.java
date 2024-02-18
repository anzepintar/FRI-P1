
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Set<Cetrta.Tocka> setTocke = new HashSet<>();
        setTocke.add(new Cetrta.Tocka(5, 3));
        setTocke.add(new Cetrta.Tocka(-2, 7));
        setTocke.add(new Cetrta.Tocka(-3, -6));
        setTocke.add(new Cetrta.Tocka(4, -2));
        setTocke.add(new Cetrta.Tocka(6, 8));
        setTocke.add(new Cetrta.Tocka(4, 7));

        Cetrta.Tocka refTocka = new Cetrta.Tocka(6, -1);
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
}
