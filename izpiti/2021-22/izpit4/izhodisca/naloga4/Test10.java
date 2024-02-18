
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(11, 25), new Cas(3, 58),
            new Cas(12, 47), new Cas(4, 2),
            new Cas(20, 35), new Cas(1, 35),
            new Cas(4, 55), new Cas(3, 4),
            new Cas(16, 13), new Cas(9, 28),
            new Cas(20, 27), new Cas(9, 18),
            new Cas(7, 21), new Cas(7, 17),
            new Cas(13, 33), new Cas(1, 13),
            new Cas(10, 39), new Cas(22, 47),
            new Cas(9, 11), new Cas(15, 40),
            new Cas(11, 29), new Cas(7, 9),
            new Cas(13, 20), new Cas(1, 10),
            new Cas(10, 50), new Cas(15, 10),
            new Cas(15, 59), new Cas(8, 29),
            new Cas(3, 2), new Cas(0, 30),
            new Cas(5, 53), new Cas(13, 18),
            new Cas(3, 3), new Cas(14, 50),
            new Cas(13, 1), new Cas(18, 34),
            new Cas(20, 3), new Cas(4, 43),
            new Cas(12, 28), new Cas(14, 29),
            new Cas(13, 9), new Cas(21, 50),
            new Cas(3, 38), new Cas(2, 26),
            new Cas(16, 20), new Cas(1, 4),
            new Cas(23, 55), new Cas(5, 40),
            new Cas(14, 34), new Cas(3, 1),
            new Cas(1, 1), new Cas(4, 25),
            new Cas(16, 57), new Cas(18, 26),
            new Cas(4, 52), new Cas(5, 26),
            new Cas(14, 55), new Cas(7, 20),
            new Cas(10, 49), new Cas(5, 2),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
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
        mnozica.add(objekti[24]);
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
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<Cas> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[23], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[42]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[34]) > 0);
    }
}
