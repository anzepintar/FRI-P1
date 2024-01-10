
//
// Primeri uporabe vmesnika Collection.
//

import java.util.*;

public class PrimeriCollection {

    public static void main(String[] args) {
        // ustvarimo zbirko ...
        Collection<Integer> zbirka = new HashSet<>();

        // ... vanjo dodamo nekaj elementov ...
        System.out.println("--- add/addAll ---");
        zbirka.add(10);
        zbirka.add(20);
        zbirka.addAll(List.of(30, 40, 50));

        // ... jo izpišemo ...
        System.out.println(zbirka);
        System.out.println();

        // ... iz nje odstranimo element ...
        System.out.println("--- remove ---");
        zbirka.remove(20);
        System.out.println(zbirka);
        System.out.println();

        // ... preverimo, ali vsebuje določene elemente ...
        System.out.println("--- contains/containsAll ---");
        System.out.println(zbirka.contains(20));
        System.out.println(zbirka.containsAll(Set.of(40, 10)));
        System.out.println();

        // ... iz nje odstranimo vse elemente razen določenih ...
        System.out.println("--- retainAll ---");
        zbirka.retainAll(List.of(30, 50, 60));
        System.out.println(zbirka);
        System.out.println(zbirka.size());
        System.out.println();

        // ... in se po njej še sprehodimo
        System.out.println("--- for-each ---");
        for (Integer element: zbirka) {
            System.out.println(element);
        }
    }
}
