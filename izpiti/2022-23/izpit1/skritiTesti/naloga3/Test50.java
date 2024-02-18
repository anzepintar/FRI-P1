
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'S', 'W'}, 3124, true);
        tablice[1] = new Tretja.Tablica(new char[]{'T', 'Z'}, 6769, false);
        tablice[2] = new Tretja.Tablica(new char[]{'S', 'W'}, 3124, true);
        tablice[3] = new Tretja.Tablica(new char[]{'I', 'P'}, 4164, false);
        tablice[4] = new Tretja.Tablica(new char[]{'S', 'W'}, 3124, true);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'X'}, 3124, false);
        tablice[6] = new Tretja.Tablica(new char[]{'S', 'W'}, 3124, false);
        tablice[7] = new Tretja.Tablica(new char[]{'I', 'P'}, 4164, false);
        tablice[8] = tablice[6];
        tablice[9] = new Tretja.Tablica(new char[]{'G', 'Q'}, 9577, false);
        tablice[10] = tablice[3];
        tablice[11] = new Tretja.Tablica(new char[]{'S', 'W'}, 3124, false);
        tablice[12] = new Tretja.Tablica(new char[]{'G', 'Q'}, 9577, false);
        tablice[13] = new Tretja.Tablica(new char[]{'F', 'D'}, 3124, false);
        tablice[14] = new Tretja.Tablica(new char[]{'M', 'U'}, 2667, false);
        tablice[15] = new Tretja.Tablica(new char[]{'S', 'W'}, 9423, false);
        tablice[16] = new Tretja.Tablica(new char[]{'M', 'U'}, 2667, false);
        tablice[17] = new Tretja.Tablica(new char[]{'Z', 'E'}, 9365, false);
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'R'}, 7296, false);
        tablice[19] = new Tretja.Tablica(new char[]{'K', 'N'}, 3124, true);
        tablice[20] = new Tretja.Tablica(new char[]{'L', 'J'}, 5942, false);
        tablice[21] = new Tretja.Tablica(new char[]{'W', 'X'}, 6699, false);
        tablice[22] = tablice[1];
        tablice[23] = new Tretja.Tablica(new char[]{'B', 'E'}, 1572, true);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'D'}, 4164, false);
        tablice[25] = new Tretja.Tablica(new char[]{'D', 'M'}, 9324, true);
        tablice[26] = new Tretja.Tablica(new char[]{'R', 'P'}, 9338, false);
        tablice[27] = new Tretja.Tablica(new char[]{'M', 'U'}, 8528, true);
        tablice[28] = new Tretja.Tablica(new char[]{'I', 'P'}, 2713, true);
        tablice[29] = new Tretja.Tablica(new char[]{'I', 'P'}, 2713, false);
        tablice[30] = tablice[28];
        tablice[31] = tablice[7];
        tablice[32] = new Tretja.Tablica(new char[]{'W', 'X'}, 3124, false);
        tablice[33] = new Tretja.Tablica(new char[]{'Y', 'H'}, 2667, true);
        tablice[34] = tablice[31];
        tablice[35] = new Tretja.Tablica(new char[]{'T', 'R'}, 7296, false);
        tablice[36] = new Tretja.Tablica(new char[]{'W', 'X'}, 2226, true);
        tablice[37] = tablice[12];
        tablice[38] = new Tretja.Tablica(new char[]{'K', 'N'}, 3124, false);
        tablice[39] = new Tretja.Tablica(new char[]{'G', 'W'}, 2878, false);
        tablice[40] = new Tretja.Tablica(new char[]{'Z', 'M'}, 7715, true);
        tablice[41] = new Tretja.Tablica(new char[]{'T', 'R'}, 7296, true);
        tablice[42] = new Tretja.Tablica(new char[]{'G', 'W'}, 9421, false);
        tablice[43] = new Tretja.Tablica(new char[]{'T', 'K'}, 8616, true);
        tablice[44] = new Tretja.Tablica(new char[]{'L', 'R'}, 5942, false);
        tablice[45] = tablice[13];
        tablice[46] = new Tretja.Tablica(new char[]{'X', 'O'}, 2667, true);
        tablice[47] = tablice[25];
        tablice[48] = new Tretja.Tablica(new char[]{'Q', 'D'}, 4164, false);
        tablice[49] = new Tretja.Tablica(new char[]{'Y', 'H'}, 4989, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
