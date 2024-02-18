
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Q', 'A'}, 7995, false);
        tablice[1] = new Tretja.Tablica(new char[]{'Q', 'A'}, 6558, false);
        tablice[2] = new Tretja.Tablica(new char[]{'O', 'K'}, 7995, true);
        tablice[3] = new Tretja.Tablica(new char[]{'Q', 'A'}, 7995, true);
        tablice[4] = new Tretja.Tablica(new char[]{'Q', 'A'}, 7995, true);
        tablice[5] = new Tretja.Tablica(new char[]{'G', 'F'}, 7995, true);
        tablice[6] = tablice[4];
        tablice[7] = tablice[5];
        tablice[8] = tablice[2];
        tablice[9] = new Tretja.Tablica(new char[]{'Q', 'A'}, 7995, true);
        tablice[10] = new Tretja.Tablica(new char[]{'T', 'S'}, 5411, true);
        tablice[11] = new Tretja.Tablica(new char[]{'T', 'S'}, 5411, false);
        tablice[12] = new Tretja.Tablica(new char[]{'O', 'Z'}, 7995, false);
        tablice[13] = new Tretja.Tablica(new char[]{'O', 'K'}, 6557, false);
        tablice[14] = new Tretja.Tablica(new char[]{'R', 'Y'}, 7995, false);
        tablice[15] = new Tretja.Tablica(new char[]{'O', 'Z'}, 7995, true);
        tablice[16] = new Tretja.Tablica(new char[]{'P', 'W'}, 7995, false);
        tablice[17] = new Tretja.Tablica(new char[]{'O', 'K'}, 7995, false);
        tablice[18] = new Tretja.Tablica(new char[]{'O', 'Z'}, 7995, false);
        tablice[19] = new Tretja.Tablica(new char[]{'O', 'K'}, 6557, true);
        tablice[20] = new Tretja.Tablica(new char[]{'O', 'Z'}, 7995, true);
        tablice[21] = tablice[12];
        tablice[22] = new Tretja.Tablica(new char[]{'Q', 'A'}, 7995, true);
        tablice[23] = new Tretja.Tablica(new char[]{'Q', 'X'}, 3228, true);
        tablice[24] = tablice[12];
        tablice[25] = tablice[9];
        tablice[26] = tablice[4];
        tablice[27] = new Tretja.Tablica(new char[]{'O', 'K'}, 6557, true);
        tablice[28] = tablice[6];
        tablice[29] = new Tretja.Tablica(new char[]{'T', 'G'}, 6724, true);
        tablice[30] = new Tretja.Tablica(new char[]{'J', 'M'}, 7995, true);
        tablice[31] = new Tretja.Tablica(new char[]{'C', 'V'}, 7581, true);
        tablice[32] = tablice[15];
        tablice[33] = new Tretja.Tablica(new char[]{'R', 'A'}, 7995, true);
        tablice[34] = new Tretja.Tablica(new char[]{'O', 'K'}, 7995, true);
        tablice[35] = new Tretja.Tablica(new char[]{'B', 'E'}, 7882, true);
        tablice[36] = new Tretja.Tablica(new char[]{'J', 'M'}, 7995, true);
        tablice[37] = new Tretja.Tablica(new char[]{'O', 'K'}, 7995, true);
        tablice[38] = new Tretja.Tablica(new char[]{'V', 'N'}, 7995, true);
        tablice[39] = new Tretja.Tablica(new char[]{'A', 'M'}, 8437, false);
        tablice[40] = new Tretja.Tablica(new char[]{'Q', 'B'}, 7995, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Q', 'A'}, 6596, true);
        tablice[42] = new Tretja.Tablica(new char[]{'O', 'Z'}, 2562, false);
        tablice[43] = new Tretja.Tablica(new char[]{'Q', 'B'}, 7995, true);
        tablice[44] = new Tretja.Tablica(new char[]{'O', 'Z'}, 7639, false);
        tablice[45] = new Tretja.Tablica(new char[]{'R', 'X'}, 5729, true);
        tablice[46] = tablice[19];
        tablice[47] = new Tretja.Tablica(new char[]{'P', 'N'}, 6557, true);
        tablice[48] = new Tretja.Tablica(new char[]{'O', 'K'}, 7995, false);
        tablice[49] = new Tretja.Tablica(new char[]{'T', 'S'}, 5716, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
