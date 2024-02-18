
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        Character[] objekti = {
            'H', 'w',
            'R', 'v',
            '9', 's',
            'O', 'a',
            'c', 'L',
            'k', 'E',
            'q', 'n',
            'V', 'e',
            'b', '5',
            'C', '1',
            'Q', '2',
            'Z', 'z',
            'p', 'B',
            'Y', 'y',
            '0', 'u',
            'g', 'K',
            'D', '7',
            't', 'P',
            'f', '3',
            'r', 'J',
            'G', 'X',
            'S', '6',
            'M', '8',
            'i', 'F',
            'j', 'x',
            'I', 'T',
            'N', 'U',
            'd', 'A',
            'o', 'l',
            '4', 'm',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        mnozica.add(objekti[16]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
        slovar.put(objekti[38], objekti[39]);
        slovar.put(objekti[40], objekti[41]);
        mnozica.add(objekti[40]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
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

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[21], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[4]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[10]) > 0);
    }
}
