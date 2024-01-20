
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Collection<String> klubi = List.of(
            "Rdeci", "Zeleni", "Crni", "Beli"
        );

        Collection<Tekma> tekme = List.of(
            new Tekma("Rdeci",  "Zeleni", 0, 0),
            new Tekma("Crni", "Beli", 2, 1),
            new Tekma("Zeleni", "Beli", 2, 4)
        );

        for (Tekma tekma: tekme) {
            System.out.println(tekma);
            for (String klub: klubi) {
                System.out.printf("    %s -> %d%n", klub, tekma.steviloTock(klub));
            }
            System.out.println();
        }
    }
}
