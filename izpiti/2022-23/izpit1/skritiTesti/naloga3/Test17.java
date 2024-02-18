
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, true);
        tablice[1] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, true);
        tablice[2] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9716, true);
        tablice[3] = new Tretja.Tablica(new char[]{'W', 'T'}, 9467, true);
        tablice[4] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, true);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'P'}, 9467, false);
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'P'}, 4963, true);
        tablice[7] = new Tretja.Tablica(new char[]{'X', 'G'}, 9833, false);
        tablice[8] = new Tretja.Tablica(new char[]{'W', 'T'}, 9656, true);
        tablice[9] = new Tretja.Tablica(new char[]{'W', 'T'}, 9467, true);
        tablice[10] = new Tretja.Tablica(new char[]{'Q', 'W'}, 4446, true);
        tablice[11] = tablice[3];
        tablice[12] = tablice[9];
        tablice[13] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, false);
        tablice[14] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, true);
        tablice[15] = new Tretja.Tablica(new char[]{'C', 'V'}, 9467, false);
        tablice[16] = new Tretja.Tablica(new char[]{'O', 'A'}, 6842, false);
        tablice[17] = new Tretja.Tablica(new char[]{'Q', 'K'}, 8686, false);
        tablice[18] = new Tretja.Tablica(new char[]{'X', 'G'}, 6644, true);
        tablice[19] = new Tretja.Tablica(new char[]{'W', 'T'}, 2682, true);
        tablice[20] = new Tretja.Tablica(new char[]{'X', 'G'}, 1387, true);
        tablice[21] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, false);
        tablice[22] = new Tretja.Tablica(new char[]{'Q', 'W'}, 7885, false);
        tablice[23] = new Tretja.Tablica(new char[]{'N', 'P'}, 4963, true);
        tablice[24] = new Tretja.Tablica(new char[]{'N', 'P'}, 4963, true);
        tablice[25] = tablice[22];
        tablice[26] = new Tretja.Tablica(new char[]{'A', 'C'}, 3696, false);
        tablice[27] = tablice[5];
        tablice[28] = new Tretja.Tablica(new char[]{'H', 'O'}, 9467, true);
        tablice[29] = new Tretja.Tablica(new char[]{'A', 'C'}, 3696, false);
        tablice[30] = new Tretja.Tablica(new char[]{'O', 'A'}, 2853, true);
        tablice[31] = new Tretja.Tablica(new char[]{'O', 'A'}, 6842, true);
        tablice[32] = tablice[25];
        tablice[33] = new Tretja.Tablica(new char[]{'W', 'T'}, 9467, true);
        tablice[34] = new Tretja.Tablica(new char[]{'G', 'X'}, 1868, true);
        tablice[35] = new Tretja.Tablica(new char[]{'Q', 'W'}, 4446, false);
        tablice[36] = new Tretja.Tablica(new char[]{'W', 'T'}, 9656, true);
        tablice[37] = new Tretja.Tablica(new char[]{'X', 'G'}, 1387, true);
        tablice[38] = tablice[29];
        tablice[39] = new Tretja.Tablica(new char[]{'W', 'T'}, 9656, false);
        tablice[40] = new Tretja.Tablica(new char[]{'N', 'P'}, 4963, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, false);
        tablice[42] = new Tretja.Tablica(new char[]{'W', 'T'}, 9656, true);
        tablice[43] = tablice[31];
        tablice[44] = new Tretja.Tablica(new char[]{'W', 'T'}, 9467, true);
        tablice[45] = new Tretja.Tablica(new char[]{'Q', 'W'}, 9467, true);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'X'}, 9467, true);
        tablice[47] = new Tretja.Tablica(new char[]{'G', 'X'}, 1868, false);
        tablice[48] = new Tretja.Tablica(new char[]{'S', 'X'}, 9467, true);
        tablice[49] = new Tretja.Tablica(new char[]{'O', 'A'}, 8321, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
