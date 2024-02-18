
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, true);
        tablice[1] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, true);
        tablice[2] = tablice[1];
        tablice[3] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, true);
        tablice[4] = new Tretja.Tablica(new char[]{'W', 'S'}, 9585, false);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'P'}, 5425, true);
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'I'}, 9585, false);
        tablice[7] = new Tretja.Tablica(new char[]{'R', 'K'}, 6376, false);
        tablice[8] = new Tretja.Tablica(new char[]{'N', 'I'}, 9585, false);
        tablice[9] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, false);
        tablice[10] = tablice[3];
        tablice[11] = new Tretja.Tablica(new char[]{'E', 'F'}, 9585, true);
        tablice[12] = new Tretja.Tablica(new char[]{'E', 'J'}, 6376, true);
        tablice[13] = new Tretja.Tablica(new char[]{'E', 'F'}, 9585, true);
        tablice[14] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, false);
        tablice[15] = new Tretja.Tablica(new char[]{'B', 'L'}, 9585, false);
        tablice[16] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, true);
        tablice[17] = new Tretja.Tablica(new char[]{'W', 'P'}, 5425, false);
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'P'}, 9585, true);
        tablice[19] = tablice[16];
        tablice[20] = new Tretja.Tablica(new char[]{'B', 'L'}, 9585, true);
        tablice[21] = new Tretja.Tablica(new char[]{'R', 'R'}, 8716, true);
        tablice[22] = new Tretja.Tablica(new char[]{'P', 'V'}, 5922, false);
        tablice[23] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, false);
        tablice[24] = tablice[6];
        tablice[25] = tablice[1];
        tablice[26] = tablice[9];
        tablice[27] = new Tretja.Tablica(new char[]{'Y', 'Y'}, 9585, false);
        tablice[28] = new Tretja.Tablica(new char[]{'N', 'I'}, 9585, false);
        tablice[29] = new Tretja.Tablica(new char[]{'G', 'K'}, 1676, true);
        tablice[30] = new Tretja.Tablica(new char[]{'C', 'N'}, 9585, true);
        tablice[31] = new Tretja.Tablica(new char[]{'L', 'C'}, 9585, true);
        tablice[32] = new Tretja.Tablica(new char[]{'P', 'V'}, 9585, false);
        tablice[33] = new Tretja.Tablica(new char[]{'H', 'G'}, 3712, false);
        tablice[34] = tablice[27];
        tablice[35] = new Tretja.Tablica(new char[]{'C', 'J'}, 9585, true);
        tablice[36] = new Tretja.Tablica(new char[]{'B', 'L'}, 9585, true);
        tablice[37] = new Tretja.Tablica(new char[]{'H', 'G'}, 2921, true);
        tablice[38] = tablice[11];
        tablice[39] = new Tretja.Tablica(new char[]{'F', 'S'}, 5425, false);
        tablice[40] = new Tretja.Tablica(new char[]{'A', 'Q'}, 8279, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Y', 'Y'}, 9585, false);
        tablice[42] = new Tretja.Tablica(new char[]{'J', 'A'}, 5425, false);
        tablice[43] = new Tretja.Tablica(new char[]{'L', 'Z'}, 4413, false);
        tablice[44] = new Tretja.Tablica(new char[]{'C', 'J'}, 9585, false);
        tablice[45] = new Tretja.Tablica(new char[]{'G', 'K'}, 1676, true);
        tablice[46] = new Tretja.Tablica(new char[]{'S', 'J'}, 3712, false);
        tablice[47] = new Tretja.Tablica(new char[]{'R', 'R'}, 8716, true);
        tablice[48] = new Tretja.Tablica(new char[]{'T', 'P'}, 9585, false);
        tablice[49] = new Tretja.Tablica(new char[]{'P', 'V'}, 5922, false);

        for (Tretja.Tablica tablica: tablice) {
            System.out.println(tablica.toString());
        }
    }
}
