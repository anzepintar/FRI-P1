
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(0, 35), new Cas(6, 25),
            new Cas(2, 41), new Cas(18, 3),
            new Cas(14, 49), new Cas(18, 5),
            new Cas(6, 17), new Cas(12, 32),
            new Cas(21, 41), new Cas(16, 5),
            new Cas(2, 30), new Cas(13, 56),
            new Cas(2, 0), new Cas(21, 8),
            new Cas(3, 55), new Cas(16, 54),
            new Cas(6, 16), new Cas(11, 19),
            new Cas(10, 36), new Cas(15, 37),
            new Cas(2, 28), new Cas(15, 42),
            new Cas(10, 18), new Cas(4, 13),
            new Cas(1, 53), new Cas(15, 30),
            new Cas(10, 5), new Cas(5, 18),
            new Cas(19, 35), new Cas(6, 8),
            new Cas(7, 49), new Cas(23, 29),
            new Cas(5, 6), new Cas(21, 1),
            new Cas(0, 3), new Cas(12, 52),
            new Cas(10, 58), new Cas(14, 10),
            new Cas(17, 18), new Cas(5, 2),
            new Cas(14, 34), new Cas(14, 28),
            new Cas(5, 15), new Cas(13, 36),
            new Cas(16, 24), new Cas(3, 17),
            new Cas(12, 11), new Cas(18, 38),
            new Cas(3, 19), new Cas(7, 31),
            new Cas(23, 32), new Cas(1, 58),
            new Cas(2, 15), new Cas(22, 56),
            new Cas(15, 28), new Cas(12, 3),
            new Cas(16, 38), new Cas(6, 21),
            new Cas(6, 28), new Cas(22, 43),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        mnozica.add(objekti[16]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
        slovar.put(objekti[38], objekti[39]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        mnozica.add(objekti[42]);
        slovar.put(objekti[44], objekti[45]);
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

        System.out.println(prim.compare(objekti[51], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[31], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[22]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[16]) > 0);
        System.out.println(prim.compare(objekti[57], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
    }
}
