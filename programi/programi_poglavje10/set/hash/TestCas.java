
//
// Množica tipa HashSet z elementi tipov CasBrezEH in CasEH.
//

import java.util.*;

public class TestCas {

    public static void main(String[] args) {
        Set<CasBrezEH> prva = new HashSet<>();
        CasBrezEH cbe = new CasBrezEH(15, 40);
        prva.add(cbe);
        prva.add(new CasBrezEH(15, 40));
        prva.add(cbe);
        prva.add(new CasBrezEH(15, 40));
        System.out.println(prva.size());
        System.out.println(prva);
        System.out.println();

        Set<CasEH> druga = new HashSet<>();
        CasEH ceh = new CasEH(15, 40);
        druga.add(ceh);
        druga.add(new CasEH(15, 40));
        druga.add(ceh);
        druga.add(new CasEH(15, 40));
        System.out.println(druga.size());
        System.out.println(druga);
    }
}
