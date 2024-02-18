
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Character[] objekti = {
            'e', 'y',
            'T', '6',
            '0', 'j',
            'F', 'O',
            'Q', 'f',
            '1', 'E',
            'm', 'i',
            'Z', 'z',
            '3', 'H',
            '2', 'C',
            'N', 'k',
            'u', 't',
            'S', 'b',
            'U', '7',
            'x', 'r',
            'X', 'M',
            'q', 'p',
            'o', 'g',
            'R', 'A',
            'V', 'W',
            'l', '8',
            'w', 'J',
            '5', 'a',
            'd', 'c',
            's', 'I',
            'P', 'L',
            'n', 'v',
            '4', 'K',
            'h', '9',
            'G', 'D',
        };

        Map<Character, Character> slovar = new HashMap<>();
        Set<Character> mnozica = new HashSet<>();

        slovar.put(objekti[0], objekti[1]);
        slovar.put(objekti[2], objekti[3]);
        mnozica.add(objekti[2]);
        slovar.put(objekti[4], objekti[5]);
        slovar.put(objekti[6], objekti[7]);
        mnozica.add(objekti[6]);
        slovar.put(objekti[8], objekti[9]);
        mnozica.add(objekti[8]);
        slovar.put(objekti[10], objekti[11]);
        mnozica.add(objekti[10]);
        slovar.put(objekti[12], objekti[13]);
        slovar.put(objekti[14], objekti[15]);
        slovar.put(objekti[16], objekti[17]);
        slovar.put(objekti[18], objekti[19]);
        mnozica.add(objekti[18]);
        slovar.put(objekti[20], objekti[21]);
        slovar.put(objekti[22], objekti[23]);
        mnozica.add(objekti[22]);
        slovar.put(objekti[24], objekti[25]);
        mnozica.add(objekti[24]);
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
        mnozica.add(objekti[44]);
        slovar.put(objekti[46], objekti[47]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        mnozica.add(objekti[54]);
        slovar.put(objekti[56], objekti[57]);
        mnozica.add(objekti[56]);
        slovar.put(objekti[58], objekti[59]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[23], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[56]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[30]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[53], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[11], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[58], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[44]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[8]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[14], objekti[15]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[13], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[35], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[6]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[18]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[9]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[23]) > 0);
        System.out.println(prim.compare(objekti[52], objekti[53]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[7]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
    }
}
