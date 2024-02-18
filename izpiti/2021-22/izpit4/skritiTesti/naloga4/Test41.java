
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        String[] objekti = {
            "f611rFCl2LQ0u", "S0z0DNFfY9FYw3b",
            "7JDEc5Zn6ho9", "X8fua2yZW",
            "8ylUAp", "77VXOSmQ",
            "cS", "ibrFN",
            "h2iT8T", "avH2j1r5",
            "d", "5rgmT5wFtlTaH",
            "h", "MFpFWPiunicRvel",
            "d87L0", "YZayOjxbxXyIMTNAl",
            "Yob9kufyJqkg2qO7d", "faZiSbDtkSZs8lL1o8s7",
            "vWTJSOKTnBM7JX", "KdXidWgeSL",
            "GM", "jajtPkZs",
            "IaN", "dD4qu2d",
            "AEbPXdnwpbr2lvP", "iJPPXNv",
            "mlWWgKXo0", "yoHPnx",
            "GLLoZV", "zyOyP707hQr",
            "bB6ESk2lCmXB", "P0X1SYyKlIOiRzdwf",
            "s", "F0OMWpUTciBOplu6",
            "39b5CRGvYE8KGnb", "EUflcFWt",
            "4O7OqVFG0vwA11", "eouCk8F5neomNStiQ",
            "U", "8",
            "G", "47TuRAmspiX3edqe",
            "Zhs", "SBJKPZg1LNF16LuD",
            "toNwVM6mc8NZRbD", "3CWajp7stJ",
            "FE8DRm97HtivY", "A9SNoyB85iRlXA",
            "DVJwZe1tNS", "i35ASGnoI3U",
            "7jnOk9YFuxlqOE4Bwl", "OTR3bk",
            "RhLENz2L3mUwObkRzMu", "XwHV3Rq9TAJyxQXvVx",
            "nbXLW5V", "ZQD",
            "8fHMUypbmPU3rDzFhpt", "cz1B",
            "LyG", "Jhr8vGuDEpL",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        mnozica.add(objekti[42]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[27], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[57], objekti[44]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[55]) > 0);
    }
}
