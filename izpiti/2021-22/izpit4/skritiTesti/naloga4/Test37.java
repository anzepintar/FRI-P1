
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        Character[] objekti = {
            'Y', 'f',
            's', '3',
            '8', 'z',
            'i', 'J',
            '5', 'G',
            'l', 'X',
            'b', 'a',
            'N', 'x',
            'k', 'I',
            'v', '6',
            'T', 'D',
            'A', '1',
            'M', 'O',
            'e', 'n',
            '7', 'U',
            'K', 'h',
            'B', 'Z',
            'g', 'w',
            'j', 'V',
            'Q', 'C',
            '9', 'o',
            'c', 'H',
            'W', 'u',
            'r', 'p',
            'd', 'E',
            'P', '4',
            'S', 'q',
            'L', 'F',
            't', 'R',
            'y', '2',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
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
        slovar.put(objekti[22], objekti[23]);
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
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        slovar.put(objekti[52], objekti[53]);
        mnozica.add(objekti[52]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[44]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[21], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[40]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[2], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[19], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[15], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[12]) > 0);
        System.out.println(prim.compare(objekti[49], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[27], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[38]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[26]) > 0);
    }
}
