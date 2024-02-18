
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Tretja.Tablica[] tablice = new Tretja.Tablica[50];
        tablice[0] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, false);
        tablice[1] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, true);
        tablice[2] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, true);
        tablice[3] = new Tretja.Tablica(new char[]{'H', 'C'}, 8349, true);
        tablice[4] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, false);
        tablice[5] = new Tretja.Tablica(new char[]{'W', 'N'}, 3287, false);
        tablice[6] = new Tretja.Tablica(new char[]{'O', 'P'}, 9262, true);
        tablice[7] = new Tretja.Tablica(new char[]{'R', 'U'}, 1969, false);
        tablice[8] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, false);
        tablice[9] = new Tretja.Tablica(new char[]{'R', 'U'}, 1733, false);
        tablice[10] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, false);
        tablice[11] = tablice[8];
        tablice[12] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, false);
        tablice[13] = tablice[4];
        tablice[14] = new Tretja.Tablica(new char[]{'W', 'R'}, 7638, false);
        tablice[15] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, true);
        tablice[16] = new Tretja.Tablica(new char[]{'H', 'N'}, 4684, false);
        tablice[17] = new Tretja.Tablica(new char[]{'M', 'N'}, 5285, false);
        tablice[18] = new Tretja.Tablica(new char[]{'V', 'F'}, 9262, false);
        tablice[19] = new Tretja.Tablica(new char[]{'F', 'W'}, 1969, false);
        tablice[20] = new Tretja.Tablica(new char[]{'F', 'W'}, 1969, true);
        tablice[21] = new Tretja.Tablica(new char[]{'D', 'F'}, 7638, false);
        tablice[22] = new Tretja.Tablica(new char[]{'L', 'A'}, 9262, false);
        tablice[23] = new Tretja.Tablica(new char[]{'A', 'Z'}, 9262, false);
        tablice[24] = new Tretja.Tablica(new char[]{'W', 'R'}, 2763, true);
        tablice[25] = new Tretja.Tablica(new char[]{'T', 'X'}, 9262, true);
        tablice[26] = new Tretja.Tablica(new char[]{'M', 'M'}, 4263, true);
        tablice[27] = new Tretja.Tablica(new char[]{'W', 'N'}, 5236, true);
        tablice[28] = new Tretja.Tablica(new char[]{'Z', 'L'}, 9937, true);
        tablice[29] = new Tretja.Tablica(new char[]{'H', 'C'}, 1891, true);
        tablice[30] = tablice[14];
        tablice[31] = new Tretja.Tablica(new char[]{'W', 'R'}, 2763, false);
        tablice[32] = new Tretja.Tablica(new char[]{'V', 'F'}, 9262, true);
        tablice[33] = new Tretja.Tablica(new char[]{'R', 'U'}, 1733, true);
        tablice[34] = tablice[18];
        tablice[35] = new Tretja.Tablica(new char[]{'N', 'I'}, 1733, true);
        tablice[36] = new Tretja.Tablica(new char[]{'R', 'U'}, 1969, false);
        tablice[37] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, true);
        tablice[38] = new Tretja.Tablica(new char[]{'W', 'N'}, 8349, false);
        tablice[39] = new Tretja.Tablica(new char[]{'L', 'A'}, 9694, true);
        tablice[40] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, true);
        tablice[41] = new Tretja.Tablica(new char[]{'H', 'M'}, 3613, true);
        tablice[42] = new Tretja.Tablica(new char[]{'F', 'W'}, 1969, false);
        tablice[43] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, false);
        tablice[44] = new Tretja.Tablica(new char[]{'W', 'N'}, 9262, true);
        tablice[45] = new Tretja.Tablica(new char[]{'U', 'P'}, 5236, true);
        tablice[46] = new Tretja.Tablica(new char[]{'K', 'L'}, 4535, false);
        tablice[47] = new Tretja.Tablica(new char[]{'D', 'S'}, 9937, false);
        tablice[48] = new Tretja.Tablica(new char[]{'W', 'R'}, 2763, true);
        tablice[49] = new Tretja.Tablica(new char[]{'T', 'X'}, 3189, true);

        for (Tretja.Tablica t1: tablice) {
            for (Tretja.Tablica t2: tablice) {
                System.out.print(t1.equals(t2) ? '+' : '-');
            }
            System.out.println();
        }
    }
}
