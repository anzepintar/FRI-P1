
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        String[] objekti = {
            "vKlgk3T65xBheJ6w", "OVG5HevCzgA2z",
            "B4y0JO2UtN", "vTKArfCCEr",
            "fTq", "TzmRhwznhE2VEKrKg29",
            "Yy4BThzz", "BxLDIg",
            "vGG3wCWy7kkM7W", "3zM5B616RAXi",
            "mUASKs", "ycbD1JcdkzN",
            "eWNex6tl3v", "H34WUruuIQ5Wh",
            "JtC8xslaKC", "LNLjbmgj",
            "bO7fXfiK", "1PltJHV",
            "JzWURyyubMZIeD", "fAu7",
            "acX6P3iBdttQb", "RVYwQQbAZ4v033P8Qh",
            "WQq", "56Z23Sr1ldT2",
            "SvgJihJ0enP", "ZO",
            "H9TxAn", "P2t2h6f136B8v1dPZoi",
            "UAm6D5LWm8AN", "QLr6dO2M73A8k1tRbJ0",
            "kBt9kcNB", "ugk0EquuAHmr8nK8M4t",
            "oNCT", "S6j5GovIoZdh",
            "ZHLhBvhhsJDSJ3T", "AJ6ndhX",
            "qfYl6Sqxwsp3Neutylmd", "7yMc9b9Rr1Zta",
            "7XwZHQXqmN4fygnfd", "LJlxY8lF2",
            "fscykDiOeXH", "cQCKmYw1CPaIlys7inY",
            "8ZAtLRqatM", "2M7SE9Hk1GYX",
            "aIXt3sL9cHaFF", "8wcwen32HNP2SfGbrDcr",
            "qauBz8E", "LaeN5MlooVC3n",
            "noj4odW3z6s6Rhnb", "1Y8eYWi6fmuSR5swj",
            "B9an05PoFGs9nUpnx86q", "366EFHctYQsm",
            "ss", "NiNtFVcqw14PMgk",
            "Ksr2GheEYiuPtYrVm", "2VWn7Qk5NZZv",
            "4hDfv4pYqhR6fE48VGW", "lM",
            "uEEV4HlSTaqMNZNiWL5", "FxQP501MuCn1wwwl",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        mnozica.add(objekti[16]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[51], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[0]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[11]) > 0);
    }
}
