
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        String[] objekti = {
            "Vl", "hgQo8NdASngkkQqd",
            "rxHsc1D71cv6", "oA",
            "QJrR", "UoRMN9G6l",
            "qsoeaTGPI8ckydHTI", "0BCtMjQ4ds",
            "ieYoW", "2pHUWzNTSgqBYxWC",
            "r", "QJUQ4d4h44vEr80JO",
            "2TiRO", "YNnmjJwj7D5",
            "iA0fnBKUaKQU7ZubmA", "YLNUC",
            "1pxFNBqhX5YU", "mdrFIJU",
            "PR", "Qu8Fx8hphx4PJE7",
            "tLhMt", "bHZ3QEB",
            "mdYiUvlzVvtO54I1Je", "RHzLXHyROwOetdMo",
            "JCoRe", "lslYf",
            "eWNsBRH2aStpaw", "fQmllvWuhj3",
            "SnDRTR", "4tiN",
            "O4g", "D9EbkUrqVyqE",
            "No63rU", "OzZEEnAAgn",
            "xViye8X8USqgIk6tNruO", "a82pWoypLgqEZ",
            "5L0DzdIZLC", "79nl5nJIab0x7CjlM",
            "Bf5Lo", "vngiJCrYS4",
            "xyENwR5fOHl7yY1hw0", "4Qmr",
            "WAiQ19PwvFJXqo9", "FbPWK",
            "ZZtH", "ibrbuaf",
            "Mxw2k", "L4",
            "8aJFxFfyoR2Fkd", "2pGwhqg49",
            "4kC7YdYKp1GsfR6", "Bz1oouggh",
            "7bp", "quIJ9jVbK23",
            "xbd0z0", "dLo3TrnUBO",
            "yOgDI1BIUMStu4f", "JiBi6zE",
            "VLPgxrleN6v", "c7WZYnnvAUn54y",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        mnozica.add(objekti[42]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[55], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[57], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[57], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[51], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[42]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[3]) > 0);
    }
}
