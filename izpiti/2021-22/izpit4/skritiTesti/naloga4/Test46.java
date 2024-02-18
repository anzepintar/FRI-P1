
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        Character[] objekti = {
            'h', 'v',
            'p', 'm',
            '3', 'M',
            't', '6',
            'A', 'g',
            'Q', 'C',
            'O', 'F',
            'J', 'r',
            'a', 'U',
            'X', 'u',
            'W', 'R',
            'b', 'I',
            'l', '5',
            'B', 'n',
            'V', '1',
            '0', 'j',
            'y', '4',
            'w', 'f',
            'T', 'o',
            'H', '7',
            'L', 'G',
            'N', 'd',
            'S', 'k',
            '9', 'x',
            'E', 'P',
            'i', 's',
            'z', 'e',
            '2', 'D',
            'Y', 'Z',
            '8', 'c',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        mnozica.add(objekti[4]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        mnozica.add(objekti[12]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        mnozica.add(objekti[20]);
        slovar.put(objekti[22], objekti[23]);
        slovar.put(objekti[24], objekti[25]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        mnozica.add(objekti[28]);
        slovar.put(objekti[30], objekti[31]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        slovar.put(objekti[36], objekti[37]);
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
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[24], objekti[28]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[22]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[1], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[29], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[48]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[22]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[37]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
    }
}
