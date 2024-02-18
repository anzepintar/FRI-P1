
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        Character[] objekti = {
            'I', 'q',
            'Z', 'P',
            '3', '2',
            '9', 's',
            '8', 'a',
            'E', 'T',
            'Y', 'd',
            'e', 'G',
            'J', 'B',
            'D', 't',
            'j', 'h',
            'S', 'n',
            'H', 'c',
            'A', 'm',
            '0', 'C',
            '6', 'i',
            'N', 'o',
            '7', 'V',
            '1', 'W',
            'F', '4',
            'w', 'R',
            'z', 'x',
            'M', 'O',
            'l', 'u',
            'b', 'U',
            'f', 'K',
            'y', 'r',
            'Q', 'p',
            'k', 'g',
            'X', 'v',
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
        slovar.put(objekti[24], objekti[25]);
        mnozica.add(objekti[24]);
        slovar.put(objekti[26], objekti[27]);
        slovar.put(objekti[28], objekti[29]);
        slovar.put(objekti[30], objekti[31]);
        mnozica.add(objekti[30]);
        slovar.put(objekti[32], objekti[33]);
        slovar.put(objekti[34], objekti[35]);
        mnozica.add(objekti[34]);
        slovar.put(objekti[36], objekti[37]);
        slovar.put(objekti[38], objekti[39]);
        slovar.put(objekti[40], objekti[41]);
        slovar.put(objekti[42], objekti[43]);
        slovar.put(objekti[44], objekti[45]);
        slovar.put(objekti[46], objekti[47]);
        mnozica.add(objekti[46]);
        slovar.put(objekti[48], objekti[49]);
        slovar.put(objekti[50], objekti[51]);
        mnozica.add(objekti[50]);
        slovar.put(objekti[52], objekti[53]);
        slovar.put(objekti[54], objekti[55]);
        slovar.put(objekti[56], objekti[57]);
        slovar.put(objekti[58], objekti[59]);
        mnozica.add(objekti[58]);

        Comparator<Character> prim = Cetrta.primerjalnik(slovar, mnozica);

        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[16]) > 0);
        System.out.println(prim.compare(objekti[36], objekti[2]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[55]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[46], objekti[47]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[49]) > 0);
        System.out.println(prim.compare(objekti[0], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[50], objekti[51]) > 0);
        System.out.println(prim.compare(objekti[44], objekti[45]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[22]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[22], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[28], objekti[29]) > 0);
        System.out.println(prim.compare(objekti[34], objekti[10]) > 0);
        System.out.println(prim.compare(objekti[48], objekti[28]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[58]) > 0);
        System.out.println(prim.compare(objekti[47], objekti[3]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
        System.out.println(prim.compare(objekti[10], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[14]) > 0);
        System.out.println(prim.compare(objekti[30], objekti[31]) > 0);
        System.out.println(prim.compare(objekti[20], objekti[21]) > 0);
        System.out.println(prim.compare(objekti[40], objekti[41]) > 0);
        System.out.println(prim.compare(objekti[45], objekti[35]) > 0);
        System.out.println(prim.compare(objekti[9], objekti[52]) > 0);
        System.out.println(prim.compare(objekti[6], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[43], objekti[34]) > 0);
        System.out.println(prim.compare(objekti[33], objekti[17]) > 0);
        System.out.println(prim.compare(objekti[4], objekti[5]) > 0);
        System.out.println(prim.compare(objekti[8], objekti[54]) > 0);
        System.out.println(prim.compare(objekti[56], objekti[57]) > 0);
        System.out.println(prim.compare(objekti[26], objekti[27]) > 0);
        System.out.println(prim.compare(objekti[38], objekti[39]) > 0);
        System.out.println(prim.compare(objekti[59], objekti[11]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[32]) > 0);
        System.out.println(prim.compare(objekti[16], objekti[19]) > 0);
        System.out.println(prim.compare(objekti[32], objekti[33]) > 0);
        System.out.println(prim.compare(objekti[41], objekti[59]) > 0);
        System.out.println(prim.compare(objekti[7], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[54], objekti[1]) > 0);
        System.out.println(prim.compare(objekti[39], objekti[26]) > 0);
        System.out.println(prim.compare(objekti[24], objekti[25]) > 0);
        System.out.println(prim.compare(objekti[18], objekti[20]) > 0);
        System.out.println(prim.compare(objekti[42], objekti[43]) > 0);
        System.out.println(prim.compare(objekti[12], objekti[13]) > 0);
    }
}
