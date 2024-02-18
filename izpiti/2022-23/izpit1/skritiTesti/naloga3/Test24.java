
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, false);
        tablice[1] = new Tretja.Tablica(new char[]{'I', 'V'}, 5475, true);
        tablice[2] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, true);
        tablice[3] = new Tretja.Tablica(new char[]{'T', 'K'}, 8123, true);
        tablice[4] = new Tretja.Tablica(new char[]{'A', 'K'}, 5717, true);
        tablice[5] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, true);
        tablice[6] = new Tretja.Tablica(new char[]{'T', 'N'}, 5717, true);
        tablice[7] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, false);
        tablice[8] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2193, true);
        tablice[9] = new Tretja.Tablica(new char[]{'I', 'V'}, 7213, false);
        tablice[10] = new Tretja.Tablica(new char[]{'N', 'D'}, 7241, false);
        tablice[11] = tablice[7];
        tablice[12] = new Tretja.Tablica(new char[]{'E', 'X'}, 8883, true);
        tablice[13] = new Tretja.Tablica(new char[]{'J', 'A'}, 8159, true);
        tablice[14] = new Tretja.Tablica(new char[]{'D', 'G'}, 1572, true);
        tablice[15] = new Tretja.Tablica(new char[]{'E', 'X'}, 4131, true);
        tablice[16] = new Tretja.Tablica(new char[]{'F', 'F'}, 4939, false);
        tablice[17] = new Tretja.Tablica(new char[]{'I', 'V'}, 8591, true);
        tablice[18] = new Tretja.Tablica(new char[]{'P', 'L'}, 7241, false);
        tablice[19] = new Tretja.Tablica(new char[]{'F', 'F'}, 8123, false);
        tablice[20] = new Tretja.Tablica(new char[]{'I', 'V'}, 8591, true);
        tablice[21] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, false);
        tablice[22] = new Tretja.Tablica(new char[]{'O', 'P'}, 7577, true);
        tablice[23] = tablice[14];
        tablice[24] = new Tretja.Tablica(new char[]{'I', 'V'}, 6825, true);
        tablice[25] = new Tretja.Tablica(new char[]{'M', 'D'}, 8766, true);
        tablice[26] = new Tretja.Tablica(new char[]{'I', 'V'}, 4662, true);
        tablice[27] = new Tretja.Tablica(new char[]{'I', 'V'}, 4662, false);
        tablice[28] = tablice[25];
        tablice[29] = new Tretja.Tablica(new char[]{'M', 'D'}, 7729, false);
        tablice[30] = tablice[3];
        tablice[31] = new Tretja.Tablica(new char[]{'I', 'V'}, 5717, false);
        tablice[32] = new Tretja.Tablica(new char[]{'K', 'M'}, 7426, true);
        tablice[33] = new Tretja.Tablica(new char[]{'I', 'V'}, 2481, true);
        tablice[34] = new Tretja.Tablica(new char[]{'I', 'V'}, 8531, true);
        tablice[35] = new Tretja.Tablica(new char[]{'M', 'D'}, 8766, false);
        tablice[36] = new Tretja.Tablica(new char[]{'Q', 'L'}, 8761, true);
        tablice[37] = new Tretja.Tablica(new char[]{'E', 'X'}, 4131, false);
        tablice[38] = new Tretja.Tablica(new char[]{'B', 'Q'}, 3422, true);
        tablice[39] = new Tretja.Tablica(new char[]{'B', 'Q'}, 3422, false);
        tablice[40] = new Tretja.Tablica(new char[]{'J', 'A'}, 8159, false);
        tablice[41] = new Tretja.Tablica(new char[]{'M', 'E'}, 4522, false);
        tablice[42] = new Tretja.Tablica(new char[]{'R', 'H'}, 8761, true);
        tablice[43] = new Tretja.Tablica(new char[]{'H', 'Y'}, 2193, true);
        tablice[44] = new Tretja.Tablica(new char[]{'D', 'G'}, 9485, false);
        tablice[45] = new Tretja.Tablica(new char[]{'Q', 'M'}, 8141, false);
        tablice[46] = new Tretja.Tablica(new char[]{'T', 'N'}, 5717, true);
        tablice[47] = new Tretja.Tablica(new char[]{'W', 'Z'}, 4131, true);
        tablice[48] = new Tretja.Tablica(new char[]{'J', 'B'}, 8761, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Q', 'F'}, 7241, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
