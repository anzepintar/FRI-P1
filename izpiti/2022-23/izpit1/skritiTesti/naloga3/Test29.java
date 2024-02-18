
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'E', 'B'}, 1377, false);
        tablice[1] = new Tretja.Tablica(new char[]{'E', 'B'}, 1377, true);
        tablice[2] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, false);
        tablice[3] = tablice[2];
        tablice[4] = new Tretja.Tablica(new char[]{'T', 'Q'}, 3136, false);
        tablice[5] = tablice[1];
        tablice[6] = new Tretja.Tablica(new char[]{'S', 'B'}, 9264, false);
        tablice[7] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[8] = new Tretja.Tablica(new char[]{'K', 'M'}, 3565, true);
        tablice[9] = new Tretja.Tablica(new char[]{'E', 'B'}, 1377, false);
        tablice[10] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, true);
        tablice[11] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[12] = new Tretja.Tablica(new char[]{'H', 'V'}, 1224, false);
        tablice[13] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, true);
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'B'}, 4847, true);
        tablice[15] = tablice[6];
        tablice[16] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, true);
        tablice[17] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, true);
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'X'}, 1224, true);
        tablice[19] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[20] = new Tretja.Tablica(new char[]{'W', 'U'}, 2386, false);
        tablice[21] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[22] = tablice[8];
        tablice[23] = new Tretja.Tablica(new char[]{'K', 'M'}, 3565, true);
        tablice[24] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, true);
        tablice[25] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[26] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, true);
        tablice[27] = new Tretja.Tablica(new char[]{'J', 'H'}, 4973, false);
        tablice[28] = new Tretja.Tablica(new char[]{'J', 'H'}, 2198, false);
        tablice[29] = new Tretja.Tablica(new char[]{'S', 'B'}, 6462, false);
        tablice[30] = new Tretja.Tablica(new char[]{'Q', 'K'}, 1224, true);
        tablice[31] = new Tretja.Tablica(new char[]{'T', 'M'}, 8535, true);
        tablice[32] = tablice[22];
        tablice[33] = tablice[19];
        tablice[34] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, false);
        tablice[35] = new Tretja.Tablica(new char[]{'Q', 'K'}, 1224, true);
        tablice[36] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, true);
        tablice[37] = new Tretja.Tablica(new char[]{'G', 'X'}, 9254, true);
        tablice[38] = new Tretja.Tablica(new char[]{'J', 'X'}, 7845, false);
        tablice[39] = new Tretja.Tablica(new char[]{'B', 'E'}, 1224, true);
        tablice[40] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, true);
        tablice[41] = new Tretja.Tablica(new char[]{'B', 'V'}, 1377, true);
        tablice[42] = tablice[5];
        tablice[43] = new Tretja.Tablica(new char[]{'K', 'M'}, 3565, true);
        tablice[44] = tablice[37];
        tablice[45] = tablice[11];
        tablice[46] = new Tretja.Tablica(new char[]{'E', 'B'}, 1377, false);
        tablice[47] = new Tretja.Tablica(new char[]{'T', 'Q'}, 1726, false);
        tablice[48] = new Tretja.Tablica(new char[]{'Z', 'T'}, 4277, false);
        tablice[49] = new Tretja.Tablica(new char[]{'I', 'N'}, 1619, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
