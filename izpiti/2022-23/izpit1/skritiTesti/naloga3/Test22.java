
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, true);
        tablice[1] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, true);
        tablice[2] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, true);
        tablice[3] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, true);
        tablice[4] = new Tretja.Tablica(new char[]{'J', 'V'}, 9173, false);
        tablice[5] = new Tretja.Tablica(new char[]{'N', 'V'}, 6533, true);
        tablice[6] = new Tretja.Tablica(new char[]{'N', 'V'}, 1354, false);
        tablice[7] = new Tretja.Tablica(new char[]{'X', 'P'}, 1354, true);
        tablice[8] = tablice[5];
        tablice[9] = new Tretja.Tablica(new char[]{'T', 'D'}, 9173, true);
        tablice[10] = tablice[2];
        tablice[11] = new Tretja.Tablica(new char[]{'J', 'V'}, 9173, false);
        tablice[12] = new Tretja.Tablica(new char[]{'N', 'V'}, 4556, true);
        tablice[13] = new Tretja.Tablica(new char[]{'N', 'V'}, 3315, true);
        tablice[14] = new Tretja.Tablica(new char[]{'N', 'V'}, 6531, false);
        tablice[15] = new Tretja.Tablica(new char[]{'N', 'V'}, 6533, false);
        tablice[16] = new Tretja.Tablica(new char[]{'Y', 'H'}, 9173, true);
        tablice[17] = new Tretja.Tablica(new char[]{'N', 'V'}, 1354, true);
        tablice[18] = tablice[14];
        tablice[19] = new Tretja.Tablica(new char[]{'S', 'V'}, 9173, true);
        tablice[20] = tablice[6];
        tablice[21] = new Tretja.Tablica(new char[]{'N', 'V'}, 6531, true);
        tablice[22] = new Tretja.Tablica(new char[]{'Y', 'L'}, 2851, true);
        tablice[23] = new Tretja.Tablica(new char[]{'T', 'D'}, 9173, false);
        tablice[24] = tablice[12];
        tablice[25] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, false);
        tablice[26] = new Tretja.Tablica(new char[]{'Y', 'L'}, 2851, true);
        tablice[27] = tablice[4];
        tablice[28] = new Tretja.Tablica(new char[]{'N', 'V'}, 4141, false);
        tablice[29] = tablice[4];
        tablice[30] = new Tretja.Tablica(new char[]{'N', 'V'}, 6531, false);
        tablice[31] = new Tretja.Tablica(new char[]{'I', 'R'}, 9173, false);
        tablice[32] = new Tretja.Tablica(new char[]{'M', 'J'}, 9173, false);
        tablice[33] = new Tretja.Tablica(new char[]{'A', 'O'}, 9418, true);
        tablice[34] = new Tretja.Tablica(new char[]{'W', 'W'}, 6549, true);
        tablice[35] = new Tretja.Tablica(new char[]{'R', 'Z'}, 9173, false);
        tablice[36] = new Tretja.Tablica(new char[]{'N', 'V'}, 9173, false);
        tablice[37] = tablice[36];
        tablice[38] = new Tretja.Tablica(new char[]{'N', 'V'}, 6533, true);
        tablice[39] = new Tretja.Tablica(new char[]{'N', 'V'}, 6533, false);
        tablice[40] = new Tretja.Tablica(new char[]{'N', 'V'}, 6533, true);
        tablice[41] = new Tretja.Tablica(new char[]{'N', 'V'}, 7315, true);
        tablice[42] = tablice[12];
        tablice[43] = new Tretja.Tablica(new char[]{'D', 'U'}, 8551, true);
        tablice[44] = new Tretja.Tablica(new char[]{'F', 'E'}, 1392, true);
        tablice[45] = new Tretja.Tablica(new char[]{'R', 'Z'}, 9173, true);
        tablice[46] = new Tretja.Tablica(new char[]{'A', 'O'}, 1354, true);
        tablice[47] = new Tretja.Tablica(new char[]{'N', 'V'}, 4141, true);
        tablice[48] = new Tretja.Tablica(new char[]{'N', 'V'}, 8588, true);
        tablice[49] = tablice[20];

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
