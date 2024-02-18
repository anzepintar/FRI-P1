
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(19, 30), new Cas(14, 27),
            new Cas(7, 5), new Cas(6, 43),
            new Cas(11, 58), new Cas(0, 8),
            new Cas(0, 12), new Cas(3, 5),
            new Cas(17, 49), new Cas(2, 43),
            new Cas(19, 29), new Cas(15, 33),
            new Cas(23, 18), new Cas(2, 58),
            new Cas(20, 41), new Cas(19, 27),
            new Cas(18, 56), new Cas(4, 29),
            new Cas(14, 3), new Cas(21, 42),
            new Cas(3, 3), new Cas(3, 13),
            new Cas(1, 0), new Cas(18, 24),
            new Cas(15, 36), new Cas(22, 25),
            new Cas(6, 21), new Cas(11, 2),
            new Cas(8, 40), new Cas(8, 38),
            new Cas(7, 14), new Cas(7, 4),
            new Cas(13, 56), new Cas(4, 32),
            new Cas(14, 8), new Cas(6, 26),
            new Cas(16, 53), new Cas(19, 13),
            new Cas(2, 45), new Cas(15, 30),
            new Cas(0, 42), new Cas(12, 55),
            new Cas(18, 40), new Cas(6, 8),
            new Cas(10, 6), new Cas(5, 20),
            new Cas(7, 18), new Cas(5, 37),
            new Cas(18, 38), new Cas(3, 18),
            new Cas(18, 25), new Cas(0, 22),
            new Cas(12, 0), new Cas(3, 41),
            new Cas(5, 48), new Cas(1, 14),
            new Cas(18, 35), new Cas(16, 52),
            new Cas(9, 0), new Cas(15, 53),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        mnozica.add(objekti[16]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        mnozica.add(objekti[24]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        mnozica.add(objekti[48]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<Cas> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[49], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[28]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[22]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[49]) > 0);
    }
}
