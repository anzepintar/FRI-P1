
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        Cas[] objekti = {
            new Cas(8, 33), new Cas(22, 58),
            new Cas(5, 50), new Cas(0, 20),
            new Cas(9, 58), new Cas(15, 4),
            new Cas(21, 24), new Cas(1, 37),
            new Cas(11, 35), new Cas(13, 21),
            new Cas(13, 20), new Cas(11, 45),
            new Cas(8, 16), new Cas(10, 43),
            new Cas(14, 50), new Cas(2, 6),
            new Cas(1, 50), new Cas(13, 29),
            new Cas(22, 31), new Cas(17, 31),
            new Cas(21, 22), new Cas(0, 16),
            new Cas(19, 18), new Cas(1, 46),
            new Cas(21, 51), new Cas(6, 55),
            new Cas(22, 15), new Cas(13, 17),
            new Cas(22, 5), new Cas(9, 39),
            new Cas(3, 44), new Cas(4, 48),
            new Cas(12, 32), new Cas(1, 32),
            new Cas(12, 3), new Cas(0, 42),
            new Cas(13, 25), new Cas(0, 4),
            new Cas(15, 30), new Cas(17, 35),
            new Cas(12, 31), new Cas(22, 25),
            new Cas(7, 31), new Cas(13, 3),
            new Cas(17, 46), new Cas(20, 52),
            new Cas(8, 31), new Cas(0, 2),
            new Cas(21, 32), new Cas(19, 45),
            new Cas(2, 16), new Cas(10, 49),
            new Cas(13, 59), new Cas(20, 48),
            new Cas(12, 34), new Cas(23, 28),
            new Cas(15, 37), new Cas(12, 57),
            new Cas(19, 43), new Cas(6, 58),
        };

        Map<Cas, Cas> slovar = new HashMap<>();
        Set<Cas> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
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
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
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
        mnozica.add(objekti[48]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Cas> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[37], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[31], objekti[42]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[49], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[53]) > 0);
    }
}
