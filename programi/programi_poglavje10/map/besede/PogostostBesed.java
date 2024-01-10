
//
// Program izpiše vse besede, ki vsaj po enkrat nastopajo na vhodu.  Za vsako
// besedo izpiše še število njenih pojavitev.
//

import java.util.*;

public class PogostostBesed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> slovar = new TreeMap<>();

        // beri besede in jih dodajaj v slovar
        while (sc.hasNext()) {
            String beseda = sc.next();
            int pogostost = slovar.containsKey(beseda) ? slovar.get(beseda) : 0;
            slovar.put(beseda, pogostost + 1);
        }

        // izpiši besede (ključe) in njihove pogostosti (vrednosti)
        for (String beseda: slovar.keySet()) {
            System.out.printf("%s: %d%n", beseda, slovar.get(beseda));
        }
    }
}
