
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(22, 2), new Cas(1, 14),
            new Cas(15, 37), new Cas(0, 45),
            new Cas(5, 13), new Cas(16, 24),
            new Cas(12, 32), new Cas(11, 41),
            new Cas(22, 18), new Cas(14, 10),
            new Cas(23, 40), new Cas(4, 55),
            new Cas(17, 13), new Cas(19, 39),
            new Cas(23, 28), new Cas(1, 24),
            new Cas(10, 59), new Cas(15, 7),
            new Cas(17, 53), new Cas(6, 18),
            new Cas(6, 46), new Cas(22, 16),
            new Cas(9, 16), new Cas(23, 12),
            new Cas(19, 54), new Cas(13, 40),
            new Cas(0, 4), new Cas(3, 0),
            new Cas(22, 34), new Cas(6, 8),
            new Cas(15, 9), new Cas(4, 38),
            new Cas(8, 55), new Cas(5, 47),
            new Cas(11, 27), new Cas(16, 57),
            new Cas(21, 22), new Cas(21, 48),
            new Cas(9, 41), new Cas(21, 42),
            new Cas(5, 3), new Cas(20, 8),
            new Cas(19, 18), new Cas(16, 1),
            new Cas(23, 42), new Cas(18, 37),
            new Cas(18, 48), new Cas(19, 43),
            new Cas(17, 39), new Cas(23, 5),
            new Cas(21, 2), new Cas(15, 11),
            new Cas(15, 46), new Cas(9, 52),
            new Cas(22, 32), new Cas(21, 6),
            new Cas(8, 14), new Cas(17, 43),
            new Cas(12, 38), new Cas(2, 17),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
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
        mnozica.add(objekti[24]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
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
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Cas> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[55], objekti[44]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[51], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[17], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[17], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[46]) > 0);
    }
}
