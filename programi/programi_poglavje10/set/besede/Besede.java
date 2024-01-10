
//
// Program izpiše vse besede, ki vsaj po enkrat nastopajo na vhodu.
// Predpostavljamo, da je vhod sestavljen iz besed, ločenih s poljubnim
// nepraznim zaporedjem presledkov, tabulatorjev in prelomov vrstice.
//

import java.util.*;

public class Besede {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> mnozica = new TreeSet<>();

        // preberi vse besede v množico
        while (sc.hasNext()) {
            String beseda = sc.next();
            mnozica.add(beseda);
        }

        // izpiši množico
        for (String beseda: mnozica) {
            System.out.println(beseda);
        }
    }
}
