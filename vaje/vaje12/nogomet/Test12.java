
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Collection<String> klubi = List.of(
            "Rdeci", "Zeleni", "Crni", "Beli"
        );

        List<Tekma> tekme = new ArrayList<>(List.of(
            new Tekma("Crni", "Beli", 3, 0),
            new Tekma("Rdeci", "Zeleni", 0, 3)
        ));

        Liga liga = new Liga(klubi, tekme);

        Iterator<Tekma> iterator = liga.poTekmah(3);

        Tekma tekma = iterator.next();
        System.out.println(tekma);

        tekme.add(new Tekma("Rdeci", "Crni", 3, 0));

        try {
            // Če je metoda poTekmah vrnila iterator po obstoječi zbirki, se
            // bo v naslednjem stavku sprožila izjema tipa
            // ConcurrentModificationException.  V nasprotnem primeru ne bo
            // izjeme.
            tekma = iterator.next();
            System.out.println(tekma);
        } catch (ConcurrentModificationException ex) {
            System.out.println("OK");
        }
    }
}
