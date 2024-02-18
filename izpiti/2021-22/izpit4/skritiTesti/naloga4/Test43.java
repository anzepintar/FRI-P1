
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        Character[] objekti = {
            '9', '7',
            'v', 'X',
            'z', 't',
            'J', 'L',
            '1', 'h',
            '3', 'w',
            'p', 'R',
            'c', '0',
            'g', 'G',
            'Z', 'H',
            'r', 'd',
            'm', 'u',
            'S', 'i',
            '5', 'E',
            'b', 'o',
            'k', 'n',
            'I', 'j',
            'T', 'a',
            'l', 'W',
            'x', 'M',
            'f', 'P',
            'C', 's',
            'Y', 'e',
            '2', 'F',
            '4', 'B',
            '6', 'A',
            'V', 'q',
            'K', 'U',
            'D', 'O',
            'N', '8',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        mnozica.add(objekti[14]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        mnozica.add(objekti[26]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
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
        mnozica.add(objekti[48]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[56]) > 0);
        System.out.println(prim.compare(objekti[55], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[17], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[36]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[24]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[37], objekti[24]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
    }
}
