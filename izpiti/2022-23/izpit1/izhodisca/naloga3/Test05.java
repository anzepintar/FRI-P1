
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'Q', 'M'}, 3825, false);
        tablice[1] = new Tretja.Tablica(new char[]{'C', 'Q'}, 3825, false);
        tablice[2] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, false);
        tablice[3] = new Tretja.Tablica(new char[]{'W', 'O'}, 3825, false);
        tablice[4] = new Tretja.Tablica(new char[]{'Q', 'M'}, 3825, true);
        tablice[5] = new Tretja.Tablica(new char[]{'T', 'F'}, 3825, true);
        tablice[6] = tablice[5];
        tablice[7] = new Tretja.Tablica(new char[]{'W', 'O'}, 6566, true);
        tablice[8] = new Tretja.Tablica(new char[]{'C', 'Z'}, 7836, true);
        tablice[9] = tablice[2];
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'O'}, 3825, false);
        tablice[11] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, false);
        tablice[12] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[13] = new Tretja.Tablica(new char[]{'Q', 'X'}, 4118, false);
        tablice[14] = new Tretja.Tablica(new char[]{'O', 'D'}, 4118, false);
        tablice[15] = new Tretja.Tablica(new char[]{'M', 'U'}, 4118, false);
        tablice[16] = new Tretja.Tablica(new char[]{'Q', 'X'}, 4118, true);
        tablice[17] = new Tretja.Tablica(new char[]{'W', 'O'}, 3825, true);
        tablice[18] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[19] = tablice[9];
        tablice[20] = new Tretja.Tablica(new char[]{'R', 'S'}, 6566, false);
        tablice[21] = new Tretja.Tablica(new char[]{'H', 'U'}, 3924, true);
        tablice[22] = new Tretja.Tablica(new char[]{'M', 'U'}, 4118, false);
        tablice[23] = new Tretja.Tablica(new char[]{'E', 'T'}, 4118, true);
        tablice[24] = new Tretja.Tablica(new char[]{'Q', 'M'}, 3825, true);
        tablice[25] = new Tretja.Tablica(new char[]{'Q', 'M'}, 9919, true);
        tablice[26] = new Tretja.Tablica(new char[]{'Q', 'F'}, 8131, false);
        tablice[27] = new Tretja.Tablica(new char[]{'C', 'Q'}, 6431, false);
        tablice[28] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, false);
        tablice[29] = new Tretja.Tablica(new char[]{'Q', 'M'}, 3825, false);
        tablice[30] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[31] = new Tretja.Tablica(new char[]{'N', 'T'}, 8871, false);
        tablice[32] = new Tretja.Tablica(new char[]{'R', 'S'}, 6566, true);
        tablice[33] = tablice[27];
        tablice[34] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, false);
        tablice[35] = new Tretja.Tablica(new char[]{'M', 'U'}, 4118, true);
        tablice[36] = new Tretja.Tablica(new char[]{'Q', 'Q'}, 9235, false);
        tablice[37] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[38] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, false);
        tablice[39] = new Tretja.Tablica(new char[]{'R', 'S'}, 6566, true);
        tablice[40] = tablice[4];
        tablice[41] = new Tretja.Tablica(new char[]{'Q', 'M'}, 9919, true);
        tablice[42] = new Tretja.Tablica(new char[]{'M', 'U'}, 4118, true);
        tablice[43] = new Tretja.Tablica(new char[]{'Z', 'U'}, 7282, true);
        tablice[44] = new Tretja.Tablica(new char[]{'W', 'O'}, 3825, true);
        tablice[45] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[46] = new Tretja.Tablica(new char[]{'W', 'O'}, 3825, true);
        tablice[47] = new Tretja.Tablica(new char[]{'T', 'A'}, 4118, true);
        tablice[48] = new Tretja.Tablica(new char[]{'M', 'U'}, 4118, true);
        tablice[49] = new Tretja.Tablica(new char[]{'Q', 'M'}, 4795, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
