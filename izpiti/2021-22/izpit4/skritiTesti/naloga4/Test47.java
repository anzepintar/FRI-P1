
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        String[] objekti = {
            "vHmHu0b8", "97nqkp6OUq",
            "693ssfEaysq", "vXBAfbMHQX4i",
            "6", "yA5s4P2a8M37R1P4im1",
            "AqipyHT3jPao6UC", "pOR5GsS",
            "ePCcl", "lM155GPR3XdlCx2",
            "zoJmvgrPBCoOcvzQm7", "38",
            "fqX", "T6qEgSS",
            "Lpx9dogVUv", "Zi7qf",
            "tCUMZZ6CglYTb244Jur", "13kEzJ9KRadC5Dk6Hx4",
            "2506VQmlZk6WDeQz15P", "LkvURakzprUf",
            "vgb0OmxHwqLHWFcNu", "S4arpSiHP",
            "o", "y3BGksf7nlpg6M",
            "OxrN", "ULQsdGLu3ID9BIF7",
            "XPLSuHC6GDgtBpsQQQ5Z", "vPxyct",
            "7HQ0", "IozICZwpE",
            "7mqyMM8Pd", "27ChcZZ46utvU1ZHNp7",
            "9JALFkLNmfN", "tdAz4SaAujNfq5Qqs",
            "JWbuuNvN2oJzZV8vq", "TOps4q6V5m71zwUH",
            "r", "ldc5xg6CZ5yyF",
            "Lp3jAfbyllssNY", "jpX",
            "R2ZRmi", "wOt",
            "c4Ms2mUvR5DWdqnqHxEr", "bBeLq0BRyhBloHwAkHzH",
            "e", "w4CjdrVTMnOyjbC6rL5",
            "TL0c3MScX0r", "OFvogbOwxt1dKCiwHu1",
            "fKEnbg", "eTQX",
            "x2PT0U", "EbcnUZ4qH",
            "6q", "bDf",
            "lGI0w", "8iYLVbwrffq5oUEdiPp5",
            "jdkfLWJ", "VWw2UoUSmKOad",
            "rB7gr", "FmhUETounbN1eL",
        };

        Map<String, String> slovar = new HashMap<>();
        Set<String> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
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
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<String> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[31], objekti[42]) > 0);
        System.out.println(prim.compare(objekti[55], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[31], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[29], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[28]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[17], objekti[54]) > 0);
    }
}
