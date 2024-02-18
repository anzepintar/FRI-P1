
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, false);
        tablice[1] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, false);
        tablice[2] = tablice[1];
        tablice[3] = new Tretja.Tablica(new char[]{'L', 'W'}, 4516, false);
        tablice[4] = new Tretja.Tablica(new char[]{'E', 'Y'}, 7832, false);
        tablice[5] = new Tretja.Tablica(new char[]{'L', 'W'}, 7599, true);
        tablice[6] = tablice[2];
        tablice[7] = new Tretja.Tablica(new char[]{'C', 'O'}, 3747, true);
        tablice[8] = new Tretja.Tablica(new char[]{'X', 'Y'}, 8614, false);
        tablice[9] = new Tretja.Tablica(new char[]{'A', 'U'}, 3852, false);
        tablice[10] = new Tretja.Tablica(new char[]{'T', 'H'}, 4516, false);
        tablice[11] = new Tretja.Tablica(new char[]{'A', 'U'}, 3852, false);
        tablice[12] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, false);
        tablice[13] = new Tretja.Tablica(new char[]{'L', 'W'}, 1684, false);
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'Y'}, 1516, true);
        tablice[15] = new Tretja.Tablica(new char[]{'A', 'U'}, 3852, true);
        tablice[16] = new Tretja.Tablica(new char[]{'L', 'W'}, 6536, true);
        tablice[17] = tablice[15];
        tablice[18] = new Tretja.Tablica(new char[]{'I', 'D'}, 1516, false);
        tablice[19] = new Tretja.Tablica(new char[]{'A', 'U'}, 2167, false);
        tablice[20] = new Tretja.Tablica(new char[]{'Z', 'U'}, 9516, true);
        tablice[21] = new Tretja.Tablica(new char[]{'Z', 'U'}, 1653, true);
        tablice[22] = tablice[20];
        tablice[23] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, true);
        tablice[24] = tablice[22];
        tablice[25] = new Tretja.Tablica(new char[]{'I', 'D'}, 1516, true);
        tablice[26] = new Tretja.Tablica(new char[]{'Z', 'U'}, 9516, true);
        tablice[27] = new Tretja.Tablica(new char[]{'K', 'T'}, 2791, false);
        tablice[28] = new Tretja.Tablica(new char[]{'D', 'H'}, 9495, true);
        tablice[29] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, true);
        tablice[30] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, false);
        tablice[31] = new Tretja.Tablica(new char[]{'E', 'Y'}, 7832, true);
        tablice[32] = new Tretja.Tablica(new char[]{'U', 'T'}, 9516, false);
        tablice[33] = new Tretja.Tablica(new char[]{'Q', 'S'}, 1288, false);
        tablice[34] = new Tretja.Tablica(new char[]{'C', 'G'}, 2989, false);
        tablice[35] = new Tretja.Tablica(new char[]{'E', 'Y'}, 7832, false);
        tablice[36] = new Tretja.Tablica(new char[]{'I', 'D'}, 2442, true);
        tablice[37] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, true);
        tablice[38] = new Tretja.Tablica(new char[]{'F', 'N'}, 2427, true);
        tablice[39] = new Tretja.Tablica(new char[]{'E', 'Y'}, 7832, false);
        tablice[40] = new Tretja.Tablica(new char[]{'D', 'V'}, 3774, true);
        tablice[41] = tablice[15];
        tablice[42] = new Tretja.Tablica(new char[]{'D', 'V'}, 3774, true);
        tablice[43] = new Tretja.Tablica(new char[]{'K', 'L'}, 1276, true);
        tablice[44] = new Tretja.Tablica(new char[]{'L', 'W'}, 7599, true);
        tablice[45] = new Tretja.Tablica(new char[]{'X', 'U'}, 7985, true);
        tablice[46] = new Tretja.Tablica(new char[]{'E', 'Y'}, 1516, true);
        tablice[47] = tablice[29];
        tablice[48] = new Tretja.Tablica(new char[]{'L', 'W'}, 3855, false);
        tablice[49] = new Tretja.Tablica(new char[]{'J', 'K'}, 3852, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
