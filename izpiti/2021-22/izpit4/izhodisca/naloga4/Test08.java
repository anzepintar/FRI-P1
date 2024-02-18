
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Character[] objekti = {
            'b', 'r',
            'd', '6',
            'l', 'C',
            '9', 'N',
            'J', 'T',
            'g', 'm',
            'n', 'u',
            'X', 'D',
            'c', '5',
            'j', 'A',
            '0', 'P',
            'G', 'Y',
            'q', 'w',
            'S', 'W',
            'Q', '1',
            's', '8',
            'I', 'z',
            'v', 'K',
            't', 'R',
            'F', 'Z',
            'p', 'f',
            'M', 'y',
            'B', 'O',
            'h', '7',
            'o', 'a',
            '4', '3',
            '2', 'x',
            'L', 'E',
            'H', 'e',
            'i', 'V',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        mnozica.add(objekti[0]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        slovar.put(objekti[10], objekti[11]);
        slovar.put(objekti[12], objekti[13]);
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
        mnozica.add(objekti[32]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        mnozica.add(objekti[36]);
        slovar.put(objekti[38], objekti[39]);
        mnozica.add(objekti[38]);
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[46]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[5], objekti[24]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[25], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[3], objekti[50]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[19]) > 0);
    }
}
