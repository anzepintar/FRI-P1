
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(5, 35), new Cas(6, 34),
            new Cas(19, 12), new Cas(18, 14),
            new Cas(21, 35), new Cas(17, 36),
            new Cas(19, 8), new Cas(1, 28),
            new Cas(23, 7), new Cas(14, 53),
            new Cas(18, 58), new Cas(2, 17),
            new Cas(22, 51), new Cas(6, 20),
            new Cas(8, 31), new Cas(22, 4),
            new Cas(10, 36), new Cas(9, 3),
            new Cas(3, 49), new Cas(14, 46),
            new Cas(0, 16), new Cas(1, 24),
            new Cas(11, 1), new Cas(14, 59),
            new Cas(23, 20), new Cas(14, 43),
            new Cas(15, 49), new Cas(6, 2),
            new Cas(0, 46), new Cas(9, 25),
            new Cas(4, 0), new Cas(11, 58),
            new Cas(4, 33), new Cas(22, 41),
            new Cas(18, 25), new Cas(3, 46),
            new Cas(15, 11), new Cas(4, 36),
            new Cas(5, 10), new Cas(3, 40),
            new Cas(3, 53), new Cas(6, 15),
            new Cas(13, 33), new Cas(11, 28),
            new Cas(0, 1), new Cas(2, 37),
            new Cas(0, 22), new Cas(19, 50),
            new Cas(4, 14), new Cas(4, 56),
            new Cas(18, 5), new Cas(20, 7),
            new Cas(19, 35), new Cas(0, 0),
            new Cas(9, 22), new Cas(2, 36),
            new Cas(17, 20), new Cas(1, 6),
            new Cas(23, 41), new Cas(8, 9),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        mnozica.add(objekti[24]);
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
        mnozica.add(objekti[42]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Cas> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[16]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[29], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[42]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
    }
}
