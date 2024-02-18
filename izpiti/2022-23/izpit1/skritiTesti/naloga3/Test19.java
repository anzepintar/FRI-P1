
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[1] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[2] = new Tretja.Tablica(new char[]{'F', 'A'}, 4312, true);
        tablice[3] = new Tretja.Tablica(new char[]{'W', 'B'}, 7221, true);
        tablice[4] = new Tretja.Tablica(new char[]{'T', 'M'}, 4361, false);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[6] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, true);
        tablice[7] = new Tretja.Tablica(new char[]{'K', 'J'}, 7426, true);
        tablice[8] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, true);
        tablice[9] = new Tretja.Tablica(new char[]{'D', 'Q'}, 4361, true);
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[11] = new Tretja.Tablica(new char[]{'J', 'U'}, 4361, true);
        tablice[12] = tablice[5];
        tablice[13] = new Tretja.Tablica(new char[]{'W', 'B'}, 7221, true);
        tablice[14] = new Tretja.Tablica(new char[]{'S', 'C'}, 9112, false);
        tablice[15] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[16] = new Tretja.Tablica(new char[]{'A', 'J'}, 7221, true);
        tablice[17] = new Tretja.Tablica(new char[]{'W', 'B'}, 1812, false);
        tablice[18] = tablice[12];
        tablice[19] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, true);
        tablice[20] = tablice[17];
        tablice[21] = new Tretja.Tablica(new char[]{'L', 'W'}, 2925, false);
        tablice[22] = tablice[16];
        tablice[23] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, false);
        tablice[24] = new Tretja.Tablica(new char[]{'W', 'B'}, 1812, true);
        tablice[25] = new Tretja.Tablica(new char[]{'B', 'A'}, 8923, false);
        tablice[26] = new Tretja.Tablica(new char[]{'W', 'B'}, 8891, false);
        tablice[27] = new Tretja.Tablica(new char[]{'O', 'Y'}, 2554, true);
        tablice[28] = new Tretja.Tablica(new char[]{'J', 'T'}, 1812, true);
        tablice[29] = new Tretja.Tablica(new char[]{'G', 'C'}, 6497, true);
        tablice[30] = new Tretja.Tablica(new char[]{'B', 'A'}, 8923, true);
        tablice[31] = new Tretja.Tablica(new char[]{'L', 'W'}, 2925, false);
        tablice[32] = new Tretja.Tablica(new char[]{'R', 'X'}, 6186, true);
        tablice[33] = new Tretja.Tablica(new char[]{'Q', 'S'}, 4312, false);
        tablice[34] = new Tretja.Tablica(new char[]{'Y', 'L'}, 8445, true);
        tablice[35] = new Tretja.Tablica(new char[]{'D', 'Y'}, 5333, true);
        tablice[36] = new Tretja.Tablica(new char[]{'T', 'M'}, 4361, true);
        tablice[37] = new Tretja.Tablica(new char[]{'W', 'B'}, 7221, true);
        tablice[38] = new Tretja.Tablica(new char[]{'S', 'A'}, 7471, true);
        tablice[39] = new Tretja.Tablica(new char[]{'W', 'B'}, 5778, true);
        tablice[40] = new Tretja.Tablica(new char[]{'R', 'X'}, 1798, false);
        tablice[41] = new Tretja.Tablica(new char[]{'D', 'E'}, 3834, false);
        tablice[42] = new Tretja.Tablica(new char[]{'B', 'A'}, 3423, true);
        tablice[43] = new Tretja.Tablica(new char[]{'D', 'E'}, 7337, false);
        tablice[44] = new Tretja.Tablica(new char[]{'T', 'M'}, 4361, false);
        tablice[45] = new Tretja.Tablica(new char[]{'A', 'J'}, 7221, false);
        tablice[46] = new Tretja.Tablica(new char[]{'A', 'J'}, 7686, false);
        tablice[47] = new Tretja.Tablica(new char[]{'S', 'C'}, 4219, true);
        tablice[48] = new Tretja.Tablica(new char[]{'F', 'L'}, 7512, true);
        tablice[49] = new Tretja.Tablica(new char[]{'W', 'B'}, 7426, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
