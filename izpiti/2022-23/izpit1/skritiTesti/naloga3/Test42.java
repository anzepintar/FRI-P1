
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'O', 'G'}, 6744, true);
        tablice[1] = new Tretja.Tablica(new char[]{'O', 'G'}, 6744, true);
        tablice[2] = new Tretja.Tablica(new char[]{'O', 'G'}, 3247, true);
        tablice[3] = new Tretja.Tablica(new char[]{'S', 'C'}, 3476, true);
        tablice[4] = new Tretja.Tablica(new char[]{'S', 'C'}, 3476, false);
        tablice[5] = new Tretja.Tablica(new char[]{'O', 'G'}, 6744, true);
        tablice[6] = new Tretja.Tablica(new char[]{'H', 'R'}, 6744, true);
        tablice[7] = new Tretja.Tablica(new char[]{'O', 'G'}, 6744, true);
        tablice[8] = new Tretja.Tablica(new char[]{'O', 'G'}, 6744, true);
        tablice[9] = new Tretja.Tablica(new char[]{'Y', 'N'}, 6744, true);
        tablice[10] = tablice[6];
        tablice[11] = new Tretja.Tablica(new char[]{'E', 'N'}, 3282, true);
        tablice[12] = new Tretja.Tablica(new char[]{'X', 'C'}, 6744, false);
        tablice[13] = tablice[2];
        tablice[14] = new Tretja.Tablica(new char[]{'E', 'N'}, 3282, false);
        tablice[15] = new Tretja.Tablica(new char[]{'P', 'W'}, 6744, false);
        tablice[16] = new Tretja.Tablica(new char[]{'P', 'W'}, 6744, true);
        tablice[17] = new Tretja.Tablica(new char[]{'X', 'C'}, 6744, true);
        tablice[18] = new Tretja.Tablica(new char[]{'X', 'O'}, 3282, false);
        tablice[19] = new Tretja.Tablica(new char[]{'A', 'C'}, 6744, true);
        tablice[20] = tablice[4];
        tablice[21] = tablice[15];
        tablice[22] = new Tretja.Tablica(new char[]{'S', 'C'}, 3476, true);
        tablice[23] = new Tretja.Tablica(new char[]{'C', 'A'}, 1399, false);
        tablice[24] = new Tretja.Tablica(new char[]{'A', 'C'}, 6744, true);
        tablice[25] = tablice[21];
        tablice[26] = new Tretja.Tablica(new char[]{'A', 'V'}, 5833, true);
        tablice[27] = new Tretja.Tablica(new char[]{'S', 'C'}, 3476, false);
        tablice[28] = new Tretja.Tablica(new char[]{'W', 'V'}, 6744, true);
        tablice[29] = new Tretja.Tablica(new char[]{'F', 'A'}, 3268, false);
        tablice[30] = new Tretja.Tablica(new char[]{'H', 'T'}, 3282, false);
        tablice[31] = new Tretja.Tablica(new char[]{'V', 'I'}, 3476, true);
        tablice[32] = new Tretja.Tablica(new char[]{'A', 'J'}, 3439, true);
        tablice[33] = new Tretja.Tablica(new char[]{'V', 'I'}, 3476, true);
        tablice[34] = tablice[26];
        tablice[35] = new Tretja.Tablica(new char[]{'F', 'A'}, 5959, true);
        tablice[36] = new Tretja.Tablica(new char[]{'X', 'C'}, 6744, true);
        tablice[37] = new Tretja.Tablica(new char[]{'C', 'A'}, 4822, true);
        tablice[38] = new Tretja.Tablica(new char[]{'D', 'T'}, 8736, true);
        tablice[39] = new Tretja.Tablica(new char[]{'U', 'X'}, 7841, false);
        tablice[40] = new Tretja.Tablica(new char[]{'K', 'R'}, 2588, false);
        tablice[41] = new Tretja.Tablica(new char[]{'Y', 'N'}, 6744, false);
        tablice[42] = tablice[31];
        tablice[43] = new Tretja.Tablica(new char[]{'C', 'A'}, 3543, false);
        tablice[44] = new Tretja.Tablica(new char[]{'G', 'N'}, 3282, true);
        tablice[45] = new Tretja.Tablica(new char[]{'M', 'E'}, 3488, true);
        tablice[46] = new Tretja.Tablica(new char[]{'V', 'I'}, 1323, true);
        tablice[47] = tablice[27];
        tablice[48] = tablice[39];
        tablice[49] = new Tretja.Tablica(new char[]{'E', 'N'}, 3282, false);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.hashCode() == t2.hashCode() ? '+' : '-');
            }
            System.out.println();
        }
    }
}
