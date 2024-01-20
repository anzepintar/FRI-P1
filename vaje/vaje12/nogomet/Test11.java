
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Collection<String> klubi = List.of(
            "Rdeci", "Zeleni", "Crni", "Beli"
        );

        Collection<Tekma> tekme = List.of(
            new Tekma("Crni", "Beli", 3, 0)
        );

        Liga liga = new Liga(klubi, tekme);

        System.out.println("-");
        Iterator<Tekma> iterator = liga.poTekmah(4);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
