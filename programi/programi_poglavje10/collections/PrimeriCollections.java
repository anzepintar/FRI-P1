
//
// Primeri uporabe vmesnika Collections.
//

import java.util.*;

public class PrimeriCollections {

    //
    // Razred za primerjalnik, ki podana niza primerja po dolžini.
    //
    private static class PrimerjalnikPoDolzini implements Comparator<String> {
        @Override
        public int compare(String prvi, String drugi) {
            return prvi.length() - drugi.length();
        }
    }

    public static void main(String[] args) {
        List<String> imena = new ArrayList<>(List.of(
            "Cvetka", "Danijel", "Janko", "Bernarda", "Ernest",
            "Hinko", "Anka", "Filip", "Iva", "Gabrijela"
        ));
        System.out.println(imena);
        System.out.println();

        // največji element glede na naravno urejenost
        System.out.println("--- max (naravno) ---");
        System.out.println(Collections.max(imena));
        System.out.println();

        // najmanjši element glede na podani primerjalnik
        System.out.println("--- min (primerjalnik) ---");
        System.out.println(Collections.min(imena, new PrimerjalnikPoDolzini()));
        System.out.println();

        // ureditev seznama glede na naravno urejenost
        System.out.println("--- sort ---");
        Collections.sort(imena);
        System.out.println(imena);
        System.out.println();

        // iskanje v urejenem seznamu
        System.out.println("--- binarySearch ---");
        System.out.println(Collections.binarySearch(imena, "Filip"));
        System.out.println(Collections.binarySearch(imena, "Irena"));
        System.out.println();

        // medsebojna zamenjava elementov
        System.out.println("--- swap ---");
        Collections.swap(imena, 1, 4);
        System.out.println(imena);
        System.out.println();

        // naključno mešanje
        System.out.println("--- shuffle ---");
        Collections.shuffle(imena, new Random(12345));
        System.out.println(imena);
        System.out.println();

        List<Integer> stevila = new ArrayList<>(List.of(50, 20, 40, 30, 20, 10, 50, 30, 20, 30));
        System.out.println(stevila);
        System.out.println();

        // število pojavitev
        System.out.println("--- frequency ---");
        System.out.println(Collections.frequency(stevila, 20));
        System.out.println();

        // indeks podseznama
        System.out.println("--- indexOfSubList ---");
        System.out.println(Collections.indexOfSubList(stevila, List.of(50, 30, 20)));
        System.out.println();

        // zamenjava vseh pojavitev elementa
        System.out.println("--- replaceAll ---");
        Collections.replaceAll(stevila, 30, -1);
        System.out.println(stevila);
        System.out.println();

        // true natanko tedaj, ko podani zbirki nimata skupnih elementov
        System.out.println("--- disjoint ---");
        System.out.println(Collections.disjoint(stevila, Set.of(3, 30, 300)));
        System.out.println();

        // zamenjava vseh elementov z istim elementom
        System.out.println("--- fill ---");
        Collections.fill(stevila, 42);
        System.out.println(stevila);
        System.out.println();

        // seznam, sestavljen iz podanega števila kopij podanega elementa
        System.out.println("--- nCopies ---");
        List<Character> polja = new ArrayList<>(Collections.nCopies(5, '_'));
        System.out.println(polja);
        System.out.println();
    }
}
