
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[1] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[2] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, true);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[5] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[6] = new Tretja.Tablica(new char[]{'R', 'J'}, 4165, false);
        tablice[7] = new Tretja.Tablica(new char[]{'L', 'H'}, 4165, false);
        tablice[8] = new Tretja.Tablica(new char[]{'C', 'G'}, 2216, true);
        tablice[9] = new Tretja.Tablica(new char[]{'N', 'D'}, 1616, false);
        tablice[10] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[11] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[12] = new Tretja.Tablica(new char[]{'L', 'H'}, 4165, true);
        tablice[13] = new Tretja.Tablica(new char[]{'X', 'N'}, 4165, false);
        tablice[14] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, true);
        tablice[15] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[16] = new Tretja.Tablica(new char[]{'A', 'J'}, 4165, false);
        tablice[17] = new Tretja.Tablica(new char[]{'N', 'D'}, 1692, true);
        tablice[18] = tablice[13];
        tablice[19] = new Tretja.Tablica(new char[]{'N', 'D'}, 1692, true);
        tablice[20] = tablice[8];
        tablice[21] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[22] = new Tretja.Tablica(new char[]{'A', 'X'}, 4165, true);
        tablice[23] = new Tretja.Tablica(new char[]{'I', 'Y'}, 2639, true);
        tablice[24] = new Tretja.Tablica(new char[]{'Y', 'H'}, 4165, true);
        tablice[25] = new Tretja.Tablica(new char[]{'N', 'D'}, 6193, false);
        tablice[26] = new Tretja.Tablica(new char[]{'L', 'H'}, 7762, false);
        tablice[27] = new Tretja.Tablica(new char[]{'N', 'D'}, 1692, true);
        tablice[28] = new Tretja.Tablica(new char[]{'S', 'Z'}, 1539, false);
        tablice[29] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[30] = tablice[20];
        tablice[31] = new Tretja.Tablica(new char[]{'I', 'Y'}, 2639, false);
        tablice[32] = tablice[2];
        tablice[33] = tablice[18];
        tablice[34] = new Tretja.Tablica(new char[]{'S', 'Z'}, 5833, false);
        tablice[35] = new Tretja.Tablica(new char[]{'M', 'S'}, 4165, true);
        tablice[36] = new Tretja.Tablica(new char[]{'O', 'K'}, 1616, true);
        tablice[37] = new Tretja.Tablica(new char[]{'N', 'D'}, 4234, false);
        tablice[38] = new Tretja.Tablica(new char[]{'C', 'G'}, 2216, false);
        tablice[39] = new Tretja.Tablica(new char[]{'L', 'H'}, 8666, false);
        tablice[40] = new Tretja.Tablica(new char[]{'L', 'H'}, 3565, false);
        tablice[41] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, true);
        tablice[42] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, false);
        tablice[43] = tablice[35];
        tablice[44] = new Tretja.Tablica(new char[]{'A', 'J'}, 8145, false);
        tablice[45] = new Tretja.Tablica(new char[]{'Q', 'O'}, 4887, false);
        tablice[46] = tablice[26];
        tablice[47] = new Tretja.Tablica(new char[]{'X', 'N'}, 4165, false);
        tablice[48] = new Tretja.Tablica(new char[]{'S', 'Z'}, 4165, true);
        tablice[49] = tablice[40];

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
