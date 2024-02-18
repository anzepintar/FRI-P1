
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, false);
        tablice[1] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, false);
        tablice[2] = new Tretja.Tablica(new char[]{'D', 'K'}, 8738, true);
        tablice[3] = new Tretja.Tablica(new char[]{'V', 'L'}, 5491, false);
        tablice[4] = tablice[3];
        tablice[5] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, true);
        tablice[6] = new Tretja.Tablica(new char[]{'D', 'K'}, 5954, false);
        tablice[7] = new Tretja.Tablica(new char[]{'V', 'L'}, 5385, false);
        tablice[8] = new Tretja.Tablica(new char[]{'B', 'V'}, 1572, true);
        tablice[9] = new Tretja.Tablica(new char[]{'R', 'P'}, 6687, true);
        tablice[10] = new Tretja.Tablica(new char[]{'V', 'L'}, 9387, true);
        tablice[11] = new Tretja.Tablica(new char[]{'V', 'L'}, 5491, true);
        tablice[12] = new Tretja.Tablica(new char[]{'C', 'A'}, 5491, false);
        tablice[13] = new Tretja.Tablica(new char[]{'Y', 'M'}, 8221, true);
        tablice[14] = new Tretja.Tablica(new char[]{'D', 'K'}, 3648, true);
        tablice[15] = new Tretja.Tablica(new char[]{'V', 'L'}, 9355, false);
        tablice[16] = tablice[9];
        tablice[17] = tablice[11];
        tablice[18] = tablice[12];
        tablice[19] = new Tretja.Tablica(new char[]{'D', 'K'}, 3648, true);
        tablice[20] = new Tretja.Tablica(new char[]{'G', 'E'}, 9291, false);
        tablice[21] = new Tretja.Tablica(new char[]{'D', 'K'}, 7118, false);
        tablice[22] = tablice[12];
        tablice[23] = new Tretja.Tablica(new char[]{'V', 'L'}, 5491, true);
        tablice[24] = new Tretja.Tablica(new char[]{'D', 'K'}, 2955, false);
        tablice[25] = new Tretja.Tablica(new char[]{'B', 'V'}, 1572, false);
        tablice[26] = new Tretja.Tablica(new char[]{'H', 'L'}, 2569, true);
        tablice[27] = new Tretja.Tablica(new char[]{'V', 'L'}, 9387, true);
        tablice[28] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, false);
        tablice[29] = new Tretja.Tablica(new char[]{'M', 'P'}, 5954, false);
        tablice[30] = new Tretja.Tablica(new char[]{'R', 'P'}, 5221, true);
        tablice[31] = new Tretja.Tablica(new char[]{'K', 'E'}, 2347, true);
        tablice[32] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, false);
        tablice[33] = new Tretja.Tablica(new char[]{'D', 'K'}, 2955, true);
        tablice[34] = new Tretja.Tablica(new char[]{'C', 'A'}, 3425, false);
        tablice[35] = new Tretja.Tablica(new char[]{'N', 'D'}, 5921, false);
        tablice[36] = tablice[27];
        tablice[37] = tablice[21];
        tablice[38] = new Tretja.Tablica(new char[]{'P', 'M'}, 4944, false);
        tablice[39] = new Tretja.Tablica(new char[]{'C', 'A'}, 3425, true);
        tablice[40] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, true);
        tablice[41] = new Tretja.Tablica(new char[]{'W', 'M'}, 4579, true);
        tablice[42] = new Tretja.Tablica(new char[]{'V', 'L'}, 9387, true);
        tablice[43] = tablice[34];
        tablice[44] = tablice[35];
        tablice[45] = new Tretja.Tablica(new char[]{'D', 'K'}, 5954, true);
        tablice[46] = new Tretja.Tablica(new char[]{'Z', 'O'}, 8849, false);
        tablice[47] = new Tretja.Tablica(new char[]{'D', 'K'}, 8221, false);
        tablice[48] = new Tretja.Tablica(new char[]{'R', 'P'}, 6144, false);
        tablice[49] = new Tretja.Tablica(new char[]{'B', 'V'}, 2781, true);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
